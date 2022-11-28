import java.util.Stack;

public class google_FrameWork_Stack_2 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(1);
        st.add(2);
        System.out.println(st);

        st.add(1);
        st.push(2);
        st.pop();
        System.out.println(st);

        st.add(1);
        System.out.println(st.peek());

        st.add(1);
        st.push(2);
        System.out.println(st.search(2));
    }

}
