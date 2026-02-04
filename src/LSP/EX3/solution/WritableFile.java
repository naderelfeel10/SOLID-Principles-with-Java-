package LSP.EX3.solution;

public class WritableFile extends File {

    public void write(String data) {
        System.out.println("Writing data: " + data);
    }

    public void delete() {
        System.out.println("File deleted.");
    }
}
