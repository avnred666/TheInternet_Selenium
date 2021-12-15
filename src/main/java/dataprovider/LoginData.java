package dataprovider;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name="signin-provider")
    public static Object[][] signInData(){
        Object[][] data = new Object[1][2];
        data[0][0] = "tomsmith";
        data[0][1] = "SuperSecretPassword!";
        return data;
    }
}
