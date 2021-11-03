import org.testng.annotations.*;

public class testNG {

    @BeforeClass
    public void beforeclass() {
        System.out.println("i am before class method");
    }


    @BeforeMethod
    public void beforemethod() {

        System.out.println("i am before method");
    }


    @Test
    public void test1() {

        System.out.println("i am test1");
    }

    @Test
    public void test2() {

        System.out.println("i am test2");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("i am after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("i am after class method");
    }


@BeforeSuite
public void BeforeSuite() {
    System.out.println("i am before suite");

}
@AfterSuite

public void AfterSuite(){
    System.out.println("i am after suite");

}

}