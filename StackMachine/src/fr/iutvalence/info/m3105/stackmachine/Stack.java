package fr.iutvalence.info.m3105.stackmachine;

public class Stack {

	private  Stack Stack;
	private int length;
	
	public Stack(int size) throws InvalidParametersException
	{
		if (size < 0)
			throw new InvalidParametersException();
		this.Stack = new Stack(size);
	}
	
	public int getlength()
	{
		return this.length;
	}

	public void push(int i) throws StackOverflowException {
		
	}

	public int pop() throws StackUnderflowException {
		return 0;
	}
	
	public void clear()
	{
		this.Stack.clear();
	}
}
