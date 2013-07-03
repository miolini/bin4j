package org.bin4j;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BinaryNumber
{
    BinaryType type();
}
