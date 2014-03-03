/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class APrintlnStmt extends PStmt
{
    private TPrintln _println_;
    private TLPar _lPar_;
    private PExpr _expr_;
    private TRPar _rPar_;
    private TSemiColon _semiColon_;

    public APrintlnStmt()
    {
        // Constructor
    }

    public APrintlnStmt(
        @SuppressWarnings("hiding") TPrintln _println_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TSemiColon _semiColon_)
    {
        // Constructor
        setPrintln(_println_);

        setLPar(_lPar_);

        setExpr(_expr_);

        setRPar(_rPar_);

        setSemiColon(_semiColon_);

    }

    @Override
    public Object clone()
    {
        return new APrintlnStmt(
            cloneNode(this._println_),
            cloneNode(this._lPar_),
            cloneNode(this._expr_),
            cloneNode(this._rPar_),
            cloneNode(this._semiColon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrintlnStmt(this);
    }

    public TPrintln getPrintln()
    {
        return this._println_;
    }

    public void setPrintln(TPrintln node)
    {
        if(this._println_ != null)
        {
            this._println_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._println_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TSemiColon getSemiColon()
    {
        return this._semiColon_;
    }

    public void setSemiColon(TSemiColon node)
    {
        if(this._semiColon_ != null)
        {
            this._semiColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semiColon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._println_)
            + toString(this._lPar_)
            + toString(this._expr_)
            + toString(this._rPar_)
            + toString(this._semiColon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._println_ == child)
        {
            this._println_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._semiColon_ == child)
        {
            this._semiColon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._println_ == oldChild)
        {
            setPrintln((TPrintln) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._semiColon_ == oldChild)
        {
            setSemiColon((TSemiColon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
