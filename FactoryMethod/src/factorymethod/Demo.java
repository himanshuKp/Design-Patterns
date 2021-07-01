package factorymethod;

import factorymethod.factory.Dialog;
import factorymethod.factory.HtmlDialog;
import factorymethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic(){
        dialog.renderWindow();
    }


}
