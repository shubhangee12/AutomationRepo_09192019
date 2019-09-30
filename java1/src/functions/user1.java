package functions;

public class user1 {

	public static void main(String[] args) 
	{
         Car test= new Car();
         test.wheels=5;
         test.colour="Red";
         test.Type="Sport";
         test.acceleration();
        		 
		Car Car2=new Car();
		Car2.wheels=4;
		//Car2.colour="Orange";
		//Car2.Type="XT+";
		Car2.acceleration();
		
		System.out.println(test.colour);

		System.out.println(test.wheels);
		
	}

}
