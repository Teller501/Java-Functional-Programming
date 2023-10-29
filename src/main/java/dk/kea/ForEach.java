package dk.kea;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("din far");

        Consumer<Integer> square = t -> System.out.println(t*t);
        square.accept(123);

        List<String> arr = Arrays.asList("Anders", "Teller", "Slens", "Vens");
        forEarchString(arr, toUpper);
        forEach(arr, toUpper);

        List<Integer> intArr = Arrays.asList(3,4,5,1,2,9,12,14);
        Consumer<Integer> out = (Integer x) -> System.out.println(x);
        forEach(intArr, out);

        intArr.forEach(out);


    }

    static void forEarchString(List<String> arr, Consumer<String> consumer){
        arr.forEach(consumer);
    }

    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        lst.forEach(consumer);
    }
}
