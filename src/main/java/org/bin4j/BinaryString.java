package org.bin4j;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BinaryString
{
    int len();
    String encoding() default "ascii";
}
