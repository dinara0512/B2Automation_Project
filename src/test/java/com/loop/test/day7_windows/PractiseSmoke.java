package com.loop.test.day7_windows;

import com.loop.test.day6_alerts_iframes.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import org.testng.annotations.Test;

public class PractiseSmoke extends TestBase {
    @Test
    public void test_login_client () throws InterruptedException {
        com.loop.test.utilities.DocuportUtils.login(driver, DocuportConstants.USERNAME_CLIENT);
        com.loop.test.utilities.DocuportUtils.logOut(driver);
    }
}


