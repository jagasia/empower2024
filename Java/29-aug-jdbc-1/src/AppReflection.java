import java.lang.reflect.Method;

public class AppReflection {
	public static void main(String[] args) {
		Class<Customer> c = Customer.class;
		Method[] methods = c.getMethods();
		for(Method m: methods)
			System.out.println(m.getName());
		
		
	}
}
