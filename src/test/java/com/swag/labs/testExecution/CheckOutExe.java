package com.swag.labs.testExecution;

import com.swag.labs.utility.BeforeAll;
import com.swag.labs.writtenTests.CheckOut;
import com.swag.labs.writtenTests.ValidLogIn;
import org.testng.annotations.Test;

public class CheckOutExe extends BeforeAll {

    @Test
    public void checkOut(){
        ValidLogIn.logInMethod(driver, wait);
        CheckOut.checkOutMethod(driver, wait);
    }

}
