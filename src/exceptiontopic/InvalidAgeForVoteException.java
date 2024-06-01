package exceptiontopic;

// checked Exception
//public class InvalidAgeForVoteException extends Exception


//Un-checked Exception
//public class InvalidAgeForVoteException extends RuntimeException


//public class InvalidAgeForVoteException extends Exception


public class InvalidAgeForVoteException extends RuntimeException
{
	public InvalidAgeForVoteException(String exceptionMsg)
	{
		// set into [errorlog]
		super(exceptionMsg);
	}
}
