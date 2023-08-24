import home.MyStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Shorter version List.of()
        MyStream myStream = new MyStream(new ArrayList<>(List.of("daisy", "rose", "sunflower")));

        System.out.println(myStream);
        //Longer version Stream.of()
        myStream.add(Stream.of("lily", "iris", "orchid").collect(Collectors.toList()));


        System.out.println(myStream);
    }
}
