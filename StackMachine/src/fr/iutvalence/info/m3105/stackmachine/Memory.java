package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private int hexadebut;
	private int hexafin;

	public Memory(int hexadebut, int hexafin) throws InvalidParametersException
	{
		if (hexadebut < 0 || hexafin < 0 || hexadebut<hexafin)
			throw new InvalidParametersException();
		this.hexadebut = hexadebut;
		this.hexafin = hexafin;
	}
	
	public int gethexadebut()
	{
		return this.hexadebut;
	}
	
	public int gethexafin()
	{
		return this.hexafin;
	}

	public int getStartAddress() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void write(int currentAddress, int instructionParam) 
	{
		// TODO Auto-generated method stub
		
	}


}
