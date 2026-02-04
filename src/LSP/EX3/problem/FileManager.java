package LSP.EX3.problem;

import java.util.List;

public class FileManager {
    public void cleanUpDirectory(List<File> files) {
        for (File f : files) {
            f.delete();
        }
        System.out.println("done deleting");
    }
}