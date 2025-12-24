public class MyShort {
    private short value;
    static short MAX = Short.MAX_VALUE;
    static short MIN = Short.MIN_VALUE;

    public MyShort(short value) {
        this.value = value;
    }

    public void add(){
        this.value += 1;
    }

    public void sub(){
        this.value -= 1;
    }

    public short getValue() {
        return value;
    }
}
