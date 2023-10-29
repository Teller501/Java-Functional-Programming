package dk.kea;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static void main(String[] args) {
        String vowels = "aeiouyæøå";
        Predicate<Character> isVowel = (p) -> vowels.indexOf(p) != -1;

        List<Character> lst = Arrays.asList('a', 'c', 'e', 'o', 'p', 'y');
        List<Character> vowList = lst.stream().filter(isVowel).collect(Collectors.toList());
        vowList.forEach(System.out::println);

        long vokalCount = "Hej min ven er du grim".chars().mapToObj(c -> (char) c).filter(isVowel).count();
        System.out.println(vokalCount);

        List<String> strings = List.of("hej", "hvor", "er", "du henne");
        var obj = strings.stream().flatMapToInt(s -> s.chars()).mapToObj(c -> (char) c);
        long lstCount = strings.stream().flatMapToInt(s->s.chars()).mapToObj(c->(char)c).filter(isVowel).count();
        System.out.println(lstCount);
    }
}
