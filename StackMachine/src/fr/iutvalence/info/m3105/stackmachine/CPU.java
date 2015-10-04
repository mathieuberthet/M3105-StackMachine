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
	private int PC;
	
	// TODO something is missing here...

	public CPU()
	{
		
	}
	public void run()
	{
		try
		{
			int opCode;
			while (true)
			{
				opCode = this.programMemory.get(this.PC);

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
						int i;
						this.expStack.push(this.callStack.pop(i));
						break;
					}
					case ADD:
					{
						int res, a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						res = a+b;
						this.expStack.push(res);
						break;
					}
					case SUB:
					{
						int res, a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						res = a-b;
						this.expStack.push(res);
						break;
					}
					case MUL:
					{
						int res, a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						res = a*b;
						this.expStack.push(res);
						break;
					}
					case DIV:
					{
						int res, a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						res = a/b;
						this.expStack.push(res);
						break;
					}
					case MOD:
					{
						int res, a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						res = a%b;
						this.expStack.push(res);
						break;
					}
					case NEG:
					{
						int a;
						this.expStack.pop(a);
						this.expStack.push(-a);
						break;
					}
					case LT:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b < a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
						break;
					}
					case LE:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b <= a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
						break;
					}
					case GT:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b > a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
						break;
					}
					case GE:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b >= a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
						break;
					}
					case EQ:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b == a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
						break;
					}
					case NE:
					{
						int  a, b;
						this.expStack.pop(a);
						this.expStack.pop(b);
						if (b != a)
						{
							this.expStack.push(0);
						}
						this.expStack.push(1);
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
						int op = this.ioSystem.read();
						this.expStack.pop();
						this.ioSystem.write(op);
						break;
					}
					case CALL:
					{
						break;
					}
					case RET:
					{
						int address;
						address = this.callStack.pop();
						this.setPC(address);
						break;
					}
					case JP:
					{
						int address;
						this.setPC(address);
						break;
					}
					case JZ:
					{
						break;
					}
					case DUP:
					{
						break;
					}
					case POP:
					{
						this.expStack.pop();
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
		this.expStack.clear();
		this.callStack.clear();
		
	}

	public void setPC(int address) 
	{
		this.PC = address;
		
	}

	// TODO something is missing here...
}
