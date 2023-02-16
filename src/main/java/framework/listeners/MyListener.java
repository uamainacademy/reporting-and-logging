package framework.listeners;


@Log4j2
public class MyListener implements ITestListener {

  @Override
  public void onTestStart(ITestResult iTestResult) {

  }

  @Override
  public void onTestSuccess(ITestResult iTestResult) {
    log.info("******************** The best test ever ********************");
  }

  @Override
  public void onTestFailure(ITestResult iTestResult) {
    Helpers.takeScreenShot(iTestResult.getName());
  }

  @Override
  public void onTestSkipped(ITestResult iTestResult) {

  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

  }

  @Override
  public void onStart(ITestContext iTestContext) {

  }

  @Override
  public void onFinish(ITestContext iTestContext) {

  }
}
