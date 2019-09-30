package arrays;

public class TwoDimeshsionalArray {

	public static void main(String[] args) {

		String[][] str= new String[4][2];
		
		
		str[0][0]="Username";
		str[0][1]="Password";
		str[1][0]="u1";
		str[1][1]="p1";
		str[2][0]="u2";
		str[2][1]="p2";
		str[3][0]="u3";
		str[3][1]="p3";
		
		//System.out.println(str[2][1]);

		for(int i=0;i<str.length;i++)
		{
			
			for(int j=0;j<str[i].length;j++)
			{
				System.out.println(str[i][j]);
			}
		}
		
		
	}

}
