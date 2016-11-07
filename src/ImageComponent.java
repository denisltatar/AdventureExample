
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class ImageComponent extends JComponent {

    private BufferedImage image;

    // Constructor for the image
    public ImageComponent() {
        image = null;
    }

    @Override
    public void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public void setImage(BufferedImage img) {
        // Set image to image being passed through
        image = img;
        // So we see the change of image
        repaint();
    }
}
