/**
 *
 * 定义一个写信的过程
 */
public interface LetterProcess {
    //首先要写信的内容
    void writeContext(String context);
    //其次写信封
    void fillEnvelope(String address);
    //把信放到信封里
    void letterInotoEnvelope();
    //然后邮递
    void sendLetter();
}