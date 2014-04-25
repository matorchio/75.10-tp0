package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock
{
	@Override
	public boolean equals( Object object )
	{
		return object instanceof Rock;
	}
	
	@Override 
	public int hashCode()
	{
		return (int)Math.random();
	}
	
	public Paper vs( Paper other )
	{
		return new Paper();
	}

	public Rock vs( Rock other )
	{
		return new Rock();
	}
	
	public Rock vs( Scissors other )
	{
		return new Rock();
	}
	
	public Rock vs( Fire other )
	{
		return new Rock();
	}
}
