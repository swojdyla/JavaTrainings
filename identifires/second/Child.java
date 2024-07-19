package identifires.second;

import identifires.first.Parent;

public class Child extends Parent {

    // klasa potomna w tej innej paczce nie ma dostepu do pól/metod private oraz default czyli bez identyfikatora
    public void testIdentifire() {
        System.out.println(first);
     //   System.out.println(second);
        System.out.println(third);
        firstMethod();
     //   secondMethod();
        thirdMethod();
    }

}
