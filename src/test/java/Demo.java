import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

    @BeforeClass(alwaysRun = true)
    void prepareData() {
        throw new SkipException("before skip");

    }

    @Test
    void demoTest() {
//        throw new SkipException("test skip");

    }

    @Test
    void demoTest1() {
        System.out.println("test1 started!");


    }

    @Test
    void demoTest2() {
        System.out.println("test2 started!");

    }

}
