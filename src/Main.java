import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import se.kth.badgers.lexparse.lexer.Lexer;
import se.kth.badgers.lexparse.lexer.LexerException;
import se.kth.badgers.lexparse.node.Token;

public class Main {

	void lexerTest() {
		FileReader fr = null;
		Token t = null;
		try {
			fr = new FileReader("./testdata/test_big.mj");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Lexer l = new Lexer(new PushbackReader(fr));
		
		do {
			try {
				t = l.next();
				System.out.println(t.getClass().toString().substring(35));
			} catch (LexerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			
		} while (!(t instanceof se.kth.badgers.lexparse.node.EOF));
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.lexerTest();
	}
}
