public class AppChecker {
    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp("Calculator");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        iphoneApp iphoneApp = new iphoneApp("Calculator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
