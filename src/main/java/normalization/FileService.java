package normalization;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FileService {

    public String readFile(Path filePath) {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(String.valueOf(filePath)), StandardCharsets.UTF_8))
        ) {
            String str;
            while ((str = reader.readLine()) != null) {
                result.append(str);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }

        return result.toString();
    }

    public void saveFile(String normalizationText) {
        try (FileWriter writer = new FileWriter("./file.txt")) {
            writer.write(normalizationText);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
