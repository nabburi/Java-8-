import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapperExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		//imperative style
		for (String name : names) {
			if(!name.equals("Sam")) {
				User user = new User(name);
				System.out.println(user);
			}
		}
		System.out.println("-------Java8 Streams------");
		//Declarative style using streams, method reference
		names.stream()
		.filter(MapperExample::isNotSam)
		.map(User::new)
		.forEach(System.out::println); 
		
		//Collect
		List<User> userList = names.stream()
		.filter(MapperExample::isNotSam)
		.map(User::new)
		.collect(Collectors.toList()); 
	}

	private static boolean isNotSam(String name){
		return !name.equals("Sam");
	}
	
	static class User{
		private String name;
		private Integer age = 30;
		
		public User(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
	}
}
