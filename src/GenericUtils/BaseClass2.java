package GenericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ElementRepository.BasePage;
import ElementRepository.ElectronicsPage;
import ElementRepository.ShoppingCart;
import ElementRepository.loginPage;

public class BaseClass2 implements IAutoConstant, ITestListener {
	
	public static WebDriver driver;
	public FileLibrary flib;
	public loginPage lp;
	public BasePage bp;
	public ElectronicsPage ep;
	public ShoppingCart scp;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("BeforeSuite", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("BeforeTest", true);
	}

	@Parameters("bname")
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browserName) {

		Reporter.log("BeforeClass", true);
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		scp = new ShoppingCart(driver);
		ep = new ElectronicsPage(driver);
		bp = new BasePage(driver);
		lp = new loginPage(driver);
		flib = new FileLibrary();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));

	}

	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("BeforeMethod", true);

		driver.get(flib.fetchDataFromproperties(PropertyFilePath, "url"));
		lp.getLoginLink().click();
		lp.getEmailTB().sendKeys(flib.fetchDataFromproperties(PropertyFilePath, "email"));
		lp.getPasswordTB().sendKeys(flib.fetchDataFromproperties(PropertyFilePath, "password"));
		lp.getLoginBtn().click();
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("AfterMethod", true);
		lp.getlogoutLink().click();
	}

	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("AfterClass", true);
		driver.close();
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("AfterTest", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("AfterSuite", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "-- is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "-- is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "-- is failed");
		LocalDateTime ldt = LocalDateTime.now();
		String time = ldt.toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(ScreenshotPath + "screenshot" + time + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (Exception e) {
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase--" + result.getName() + "-- is skipped");
	}

	public void OnStart(ITestContext context) {
		Reporter.log("[context--" + context.getName() + "-- is started");
	}

	public void OnFinish(ITestContext context) {
		Reporter.log("[context--" + context.getName() + "-- is finished");
	}
}