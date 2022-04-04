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
        String replaceRusSimilarChars = textService.replaceRusSimilarChars(normalizationText);
        fileService.saveFile(replaceRusSimilarChars);

        System.out.println(normalizationText);
    }
}
