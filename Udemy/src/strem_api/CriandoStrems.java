package strem_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStrems {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		//#01:
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS \n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python", "Lisp", "Perl\n"};
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C", "PHP", "Rybu\n");
		outrasLangs.forEach(print);
		outrasLangs.parallelStream().forEach(print);//Processamento paralelo
		
		//Gerar Strems Infinita
		//Stream.generate(() -> "a").forEach(print);
		System.out.println("");
		//Stream.iterate(0, n-> n+1).forEach(println);

	}
}
