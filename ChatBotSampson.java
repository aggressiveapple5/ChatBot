/**
* This is a very basic chat bot.
* He will have very short and very basic 
* conversations with the user
* Bug: If the user types bye after the first question,
* the program will not quit until after the second question
* @author Matt Keller
* @version 1.0
*/
import java.util.Scanner;

public class ChatBotSampson
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi friend. I'm Sampson. What's your name? ");
		String name = keyboard.nextLine();
		System.out.println("Nice to meet you, " + name + "!");
		String response = ("");
		
		while(!response.equals("bye") && (!response.equals("Bye")))
		{
				int correct = 0;
			System.out.println("I'd love to talk about sports. What's your favorite football team? ");
			response = keyboard.nextLine();
			if((response.equals("giants")) || (response.equals("Giants")))
			{
				System.out.println("No way! That's my favorite team too!");
				correct = 1;
			}
			else
			{
				System.out.println("Boooooooooo!");
			}
			
			System.out.println("Food is my second favorite. What's your favorite food?");
			response = keyboard.nextLine();
			if ((response.equals("pizza")) || (response.equals("Pizza")))
			{
				
				if (correct == 1)
				{
					System.out.println("We have the same favorite football team and food!");
				}
				else if (correct == 0)
				{
					System.out.println("There's no food better!");
				}
			}
			else
			{
				System.out.println("Thats' pretty good. My favorite food is pizza, though.");
			}
			
			
			
		}
	
	
	
	
	
	
	
	
	
	}










}