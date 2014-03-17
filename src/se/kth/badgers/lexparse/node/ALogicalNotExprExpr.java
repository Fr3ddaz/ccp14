/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class ALogicalNotExprExpr extends PExpr
{
    private TLogicalNot _logicalNot_;
    private PExpr _expr_;

    public ALogicalNotExprExpr()
    {
        // Constructor
    }

    public ALogicalNotExprExpr(
        @SuppressWarnings("hiding") TLogicalNot _logicalNot_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setLogicalNot(_logicalNot_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new ALogicalNotExprExpr(
            cloneNode(this._logicalNot_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalNotExprExpr(this);
    }

    public TLogicalNot getLogicalNot()
    {
        return this._logicalNot_;
    }

    public void setLogicalNot(TLogicalNot node)
    {
        if(this._logicalNot_ != null)
        {
            this._logicalNot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalNot_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicalNot_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicalNot_ == child)
        {
            this._logicalNot_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicalNot_ == oldChild)
        {
            setLogicalNot((TLogicalNot) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
