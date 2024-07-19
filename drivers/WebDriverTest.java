package drivers;

import javax.crypto.NullCipher;

public class WebDriverTest {

    public static void main(String[] args) {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i<driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }
        WebDriver driver = getDriver(DriverType.FIREFOX);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        firefox.findElementBy();
    }

    private static WebDriver getDriver(DriverType type) {
        if(type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
            System.out.println("type.path");
            return new FirefoxDriver();

    }
}
