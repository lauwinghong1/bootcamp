public class DemoIf {
    public static void main(String[] args)  {
        int x = 3;
        boolean result= x > 2;
        if (result){
            System.out.println("x > 2");
        }

        int age = 66;
        boolean isElderly = age >= 65;
        if (isElderly) {
            System.out.println("Elderly");
        }
        
        String s = "hello";
        if (s.length()>4) {
            System.out.println("length > 4");
        } else {
            System.out.println("Length <= 4");
        }

        int a = 200;
        int b = 10;
        int max = -1;
        if (a > b) {
            max = a; 
        } else {
            max = b;
        } 
        System.out.println("max="+max);

        int historyScore = 70;
        int passRate = 60;
        boolean examresult1 = historyScore >= passRate;
        if (examresult1) {
            System.out.println("Pass");
        } else {System.out.println("Fail");}

        //! else if
        char grade4 = ' ';
        int score4 = 100;
        // A: >=90;  B:>=80 C:>=70; Fail:<70
        if (score4>=90) {
            grade4 = 'A';
        } else if (score4 >=80 && score4<90) {
            grade4 = 'B';
        } else if (score4 >=70 && score4<80) {
            grade4 = 'C';
        } else {    // below 70
            grade4 = 'F';
        }
        System.out.println("Grade = " + grade4);

        int customerAge = 70;
        char customerGender = 'M';
        int basFee  = 100;
        int increment = 0;
        if (customerGender == 'M') {
            increment = 10;
        } else if (customerGender == 'F' && customerAge > 60) {
            increment = 8;
        } else {
            increment = 10;
        }
        int newFee = (basFee * increment/100) + basFee;
        System.out.println("The new fee: " + newFee);

        // OR, combine same result scenario
        if (customerGender=='M' || customerGender=='F' && customerAge<=60) {
            increment = 10;
        } else increment = 8;
        newFee = (basFee * increment/100) + basFee;
        System.out.println("The new fee: " + newFee);

        // String method
        String s2 = "hello world";
        // if string value contains 'w', print "Contain w."
        // if string value contains 'w' and length>7, print "****"
        if (s2.contains("w")) {
            if (s2.length()>7) {
                System.out.println("*****");
            } else System.out.println("Contain w");
        } else if (s2.charAt(2) == s2.toUpperCase().charAt(2)) {
             System.out.println("upper case");
         }
    }
}
