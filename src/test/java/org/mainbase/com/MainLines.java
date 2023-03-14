package org.mainbase.com;
import java.awt.AWTException;
	import java.awt.Robot;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MainLines {
		

	public static void maxWindow() {
		driver.manage().window().maximize();
		}
	public static void provideUrl(String url){
	driver.get(url);
	}


	public static WebDriver driver;

	public static void browserLaunch() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

	}

	public static void getTheTitlePage(){
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
	}
	public static void getTitle(){
		String text=driver.getCurrentUrl();
		System.out.println(text);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void robotHandle() throws AWTException {
		Robot r=new Robot(); 
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	public static void threadSleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public static void fluentWait(long ds,long loh,WebElement element) {
		FluentWait<WebDriver>  f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(ds)).pollingEvery(Duration.ofNanos(loh)).ignoring(Throwable.class);
		
	}
	public static void alertScreenAccept() {
		Alert ats=driver.switchTo().alert();
		ats.accept();
	}
	public static void alertScreenDismiss() {
		Alert ats=driver.switchTo().alert();
		ats.dismiss();
	}
	public static void alertScreenGetText() {
		Alert ats=driver.switchTo().alert();
		ats.getText();
	}
	public static void alertScreenSendKeys(String value) {
		Alert ats=driver.switchTo().alert();
		ats.sendKeys(value);
	}

	public static void TakeScreen(String val) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File img=ts.getScreenshotAs(OutputType.FILE);
		File m=new File("C:\\kesh\\SeleniumClass\\Images\\"+val+"");
		FileUtils.copyFile(img,m);
		System.out.println("Screen Shot taken stored name:"+val);
	}

	public static void parVal(WebElement snd,String val) {
		snd.sendKeys(val);
	}
	public static void getattri(WebElement ga) {
		String attrib=ga.getAttribute("value");
		System.out.println(attrib);
	}
	public static void click(WebElement act) {
		Actions a = new Actions(driver);
		a.click(act).perform();
	}
	public static void rightClickAccess(WebElement act) {
		Actions	a = new Actions(driver);
		a.contextClick(act).perform();
	}
	private void doubleClickAccess(WebElement act) {
		Actions	a = new Actions(driver);
		a.doubleClick(act).perform();
	}
	public static void mouseMoveAccess(WebElement act) {
		Actions	a = new Actions(driver);
		a.moveToElement(act).perform();
	}
	public static void dragDropAccess(WebElement source,WebElement target) {
		Actions	a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public static void javaClickAccess(WebElement jve) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()",jve);
	}
	public static void javaScrollAccess(WebElement jve, String val) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView("+ val +")",jve );
	}
	public static  void javapassvalAccess(WebElement jve,String val) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','"+val +"')",jve );
	}
	public static  void javagetval(WebElement jve,String val) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Object text = j.executeScript("return arguments[0].getAttribute('value',)",jve);
		System.out.println(text);
	}
	public static String readDataFromExcel(int rowNo,int cellNo) throws IOException{

			File file = new File("C:\\kesh\\MavenConfi\\ExcelFile\\fb.xlsx");

			FileInputStream fos = new FileInputStream(file);
			
			Workbook wb = new XSSFWorkbook(fos);
			
			Sheet sheet = wb.getSheet("Facebook");
			

			Row allrow = sheet.getRow(rowNo);
				
			Cell c = allrow.getCell(cellNo);

			int cellType = c.getCellType();
			String values ="";
			
			if (cellType==1) {
			values = c.getStringCellValue();
				
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date value = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			    values = sim.format(value);
				
			}
			else {
				double value = c.getNumericCellValue();
				long l = (long)value;
				values = String.valueOf(l);
				
					
			}
			return values;	
			}

	// Write in Excel
	public static void writeExcelInExistingRow(String excelname,String sheetname, int rowno, int cellno,String value) throws IOException {
		
		File f = new File("C:\\kesh\\MavenConfi\\ExcelFile\\"+excelname+".xlsx");
		FileInputStream fos = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fos);
		
		Sheet sh=(Sheet) wb.getSheet(sheetname);
		
		Row cr = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowno);
		Cell c1 = cr.createCell(cellno);
		
		
		c1.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		wb.write(fs);
	}





	public static void writeExcelInNewRow(String excelname,String sheetname, int rowno, int cellno,String value) throws IOException {
		
		File f = new File("C:\\kesh\\MavenConfi\\ExcelFile\\"+excelname+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = (Sheet) book.getSheet(sheetname);
		Row cr = ((org.apache.poi.ss.usermodel.Sheet) sh).createRow(rowno);
		Cell c1 = cr.createCell(cellno);
		c1.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		book.write(fs);
	}
	}




