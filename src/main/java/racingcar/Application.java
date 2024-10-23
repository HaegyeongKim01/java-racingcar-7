package racingcar;

import racingcar.common.InputValidator;
import racingcar.controller.RacingGameController;
import racingcar.util.Separator;
import racingcar.view.InputView;
import racingcar.vo.CarFactory;

public class Application {
    public static void main(String[] args) {

        RacingGameController racingGameController = new RacingGameController(
                new InputView(),
                new InputValidator(),
                new Separator(),
                new CarFactory()
        );

        racingGameController.run();

    }
}
