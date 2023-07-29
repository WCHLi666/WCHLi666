import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example {

  public static void main(String[] args) {
    String[] strings = {"CCQQ", "QQCC", "CQQ", "QUACK", "CCQ", "CQC", "CQQQ", "CCCQQ"};
    Pattern pattern = Pattern.compile("C+Q{2}");
    Matcher matcher;
    for(String s: strings){
      matcher = pattern.matcher(s);
      System.out.println(matcher.matches());
    }
  }
}