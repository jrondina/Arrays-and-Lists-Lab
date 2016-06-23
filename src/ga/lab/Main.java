package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        System.out.println(maxValue(new int[]{2, 52, 7, 91, 10, 12}));
        System.out.println(maxValue(new int[]{12, 1, 11}));
        System.out.println(maxValue(new int[]{0, 14}));
        System.out.println(maxValue(new int[]{100, 23, 29, 101, 1}));

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);


       //Problem 5:
       charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
       System.out.println(charString);

       charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
       System.out.println(charString);

       charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
       System.out.println(charString);

       charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
       System.out.println(charString);

       //Problem 6:
       List<String> myStringList = new ArrayList<>();
        myStringList.add("fe");
        myStringList.add("fi");
        myStringList.add("fo");
        myStringList.add("fum");
        myStringList.add("englishman");
        System.out.println(myStringList);

        //Problem 7:
        reversedStringOrder(myStringList);

        //Problem 8:
        printOrAdd(myStringList);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.

        int[] oddSizedArray = new int[5];
        for(int i = 0; i <= 4; i++){
            oddSizedArray[i] = i;
            System.out.println(oddSizedArray[i]);
        }



        //Problem 10:
        System.out.println(findMiddle(oddSizedArray));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{2,7,9,12,15}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145}));
        //how do we print a variable to the command line

    }

    //declare your functions

    static void stringLengthOrValue(String userString){
        if (userString.length() >= 5) {
            System.out.println(userString);

        }
        else {
            System.out.println(userString.length());
        }
    }
    static void reversedOrder(){
        int[] anArray = new int[10];
        for(int i = 0; i <= 9; i++) {
            anArray[i] = i;
        }
        for(int i = 9; i >= 0; i--) {
            System.out.println(anArray[i]);
        }
    }
    static int maxValue(int[] array){
        int highest = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }

    static double sumOfValues(double[] doubleArray) {
        double summedDoubles = 0;
        for(int i = 0; i < doubleArray.length; i++)  {
            summedDoubles += doubleArray[i];
        }
        return summedDoubles;
    }

    static String charsToString(char[] charArray) {
        String charString = "";
        for(int i = 0; i < charArray.length; i++){
            charString += charArray[i];
        }
        return charString;
    }

    static void reversedStringOrder(List toReverse){
        for(int i = toReverse.size(); i > 0; i-- ){
            System.out.println(toReverse.get(i - 1));
        }
    }

    static void printOrAdd(List sizeTen) {
        if (sizeTen.size() == 10) {
            System.out.println(sizeTen);
        }
        else {
            sizeTen.add("Java" + sizeTen.size());
            //sizeTen.add(sizeTen.size());

            System.out.println(sizeTen);
        }
    }
    static int findMiddle(int[] intArray){
        int middleValue = intArray[(intArray.length / 2)];
        return middleValue;
    }

}
