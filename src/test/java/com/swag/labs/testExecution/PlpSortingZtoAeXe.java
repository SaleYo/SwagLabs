package com.swag.labs.testExecution;

import com.swag.labs.utility.BeforeAll;
import com.swag.labs.writtenTests.PlpSorting;
import com.swag.labs.writtenTests.ValidLogIn;
import org.testng.annotations.Test;

public class PlpSortingZtoAeXe extends BeforeAll {

    @Test
    public void sortingZtoA(){
        ValidLogIn.logInMethod(driver, wait);
        PlpSorting.sortingProductsZtoAMethod(driver, wait);
    }
}
