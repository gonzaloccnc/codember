package pe.codember.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Challenge01 {

  public static String resolve(String words) {
    var wordsToArray = Arrays.asList(words.split(" "));
    var wordsCount = new LinkedHashMap<String, Integer>();

    wordsToArray.forEach(word ->
      wordsCount.put(word, (wordsCount.get(word) == null ? 0 : wordsCount.get(word)) + 1)
    );

    final StringBuilder wordConcat = new StringBuilder();

    wordsCount.forEach((word, count) -> {
      wordConcat.append(word).append(count);
    });

    return wordConcat.toString();
  }
}
