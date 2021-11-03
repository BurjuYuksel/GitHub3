import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

    @DataProvider(name = "invalid Credentials")
    public Object[][] getData() {

        Object[][] array = {{"Admin", "123", "Invalid credentials"},
                {"Admin", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "password can not be empty"},
                {"", "Hum@nhrm123", "userName can not be empty"}};

        return array;


    }
    @Test(dataProvider = "Invalid Credentials")
    public void mytest(String password,String userName,String message){
        System.out.println("username: " + userName);
        System.out.println("password:"+password);
        System.out.println("Message:"+message);

    }
    @AfterMethod()
    public void aftertest(){
        System.out.println("i have a executed");

    }
    }
