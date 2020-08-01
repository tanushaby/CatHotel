package type;

import animal.Animal;
import animal.Huntable;

public class HomeCat extends Animal implements Huntable {
    public HomeCat(int age, String name) {
        super(age, name);
    }

    @Override
    public void getSay() {
        System.out.println("Она говорит мяу-мяу, мур-мур");
    }

    @Override
    public void getEat() {
        System.out.println("Она ест то, что даст хозяин");
    }

    @Override
    public void getHunt() {
        System.out.println("Она люблит охотиться на птичек и мышей");
    }
}

