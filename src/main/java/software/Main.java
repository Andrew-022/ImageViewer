package software;

import java.io.File;

public class Main {

    public static final String root = "fotos";
    public static void main(String[] args) {
        Image image = new FileImageLoader(new File(root)).load();
        MainFrame frame = new MainFrame();
        ImageDisplay imageDisplay = frame.imageDisplay();
        new ImagePresenter(image,imageDisplay);
        frame.setVisible(true);
    }
}
