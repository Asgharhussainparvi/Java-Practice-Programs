package Generic_Class;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }
    public static void main(String[] args) {
        // Pair with Strings
        Pair<String, String> namePair = new Pair<>("John", "Doe");
        System.out.println("Name Pair: " + namePair.getFirst() + " " + namePair.getSecond());

        // Pair with Integers
        Pair<Integer, Double> scorePair = new Pair<>(95, 87.5);
        System.out.println("Score Pair: " + scorePair.getFirst() + " " + scorePair.getSecond());

    }
}



