public class MyInteger {
    private int value;
    static int MAX = Integer.MAX_VALUE;
    static int MIN = Integer.MIN_VALUE;

    public MyInteger(int value) {
        this.value = value;
    }

    public void add(){
        this.value += 1;
    }

    public void sub(){
        this.value -= 1;
    }

    public int getValue() {
        return value;
    }
}
