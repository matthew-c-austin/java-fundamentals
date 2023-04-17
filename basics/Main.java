import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    // Call the pluralize method with some example input
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Call the flipNHeads method with some example input
    int flipCount1 = 2;
    flipNHeads(flipCount1);
    int flipCount2 = 1;
    flipNHeads(flipCount2);

    //Call the clock method
    clock();
  }

  public static String pluralize(String word, int n) {
    if (n == 0 || n > 1) {
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int n) {
    //If n is less than 1, then say that it's an invalid number
    if(n < 1) {
      System.out.println("Please enter a number of flips greater than 0");
      return;
    }
    
    int counter = 0;
    int streak = 0;
    Random rand = new Random();
    while(streak < n) {
      double newRand = rand.nextDouble();
      // If the new random double is less than 0.5, it is tails. Otherwise, it is heads
      if(newRand < 0.5) {
        System.out.println("tails");
        streak = 0;
      } else {
        System.out.println("heads");
        streak++;
      }
      counter++;
    }
    // To get the correct grammar on "flip/flips" and "head/heads", we need to check both the counter and the argument n
    System.out.println("It took " + counter + "\s" + pluralize("flip", counter) + " to flip " + n + "\s" + pluralize("head", n) + " in a row");
    return;
  }

  public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    int currentSecond = now.getSecond();
    // We want a counter for determining how many hertz the program executes at
    double cycles = 0;

    // Since we're running this until it's manually killed, we use an infinite while loop
    while (true) {
      now = LocalDateTime.now();
      int second = now.getSecond();
      cycles++;
      if (second != currentSecond) {
        currentSecond = second;

        // Handle which unit to use
        String unit;     
        if (cycles >= 1000000000) {
          cycles /= 1000000000;
          unit = "GHz";
        } else if (cycles >= 1000000) {
            cycles /= 1000000;
            unit = "MHz";
        } else if (cycles >= 1000) {
            cycles /= 1000;
            unit = "kHz";
        } else {
            unit = "Hz";
        }
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time + "\s" + String.format("%.3f", cycles) + "\s" + unit);
        cycles = 0;
      }
    }
  }
}