
import java.util.ArrayList;

public class Gcina {

    public static void main(String[] args) {
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        System.out.println("Input: \n" + input);
        Summarizer summarizer = new Summarizer();
        ArrayList<Integer> collection = summarizer.collect(input);
        String summary = summarizer.summarizeCollection(collection);
        System.out.println("Result: \n" + summary);
    }

}
