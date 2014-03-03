/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class AArrayLengthExpr extends PExpr
{
    private PExpr _expr_;
    private TDot _dot_;
    private TId _length_;

    public AArrayLengthExpr()
    {
        // Constructor
    }

    public AArrayLengthExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TId _length_)
    {
        // Constructor
        setExpr(_expr_);

        setDot(_dot_);

        setLength(_length_);

    }

    @Override
    public Object clone()
    {
        return new AArrayLengthExpr(
            cloneNode(this._expr_),
            cloneNode(this._dot_),
            cloneNode(this._length_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayLengthExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TId getLength()
    {
        return this._length_;
    }

    public void setLength(TId node)
    {
        if(this._length_ != null)
        {
            this._length_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._length_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._dot_)
            + toString(this._length_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._length_ == child)
        {
            this._length_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._length_ == oldChild)
        {
            setLength((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}