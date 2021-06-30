package chapter8_exceptions.challenge;

public class NoBeerExceptionChallenger {

    static String finalResult = "";

    public static void main(String[] args) {

        try (NoBeerException exception = new NoBeerException()) {
            
            finalResult += "GetBeer";
            throw new NoAlcoholError();
        } catch (Exception exception){
            finalResult += "NoWhiskey";
        } catch (Error error){
            finalResult += "NoWine";
        } finally {
            try {
                int i = 1 / 0;
            } catch (NoBarException noBar){
                finalResult += "NoBar";
            }catch (RuntimeException exception){
                finalResult += "NoAlcohol";
            }
        }
        System.out.println(finalResult);
    }

    static class NoBeerException extends Exception implements AutoCloseable{
        public void close(){
            finalResult += "BarClosing";
            throw new NoBarException();
        }
    }

    static class NoBarException extends RuntimeException{}
    static class NoAlcoholError extends Error{}


}




