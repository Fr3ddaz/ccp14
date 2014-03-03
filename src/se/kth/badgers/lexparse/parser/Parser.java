/* This file was generated by SableCC (http://www.sablecc.org/). */

package se.kth.badgers.lexparse.parser;

import se.kth.badgers.lexparse.lexer.*;
import se.kth.badgers.lexparse.node.*;
import se.kth.badgers.lexparse.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    @SuppressWarnings({"unchecked","unused"})
    private void push(int numstate, ArrayList<Object> listNode) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PGrammar node1 = (PGrammar) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce AGrammar */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list);
            }
            break;
            case 1: /* reduce AAexplist1ExpList */
            {
                ArrayList<Object> list = new1();
                push(goTo(1), list);
            }
            break;
            case 2: /* reduce AAexplist2ExpList */
            {
                ArrayList<Object> list = new2();
                push(goTo(1), list);
            }
            break;
            case 3: /* reduce AExpListTail */
            {
                ArrayList<Object> list = new3();
                push(goTo(2), list);
            }
            break;
            case 4: /* reduce APlusExp */
            {
                ArrayList<Object> list = new4();
                push(goTo(3), list);
            }
            break;
            case 5: /* reduce AMinusExp */
            {
                ArrayList<Object> list = new5();
                push(goTo(3), list);
            }
            break;
            case 6: /* reduce AFactorExp */
            {
                ArrayList<Object> list = new6();
                push(goTo(3), list);
            }
            break;
            case 7: /* reduce AMultFactor */
            {
                ArrayList<Object> list = new7();
                push(goTo(4), list);
            }
            break;
            case 8: /* reduce ADivFactor */
            {
                ArrayList<Object> list = new8();
                push(goTo(4), list);
            }
            break;
            case 9: /* reduce ATermFactor */
            {
                ArrayList<Object> list = new9();
                push(goTo(4), list);
            }
            break;
            case 10: /* reduce ANumberTerm */
            {
                ArrayList<Object> list = new10();
                push(goTo(5), list);
            }
            break;
            case 11: /* reduce AExpTerm */
            {
                ArrayList<Object> list = new11();
                push(goTo(5), list);
            }
            break;
            case 12: /* reduce ATerminal$ExpListTail */
            {
                ArrayList<Object> list = new12();
                push(goTo(6), list);
            }
            break;
            case 13: /* reduce ANonTerminal$ExpListTail */
            {
                ArrayList<Object> list = new13();
                push(goTo(6), list);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce AGrammar */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PGrammar pgrammarNode1;
        {
            // Block
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        listNode2 = (LinkedList)nodeArrayList1.get(0);
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }

        pgrammarNode1 = new AGrammar(listNode3);
        }
	nodeList.add(pgrammarNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce AAexplist1ExpList */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList1.get(0);
	if(pexpNode1 != null)
	{
	  listNode2.add(pexpNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce AAexplist2ExpList */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        PExp pexpNode1;
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        pexpNode1 = (PExp)nodeArrayList1.get(0);
        listNode2 = (LinkedList)nodeArrayList2.get(0);
	if(pexpNode1 != null)
	{
	  listNode3.add(pexpNode1);
	}
	if(listNode2 != null)
	{
	  listNode3.addAll(listNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce AExpListTail */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList2.get(0);
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce APlusExp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        {
            // Block
        PExp pexpNode2;
        PExp pexpNode3;
        pexpNode2 = (PExp)nodeArrayList1.get(0);
        pexpNode3 = (PExp)nodeArrayList3.get(0);

        pexpNode1 = new APlusExp(pexpNode2, pexpNode3);
        }
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new5() /* reduce AMinusExp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        {
            // Block
        PExp pexpNode2;
        PExp pexpNode3;
        pexpNode2 = (PExp)nodeArrayList1.get(0);
        pexpNode3 = (PExp)nodeArrayList3.get(0);

        pexpNode1 = new AMinusExp(pexpNode2, pexpNode3);
        }
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new6() /* reduce AFactorExp */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList1.get(0);
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new7() /* reduce AMultFactor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        {
            // Block
        PExp pexpNode2;
        PExp pexpNode3;
        pexpNode2 = (PExp)nodeArrayList1.get(0);
        pexpNode3 = (PExp)nodeArrayList3.get(0);

        pexpNode1 = new AMultExp(pexpNode2, pexpNode3);
        }
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new8() /* reduce ADivFactor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        {
            // Block
        PExp pexpNode2;
        PExp pexpNode3;
        pexpNode2 = (PExp)nodeArrayList1.get(0);
        pexpNode3 = (PExp)nodeArrayList3.get(0);

        pexpNode1 = new ADivExp(pexpNode2, pexpNode3);
        }
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new9() /* reduce ATermFactor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList1.get(0);
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new10() /* reduce ANumberTerm */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        {
            // Block
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        pexpNode1 = new ANumberExp(tnumberNode2);
        }
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new11() /* reduce AExpTerm */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList2.get(0);
	nodeList.add(pexpNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new12() /* reduce ATerminal$ExpListTail */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode2 = new LinkedList<Object>();
        {
            // Block
        PExp pexpNode1;
        pexpNode1 = (PExp)nodeArrayList1.get(0);
	if(pexpNode1 != null)
	{
	  listNode2.add(pexpNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new13() /* reduce ANonTerminal$ExpListTail */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        LinkedList<Object> listNode3 = new LinkedList<Object>();
        {
            // Block
        LinkedList<Object> listNode1 = new LinkedList<Object>();
        PExp pexpNode2;
        listNode1 = (LinkedList)nodeArrayList1.get(0);
        pexpNode2 = (PExp)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(pexpNode2 != null)
	{
	  listNode3.add(pexpNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, REDUCE, 10}, },
			{{-1, ERROR, 2}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, ERROR, 3}, {39, ACCEPT, -1}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 1}, {18, SHIFT, 9}, {19, SHIFT, 10}, {33, SHIFT, 11}, },
			{{-1, REDUCE, 6}, {20, SHIFT, 14}, {21, SHIFT, 15}, },
			{{-1, REDUCE, 9}, },
			{{-1, ERROR, 8}, {18, SHIFT, 9}, {19, SHIFT, 10}, {27, SHIFT, 16}, },
			{{-1, ERROR, 9}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, ERROR, 10}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, ERROR, 11}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, REDUCE, 12}, },
			{{-1, REDUCE, 2}, {33, SHIFT, 11}, },
			{{-1, ERROR, 14}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, ERROR, 15}, {17, SHIFT, 1}, {26, SHIFT, 2}, },
			{{-1, REDUCE, 11}, },
			{{-1, REDUCE, 4}, {20, SHIFT, 14}, {21, SHIFT, 15}, },
			{{-1, REDUCE, 5}, {20, SHIFT, 14}, {21, SHIFT, 15}, },
			{{-1, REDUCE, 3}, {18, SHIFT, 9}, {19, SHIFT, 10}, },
			{{-1, REDUCE, 13}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 8}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 3}, },
			{{-1, 4}, },
			{{-1, 12}, {13, 20}, },
			{{-1, 5}, {2, 8}, {11, 19}, },
			{{-1, 6}, {9, 17}, {10, 18}, },
			{{-1, 7}, {14, 21}, {15, 22}, },
			{{-1, 13}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: number, '('",
			"expecting: '+', '-', star, div, ')', ',', EOF",
			"expecting: EOF",
			"expecting: '+', '-', ',', EOF",
			"expecting: '+', '-', ')'",
			"expecting: ',', EOF",
        };*/
    private static int[] errors;
/*      {
			0, 1, 0, 2, 2, 3, 1, 1, 4, 0, 0, 0, 5, 5, 0, 0, 1, 1, 1, 3, 5, 1, 1, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
