package LSP.EX3.problem;

public class ReadOnlyFile extends File {
    @Override
    public void write(String data) {
        // LSP Violation: This changes the expected behavior of a 'File'
        throw new UnsupportedOperationException("Error: Cannot write to a read-only file!");
    }

    @Override
    public void delete() {
        // LSP Violation: Another unexpected failure
        throw new UnsupportedOperationException("Error: Cannot delete a read-only file!");
    }
}