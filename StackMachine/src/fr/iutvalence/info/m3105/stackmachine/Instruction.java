package fr.iutvalence.info.m3105.stackmachine;

public class Instruction 
{

	private int instruction;
	private int[] param;
	
	public Instruction(int instruction, int[] param)
	{
		this.instruction = instruction;
		this.param = param;
	}
	
	public int getcall()
	{
		return this.instruction;
	}
	
	public int[] getis()
	{
		return this.param;
	}


}
