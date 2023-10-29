package dk.kea;

public class ZeroOneTwoArgument {
    public interface ZeroArgument {
        public void myFunc();
    }

    public interface OneArgument {
        public void myFunc (String str);
    }

    public interface TwoArgument {
        public int myFunc (int x, int y);
    }

    public interface OneArgAsArg {
        void myFunc(OneArgument arg);
    }

    public static void printZero(ZeroArgument z0) {
        z0.myFunc();
    }

    public static void main(String[] args) {
        ZeroArgument z = () -> System.out.println("Hello I am interface");
        printZero(z);

        OneArgument out = (str) -> System.out.println(str);
        out.myFunc("Hej");

        OneArgAsArg oaaa = (arg) -> arg.myFunc("Hej");
        oaaa.myFunc(out);
    }
}
