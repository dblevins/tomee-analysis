package asm.org.apache.webbeans.util;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SpecializationUtil$BeanAttributesProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/util/SpecializationUtil$BeanAttributesProvider", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/util/SpecializationUtil$BeanAttributesProvider", "org/apache/webbeans/util/SpecializationUtil", "BeanAttributesProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/enterprise/inject/spi/AnnotatedType;)Ljakarta/enterprise/inject/spi/BeanAttributes;", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;)Ljakarta/enterprise/inject/spi/BeanAttributes<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
