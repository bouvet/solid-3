package no.bouvet.solid.isp;


public interface PersistenceMedium {
    String getFileName();
    void setFileName(String fileName);

    String getConnection();
    void setConnection(String connection);

    void open();
    String executeQuery(String query);
    String readFile();
    void close();
}
