/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import java.util.*;
import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class AClassDecl extends PClassDecl
{
    private TClassToken _classToken_;
    private TId _id_;
    private TLBrace _lBrace_;
    private final LinkedList<PVarDecl> _varDecl_ = new LinkedList<PVarDecl>();
    private final LinkedList<PMethodDecl> _methodDecl_ = new LinkedList<PMethodDecl>();
    private TRBrace _rBrace_;

    public AClassDecl()
    {
        // Constructor
    }

    public AClassDecl(
        @SuppressWarnings("hiding") TClassToken _classToken_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") List<?> _varDecl_,
        @SuppressWarnings("hiding") List<?> _methodDecl_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setClassToken(_classToken_);

        setId(_id_);

        setLBrace(_lBrace_);

        setVarDecl(_varDecl_);

        setMethodDecl(_methodDecl_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AClassDecl(
            cloneNode(this._classToken_),
            cloneNode(this._id_),
            cloneNode(this._lBrace_),
            cloneList(this._varDecl_),
            cloneList(this._methodDecl_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClassDecl(this);
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

    public LinkedList<PVarDecl> getVarDecl()
    {
        return this._varDecl_;
    }

    public void setVarDecl(List<?> list)
    {
        for(PVarDecl e : this._varDecl_)
        {
            e.parent(null);
        }
        this._varDecl_.clear();

        for(Object obj_e : list)
        {
            PVarDecl e = (PVarDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._varDecl_.add(e);
        }
    }

    public LinkedList<PMethodDecl> getMethodDecl()
    {
        return this._methodDecl_;
    }

    public void setMethodDecl(List<?> list)
    {
        for(PMethodDecl e : this._methodDecl_)
        {
            e.parent(null);
        }
        this._methodDecl_.clear();

        for(Object obj_e : list)
        {
            PMethodDecl e = (PMethodDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._methodDecl_.add(e);
        }
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
            + toString(this._varDecl_)
            + toString(this._methodDecl_)
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

        if(this._varDecl_.remove(child))
        {
            return;
        }

        if(this._methodDecl_.remove(child))
        {
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

        for(ListIterator<PVarDecl> i = this._varDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVarDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PMethodDecl> i = this._methodDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMethodDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}