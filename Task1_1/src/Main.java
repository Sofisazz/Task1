public class Main {
    public static void main(String[] args){
        MyInteger maxInteger = new MyInteger(MyInteger.MAX);
        MyInteger minInteger = new MyInteger(MyInteger.MIN);

        MyByte maxByte = new MyByte(MyByte.MAX);
        MyByte minByte = new MyByte(MyByte.MIN);

        MyLong maxLong = new MyLong(MyLong.MAX);
        MyLong minLong = new MyLong(MyLong.MIN);

        MyShort maxShort = new MyShort(MyShort.MAX);
        MyShort minShort = new MyShort(MyShort.MIN);

        System.out.printf("Максимальное значение типа Integer: %d;\n Минимальное значение типа Integer: %d;\n\n ",
                maxInteger.getValue(),minInteger.getValue());

        System.out.printf("Максимальное значение типа Byte: %d;\n Минимальное значение типа Byte: %d;\n\n ",
                maxByte.getValue(),minByte.getValue());

        System.out.printf("Максимальное значение типа Long: %d;\n Минимальное значение типа Long: %d;\n\n ",
                maxLong.getValue(),minLong.getValue());

        System.out.printf("Максимальное значение типа Short: %d;\n Минимальное значение типа Short: %d;\n\n ",
                maxShort.getValue(),minShort.getValue());

        maxInteger.add();
        minInteger.sub();

        maxByte.add();
        minByte.sub();

        maxLong.add();
        minLong.sub();

        maxShort.add();
        minShort.sub();

        System.out.print("Измененные значения:\n");

        System.out.printf("Максимальное значение типа Integer: %d;\n Минимальное значение типа Integer: %d;\n\n ",
                maxInteger.getValue(),minInteger.getValue());

        System.out.printf("Максимальное значение типа Byte: %d;\n Минимальное значение типа Byte: %d;\n\n ",
                maxByte.getValue(),minByte.getValue());

        System.out.printf("Максимальное значение типа Long: %d;\n Минимальное значение типа Long: %d;\n\n ",
                maxLong.getValue(),minLong.getValue());

        System.out.printf("Максимальное значение типа Short: %d;\n Минимальное значение типа Short: %d;\n ",
                maxShort.getValue(),minShort.getValue());
    }
}
