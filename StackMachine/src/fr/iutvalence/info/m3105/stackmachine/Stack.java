package fr.iutvalence.info.m3105.stackmachine;

public class Stack {

	// TODO Mettre ici la pile
	private int length;
	
	public Stack(int i) 
	{
		this.length = i;
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
}
