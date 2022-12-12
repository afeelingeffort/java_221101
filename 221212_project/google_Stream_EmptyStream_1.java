import java.util.List;
import java.util.stream.Stream;

public class google_Stream_EmptyStream_1 {

    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty()
                ? Stream.empty()
                : list.stream();
    }

    public static void main(String[] args) {

    }

}
