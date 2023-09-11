package home;

import lombok.ToString;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@ToString
public class MyStream {

    private final List<String> flowers;

    public MyStream(final List<String> flowers) {
        this.flowers = flowers;
    }

    public void add(final List<String> flowers) {
        this.flowers.addAll(flowers);
    }

    public void modify() {
        flowers.stream()
                .map((String::toUpperCase))
                .filter(flower -> flower.startsWith("S"))
                .distinct()
                .forEach(System.out::println);
    }

    public Optional<Integer> multiply(Integer value) {
        return Optional.ofNullable(value)
                .map(v -> v * 100);
    }

    public Integer getRandomNumber() {
        return  new Random().nextInt(10 - 1 + 1) + 1;
    }
}
