package DemoProg;

public class Breakpoint_Test {
	
	int temp;
	int x,y;
	public void swap(int x, int y) {
		//this pointers
		this.x=x;
		this.y=y;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("Value of x and y are: "+ x +" "+ y);
		
	}
	
	public void greater() {
		if(x>y) {
			System.out.println("value "+x+" is greater than "+y);
		}
		else {
			System.out.println("value "+y+" is greater than "+x);
		}
	}
	
	public static void main(String[] args) {
		
		Breakpoint_Test obj = new Breakpoint_Test();
		obj.swap(10, 20);
		obj.greater();
		
		
	}

}
