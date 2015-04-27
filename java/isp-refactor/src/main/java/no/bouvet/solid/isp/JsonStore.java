package no.bouvet.solid.isp;

public class JsonStore implements FileConnection, FileOperation {

    private String fileName;

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        // open file
    }

    @Override
    public String readFile() {
        return "File content!";
    }

    @Override
    public void close() {
        // close file
    }

}
