package Counter;

public class Startup {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        for(int i = 0; i < 10; i++) {
            counter.increment();
        }

        for(int i = 0; i < 8; i++) {
            counter.decrement();
        }

        System.out.println("Contador atual " + counter.getCount());
        
        counter.reset();
    }
}
