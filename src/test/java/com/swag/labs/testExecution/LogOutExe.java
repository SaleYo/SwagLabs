package com.swag.labs.testExecution;

import com.swag.labs.utility.BeforeAll;
import com.swag.labs.writtenTests.ValidLogIn;
import com.swag.labs.writtenTests.ValidLogOut;
import org.testng.annotations.Test;

public class LogOutExe extends BeforeAll {

    @Test
    public void logOut(){
        ValidLogIn.logInMethod(driver, wait);
        ValidLogOut.logOutMethod(driver, wait);
    }
}
