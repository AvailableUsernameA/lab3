import static org.junit.Assert.*;

import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests{

    @Test
    public void testFile() throws IOException {
        File some_files = new File("some-files");
        List<File> result = new ArrayList<>();
        File File1 = new File("some-files/a.txt");
        File File2 = new File("some-files/more-files/b.txt");
        File File3 = new File("some-files/more-files/c.java");
        File File4 = new File("some-files/even-more-files/d.java");
        File File5 = new File("some-files/even-more-files/a.txt");
        result.add(File4);
        result.add(File5);
        result.add(File3);
        result.add(File2);
        result.add(File1);
        List<File> runResult;
        try{
            runResult = FileExample.getFiles(some_files);
        } 
        catch (Exception e) {
            throw new IOException("Wrong input");
        }
        assertEquals(result, runResult);

        File moreFiles = new File("some-files/more-files");
        List<File> expect_moreFiles = new ArrayList<>();
        expect_moreFiles.add(File3);
        expect_moreFiles.add(File2);
        List<File> result_moreFiles;
        try{
            result_moreFiles = FileExample.getFiles(moreFiles);
        } 
        catch (Exception e) {
            throw new IOException("Wrong input");
        }
        assertEquals(expect_moreFiles, result_moreFiles);
    }
}