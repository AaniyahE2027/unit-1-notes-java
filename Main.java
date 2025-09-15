 // Every java file is a CLASS

public class Main {
   // main method is the ENTRYWAY to the program
   public static void main(String []args) {
      System.out.println("Welcome to Java!");
      System.out.println("hiii");
      
      // 1. DECLARE a new varible
      int score; 
      // 2. ASSIGN a value to the variable
      score = 23;
      // 3. INITIALIZE combines declaring + assigning
      String pokemon = "Pikachu";
      double healthPercent = 0.75;
      boolean isAlive = true;

      // Use the plus sign th CONCATENATE (combine) Strings
      String greeting = "Hello " + "World";
      System.out.println(greeting);
      // Quotation marks contain STRING LITERALS 


      // OUTPUT difference between .print & .println
      System.out.print("hi ");
      System.out.println("there");
      System.out.print("!");
      // .println display the message THEN goes to next line

      // ESCAPE: use backlash (\) to include special characters, use (\n) for line break
      String message = "\nI woke and said, \"hello world\"";
      System.out.println(message);

      // ARITHMETIC expressions with operators
      System.out.println(4 + 3);
      System.out.println(4 - 1);
      System.out.println(6 * 7);
      System.out.println(5/3); // TRUNCATED! 
      // integer division result in TRUNCATION, which is basically throwing away the decimal places
      System.out.println(5.0/3); //double

      // COMPOUND expressions follow PEMDAS
      double result = 2 + (3 * 2 - 6);
      System.out.println(result);

      // REMAINDER % operator 
      int remain = 23 % 2; //1 -> means odd number
      System.out.println(remain);
      System.out.println(628 % 2); // 0 -> means even

      // Watch out for the plus sign
      System.out.println (3 + "3"); // int plus string results in string
   }
}
