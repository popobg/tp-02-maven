import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;


public class HelloWorld {
    public static void main(String[] args) {
        String asciiArt1 = "Hello World !";

        try {
            asciiArt1 = FigletFont.convertOneLine(asciiArt1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(asciiArt1);
    }
}
