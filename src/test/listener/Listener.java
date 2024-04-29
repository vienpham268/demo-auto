package listener;

import allure.AllureManager;
import org.testng.ITestListener;
import org.testng.ITestResult;
import scripts.BaseTest;

public class Listener extends BaseTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        if (!result.getThrowable().toString().contains("Assert"))
            AllureManager.captureImage();
    }
}
