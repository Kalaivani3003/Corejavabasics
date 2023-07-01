package basic;
	class Operation{
		void addition(int a,int b,int c) {
			System.out.println("Addition of 3 numbers: "+(a+b+c));;
		}
		int divide (int a,int b) {
			return a/b;
		}
	}
public class Typesofmethod {

	public static void main(String[] args) {
		Operation o=new Operation();
		o.addition(10, 5, 5);
		}

}
