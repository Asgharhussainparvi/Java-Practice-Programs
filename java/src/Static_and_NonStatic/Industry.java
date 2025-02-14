package Static_and_NonStatic;

public class Industry  {
    public static int Worker = 20;
    public String name;

    public Industry (String name) {
        this.name = name;
        Worker=Worker*2;
    }
}

class Main {
    public static void main(String[] args) {
       Industry ind1 = new Industry("Education");
        System.out.println("The total worker need =" +Industry.Worker);

        Industry ind2 = new Industry("Finance");
        System.out.println("The total worker need =" +Industry.Worker);
    }
}