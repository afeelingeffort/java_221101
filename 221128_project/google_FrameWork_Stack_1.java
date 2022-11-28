import java.util.Stack;

public class google_FrameWork_Stack_1 {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("Data1");
        st.push("Data2");
        st.push("Data3");

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }

}
