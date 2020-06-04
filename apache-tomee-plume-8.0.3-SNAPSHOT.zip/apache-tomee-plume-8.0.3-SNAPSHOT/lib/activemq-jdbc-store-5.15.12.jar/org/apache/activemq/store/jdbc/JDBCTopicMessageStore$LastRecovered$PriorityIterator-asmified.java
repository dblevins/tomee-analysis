package asm.org.apache.activemq.store.jdbc;
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
public class JDBCTopicMessageStore$LastRecovered$PriorityIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecovered", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "PriorityIterator", 0);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecoveredEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "current", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "this$1", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "current", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "current", "I");
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "this$1", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "hasMessages", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "current", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(1, -1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "this$1", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "current", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("not implemented");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "next", "()Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
