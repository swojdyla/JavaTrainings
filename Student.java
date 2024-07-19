public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + nazwisko);
    }
    public void zalogujSie() {
        System.out.println("Loguje sie za pomocą " + nick);
    }
    public void podajNrIndeksu (){
        System.out.println("Numer indeksu " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Email to " + email);
    }
    public static void infoUczelnia() {
        System.out.println("Moja uczenia to " + nazwaUczelni);
        druga();
    }
    public static void druga() {
        System.out.println("Jestem drugą metoda");
    }
}
