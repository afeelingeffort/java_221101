import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class google_Stream_flatMap_1 {

    public static void main(String[] args) {
        // 왜 List.of가 안 써지지? 도대체 ?
        List<String> list1 = List.of("mad", "play");
        List<String> list2 = List.of("kim", "hwang");
        List<List<String>> combinedList = List.of(list1, list2);

        List<String> streamByList = combinedList.stream()
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
