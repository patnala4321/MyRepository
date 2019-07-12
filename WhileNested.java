
public class WhileNested {

	public static void main(String[] args) {
		int i = 1,j;
		while (i <= 5) 
		{
			j=1;
			while (j <= 5)
			{
				System.out.print(1+ " ");
				j++;
			}
			System.out.println();
			i++;	
		}
	}
}
