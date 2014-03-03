/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.node;

import java.util.*;
import se.kth.badgers.lexparse.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private PMainClass _mainClass_;
    private final LinkedList<PClassDecl> _classDecl_ = new LinkedList<PClassDecl>();

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") PMainClass _mainClass_,
        @SuppressWarnings("hiding") List<?> _classDecl_)
    {
        // Constructor
        setMainClass(_mainClass_);

        setClassDecl(_classDecl_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._mainClass_),
            cloneList(this._classDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public PMainClass getMainClass()
    {
        return this._mainClass_;
    }

    public void setMainClass(PMainClass node)
    {
        if(this._mainClass_ != null)
        {
            this._mainClass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mainClass_ = node;
    }

    public LinkedList<PClassDecl> getClassDecl()
    {
        return this._classDecl_;
    }

    public void setClassDecl(List<?> list)
    {
        for(PClassDecl e : this._classDecl_)
        {
            e.parent(null);
        }
        this._classDecl_.clear();

        for(Object obj_e : list)
        {
            PClassDecl e = (PClassDecl) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._classDecl_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mainClass_)
            + toString(this._classDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mainClass_ == child)
        {
            this._mainClass_ = null;
            return;
        }

        if(this._classDecl_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mainClass_ == oldChild)
        {
            setMainClass((PMainClass) newChild);
            return;
        }

        for(ListIterator<PClassDecl> i = this._classDecl_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PClassDecl) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}