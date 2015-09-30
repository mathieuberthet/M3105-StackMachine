package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public class CPU
{

	public final static int HALT 	= 0x00;
	public final static int PUSH  	= 0x01;
	public final static int ADD 	= 0x02;
	public final static int SUB 	= 0x03;
	public final static int MUL 	= 0x04;
	public final static int DIV 	= 0x05;
	public final static int MOD 	= 0x06;
	public final static int NEG 	= 0x07;
	public final static int LT 		= 0x08;
	public final static int LE 		= 0x09;
	public final static int GT 		= 0x0A;
	public final static int GE 		= 0x0B;
	public final static int EQ 		= 0x0C;
	public final static int NE 		= 0x0D;
	public final static int IN 		= 0x0E;
	public final static int OUT 	= 0x0F;
	public final static int CALL 	= 0x10;
	public final static int RET		= 0x11;
	public final static int JP		= 0x12;
	public final static int JZ		= 0x13;
	public final static int DUP		= 0x14;
	public final static int POP		= 0x15;
	private int opCode;
	private IO ioSystem;
	private Stack expStack;
	private Memory programMemory;
	private Stack callStack;
	
	// TODO something is missing here...

	public CPU()
	{
		
	}
	public void run(int address, int value)
	{
		try
		{
			while (true)
			{
				// TODO something is missing here...

				// System.err.print("@" + this.programCounter + ": ");
				// int i = this.programMemory.getAt(this)
				switch (opCode)
				{
					case HALT:
					{
						// System.err.println("HALT");
						this.ioSystem.displayProgramTermination();
						return;
					}
					case PUSH:
					{
						break;
					}
					case ADD:
					{
						break;
					}
					case SUB:
					{
						break;
					}
					case MUL:
					{
						break;
					}
					case DIV:
					{
						break;
					}
					case MOD:
					{
						break;
					}
					case NEG:
					{
						break;
					}
					case LT:
					{
						break;
					}
					case LE:
					{
						break;
					}
					case GT:
					{
						break;
					}
					case GE:
					{
						break;
					}
					case EQ:
					{
						break;
					}
					case NE:
					{
						break;
					}
					case IN:
					{
						int i = this.ioSystem.read();
						this.expStack.push(i);
						
						break;
					}
					case OUT:
					{
						this.io.out();
						break;
					}
					case CALL:
					{
						this.io.call(address);
						break;
					}
					case RET:
					{
						this.io.ret();
						break;
					}
					case JP:
					{
						this.io.jp(address);
						break;
					}
					case JZ:
					{
						this.io.jz(address);
						break;
					}
					case DUP:
					{
						this.io.dup();
						break;
					}
					case POP:
					{
						this.io.pop();
						break;
					}
					default:
					{
						// TODO something is missing here...
						return;
					}
				}
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{
			// TODO something is missing here...
		}		
	}

	public void wireToProgramMemory(Memory programMemory) 
	{
		this.programMemory = programMemory;
	}

	public void wireToExpStack(Stack expStack) 
	{
		this.expStack = expStack;
	}

	public void wireToCallStack(Stack callStack) 
	{
		this.callStack = callStack;
	}

	public void wireToIoSubsystem(IO ioSystem) 
	{
		this.ioSystem = ioSystem;
	}

	public void clearStacks() 
	{
		// TODO Auto-generated method stub
		
	}

	public void setPC(int address) 
	{
		// TODO Auto-generated method stub
		
	}

	// TODO something is missing here...
}
