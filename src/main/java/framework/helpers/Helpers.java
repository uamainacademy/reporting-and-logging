package framework.helpers;

import com.github.javafaker.Faker;
import com.opencart.demo.components.Products;
import com.opencart.demo.pages.BasePage;
import io.qameta.allure.Attachment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Helpers {


  @SneakyThrows
  public static void makeScreenShot() {
    File scrFile = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile,
        new File("/Users/olegdatsiuk/IdeaProjects/pageObjectLab/src/test/resources/sreenshots/"
            + new Faker().random().hex(10) + ".png"));
  }


  @Attachment(value = "{fileName}", type = "image/png")
  public static byte[] takeScreenShot(String fileName) {
    return ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);
  }


}