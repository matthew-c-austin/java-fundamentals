public class Main {
  public static void main(String[] args) {
    //Call the pluralize function with some example input
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }

  public static String pluralize(String word, int n) {
    if (n == 0 || n > 1) {
      return word + "s";
    } else {
      return word;
    }
  }
}