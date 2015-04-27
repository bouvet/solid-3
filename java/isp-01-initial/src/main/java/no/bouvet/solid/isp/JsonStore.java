package no.bouvet.solid.isp;

public class JsonStore implements PersistenceMedium {

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
    public String getConnection() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void setConnection(String connection) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void open() {
        // open file
    }

    @Override
    public String executeQuery(String query) {
        throw new UnsupportedOperationException("Not supported");
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
