package calculator.controller;

import calculator.view.View;

public interface CalculatorController {
    View getView();
    void dataCleanRequested();
    void countRequested();
}
