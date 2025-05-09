package Game.cursor;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CustomCursor {
    public static Cursor getCursor(String path) {
        try {
            Image img = ImageIO.read(new File(path));
            return Toolkit.getDefaultToolkit().createCustomCursor(img, new Point(0, 0), "custom");
        } catch (IOException e) {
            e.printStackTrace();
            return Cursor.getDefaultCursor();
        }
    }
}
