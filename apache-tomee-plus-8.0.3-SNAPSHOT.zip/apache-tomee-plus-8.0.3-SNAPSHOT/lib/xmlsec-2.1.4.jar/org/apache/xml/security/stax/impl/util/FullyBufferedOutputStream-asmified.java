package asm.org.apache.xml.security.stax.impl.util;
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
public class FullyBufferedOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", null, "java/io/FilterOutputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "write", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "write", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "out", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "writeTo", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "out", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/util/FullyBufferedOutputStream", "buf", "Lorg/apache/xml/security/utils/UnsyncByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/utils/UnsyncByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
