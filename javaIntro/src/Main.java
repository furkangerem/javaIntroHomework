public class Main {
    public static void main(String[] args) {

        /* Course 5, Hello World
        System.out.println("Hello world!");
         */

        /* Course 6, Variable Types
        int studentAmount = 10;
        String totalStudentText = "Total student number: ";
        System.out.println("Total student number: " + studentAmount);
        System.out.println(totalStudentText + studentAmount);
         */

        /* Course 7, Data Types
        int number = 12583;
        double number2 = 12.5;
        char charK = 'K';
        String text = "Text";
        boolean trueOrFalse = true;
         */

        /* Course 8, If Structure
        int number = 11;
        if(number<20){
            System.out.println("The number (" + number + ") is less than 20." );
        } else if (number == 20){
            System.out.println("The number (" + number + ") is equal to 20." );
        }else {
            System.out.println("The number (" + number + ") is greater than 20." );
        }
         */

        /* Course 9, Find the Greatest Number
        int number = 10;
        int number2 = 11;
        int number3 = 12;
        int theGreatestNumber = number;

        if(theGreatestNumber < number2){
            theGreatestNumber = number2;
        }
        if(theGreatestNumber < number3){
            theGreatestNumber = number3;
        }

        System.out.println("The greatest number is: " + theGreatestNumber);
         */

        /* Course 10, Switch Case
        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Well done! You're passed.");
                return;
            case 'B':
            case 'C':
                System.out.println("Good! You're passed.");
                return;
            case 'D':
                System.out.println("Try harder! You're passed.");
                return;
            case 'F':
                System.out.println("Failed!");
                return;
            default:
                System.out.println("Invalid grade.");
        }
         */

        /* Course 11, For Loop
        for(int i = 0; i < 10; i++){
            System.out.println("Current number: " +i);
        }
        System.out.println("The loop is done.");
         */

        /* Course 12, While Loop
        int i = 0;
        while (i < 10){
            System.out.println("Current number: " +i);
            i++;
        }
        System.out.println("The loop is done.");
         */

        /* Course 13, Do-While Loop
        int j = 0;
        do {
            System.out.println("Current number: " + j);
            j += 2;
        } while (j < 10);
        System.out.println("The loop is done.");
         */

        /* Course 14, Arrays
        String[] students = new String[4];
        students[0] = "Muhammed";
        students[1] = "Furkan";
        students[2] = "Gerem";
        students[3] = "MFG";

        for (int i = 0; i < students.length; i++) {
            System.out.println("Current Student: " + students[i]);
        }
        for (String student : students) {
            System.out.println("Current Student: " + student);
        }
         */

        /* Course 15, ReCap - 2
        double [] numbersList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max[] = numbersList[0];

        for (double number:numbersList){
            if(max < number) {
                max = number;
            }
            total = total + number;
        }
        System.out.println("The total is: " + total);
        System.out.println("The greatest number is: " + max);
         */

        /* Course 16, Multi-Dimensional Arrays
        String[][] cities = new String[2][2];
        cities[0][0] = "Istanbul";
        cities[0][1] = "Ankara";
        cities[1][0] = "Izmir";
        cities[1][1] = "Antalya";

        for (int i = 0; i <= 2 ; i++) {
            for(int j = 0; j <= 2; j++){
                System.out.println("Current City: " + cities[i][j]);
            }
        }
         */

        /* Course 17, String operations - 1
        String message = "    Today is a good day to    ";
        System.out.println(message);

        System.out.println("Total char numbers: " + message.length());
        System.out.println("5th char is: " + message.charAt(4));
        System.out.println(message.concat(" die"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("A"));

        char[] letters = new char[5];
        message.getChars(0, 5, letters, 0);

        System.out.println(message.indexOf("oo"));
        System.out.println(message.lastIndexOf("oo"));
         */

        /* Course 18, String operations - 2
        String message = "Today is a good day to";
        System.out.println(message);

        System.out.println(message.replace(' ', '-'));
        System.out.println(message.subString(2, 4);

        for(String word;message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
         */

        /* Course 19, Mini Project - 1
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        if(number == 1) {
            System.out.println("The number is not prime.");
            return;
        }

        if(number < 1) {
            System.out.println("Invalid number.");
        }

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("The number is prime.");
        }else {
            System.out.println("The number is not prime.");
        }
         */

        /* Course 20, Mini Project - 2
        char letter = 'E';
        switch(letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Ince sesli harf.");
            break;
            default:
            System.out.println("Kalin sesli harf.");
        }
         */

        /* Course 21, Mini Project - 3
        int number = 5;
        int total = 0;

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total = total + number;
            }
        }
        if (total == number) {
            System.out.println("Perfect number.");
        }else {
            System.out.println("Not a perfect number.");
        }
         */

        /* Course 22, Mini Project - 4
        int number = 220;
        int number2 = 284;
        int total = 0;
        int total2 = 0;

        for (int i = 1; i < number; i++){
            if(number % i == 0){
                total = total + number;
            }
        }

        for (int i = 1; i < number2; i++){
            if(number2 % i == 0){
                total2 = total2 + number;
            }
        }

        if(number == total2 && number2 = total)7
            System.out.println("These two numbers are friend.");
        }else{
            System.out.println("These two numbers are not friend.");
        }
         */

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int numberToFind = 6;
        boolean exist = false;

        for (int number : numbers) {
            if (number == numberToFind) {
                exist = true;
                break;
            }
        }

        if (exist == true) {
            System.out.println("The number exists.");
        } else {
            System.out.println("The number does not exist.");
        }
    }
}