import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class Solution {
  public static int uniqueMorseRepresentations(String[] words) {
    String[] specialWord = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
    Character[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
        's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    Map<Character, String> specialMap = new HashMap<>();
    for (int i = 0; i < specialWord.length; i++) {
      specialMap.put(letters[i], specialWord[i]);
    }
    Set<String> setNonDublicate = new HashSet<>();
    for (int i = 0; i < words.length; i++) {
      String word = "";
      for (int j = 0; j < words[i].length(); j++) {
        word += specialMap.get(words[i].charAt(j));
      }

      setNonDublicate.add(word);
    }
    return setNonDublicate.size();
  }
  public static void main(String[] args){
    String[] arr = { "gin", "zen", "gig", "msg" };
    System.out.println(uniqueMorseRepresentations(arr));
  }
}