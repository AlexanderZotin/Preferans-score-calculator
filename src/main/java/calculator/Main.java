package calculator;

import calculator.controller.ControllerImplementation;
import calculator.controller.Listener;
import calculator.model.Calculator;
import calculator.view.Window;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main (String [] args) {
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        SwingUtilities.invokeLater(() -> {
            var view = new Window();
            var controller = new ControllerImplementation(view, new Calculator());
            view.subscribeToListener(new Listener(controller));
            view.setVisible(true);
        });
    }
}