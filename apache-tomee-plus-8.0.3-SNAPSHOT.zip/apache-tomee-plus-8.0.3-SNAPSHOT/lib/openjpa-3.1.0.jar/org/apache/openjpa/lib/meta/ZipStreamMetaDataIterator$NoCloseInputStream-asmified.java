package asm.org.apache.openjpa.lib.meta;
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
public class ZipStreamMetaDataIterator$NoCloseInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", null, "java/io/InputStream", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator", "NoCloseInputStream", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "this$0", "Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStream", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "available", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "this$0", "Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator", "access$100", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;)Ljava/util/zip/ZipInputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/ZipInputStream", "available", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "this$0", "Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator", "access$100", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;)Ljava/util/zip/ZipInputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/ZipInputStream", "read", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "this$0", "Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator", "access$100", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;)Ljava/util/zip/ZipInputStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/ZipInputStream", "read", "([BII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/meta/ZipStreamMetaDataIterator$NoCloseInputStream", "<init>", "(Lorg/apache/openjpa/lib/meta/ZipStreamMetaDataIterator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
