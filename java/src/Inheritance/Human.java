package Inheritance;

class Human {
    public void canSpeak() {
        System.out.println("All Human can Speak");
    }
}

class Man extends Human {
    public void Beard() {
        System.out.println(" Man has Beard");
    }
}

class Test {
    public static void main(String[] args) {
        Man m = new Man();
        m.canSpeak();
        m.Beard();
    }
}