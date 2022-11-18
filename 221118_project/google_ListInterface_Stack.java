import java.util.Iterator;
import java.util.Stack;

public class google_ListInterface_Stack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Hello");
        stack.push("Wolrd");
        stack.push("Hello");
        stack.push("Hello");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
