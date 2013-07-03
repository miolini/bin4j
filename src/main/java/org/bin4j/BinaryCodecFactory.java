package org.bin4j;

import org.objectweb.asm.tree.ClassNode;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BinaryCodecFactory
{
    public static <T> BinaryCodec<T> create(Class<T> cls) throws BinaryCodecFactoryException
    {
        try
        {
            List<Annotation> binaryAnnotations = new ArrayList<Annotation>();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields)
            {
                Annotation[] annotations = field.getDeclaredAnnotations();
                for (Annotation annotation : annotations)
                {
                    binaryAnnotations.add(annotation);
                }
            }
            ClassNode classNode = new ClassNode();
            return null;
        }
        catch (Exception e)
        {
            throw new BinaryCodecFactoryException(String.format("Could not create binary codec for class: %s", cls.getCanonicalName()), e);
        }
    }
}
