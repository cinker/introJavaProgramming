package test;

public class pyramid {

	public static void main(String[] args) {
		int i, j, k;
		for(i = 1; i<=6; i++)
		{
			for(k = 6-i; k>0 ; k--)
			{
				System.out.print(" ");
				System.out.print(" ");
			}
			
			for(j = i; j>0 ; j--)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
