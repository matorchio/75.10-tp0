package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock 
{
	Rock vs( Scissors scissors )
	{
		return this;
	}
	
	Rock vs( Rock rock )
	{
		return rock;
	}
	
	Paper vs( Paper paper )
	{
		return paper;
	}
}
