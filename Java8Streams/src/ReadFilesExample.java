import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFilesExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<String> anagrams = Files.lines(Paths.get("/home/nava/anagramtest.txt"))
			.filter(line -> line.contains("Chin"))
			.map(line -> line.replace("C", "n"))
			.collect(Collectors.toList());
		
		System.out.println(anagrams);
			
	}

}
