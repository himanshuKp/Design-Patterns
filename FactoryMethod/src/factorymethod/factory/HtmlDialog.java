package factorymethod.factory;

import factorymethod.buttons.Button;
import factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
