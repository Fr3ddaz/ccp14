import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import se.kth.badgers.lexparse.analysis.DepthFirstAdapter;
import se.kth.badgers.lexparse.lexer.Lexer;
import se.kth.badgers.lexparse.lexer.LexerException;
import se.kth.badgers.lexparse.node.Start;
import se.kth.badgers.lexparse.node.Token;
import se.kth.badgers.lexparse.parser.Parser;
import se.kth.badgers.lexparse.parser.ParserException;

public class Main {

	public static void main(final String[] args) {
		final Main m = new Main();
//		m.lexerTest();
		m.parserTest();
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
	
	void parserTest() {
		FileReader fr = null;
		try {
			fr = new FileReader("./testdata/MainClassDecl");
		} catch (final FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final Lexer l = new Lexer(new PushbackReader(fr));
		
		Parser parser = new Parser(l);
		
		Start tree = null;
		try {
			tree = parser.parse();
		} catch (ParserException | LexerException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		tree.apply(new FormattedOutput());
		
//		 System.out.println("CSTTree.........\n" + tree.toString());
				 
		
		
	}
}
