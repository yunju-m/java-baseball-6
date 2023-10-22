package baseball.controller;

import baseball.model.GameNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
    GameNumber gameNumber = new GameNumber();
    ComputerController computerController = new ComputerController();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startGame() {
        outputView.printStartGame();
        computerController.startGame(gameNumber);

        gameNumber.setInputNumber(inputView.enterGameNumber());

        computerController.compareNumbers(gameNumber);
        computerController.provideHint();

        if (computerController.isSuccessGame()) {
            outputView.printEndGame();
        }
    }
}
