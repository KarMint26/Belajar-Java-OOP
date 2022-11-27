package ObjectOrientedProgramming.Java.Karel.Application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {
//                    "Karel", "Trisnanto", "Utomo"
//            };
//            System.out.println(names[100]);
//        } catch (Throwable throwable){
//            //StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        } catch (RuntimeException exception){
            exception.printStackTrace();
        }

    }

    public static void sampleError(){
        try {
            String[] names2 = {
                    "Violet", "GreenLow", "Salmon"
            };

            System.out.println(names2[100]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
