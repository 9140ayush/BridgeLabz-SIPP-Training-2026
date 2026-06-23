import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("B")) {
                iterator.remove();
            }
        }
        try {
            iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException caught: " + e.getMessage());
        }
    }
}