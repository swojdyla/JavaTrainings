package docs;

import javax.print.Doc;

public class ExcelDocument implements Document {
    @Override
    public void getDescription() {
        System.out.println("I'm excel domument");
    }
}
