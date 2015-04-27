package no.bouvet.solid.isp;

public interface DatabaseConnection {

    String getConnection();

    void setConnection(String connection);

    void open();

    void close();

}
