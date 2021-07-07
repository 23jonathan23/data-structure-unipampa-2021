package Counter;

public class Counter {
  private int count = 0;

  public Counter(int initialCount) {
    count = initialCount;
  }

  public int getCount() {
    return count;
  }

  public void increment() {
    count++;
  }

  public void decrement() {
    count--;
  }

  public void reset() {
    count = 0;
  }
}