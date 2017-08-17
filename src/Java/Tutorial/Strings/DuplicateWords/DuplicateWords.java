package Java.Tutorial.Strings.DuplicateWords;

/**
 * Created by rgimenez on 30/12/2016.
 */
import java.util.*;
import java.util.regex.*;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?: +\\1)+\\b";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE /* Insert the correct Pattern flag here.*/);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
