public class DemoRuntimeException {
    public static void main(String[] args) {

        int y = 0;
        // int x = 10/y;

        int[] arr = new int[3];

        // System.out.println(arr[3]);


        // Solution: try-catch
        int count = 0;
        try {
            System.out.println("abc");
            int p = 10 / count; // error, go to printer hello
            System.out.println(p);
        } catch (ArithmeticException e) {
            System.out.println("Hello");
        }

        String input = "123a";
        try {
            int j = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is not a interger value");
        }

        // Customer Excpetion
        //calculate (-1,9);
        //FINALLY
        y=0;
        // happy flow
        try{
            int answer = 10/y;
        } catch(ArithmeticException e){
            //Unhappy flow

        } finally{
            //happy and unhappy flow will do together
            System.out.println("End");
        }
        


    }

    // throw Bueinss exception
    public static int calculate(int x, int y) {
        if (x < 0 || y < 0) {
            throw new BusinessRuntimeException();
        }
        return x + y;
    }
}
