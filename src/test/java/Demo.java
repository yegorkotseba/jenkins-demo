import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

    @BeforeClass(alwaysRun = true)
    void prepareData() {
        throw new NullPointerException();
    }

    @Test
    void demoTest() {
        System.out.println("test started!");
    }


}
