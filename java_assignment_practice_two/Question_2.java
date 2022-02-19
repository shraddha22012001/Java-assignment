import java.util.*;

public class Question_2{

    static final Comparator<String> IGNORE_CASE_ORDER
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> s = new TreeSet<String>(IGNORE_CASE_ORDER);
        for (String a : args) {
            s.add(a);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}

/*****output********************

3 distinct words: [Gaware, sandeep, shraddha]

*********************************/