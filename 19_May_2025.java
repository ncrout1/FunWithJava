// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 30, 45, 65};
        int firstElement = 0;
        int secondElement = -10000;

        System.out.println("Try programiz.pro");

        if (arr.length == 0) {
            System.out.println("None");
        } else {
            firstElement = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > firstElement) {  // Fixed typo here
                    secondElement = firstElement;
                    firstElement = arr[i];
                } else if (arr[i] > secondElement && arr[i] != firstElement) {
                    secondElement = arr[i];
                }
            }
        }
        System.out.println(secondElement);
    }
}
