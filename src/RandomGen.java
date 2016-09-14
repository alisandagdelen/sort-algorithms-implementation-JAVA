import java.util.Random;

/**
 * Created by alisa on 14.10.2015.
 */
public class RandomGen {
  public static int[] RandomizeArray(int[] array) {
    Random rgen = new Random(); // Random number generator

    for (int i = 0; i < array.length; i++) {
      int randomPosition = rgen.nextInt(array.length);
      int temp = array[i];
      array[i] = array[randomPosition];
      array[randomPosition] = temp;
    }

    return array;
  }
}
