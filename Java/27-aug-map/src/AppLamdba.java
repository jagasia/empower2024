interface Person
{
	void speak();
}


public class AppLamdba {
	public static void main(String[] args) {
		Person raja=()->{
			System.out.println("Raja speaks");
		};
		
		raja.speak();
	}
}
