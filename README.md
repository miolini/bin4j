bin4j
=====

Fast Binary Parsing Java Framework


####Examples

##### Message.java
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
##### Test.java
    BinaryCodec<Message> messageCodec = BinaryCodecFactory.create(Message.class);
    Message msg = new Message("user", "Hello, World!", System.currentTimeMillis());
    byte[] data = messageCodec.encode(msg);
    System.out.println(String.format("%s\n%s", msg, Hex.encodeHexString(data)));
