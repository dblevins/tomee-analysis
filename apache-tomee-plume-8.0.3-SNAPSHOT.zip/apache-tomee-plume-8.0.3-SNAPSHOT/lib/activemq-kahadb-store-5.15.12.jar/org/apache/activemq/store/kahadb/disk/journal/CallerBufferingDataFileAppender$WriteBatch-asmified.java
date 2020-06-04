package asm.org.apache.activemq.store.kahadb.disk.journal;
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
public class CallerBufferingDataFileAppender$WriteBatchDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", null, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "org/apache/activemq/store/kahadb/disk/journal/Journal", "WriteCommand", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "WriteBatch", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch", "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender", "WriteBatch", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(0, "buff", "Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forceToDisk", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;ILorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "cachedBuffers", "[Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "flip", "B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "flip", "B");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "buff", "Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "buff", "Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "access$000", "(Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "append", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch", "append", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "forceToDisk", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "buff", "Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender", "access$100", "(Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;Lorg/apache/activemq/store/kahadb/disk/util/DataByteArrayOutputStream;)Z", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "forceToDisk", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/CallerBufferingDataFileAppender$WriteBatch", "forceToDisk", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
