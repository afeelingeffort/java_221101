import java.util.stream.Stream;

public class google_Stream_builder_1 {

	public static void main(String[] args) {
		Stream<String> stream=Stream.<String>builder()
				.add("Apple").add("Banana").add("Melon").build();
		
	}

}
