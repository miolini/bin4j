package org.bin4j;

public interface BinaryCodec<T>
{
    public T decode(byte[] buf, int offset, int len);
    public byte[] encode(T object);
}
