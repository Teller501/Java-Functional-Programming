package dk.kea;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Soldier {
    private int rank;
    private String name;

    public Soldier(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(4, "Anders"));
        soldiers.add(new Soldier(2, "Bent"));
        soldiers.add(new Soldier(1, "Jens"));
        soldiers.add(new Soldier(5, "Klens"));
        soldiers.add(new Soldier(3, "Svend"));

        soldiers.forEach(s -> System.out.println(s));
        System.out.println("------------------------");

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank()>3;

        Stream<Soldier> highSoldiers = soldiers.stream().filter(isHighRanked);
        List<Soldier> highSoldiersList = highSoldiers.collect(Collectors.toList());
        System.out.println("------------------------");

        Predicate<Soldier> startsWithA = s -> s.getName().startsWith("A");
        Stream<Soldier> highAndJ = soldiers.stream().filter(isHighRanked).filter(startsWithA);
        highAndJ.forEach(s-> System.out.println(s));
        System.out.println("------------------------");

        List<String> names = highSoldiersList.stream().map((s) -> s.getName()).collect(Collectors.toList());
        names.forEach(n -> System.out.println(n));
    }
}
