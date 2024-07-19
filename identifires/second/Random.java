package identifires.second;

import identifires.first.Parent;

public class Random {
    // klasa potomna w tej innej paczce nie ma dostepu do pól/metod private oraz default czyli bez identyfikatora oraz proceted
    public void testIdentifire() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        parent.firstMethod();

    }
}
