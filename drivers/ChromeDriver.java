package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduę element w przeglądarce Chrome");

    }
}
