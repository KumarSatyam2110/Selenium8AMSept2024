package ExtentReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String takeScreenShot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        String timestamp = new SimpleDateFormat("yyyyMMdd___hhmmss").format(new Date());
        String filename = "IMG" + timestamp + ".png";

        File srcfile = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("Report\\screenshots\\"+filename));

        return filename;

    }

    public static ExtentReports initExtentObj() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Exchange Report");
        reporter.config().setReportName("Regression Test");

        extent.setSystemInfo("createdBy", "Satyam");
        extent.setSystemInfo("project Start Date", "21-10-2024");
        extent.setSystemInfo("developer Name", "Sahil");
        extent.setSystemInfo("Tester Name", "Siddharth");

        return extent;
    }


}
