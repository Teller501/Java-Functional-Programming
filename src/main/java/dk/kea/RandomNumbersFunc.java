package dk.kea;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class RandomNumbersFunc {
    public static void main(String[] args) {
        Supplier<Double> ran = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(ran);

        Function<Double, Long> dblround = d -> Math.round(d*100);

        Predicate<Long> longEqual = rannum -> rannum % 2==0;
        Stream<Long> ranLong = randomNumbers.map(dblround).filter(longEqual).limit(12);
        DoubleStream randbl = ranLong.mapToDouble(d -> d);
        System.out.println("Sum: " + randbl.sum());
        System.out.println("AVG: " + randbl.average());
    }
}
