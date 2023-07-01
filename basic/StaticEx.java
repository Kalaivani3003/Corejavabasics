package basic;
class Student {
		public static int fee;
		public static String name="kalai";
}
public class StaticEx {
	public static void main(String[] args) {
		Student.fee=1000;
		System.out.println("fee : "+Student.fee);
		Student.name="vani";
		System.out.println("Name :"+Student.name);
	
		

	}

}
