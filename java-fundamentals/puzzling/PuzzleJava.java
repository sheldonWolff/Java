import java.util.Random;

public class PuzzleJava {

    public int[] getTenRolls() {
        Random randMachine = new Random();
        int[] arr = new int[10];
        for (int i =0; i < arr.length; i++) {
            arr[i] = randMachine.nextInt(20);
            System.out.println(arr[i]);
        }
        return arr;
    }
    
}
// To use methods from the Random library you will need to create an instance of Random

// From there you can use any of the methods listed in the documentation. For example:


