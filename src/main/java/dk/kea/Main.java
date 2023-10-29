package dk.kea;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2023,8,18);

        Stream<LocalDate> tendates = IntStream.range(1,10).mapToObj(i -> birthday.plusYears(i));
        var obj = tendates.map(date -> "Year = " + date.getYear() + " UGEDAG = " + date.getDayOfWeek());
        obj.forEach(System.out::println);

    }
}