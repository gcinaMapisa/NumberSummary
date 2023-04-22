
import java.util.*;
import numberrangesummarizer.NumberRangeSummarizer;

public class Summarizer implements NumberRangeSummarizer {

    // Constructor
    public Summarizer() {

    }

    @Override
    public ArrayList<Integer> collect(String input) {
        ArrayList<Integer> list = new ArrayList();
        String[] numbers = input.split(",");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        return list;
    }

    @Override
    public String summarizeCollection(ArrayList<Integer> input) {
        StringBuilder sb = new StringBuilder();
        int len = input.size();
        int start = 0, end = 0;
        while (end < len) {
            while (end < len - 1 && input.get(end) == input.get(end + 1) - 1) {
                end++;
            }
            if (start == end) {
                sb.append(input.get(start));
            } else if (end == start + 1) {
                sb.append(input.get(start)).append(", ").append(input.get(end));
            } else {
                sb.append(input.get(start)).append("-").append(input.get(end));
            }
            if (end < len - 1) {
                sb.append(", ");
            }
            end++;
            start = end;
        }
        return sb.toString();
    }

}
