import java.util.ArrayList;

public class google_CollectioinFramework_ArrayList_2 {

    public static void main(String[] args) {
        ArrayList<String> launch = new ArrayList<String>();

        launch.add("칼국수");
        launch.add("라면");
        launch.add("돈까스");
        launch.add("중식");
        launch.add("기사식당");

        System.out.print("ArrayList: ");
        for (String lch : launch) {
            System.out.print(lch + " ");
        }
        System.out.println("\n");

        System.out.println("launch.get(1): " + launch.get(1));
        System.out.println("launch.size(): " + launch.size());
        System.out.println("launch.contains(\"중식\"):" + launch.contains("중식"));

        System.out.println("remove(중식): " + launch.remove("중식"));
        System.out.println("remove(1): " + launch.remove(1));

        System.out.print("\nArrayList: ");
        for (int i = 0; i < launch.size(); i++) {
            System.out.print(launch.get(i) + " ");
        }
    }

}
