package pe.codember.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Challenge03 {

  public static void main(String[] args) {
    List<String> policies = readFile();
    var word = getWordOfPolicy(policies, 42);
    System.out.printf("the word 42th is '%s'", word);
  }

  public static String getWordOfPolicy(List<String> policies, int errorPosition) {
    int errors = 0;
    String word = "";

    for (String p : policies) {
      var policy = convertToPolicy(p);
      var lengthChar = policy.key.length();
      var lengthOthers = policy.key.replace(policy.letter.toString(), "").length();
      var countLetter = lengthChar - lengthOthers;

      var isValid = countLetter >= policy.min && countLetter <= policy.max;

      if (!isValid) ++errors;

      if(errors == errorPosition) {
        word = policy.key;
        break;
      };
    }

    return word;
  }
  public static Policy convertToPolicy(String policy) {
    // 8-10 r: ozrcdfnug -> Policy{min:8, max:10, letter: key:ozrcdfnug}

    var firstCompact = policy.split(" ");
    var maxMin = firstCompact[0].split("-");
    var min = Integer.parseInt(maxMin[0]);
    var max = Integer.parseInt(maxMin[1]);
    var letter = firstCompact[1].replace(":", "").charAt(0);
    var key = firstCompact[2];

    return new Policy(min, max, letter, key);
  }

  public static List<String> readFile() {
    ArrayList<String> policies = new ArrayList<>();

    try {
      var cwd = System.getProperty("user.dir");
      var path = Paths.get(cwd, "src/main/resources", "encryption_policies.txt");
      BufferedReader br = new BufferedReader(
          new FileReader(path.toString())
      );

      String line;
      while ((line = br.readLine()) != null) {
        policies.add(line);
      }

    } catch (IOException ex) {
      ex.printStackTrace(System.out);
    }

    return policies;
  }

  public static class Policy {
    public Integer min, max;
    public Character letter;
    public String key;

    public Policy(Integer min, Integer max, Character letter, String key) {
      this.min = min;
      this.max = max;
      this.letter = letter;
      this.key = key;
    }
  }
}
