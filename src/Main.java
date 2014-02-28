import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import se.kth.badgers.lexparse.lexer.Lexer;
import se.kth.badgers.lexparse.lexer.LexerException;
import se.kth.badgers.lexparse.node.Token;

public class Main {

	/* ANTON */
	public static void main(String[] args) {	
		FileReader fr = null;
		Token t = null;
		try {
			fr = new FileReader("./testdata/test_big.mj");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Lexer l = new Lexer(new PushbackReader(fr));
		
		while (true) {
			try {
				t = l.next();
			} catch (LexerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
