/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class ANotExprNotExpr extends PNotExpr
{
    private TLogicalNot _logicalNot_;
    private PPostfixExpr _postfixExpr_;

    public ANotExprNotExpr()
    {
        // Constructor
    }

    public ANotExprNotExpr(
        @SuppressWarnings("hiding") TLogicalNot _logicalNot_,
        @SuppressWarnings("hiding") PPostfixExpr _postfixExpr_)
    {
        // Constructor
        setLogicalNot(_logicalNot_);

        setPostfixExpr(_postfixExpr_);

    }

    @Override
    public Object clone()
    {
        return new ANotExprNotExpr(
            cloneNode(this._logicalNot_),
            cloneNode(this._postfixExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotExprNotExpr(this);
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

    public PPostfixExpr getPostfixExpr()
    {
        return this._postfixExpr_;
    }

    public void setPostfixExpr(PPostfixExpr node)
    {
        if(this._postfixExpr_ != null)
        {
            this._postfixExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._postfixExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicalNot_)
            + toString(this._postfixExpr_);
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

        if(this._postfixExpr_ == child)
        {
            this._postfixExpr_ = null;
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

        if(this._postfixExpr_ == oldChild)
        {
            setPostfixExpr((PPostfixExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}