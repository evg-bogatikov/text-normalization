package normalization;

import junit.framework.TestCase;
import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

public class FileServiceTest {

    Logger logger = LoggerFactory.getLogger(FileServiceTest.class);
    FileService fileService = new FileService();

    @BeforeClass
    public static void beforeClass() throws Exception {
        BasicConfigurator.configure();
    }

    @Test
    public void testReadFile() {
        String expected = "text text texttext text texttext text texttext text text";

        String result = fileService.readFile(Path.of("./src/test/resources/mock/mockFile.txt"));

        logger.info(result);

        Assert.assertEquals(expected, result);
    }
}
