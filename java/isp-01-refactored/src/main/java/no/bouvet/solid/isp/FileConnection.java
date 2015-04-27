package no.bouvet.solid.isp;

public interface FileConnection {

    String getFileName();

    void setFileName(String fileName);

    void open();

    void close();
}
