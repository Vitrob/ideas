import home.MyStream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MyStream myStream = new MyStream(Stream.of("daisy", "rose", "sunflower").collect(Collectors.toList()));
        System.out.println(myStream);
    }
}
