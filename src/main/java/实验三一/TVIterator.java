package 实验三一;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/8 9:56
 **/
public interface TVIterator {
    void setChannel(int i);
    void next();
    void  previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();

    int longer();
}
