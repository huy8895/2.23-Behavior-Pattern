import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        for (String integer: arrayList){
            System.out.println(integer);
        }
        System.out.println();

        String a ="1";
        arrayList.remove(a);
        for (String integer: arrayList){
            System.out.println(integer);
        }


    }
}
