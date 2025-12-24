public class MyLong {
    private long value;
    static long MAX = Long.MAX_VALUE;
    static long MIN = Long.MIN_VALUE;

    public MyLong(long value) {
        this.value = value;
    }

    public void add(){
        this.value += 1;
    }

    public void sub(){
        this.value -= 1;
    }

    public long getValue() {
        return value;
    }
}
