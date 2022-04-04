package normalization;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        TextService textService = new TextService();
        FileService fileService = new FileService();

        Path path = Path.of("./file.txt");
        String str = fileService.readFile(path);
        String normalizationText = textService.getNormalizationText(str);
        fileService.saveFile(normalizationText);

        System.out.println(normalizationText);
    }
}
