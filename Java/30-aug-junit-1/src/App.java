import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.empower.demo.test.MathematicsTest;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathematicsTest.class);
		List<Failure> failures = result.getFailures();
		for(Failure f :failures)
		{
			System.out.println(f.getMessage());
		}
	}

}
