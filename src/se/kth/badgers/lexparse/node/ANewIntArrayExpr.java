/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class ANewIntArrayExpr extends PExpr
{
    private TNew _new_;
    private TInt _int_;
    private TLBracket _lBracket_;
    private PExpr _expr_;
    private TRBracket _rBracket_;

    public ANewIntArrayExpr()
    {
        // Constructor
    }

    public ANewIntArrayExpr(
        @SuppressWarnings("hiding") TNew _new_,
        @SuppressWarnings("hiding") TInt _int_,
        @SuppressWarnings("hiding") TLBracket _lBracket_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TRBracket _rBracket_)
    {
        // Constructor
        setNew(_new_);

        setInt(_int_);

        setLBracket(_lBracket_);

        setExpr(_expr_);

        setRBracket(_rBracket_);

    }

    @Override
    public Object clone()
    {
        return new ANewIntArrayExpr(
            cloneNode(this._new_),
            cloneNode(this._int_),
            cloneNode(this._lBracket_),
            cloneNode(this._expr_),
            cloneNode(this._rBracket_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewIntArrayExpr(this);
    }

    public TNew getNew()
    {
        return this._new_;
    }

    public void setNew(TNew node)
    {
        if(this._new_ != null)
        {
            this._new_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._new_ = node;
    }

    public TInt getInt()
    {
        return this._int_;
    }

    public void setInt(TInt node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
    }

    public TLBracket getLBracket()
    {
        return this._lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(this._lBracket_ != null)
        {
            this._lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBracket_ = node;
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

    public TRBracket getRBracket()
    {
        return this._rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(this._rBracket_ != null)
        {
            this._rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._new_)
            + toString(this._int_)
            + toString(this._lBracket_)
            + toString(this._expr_)
            + toString(this._rBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._new_ == child)
        {
            this._new_ = null;
            return;
        }

        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._lBracket_ == child)
        {
            this._lBracket_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._rBracket_ == child)
        {
            this._rBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._new_ == oldChild)
        {
            setNew((TNew) newChild);
            return;
        }

        if(this._int_ == oldChild)
        {
            setInt((TInt) newChild);
            return;
        }

        if(this._lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
