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
public class DataFileAppender$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/disk/journal/DataFileAppender", "enqueue", "(Lorg/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand;)Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch;");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/Journal$WriteCommand", "org/apache/activemq/store/kahadb/disk/journal/Journal", "WriteCommand", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$WriteBatch", "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender", "WriteBatch", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$1", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender$1", "this$0", "Lorg/apache/activemq/store/kahadb/disk/journal/DataFileAppender;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/journal/DataFileAppender", "processQueue", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
