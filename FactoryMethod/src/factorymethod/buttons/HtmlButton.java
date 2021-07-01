package factorymethod.buttons;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Hello button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click button says - Hello World.");
    }
}
