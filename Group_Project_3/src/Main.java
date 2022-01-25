import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a String for the program");
        String inputString = in.nextLine();


        char[] arrayInput = inputString.toCharArray();


        System.out.println("Please enter 1 to see how many of the letter a your sentence hase \n " +
                "Please enter 2 to remove spaces from your sentence \n " +
                "Please enter 3 to find all pairs of duplicate numbers \n" +
                "Please enter 4 to reverse your sentence" );

        int numberSelected = in.nextInt();

        switch (numberSelected) {
            case 1:
                numberOfa(arrayInput);
                break;
            case 2:
                removeWhiteSpace(inputString);
                break;
            case 3:
                findDuplicates(arrayInput);
                break;
            case 4:
                reverseString(inputString);
                break;
            default:
                System.out.println("That was not a choice");

        }

    }

// Methods Below
    public static int numberOfa(char[] array) {
        int numOfas = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 'a') {
                numOfas++;
            }
        }
        System.out.println(numOfas);
        return numOfas;
    }

    public static String removeWhiteSpace(String stringInput) {

        stringInput = stringInput.replaceAll("\\s","");
        System.out.println(stringInput);
        return stringInput;
    }

    public static void findDuplicates(char [] array) {
        int numberOfDuplicates = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    numberOfDuplicates++;
                }
            }
        }
        System.out.println("The number of duplicates is " + numberOfDuplicates);
    }

    public static void reverseString(String string) {
       String [] s = string.split(" ");
       String ans = "";

       for (int i = s.length - 1; i >= 0; i--) {
           ans += s[i] + " ";
       }
        System.out.println(ans);
    }
}
