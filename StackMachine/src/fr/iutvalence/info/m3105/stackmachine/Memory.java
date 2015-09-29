package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private int hexadebut;
	private int hexafin;
	
	public Memory(int i, int j) 
	{
		this.hexadebut = i;
		this.hexafin = j;
	}
	
	public int gethexadebut()
	{
		return this.hexadebut;
	}
	
	public int gethexafin()
	{
		return this.hexafin;
	}

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void write(int currentAddress, int instructionParam) {
		// TODO Auto-generated method stub
		
	}


}
