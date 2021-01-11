package lotto;

import java.util.List;

public class LottoApplication {
    public static void main(String[] args) {
        int lottoPrice = InputView.inputLottoPrice();

        Price price = new Price(lottoPrice);
        LottoGame lottoGame = new LottoGame(price.getLottoCount());
        lottoGame.createLotto();

        ResultView.print(lottoGame);

        List<String> winnerNumber = InputView.inputLastLottoNumber();

        LottoResult lottoResult = lottoGame.matching(winnerNumber);
        ResultView.printResult(lottoResult);
    }
}
