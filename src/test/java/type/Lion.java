package type;

import animal.Animal;
import animal.Huntable;

public class Lion extends Animal implements Huntable {
    public Lion(int age, String name) {
        super(age, name);
    }

    @Override
    public void getSay() {
        System.out.println("ррррррр");
    }

    @Override
    public void getEat() {
        System.out.println("Он может прокормить себя сама, если отпустить на свободу");
    }

    @Override
    public void getHunt() {
        System.out.println("Он может охотиться на крупных животных");
    }
}
