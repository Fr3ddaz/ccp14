import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import se.kth.badgers.lexparse.lexer.Lexer;
import se.kth.badgers.lexparse.lexer.LexerException;
import se.kth.badgers.lexparse.node.Token;

public class Main {

	public static void main(final String[] args) {
		final Main m = new Main();
		m.lexerTest();
	}

	void lexerTest() {
		FileReader fr = null;
		Token t = null;
		try {
			fr = new FileReader("./testdata/simpletest.mj");
		} catch (final FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final Lexer l = new Lexer(new PushbackReader(fr));

		do {
			try {
				t = l.next();
				System.out.println(t.getClass().toString().substring(35));
			} catch (final LexerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}

		} while (!(t instanceof se.kth.badgers.lexparse.node.EOF));
	}
}
