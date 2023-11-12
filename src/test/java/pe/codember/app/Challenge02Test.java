package pe.codember.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing challenge 2 from codember 2023, its a mini compiler!!")
class Challenge02Test {

  /*
  "#" Increases the numeric value by 1.
  "@" Decreases the numeric value by 1.
  "*" Multiplies the numeric value by itself.
  "&" Prints the current numeric value.
  */

  @Test
  @DisplayName("Should be returns a string depending on how many prints string (&) there are")
  void test() {
    assertEquals(
        "4",
        Challenge02.something("##*&"),
        "Ups fix your solution"
    );
  }

  @Test
  @DisplayName("Should be returns a string depending on how many prints string (&) there are")
  void test02() {
    assertEquals(
        "0243",
        Challenge02.something("&##&*&@&"),
        "Ups fix your solution"
    );
  }

/*  @Test
  @DisplayName("This test is the solution to send")
  void finalTest() {
    assertEquals(
        "024899455",
        Challenge02.something(Challenge02.input),
        "Ups fix your solution"
    );
  }*/

}
