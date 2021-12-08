package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.Driver;

public class GoogleTest {

    GooglePage page=new GooglePage(); //ya da bu classi GooglePage classa extends yaparsak object olusturmaya gerek kalmaz.


    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        page.searchBox.sendKeys("testng"+ Keys.ENTER);

    }
}
