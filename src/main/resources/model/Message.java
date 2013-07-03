package model;

import org.bin4j.BinaryModel;
import org.bin4j.BinaryNumber;
import org.bin4j.BinaryString;
import org.bin4j.BinaryType;

@BinaryModel
public class Message
{
    @BinaryString(len = 8)
    public String sender;
    @BinaryString(len = 256, encoding = "utf-8")
    public String text;
    @BinaryNumber(type = BinaryType.UINT64)
    public long timestamp;

    public Message()
    {
    }

    public Message(String sender, String text, long timestamp)
    {
        this.sender = sender;
        this.text = text;
        this.timestamp = timestamp;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Message{");
        sb.append("sender='").append(sender).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
