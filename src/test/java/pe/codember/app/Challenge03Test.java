package pe.codember.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing challenge 3 from codember 2023")
class Challenge03Test {

  private static List<String> policies;

  @BeforeAll
  public static void initializePolicies() {
    policies = Challenge03.readFile();
  }

  @Test
  @DisplayName("First test: should be return the 5th word with error in the list")
  void getWordOfPolicy5() {
    String expect = "gifzgmpab";
    assertEquals(expect, Challenge03.getWordOfPolicy(policies, 5));
  }

  @Test
  @DisplayName("Second test: should be return the 42th word with error in the list")
  void getWordPolicy42() {
    String expect = "bgamidqewtbus";
    assertEquals(expect, Challenge03.getWordOfPolicy(policies, 42));
  }

  @Test
  @DisplayName("Second test: should be return the 42th word with error in the list")
  void getPassword() {
    String expect = "nljzuyfzb";
    assertEquals(expect, Challenge03.getWordOfPolicy(policies, 13));
  }
}
