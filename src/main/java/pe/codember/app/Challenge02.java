package pe.codember.app;

public class Challenge02 {

  public static final String input = "&###@&*&###@@##@##&######@@#####@#@#@#@##@@@@@@@@@@@@@@@*&&@@@@@@@@@####@@@@@@@@@#########&#&##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@##@@&";

  /*
  "#" Increases the numeric value by 1.
  "@" Decreases the numeric value by 1.
  "*" Multiplies the numeric value by itself.
  "&" Prints the current numeric value.
  */
  public static void main(String[] args) {
    System.out.println(something(input));
  }

  public static String something(String input) {
    int initialValue = 0;
    StringBuilder response = new StringBuilder();

    for (Character letter: input.toCharArray()) {
      switch (letter.toString()) {
        case "#" -> initialValue += 1;
        case "@" -> initialValue -= 1;
        case "*" -> initialValue *= initialValue;
        default -> response.append(initialValue);
      }
    }

    return response.toString();
  }

}
