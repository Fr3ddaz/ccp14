/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class AMainClass extends PMainClass
{
    private TClassToken _classToken_;
    private TId _id_;
    private TLBrace _lBrace_;
    private PMainMethodDecl _mainMethodDecl_;
    private PMainMethodBody _mainMethodBody_;
    private TRBrace _rBrace_;

    public AMainClass()
    {
        // Constructor
    }

    public AMainClass(
        @SuppressWarnings("hiding") TClassToken _classToken_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") PMainMethodDecl _mainMethodDecl_,
        @SuppressWarnings("hiding") PMainMethodBody _mainMethodBody_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setClassToken(_classToken_);

        setId(_id_);

        setLBrace(_lBrace_);

        setMainMethodDecl(_mainMethodDecl_);

        setMainMethodBody(_mainMethodBody_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AMainClass(
            cloneNode(this._classToken_),
            cloneNode(this._id_),
            cloneNode(this._lBrace_),
            cloneNode(this._mainMethodDecl_),
            cloneNode(this._mainMethodBody_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainClass(this);
    }

    public TClassToken getClassToken()
    {
        return this._classToken_;
    }

    public void setClassToken(TClassToken node)
    {
        if(this._classToken_ != null)
        {
            this._classToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._classToken_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public PMainMethodDecl getMainMethodDecl()
    {
        return this._mainMethodDecl_;
    }

    public void setMainMethodDecl(PMainMethodDecl node)
    {
        if(this._mainMethodDecl_ != null)
        {
            this._mainMethodDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mainMethodDecl_ = node;
    }

    public PMainMethodBody getMainMethodBody()
    {
        return this._mainMethodBody_;
    }

    public void setMainMethodBody(PMainMethodBody node)
    {
        if(this._mainMethodBody_ != null)
        {
            this._mainMethodBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mainMethodBody_ = node;
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._classToken_)
            + toString(this._id_)
            + toString(this._lBrace_)
            + toString(this._mainMethodDecl_)
            + toString(this._mainMethodBody_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._classToken_ == child)
        {
            this._classToken_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._mainMethodDecl_ == child)
        {
            this._mainMethodDecl_ = null;
            return;
        }

        if(this._mainMethodBody_ == child)
        {
            this._mainMethodBody_ = null;
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._classToken_ == oldChild)
        {
            setClassToken((TClassToken) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(this._mainMethodDecl_ == oldChild)
        {
            setMainMethodDecl((PMainMethodDecl) newChild);
            return;
        }

        if(this._mainMethodBody_ == oldChild)
        {
            setMainMethodBody((PMainMethodBody) newChild);
            return;
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}