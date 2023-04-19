package oop.interfaces;

interface Bug {
    public void bugSound();
    public void bugSize();
}

class Ant implements Bug{
    public void bugSound(){
        System.out.println("tsss");
    }

    @Override
    public void bugSize() {
        System.out.println("Small");
    }
    public void location(){
        System.out.println("Forest");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

    }
}
