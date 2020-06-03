import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

    @BeforeClass(alwaysRun = true)
    void prepareData() {
        Assert.assertEquals(1, 5);
    }

    @Test
    void demoTest() {
        System.out.println("test started!");
    }


}
