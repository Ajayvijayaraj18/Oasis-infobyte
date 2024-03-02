import java.io.*;
import java.util.Scanner;
import java.util.Random;
class Numbergame
{
  public static void main (String[]args)
  {
    
    Numbergame ng = new Numbergame ();
    ng.randomcompare ();
  }
  void randomcompare ()
  {
    
    Random r = new Random ();
    int rand = r.nextInt (100);


    System.out.println ("\n\t\tNUMBER GAME\n\n YOU HAVE 5 ATTEMPTS TO TRY..BEST OF LUCK!!");
    int i = 1;

    
    while (i <= 5)
      {

	System.out.println ("\n  ATTEMPT : " + (i));
	Scanner sc = new Scanner (System.in);


	System.out.print ("\tGuess the generated number:");
	int uinp = sc.nextInt ();

	
	if (uinp == rand)
	{
	    System.out.println ("\n\t<--GREAT JOB! YOU WON!!-->");
	    break;
	}
	else if (uinp < rand)
	{
	    System.out.println ("\n\t<--YOUR GUESS IS SMALL-->");
	}
	else
	{
	    System.out.println ("\n\t<--YOUR GUESS IS LARGE-->");
	}
	i++;

	
	if (i == 6)
	{
	    System.out.println ("\n\t\tOUT OF ATTEMPTS");
	}

    }				
    if (i == 1)
    {
	    System.out.println ("\n\tYOUR SCORE = 100");
    }
    else if (i == 2)
    {
	    System.out.println ("\n\tYOUR SCORE = 80");
    }
    else if (i == 3)
    {
	    System.out.println ("\n\tYOUR SCORE = 60");
    }
    else if (i == 4)
    {
	    System.out.println ("\n\tYOUR SCORE = 40");
    }
    else if (i == 5)
    {
	    System.out.println ("\n\tYOUR SCORE = 20");
    }
    else
    {
	    System.out.println ("\n\tYOUR SCORE = 0");
    }
        System.out.println ("\n\n\t\t***GOOD TRY***");
  }
}