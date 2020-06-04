import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {

    @BeforeClass(alwaysRun = true)
    void prepareData() {

    }

    @Test
    void demoTest() {
        System.out.println("test started!");
        Assert.assertEquals(1, 5);

    }


}
