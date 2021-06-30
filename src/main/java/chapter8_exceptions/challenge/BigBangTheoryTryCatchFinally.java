package chapter8_exceptions.challenge;

public class BigBangTheoryTryCatchFinally {

    static String s = "";

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (RuntimeException e){
            try {
                throw new StackOverflowError();
            } catch (IllegalArgumentException | NullPointerException | IndexOutOfBoundsException x){
                s += "Sheldon ";
            } catch (Error error){
                s+= "Penny ";
            } finally {
                s += "Leo ";
            }
        } finally {
            s += "Howard ";
            try {
                throw new VirtualMachineError("Wrong experience formula"){ };
            } catch (Exception | StackOverflowError error){
                s += "Raj ";
            } catch (Throwable error){
                s += "Melissa ";
            }
        }

        System.out.println(s);
    }
}
