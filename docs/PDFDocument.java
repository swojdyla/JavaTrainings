package docs;

public class PDFDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I'm PDF document");
    }
}
