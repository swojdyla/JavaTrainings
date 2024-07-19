public class homework4cz2 {
    public static void main(String[] args) {

    homework4 adam = new homework4();
    adam.imie = "Adam";
    adam.nazwisko = "Adamski";
    adam.numerIndeksu = 231321;
    adam.email = "adam@adam.pl";
    adam.nick = "Adams";

    homework4 kasia = new homework4();
    kasia.imie = "Kasia";
    kasia.nazwisko = "Lupa";
    kasia.numerIndeksu = 231221;
    kasia.email = "kasia@akasm.pl";
    kasia.nick = "Kasiaa1";

    homework4 piotr = new homework4();
    piotr.imie = "Piotr";
    piotr.nazwisko = "Polak";
    piotr.numerIndeksu = 231277;
    piotr.email = "piotr@eas.pl";
    piotr.nick = "Pjoter3";

    homework4[] students = new homework4[3];

    students[0] = adam;
    students[1] = kasia;
    students[2] = piotr;

    for (int i = 0; i < students.length; i++){
        students[i].przedstawSie();
        students[i].podajEmail();
        students[i].podajNrIndeksu();
        students[i].zalogujSię();
    }

    }

}
