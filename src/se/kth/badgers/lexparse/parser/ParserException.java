/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.parser;

import se.kth.badgers.lexparse.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    private Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}
