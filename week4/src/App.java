import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        // Task: Write a program that swaps the first and last elements of an integer array
        // expected result = [5,4,3,2,1]
        int swap = 0;
        for (int i = 0; i <= arr.length / 2; i++) {
            swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
        }
        System.out.println(Arrays.toString(arr));

        // Example 2
        // indexof()
        // Find all occurrence of a substring using indexof() and while-loop
        String inputString = "abracadabra";
        String targetSubString = "ab";
        int count = 0;
        int pos = 0;
        pos = inputString.indexOf(targetSubString, pos);
        while (pos != -1) {
            count++;
            pos = inputString.indexOf(targetSubString, pos + 1);
        }
        System.out.println("Total occurance: " + count);

        // Example 3
        // Objective: Split a sentence into words and process each word.
        String sentence1 = "Learning Java is fun.";
        String[] strArr = sentence1.split(" ");
        System.out.println(sentence1);
        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i <= strArr.length - 1; i++) {
            System.out.println("Fetch API by split function: " + strArr[i]);
        }

        // Other syntax of for-loop
        for (String arr2 : strArr) { // for-each, for(type of source:source)
            System.out.println("arr2: " + arr2);
        }
        int[] arr3 = new int[] {100, 200, 300};
        for (int arr31 : arr3) {
            System.out.println(arr31);
        }


        // Exercise
        String str3 = "Java , Python , JavaScript , TypeScript , R , C++ , C#";
        // Swap, expect output : [C#,C++,R,TypeScript,JavaScript,Python,Java]
        String[] strArr3 = str3.split(" , ");
        String swap3 = "";
        for (int i = 0; i <= strArr3.length / 2; i++) {
            swap3 = strArr3[i];
            strArr3[i] = strArr3[strArr3.length - 1 - i];
            strArr3[strArr3.length - 1 - i] = swap3;
        }
        System.out.println(Arrays.toString(strArr3));

        // Remove space in between
        String str31 = "Java , Python , JavaScript , TypeScript , R , C++ , C#";
        System.out.println(str31.replace(" ", ""));

        // String with omitted upper char
        char[] arr31 = str31.toCharArray();
        String out31 = "";
        for (int i = 0; i <= arr31.length - 1; i++) {
            if (arr31[i] >= 'A' && arr31[i] <= 'Z')
                continue;
            out31 = out31 + arr31[i];
        }
        System.out.println("String with omitted upper char: " + out31);


        // Final value of variable after performing operations
        String[] operations = new String[] {"--X", "X++", "X++","++X","X--"};
        int result = 0;
        for (String o : operations) {
            switch (o) {
                case "--X":
                    result--;
                    break;
                case "X--":
                    result--;
                    break;
                case "X++":
                    result++;
                    break;
                case "++X":
                    result++;
            }
        }
        System.out.println(result);
    }
}
