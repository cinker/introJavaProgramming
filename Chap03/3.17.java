import java.util.Scanner;

public class scissor_rock_paper {

	public static void main(String[] args) 
	{
		int computer_token = (int)(Math.random() * 3);
		
		System.out.println("It's your turn. Scissor (0), Rock(1), Paper(2): ");
		
		Scanner input = new Scanner(System.in);
		int user_token = input.nextInt();
		
		if(computer_token == user_token)
			System.out.println("it's a draw.");
		else if(computer_token == 0)
		{
			if(user_token == 1)
				System.out.println("you win.");
			else
				System.out.println("computer wins.");
		}
		else if(computer_token == 1)
		{
			if(user_token == 2)
				System.out.println("you win.");
			else
				System.out.println("computer wins.");
		}
		else if(computer_token == 2)
		{
			if(user_token == 1)
				System.out.println("computer win.");
			else
				System.out.println("you wins");
		}
	}
}
