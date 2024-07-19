package identifires.first;

public class Random {
// klasa  w tej samej paczce nie ma dostepu do pól/metod private
    public void testIdentifire() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();

}
}