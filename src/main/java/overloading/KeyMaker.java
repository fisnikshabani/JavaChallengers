package overloading;

public class KeyMaker {
    public static void main(String[] args) {

        char keyChar = 1;
        System.out.println(keyChar);

        double keyDouble = keyChar;
        System.out.println(keyDouble);

        short keyShort = 1;
        System.out.println(keyShort);

        float keyFloat = keyShort;
        System.out.println(keyFloat);

        int keyInt = (int) keyDouble;
        System.out.println(keyInt);

        byte keyByte = (byte) keyDouble;
        System.out.println(keyByte);

        long keyLong = (long) keyFloat;
        System.out.println(keyLong);
    }
}
