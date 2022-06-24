import java.util.ArrayList;
import java.util.*;


public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        List<String> list = new ArrayList<>();

        for(String s : array2) {
            for(String a : array1) {
                if(s.indexOf(a) > -1 && !(list.contains(a)))
                    list.add(a);
            }
        }

        String[] str = list.stream()
                .sorted()
                .toArray(String[]::new);
        return str;

    }
}