/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class AIntLitPrimaryExpr extends PPrimaryExpr
{
    private TIntLiteral _intLiteral_;

    public AIntLitPrimaryExpr()
    {
        // Constructor
    }

    public AIntLitPrimaryExpr(
        @SuppressWarnings("hiding") TIntLiteral _intLiteral_)
    {
        // Constructor
        setIntLiteral(_intLiteral_);

    }

    @Override
    public Object clone()
    {
        return new AIntLitPrimaryExpr(
            cloneNode(this._intLiteral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntLitPrimaryExpr(this);
    }

    public TIntLiteral getIntLiteral()
    {
        return this._intLiteral_;
    }

    public void setIntLiteral(TIntLiteral node)
    {
        if(this._intLiteral_ != null)
        {
            this._intLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._intLiteral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._intLiteral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._intLiteral_ == child)
        {
            this._intLiteral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._intLiteral_ == oldChild)
        {
            setIntLiteral((TIntLiteral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}