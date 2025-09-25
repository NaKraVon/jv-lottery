package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int lotteryNumber = new Random().nextInt(101);

        return new Ball(colorSupplier.getRandomColor(), lotteryNumber);
    }

}
