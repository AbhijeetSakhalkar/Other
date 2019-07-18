package streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args){
		Stream<Double> randoms = Stream.generate(Math::random).limit(10);
		randoms.forEach(System.out::println);
		
		Stream<UUID> uuids = Stream.generate(UUID::randomUUID).limit(5);
		uuids.forEach(System.out :: println);
		
		
		Stream<String> words = Stream.of("merrily111111111111111", "merrily1", "merrily111111", "gently1");
		
		/*Stream<String> uniqueWords = words.distinct();
		uniqueWords.forEach(System.out :: println);
		*/
		//Stream<String> sortedWords = words.sorted();
		Stream<String> sortedWords2 = words.sorted(Comparator.comparing(String :: length));
		//Stream<String> sortedWords3 = words.sorted(Comparator.comparing(String :: length).reversed());
		
		/*System.err.println("---------------------");
		sortedWords.forEach(System.out :: println);*/
		System.err.println("---------------------");
		sortedWords2.forEach(System.out :: println);
		System.err.println("---------------------");
		/*sortedWords3.forEach(System.out :: println);
		System.err.println("---------------------");*/
		
		//-------------------------------------------------------------------------------------------------------------------
		
		Optional<Double> num = squareRoot((double) -21);
		if(num.isPresent()){
			System.out.println("I am there");
		}
		else{
			System.err.println("I am not");
		}
	}
	
	private static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}
}
 