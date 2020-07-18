import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RGB_Calculator_of_Image
{
    public static void main(String args[]) throws Exception
    {
        int red = 0, green = 0, blue = 0, num = 0;
        File file = new File("C:\\Users\\user\\Downloads\\sample.jpeg");
        BufferedImage img = ImageIO.read(file);
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                //Retrieving contents of a pixel
                int pixel = img.getRGB(x, y);
                //Creating a Color object from pixel value
                Color color = new Color(pixel, true);
                //Retrieving the R G B values
                red += color.getRed();
                green += color.getGreen();
                blue += color.getBlue();
                num++;
            }
        }
        System.out.println("Red: " + red / num + "\nGreen: " + green / num + "\nBlue: " + blue / num);
    }
}