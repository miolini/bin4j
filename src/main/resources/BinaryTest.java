import model.Message;
import org.apache.commons.codec.binary.Hex;
import org.bin4j.*;
import org.junit.Test;

public class BinaryTest
{
    @Test
    public void simpleTest() throws BinaryCodecFactoryException
    {
        BinaryCodec<Message> messageCodec = BinaryCodecFactory.create(Message.class);
        Message msg = new Message("user", "Hello, World!", System.currentTimeMillis());
        byte[] data = messageCodec.encode(msg);
        System.out.println(String.format("%s\n%s", msg, Hex.encodeHexString(data)));
    }
}
