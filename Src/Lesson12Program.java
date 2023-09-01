import Helper.*;

import static Helper.Sex.FEMALE;
import static Helper.Sex.MALE;

public class Lesson12Program {
    public static void main(String[] args) {

        Human human = new Human("Kate", 24, FEMALE);

        System.out.println(human);

        human.setName("Mike");
        human.setSex(MALE);
        System.out.println(human);

//        Book b1 = new Book("War and Peace", "L. Tolstoy", Topic.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch (b1.bookType) {
//            case BELLETRE:
//                System.out.println(" Belletre");
//                break;
//            case SCIENCE:
//                System.out.println(" Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println(" Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println(" Phantasy");
//                break;
//        }

//        Operation op = Operation.SUM;
//        System.out.println(op.action(10, 4));   // 14
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));    // 24


//        System.out.println(Color.RED);
//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.GREEN);
//        System.out.println(Color.GREEN.getCode());      // #00FF00

//        Topic[] topics = Topic.values();
//        for (Topic s : topics) {
//            System.out.println(s);
//        }
//
//        //Метод ordinal() повертає порядковый номер константи (нумерація починається з 0):
//        System.out.println(Topic.BELLETRE.ordinal());


//        Day current = Day.FRIDAY;
//        System.out.println(current);    // Friday

//        Figure square = new Figure(0, 1) {
//
//            @Override
//            public float getPerimeter() {
//                return 4*5;
//            }
//
//            @Override
//            public float getArea() {
//                return 5*5;
//            }
//        };

//        Figure rectangle = new Rectangle(0, 1, 10, 15);
//        Figure circle = new Circle(-10, -2, 6);
//
//        System.out.println("Rectangle");
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//
//        System.out.println("circle");
//        System.out.println(circle.getPerimeter());
//        System.out.println(circle.getArea());

//        Employee sam = new Employee("Sam", "Leman Brothers");
//        sam.display();
//        sam.voice();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//        bob.voice();
    }
}
