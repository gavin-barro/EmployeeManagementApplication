import java.util.*;

public class HelloWorld {

    private int count;

    public HelloWorld() {
        this.count = 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        String msg = "Hello";
        String msg2 = " ";
        String msg3 = "World!";
        List<String> array = new ArrayList<>();
        array.add(msg);
        array.add(msg2);
        array.add(msg3);

        for (String str : array) {
            System.out.print(str);
        }
        System.out.println();
        System.out.println("Returning exit code: " + 0);
    }

}