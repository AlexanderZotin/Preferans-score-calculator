package calculator.view;

import calculator.model.PlayersCount;
import calculator.model.Player;
import calculator.controller.Listener;

import lombok.NonNull;

public interface View {
    void subscribeToListener(@NonNull Listener listener);
    void cleanData();
    void setVisible(boolean visible);
    void update(@NonNull PlayersCount playersCount);
    Player[] parseData();
    void showResult(@NonNull int[] result);
}
