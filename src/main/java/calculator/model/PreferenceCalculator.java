package calculator.model;

import lombok.NonNull;

public interface PreferenceCalculator {
    int[] calculate(@NonNull Player[] players);
}
