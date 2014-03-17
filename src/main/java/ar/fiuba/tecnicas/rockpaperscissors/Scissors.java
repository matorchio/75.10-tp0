package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors
{
	Scissors vs( Scissors scissors )
	{
		return scissors;
	}
	
	Rock vs( Rock rock )
	{
		return rock;
	}
	
	Scissors vs( Paper paper )
	{
		return this;
	}
}
