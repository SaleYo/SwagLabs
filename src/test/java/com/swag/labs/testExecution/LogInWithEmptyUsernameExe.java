package com.swag.labs.testExecution;

import com.swag.labs.utility.BeforeAll;
import com.swag.labs.writtenTests.LogInWithoutUserName;
import org.testng.annotations.Test;

public class LogInWithEmptyUsernameExe extends BeforeAll {

    @Test
    public void logInWithoutUsername(){
        LogInWithoutUserName.logInWithoutUserMethod(driver, wait);
    }
}
