/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class TTemp extends Token
{
    public TTemp()
    {
        super.setText("hejhej");
    }

    public TTemp(int line, int pos)
    {
        super.setText("hejhej");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTemp(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTemp(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTemp text.");
    }
}