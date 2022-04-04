package normalization;

import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TextServiceTest {

    Logger logger = LoggerFactory.getLogger(TextServiceTest.class);
    TextService textService = new TextService();

    @BeforeClass
    public static void beforeClass() throws Exception {
        BasicConfigurator.configure();
    }

    @Test
    public void testGetNormalizationText() {
        String expected = "qwerty01234 йцукен56789";

        String result = textService.getNormalizationText("qWeRtY01234 йЦуКеН56789!@#$%^&*()[]-=");

        logger.info(result);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testReplaceRusSimilarChars() {
        String expected = "деловой";

        String result = textService.replaceRusSimilarChars("дeл0в0й");

        logger.info(result);

        Assert.assertEquals(expected, result);
    }
}
