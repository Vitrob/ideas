import home.MyStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Shorter version List.of()
        MyStream myStream = new MyStream(new ArrayList<>(List.of("daisy", "rose", "sunflower")));

        //Longer version Stream.of()
        myStream.add(Stream.of("lily", "iris", "orchid").collect(Collectors.toList()));

        myStream.modify();

        //Optional<Integer>
        System.out.println(myStream.multiply(1000));
        System.out.println(myStream.multiply(0));
        System.out.println(myStream.multiply(null));
        //Integer
        System.out.println(myStream.multiply(1000).orElseGet(myStream::getRandomNumber));
        System.out.println(myStream.multiply(0).orElseGet(myStream::getRandomNumber));
        System.out.println(myStream.multiply(null).orElseGet(myStream::getRandomNumber));
    }
}
