import animal.Animal;
import type.HomeCat;
import type.Lion;

import java.util.Scanner;

public class CatHotel {
    static  int shooseAnimal;
    static String name;
    static int age;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здравствуйте! \n Кого вы принесли к нам в отель? \n Если домашнюю - нажмите 1, \n " +
                "если льва - нажмите 2");
        shooseAnimal = scan.nextInt();
        System.out.println("Сколько ей лет");
        age = scan.nextInt();
        System.out.println("Как ее зовут?");
        name = scan.next();

        Animal[] cat = new Animal[2];
        cat[0] = new HomeCat(age, name);
        cat[1] = new Lion(age, name);

        switch (shooseAnimal) {
            case 1:
                System.out.println("Вашей кошечке " + age + "лет");
                System.out.println("И её зовут " + name);
                System.out.println("Что она умеет делать?");
                cat[0].getSay();
                cat[0].getEat();
                cat[0].getHunt();
                System.out.println(" ");
                System.out.println("Мы разместим ее в комнату 2. Спасибо, что выбрали нас!");

                break;
            case 2:
                System.out.println("Вашему льву " + age + "лет");
                System.out.println("И его зовут " + name);
                System.out.println("Что он умеет делать?");
                cat[1].getSay();
                cat[1].getEat();
                cat[1].getHunt();
                System.out.println(" ");
                System.out.println("Мы разместим его в комнату 7. Спасибо, что выбрали нас!");

                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
        scan.close();
    }
}

