package Ite;

public interface TVIterator {
    void setChannel(int i );
    void next();
    void previous();
    void isLast();
    Object currentChannel();
    boolean isFirst();
}
