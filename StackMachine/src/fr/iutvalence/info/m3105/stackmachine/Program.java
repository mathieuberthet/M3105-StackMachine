package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	private Instruction[] instruction;
	
	public Program(Instruction[] instructions) 
	{
		this.instruction = instructions;
	}
	
	public Instruction[] getinstruction()
	{
		return this.instruction;
	}

}
