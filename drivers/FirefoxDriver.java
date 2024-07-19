package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce firefox");

    }
}
