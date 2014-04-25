package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper
{
	@Override
	public boolean equals( Object object )
	{
		return object instanceof Paper;
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

	public Paper vs( Rock other )
	{
		return new Paper();
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
