public class StrMan {


  public static void main(String[] args){
    // Basics();
    String word = "vujade@studios.com";
    // WhiteText(word);
    String domainN = StringBending(word);
    System.out.println(domainN);
  }

  public static void Basics(){
    String brand = "Vujade@tokyostudios";
    int brandLen = brand.length();
    int atI = brand.charAt(3);
    int iOf = brand.indexOf("e") ; // returns the index for first occurence
    int liOf = brand.lastIndexOf("s") ; // returns the index for first occurence
    
    brand.toUpperCase();
    brand.toLowerCase();

    System.out.println(brandLen);
    System.out.printf("%c\n",atI);
    System.out.println(iOf);
    System.out.println(liOf);
  }

  public static void WhiteText(String word){
    /*
     * isEmpty()
     * length()
     * contains()
     * Equals()
     * EqualsIgnoreCase()
     * replaceAll(regex, replacement) -> str.replaceAll("\\s", "") <removes all white spaces>
     * 
     */

    if (word.isEmpty()) {
      System.out.println("word is [empty]");
      return;
    }

    if (word.length() < 5) {
      System.out.println("word too short to work with");
      return;
    }

    if (word.contains("vujade")) {
      System.out.println("you wear [vujade]");
      return;
    }


    /* Removing white space AROUND the text */
    String fmtWrd = word.toLowerCase().trim();
    System.out.printf("Formatted word -> %s\n ", fmtWrd);
  }

  public static String StringBending(String username){
    /*
     * substring(startI, endIndex) -> string  between startI and endIndex(exclusive)
     * To get everything after the start index, ommit the endIndex or replace options with str.Length()
     *
     */

    if (!username.contains("@")) {
      return "INVALID USERNAME";
    }

    String domain = username.substring(username.indexOf("@"));
    return domain;
  }
}
