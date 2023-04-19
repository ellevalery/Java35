package oop.abstraction;

public abstract class Pet {

    protected String color;
    protected String eat;
    protected String place;
    protected String averageAge;

    public Pet(String color, String eat, String place, int averageAge){
        this.color = color;
        this.eat = eat;
        this.place = place;
    }

    public abstract void printPetInfo();

}

