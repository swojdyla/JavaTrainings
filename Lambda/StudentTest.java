package Lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 21);


        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
            }
        };

        sayHello("Kate", med, 31);

        // parametr -> System.out.println("My name is " + name);

        Student noStudent = (name, age) -> System.out.println("I'm not a student, I'm " + age);

        sayHello("Tom", noStudent, 21);
    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name,age);
    }
}
