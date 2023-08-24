package home;

import lombok.ToString;

import java.util.List;

@ToString
public class MyStream {

    private final List<String> flowers;

    public MyStream(final List<String> flowers) {
        this.flowers = flowers;
    }

    public void add(final List<String> flowers) {
        this.flowers.addAll(flowers);
    }
}
