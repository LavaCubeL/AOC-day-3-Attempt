import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String example = "987654321111111";


        char [] charArray = example.toCharArray();
        //creates a new array with the length of the previous one
        int[] num = new int[example.length()];
        //and then he fills the array
        for (int i = 0; i < num.length; i++) {
            num[i] = example.charAt(i) - '0';
        }

        for(int i : num){
            System.out.print(i);

        }

        //Logic case 1
        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        System.out.println("Largest number is " + largest);

        Integer first = null;
        Integer second = null;

        for (int n : num) {
            if (first == null || n > first) {
                second = first;
                first = n;
            } else if ((second == null || n > second) && n != first) {
                second = n;
            }
        }
        if (second != null) {
            System.out.println("largest" + largest + " largest: " + second);
        } else {
            System.out.println("No distinct second largest value.");
        }


        //Logic case 2

        String example2 = "811111111111119";

        char [] charArray2 = example2.toCharArray();
        //creates a new array with the length of the previous one
        int[] num2 = new int[example2.length()];
        //and then he fills the array
        for (int i = 0; i < num2.length; i++) {
            num2[i] = example2.charAt(i) - '0';
        }
        System.out.println("\n");
        for(int i : num2){

            System.out.print(i);

        }
        for(int i = 0; i != 1; i++){
            System.out.println("\n");
            System.out.println(num2[i]);
            break;
        }
        int testing = 0;
        System.out.println("\n");
        for(boolean j = true; j;){

            testing++;



           if(num2[testing] != 1){
               System.out.println(num2[testing]);
               j = false;
           }
        }


        //Logic 3
        String example3 = "234234234234278";

        char [] charArray3 = example3.toCharArray();
        //creates a new array with the length of the previous one
        int[] num3 = new int[example3.length()];
        //and then he fills the array
        for (int i = 0; i < num3.length; i++) {
            num3[i] = example3.charAt(i) - '0';
        }
        System.out.println("Logic case 3");
        for(int i : num3){

            System.out.print(i);

        }

        int largest3 = num3[0];
        for (int i = 1; i < num.length; i++) {
            if (num3[i] > largest3) {
                largest3 = num[i];
            }
        }
        System.out.println("Largest number is " + largest3);

        Integer first2 = null;
        Integer second2 = null;

        for (int n : num3) {
            if (first2 == null || n > first2) {
                second2 = first2;
                first2 = n;
            } else if ((second2 == null || n > second2) && n != first2) {
                second = n;
            }
        }
        if (second2 != null) {
            System.out.println("second largest" + second2 + " second largest: " + largest3);
        } else {
            System.out.println("No distinct second largest value.");
        }

    String  example4 = "818181911112111";
        //Logic 4
        char [] charArray4 = example4.toCharArray();
        //creates a new array with the length of the previous one
        int[] num4 = new int[example4.length()];
        //and then he fills the array
        for (int i = 0; i < num4.length; i++) {
            num4[i] = example4.charAt(i) - '0';
        }

        for(int i : num4){
            System.out.print(i);

        }
            System.out.println("\n");
        int counter = 0;
        int max = charArray4.length;
        // Iterate though input array, for every element a[i],
        // increment a[a[i]%k] by k
        for (int i = 0; i< charArray4.length; i++)
        {
            charArray4[charArray4[i]%max] += max;
        }
        // Find index of the maximum repeating element
        int maxr = charArray4[0], result = 0;
        for (int i = 1; i < charArray4.length; i++)
        {
            if (charArray4[i] > maxr)
            {
                maxr = charArray4[i];
                result = i;
            }
        }

        System.out.println(result);
        for(int i = 0; i< num4.length;i++){

            System.out.print(num4[i]);
            if(num4[i] == 1){
                counter++;

                if(counter >= result){
                    num4[i+1];
                    System.out.println("hi");
                    break;
                }

                System.out.println("bye");
            }else{

                counter = 0;
            }
        }
        //Two loops


        //for logic I think the code is valid if you loop through an array until you find the second largest

        //Now we can finally implement the logic
        //What if we keep going looping the array until we find one break the loop go the last index
        //loop through it again to find the next index that is not 1
        // Using Streams to convert the string into an integer array



    }



}