public class MyByte {
    private byte value;
    static byte MAX = Byte.MAX_VALUE;
    static byte MIN = Byte.MIN_VALUE;

    public MyByte(byte value) {
        this.value = value;
    }

    public void add(){
        this.value += 1;
    }

    public void sub(){
        this.value -= 1;
    }

    public byte getValue() {
        return value;
    }
}
