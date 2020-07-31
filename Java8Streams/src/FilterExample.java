import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		//imperative style
		for (String name : names) {
			if(!name.equals("Sam")) {
				System.out.println(name);
			}
		}
		System.out.println("-------Java8 Streams------");
		//Declarative style using streams
		names.stream().filter((name)-> !name.equals("Sam")).forEach(System.out::println);;
	}
}
