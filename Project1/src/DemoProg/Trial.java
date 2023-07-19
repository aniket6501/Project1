package DemoProg;

public class Trial 
{
	int roll_no=32;
	
	public void display() {
		System.out.println("Roll No. is: "+ roll_no);
	}
	
	public void add() {
		int a = 12;
		int b= 24;
		int add = a + b;
		System.out.println("Addition value is:"+add);
	}

	public static void main(String[] args) {
		// new memory is allocated 
		Trial obj1 = new Trial();
		obj1.display();
		obj1.add();
		//System.out.println(obj1.roll_no);
	}

}
