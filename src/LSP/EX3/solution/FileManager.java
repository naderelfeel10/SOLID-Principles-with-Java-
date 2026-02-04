package LSP.EX3.solution;

import java.util.List;

public class FileManager {
    public void cleanUpDirectory(List<WritableFile> files) {
        for (WritableFile f : files) {
            f.delete();
        }
        System.out.println("done deleting");
    }
}