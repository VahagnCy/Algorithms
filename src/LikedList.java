import java.util.LinkedList;

public class LikedList {
    public static void main(String[] args) {
        LinkedList<String> listy = new LinkedList<>();
        listy.add("Vagi");
        listy.add("Tagi");
        listy.add("Mher");
        listy.add("Aria");

        System.out.println(listy.contains("Vagi"));
        System.out.println(listy.size());

//        for (String item: listy) {
//            System.out.println(item + "->");
//        }

        listy.forEach(x -> System.out.print(x + "->"));

    }
}
