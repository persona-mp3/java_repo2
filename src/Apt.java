import java.util.HashMap;

public class Apt {
    public static void main(String[] args) {

        String sentence = "All cows eat grass";
        validateInput(sentence);
    }

    public static void validateInput(String sentence) {
        // .replaceAll(regex, replacement) -> \\s removes all white spaces including tabs
        String fmtStr = sentence.replaceAll("\\s", "").replaceAll("\\W", "");
       if (fmtStr.length() < 3) {
           System.out.println("Invalid entry, statement was too short");
           return;
       }

       System.out.printf("fmtStr -> %s\n", fmtStr);

       HashMap<String, String> vowels = new HashMap<String, String>();
       vowels.put("a", "a");
       vowels.put("e", "e");
       vowels.put("i", "i");
       vowels.put("o", "o");
       vowels.put("u", "u");
       System.out.printf("hashmaps -> %s\n", vowels);

       String isVal = vowels.get("england");
       System.out.printf("expecting the hashmap to return NULL -> %s\n", isVal);

       int freq = 0;
       for (int i = 0; i < fmtStr.length(); i++) {
           char ch = fmtStr.charAt(i);
          if ( vowels.get(ch) == null) {
              System.out.printf("current char -> %c\n", ch);
//              System.out.printf("currentlyAt -> %s\n", ch);
//              System.out.printf("counter updated -> %d\n", freq);
              freq += 1;
           }
       }

//       System.out.printf("[total count] -> %s\n" ,freq);

    }
}
