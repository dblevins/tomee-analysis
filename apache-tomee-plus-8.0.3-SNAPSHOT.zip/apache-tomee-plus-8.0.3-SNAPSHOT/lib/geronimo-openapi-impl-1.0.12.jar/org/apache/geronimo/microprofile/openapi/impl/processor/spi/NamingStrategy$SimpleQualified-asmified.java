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
public class NamingStrategy$SimpleQualifiedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$SimpleQualified", null, "java/lang/Object", new String[] { "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy" });

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$SimpleQualified", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "SimpleQualified", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context", "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy", "Context", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "name", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context", "access$000", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context;)Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedMethodElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedMethodElement", "getDeclaringClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context", "access$000", "(Lorg/apache/geronimo/microprofile/openapi/impl/processor/spi/NamingStrategy$Context;)Lorg/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedMethodElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedMethodElement", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
