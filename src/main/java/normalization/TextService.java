package normalization;

public class TextService {

    public String getNormalizationText(String str) {
        return str.toLowerCase().toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9\\s]", "");
    }
}
