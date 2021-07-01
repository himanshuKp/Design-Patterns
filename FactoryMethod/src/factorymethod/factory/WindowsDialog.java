package factorymethod.factory;

import factorymethod.buttons.Button;
import factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
