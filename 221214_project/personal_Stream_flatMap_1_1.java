import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class personal_Stream_flatMap_1_1 {

    public static void main(String[] args) {
        List<String> list3 = Arrays.asList("mad", "play");
        List<String> list4 = Arrays.asList("kim", "hwang");
        List<List<String>> combinedList2 = Arrays.asList(list3, list4);

        List<String> streamByList = combinedList2.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(streamByList);

        String[][] arrs = new String[][] {
                { "mad", "play" }, { "kim", "hwang" }
        };

        List<String> streamByArr = Arrays.stream(arrs)
                .flatMap(arr -> Arrays.stream(arr))
                .collect(Collectors.toList());

        System.out.println(streamByArr);
    }

}
