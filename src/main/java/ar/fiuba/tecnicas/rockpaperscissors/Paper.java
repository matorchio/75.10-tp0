package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper
{
	Scissors vs( Scissors scissors )
	{
		return scissors;
	}
	
	Paper vs( Rock rock )
	{
		return this;
	}
	
	Paper vs( Paper paper )
	{
		return paper;
	}
}
