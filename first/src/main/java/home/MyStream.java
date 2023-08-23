package home;

import lombok.ToString;

import java.util.List;

@ToString
public class MyStream {

    private final List<?> flowers;

    public MyStream(final List<?> flowers) {
        this.flowers = flowers;
    }


}
