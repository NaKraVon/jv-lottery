package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSuplier = new ColorSupplier();

    public Ball getRandomBall() {
        int lotteryNumber = new Random().nextInt(101);

        return new Ball(colorSuplier.getRandomColor(), lotteryNumber);
    }

}
