import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    
    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }

        if (!result.wasSuccessful()) {
            System.out.println("Some tests failed");
            System.exit(1);
        } else {
            System.out.println("All tests passed");
            System.exit(0);
        }
    }
}
