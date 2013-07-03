package org.bin4j;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Binary
{
    int bytes() default 1;
    BinaryType type();
    int order() default 0;
    ByteOrder byteOrder() default ByteOrder.LITTLE_ENDIAN;
}
