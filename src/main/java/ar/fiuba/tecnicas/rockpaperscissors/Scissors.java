package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors
{
	@Override
	public boolean equals( Object object )
	{
		return object instanceof Scissors;
	}
	
	@Override 
	public int hashCode()
	{
		return (int)Math.random();
	}
	
	public Scissors vs( Paper other )
	{
		return new Scissors();
	}

	public Rock vs( Rock other )
	{
		return new Rock();
	}
	
	public Scissors vs( Scissors other )
	{
		return new Scissors();
	}
	
	public Fire vs( Fire other )
	{
		return new Fire();
	}
}
