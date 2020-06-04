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
public class TargetedDataFileAppender$WriteBatchDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "org/apache/activemq/store/kahadb/disk/journal/Journal", "WriteCommand", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender", "WriteBatch", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "dataFile", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "writes", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList<Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "exception", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Ljava/io/IOException;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "writes", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/journal/Journal", "BATCH_CONTROL_RECORD_SIZE", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "exception", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "dataFile", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "dataFile", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/journal/Journal", "BATCH_CONTROL_RECORD_SIZE", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/DataFile", "incrementLength", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/journal/Journal", "BATCH_CONTROL_RECORD_SIZE", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender", "access$000", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;)Lorg/apache/activemq/store/kahadb/disk/journal/Journal;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/journal/Journal", "BATCH_CONTROL_RECORD_SIZE", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Journal", "addToTotalLength", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;ILorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "append", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canAppend", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "getSize", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender", "access$100", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "writes", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "addLast", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "dataFile", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/DataFile", "getDataFileId", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "setDataFileId", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "setOffset", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "location", "Lorg/apache/activemq/store/kahadb/disk/journal/Location;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Location", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "dataFile", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFile;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/DataFile", "incrementLength", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender$WriteBatch", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender", "access$000", "(Lorg/apache/activemq/store/kahadb/disk/journal/TargetedDataFileAppender;)Lorg/apache/activemq/store/kahadb/disk/journal/Journal;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/Journal", "addToTotalLength", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
