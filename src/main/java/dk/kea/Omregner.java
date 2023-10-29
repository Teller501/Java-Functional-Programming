package dk.kea;

import java.util.Arrays;
import java.util.List;

public class Omregner {
    static int sumTwoArgFunction(List<Integer> list, ZeroOneTwoArgument.TwoArgument two){
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t,t);
        }
        return sum;
    }

    static int valutaomregner(List<Integer> list, ZeroOneTwoArgument.TwoArgument two, int kurs) {
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(4,12,51,632);

        ZeroOneTwoArgument.TwoArgument twoPlus = (x,y) -> x+y;
        int ss = sumTwoArgFunction(ints, twoPlus);
        System.out.println(ss);

        ZeroOneTwoArgument.TwoArgument twomult = (x, y) -> x * y;
        ss = sumTwoArgFunction(ints, twomult);
        System.out.println(ss);

        List<Integer> dollars = Arrays.asList(1,5,10);
        int pengeDKK = valutaomregner(dollars, twomult, 6);
        System.out.println("DKK: " + pengeDKK);

    }

}
