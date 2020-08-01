package animal;

public abstract class Animal implements Huntable{

    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void getSay();

    public abstract void getEat();

}
