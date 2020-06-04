package asm.org.apache.geronimo.microprofile.openapi.impl.processor.spi;
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
public class NamingStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Http", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "Http", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Qualified", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "Qualified", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$SimpleQualifiedCamelCase", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "SimpleQualifiedCamelCase", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$SimpleQualified", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "SimpleQualified", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Default", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "Default", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "Context", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "name", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
