package identifires.first;

public class Child extends Parent {
    // klasa potomna w tej samej paczce nie ma dostepu do pól/metod private
    public void testIdentifire() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
}
}
