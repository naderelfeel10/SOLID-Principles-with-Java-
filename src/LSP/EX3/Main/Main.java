package LSP.EX3.Main;

import LSP.EX3.problem.File;
import LSP.EX3.problem.FileManager;
import LSP.EX3.problem.ReadOnlyFile;
import LSP.EX3.solution.WritableFile;

import java.util.List;

public class Main {
    static FileManager fileManager = new FileManager();
    public static void main(String[] args){

        List<File> files = List.of(
                new File(),
                new ReadOnlyFile()
        );
        // this will throw an exception because of ReadOnlyFiles
        //fileManager.cleanUpDirectory(files);

        //solution :
        LSP.EX3.solution.FileManager fileManager1 = new LSP.EX3.solution.FileManager();

        List<WritableFile> writableFiles = List.of(
                new WritableFile(),
                new WritableFile(),
                new WritableFile()
        );
        fileManager1.cleanUpDirectory(writableFiles);


    }
}
