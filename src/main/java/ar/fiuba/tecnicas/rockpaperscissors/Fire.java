package ar.fiuba.tecnicas.rockpaperscissors;

public class Fire
{
	@Override
	public boolean equals( Object object )
	{
		return object instanceof Fire;
	}
	
	@Override 
	public int hashCode()
	{
		return (int)Math.random();
	}
	
	public Fire vs( Paper other )
	{
		return new Fire();
	}

	public Rock vs( Rock other )
	{
		return new Rock();
	}
	
	public Fire vs( Scissors other )
	{
		return new Fire();
	}
	
	public Fire vs( Fire other )
	{
		return new Fire();
	}
}
