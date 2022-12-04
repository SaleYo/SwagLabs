package com.swag.labs.testExecution;

import com.swag.labs.utility.BeforeAll;
import com.swag.labs.writtenTests.ValidLogIn;
import org.testng.annotations.Test;

public class LogInExe extends BeforeAll {

    @Test
    public void validLogIn(){
        ValidLogIn.logInMethod(driver, wait);
    }
}
