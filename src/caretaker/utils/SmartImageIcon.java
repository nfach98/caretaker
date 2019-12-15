package caretaker.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SmartImageIcon extends ImageIcon{

    private float ratio;
    private Image image;
    private BufferedImage img;
    private JLabel label;
    int width;
    int height;
    
    public SmartImageIcon(String filename, JLabel label) {
        super(filename);
        
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            Logger.getLogger(SmartImageIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(img.getWidth() > img.getHeight() || img.getWidth() == img.getHeight()){
            ratio = (float) label.getWidth() / (float) img.getWidth();
        }
        else if(img.getWidth() < img.getHeight()){
            ratio = (float) label.getHeight() / (float)img.getHeight();
        }
        
        width = (int) (img.getWidth() * ratio);
        height = (int) (img.getHeight() * ratio);
        
        Image im = new ImageIcon(img).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setImage(im);
    }
    
    public SmartImageIcon(Image image, JLabel label) {
        super(image);
        
        this.image = image;
        this.label = label;
        
        if(image.getWidth(null) > image.getHeight(null) || image.getWidth(null) == image.getHeight(null)){
            ratio = (float) label.getWidth() / (float) image.getWidth(null);
        }
        else if(image.getWidth(null) < image.getHeight(null)){
            ratio = (float) label.getHeight() / (float)image.getHeight(null);
        }
        
        width = (int) (image.getWidth(null) * ratio);
        height = (int) (image.getHeight(null) * ratio);
        
        Image im = new ImageIcon(image).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setImage(im);
    }
    
    public SmartImageIcon(URL url, JLabel label) {
        super(url);
        
        image = new ImageIcon(url).getImage();
        this.label = label;
        
        if(image.getWidth(null) > image.getHeight(null) || image.getWidth(null) == image.getHeight(null)){
            ratio = (float) label.getWidth() / (float) image.getWidth(null);
        }
        else if(image.getWidth(null) < image.getHeight(null)){
            ratio = (float) label.getHeight() / (float)image.getHeight(null);
        }
        
        width = (int) (image.getWidth(null) * ratio);
        height = (int) (image.getHeight(null) * ratio);
        
        Image im = new ImageIcon(image).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        setImage(im);
    }
    
}
