public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Adamski";
        adam.numerIndeksu = 231321;
        adam.email = "adam@adam.pl";
        adam.nick = "Adams";
        String uczelniaAdama = adam.nazwaUczelni;
        adam.infoUczelnia();

        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nazwisko = "Lupa";
        kasia.numerIndeksu = 231221;
        kasia.email = "kasia@akasm.pl";
        kasia.nick = "Kasiaa1";

        Student piotr = new Student();
        piotr.imie = "Piotr";
        piotr.nazwisko = "Polak";
        piotr.numerIndeksu = 231277;
        piotr.email = "piotr@eas.pl";
        piotr.nick = "Pjoter3";

        Student[] students = new Student[3];

        students[0] = adam;
        students[1] = kasia;
        students[2] = piotr;

        for (int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();

        }

    }
}
