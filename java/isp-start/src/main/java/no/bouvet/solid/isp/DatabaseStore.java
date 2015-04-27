package no.bouvet.solid.isp;

public class DatabaseStore implements PersistenceMedium {
    private String connection;

    @Override
    public String getFileName() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void setFileName(String fileName) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String getConnection() {
        // TODO Auto-generated method stub
        return connection;
    }

    @Override
    public void setConnection(String connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        // open connection
    }

    @Override
    public String executeQuery(String query) {
        return "Query result!";
    }

    @Override
    public String readFile() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void close() {
        // close connection
    }

}
