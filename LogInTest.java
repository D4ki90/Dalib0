package tests;

import org.junit.Test;

import pages.LogInPage;

public class LogInTest extends BaseTest {

    public LogInPage loginPage;
    @Test
    public void loginTC1 (){

        LogInPage loginPage = new LogInPage(driver);
        loginPage.basePage();
        loginPage.login("standard_user", "secret_sauce");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    
}
