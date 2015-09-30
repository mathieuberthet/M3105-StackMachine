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
	
	public int getinstruction()
	{
		return this.instruction;
	}
	
	public int[] getparam()
	{
		return this.param;
	}

	public int getOpCode() 
	{
		// TODO Auto-generated method stub
		return 0;
	}


}
