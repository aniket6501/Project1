package DemoProg;

public class input_parameters {

	public void substract(int x, int y) {
		int res = x-y;
		System.out.println("Substraction value is: "+ res);
	}
	//method with input arguements and return type
	public int mul(int x, int y) {
		int res = x*y;
		return res;
	}
	
	public static void main(String[] args) {
		input_parameters obj = new input_parameters();
		obj.substract(20, 10);
		// assigning function value to var
		int res1 = obj.mul(10, 10);
		System.out.println(res1);
		System.out.println(obj.mul(10, 20));

	}

}
