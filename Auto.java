public class Auto {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;


    public Auto () {

    }
    public Auto(String marka, String model, int rokProdukcji, int przebieg){
    this.marka = marka;
    this.model = model;
    this.rokProdukcji = rokProdukcji;
    this.przebieg = przebieg;
    }

    public void  jedz() {
        System.out.println("JADE!");
    }
    public void hamuj() {
        System.out.println("HAMUJ!");
    }
    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Prebieg : " + przebieg);
    }
}
