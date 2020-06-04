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
public class JDBCTopicMessageStore$LastRecoveredDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "Ljava/lang/Object;Ljava/lang/Iterable<Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecovered", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "PriorityIterator", 0);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecoveredEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "this$0", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "<init>", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "updateStored", "(JI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "stored", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "defaultPriority", "()Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered", "perPriority", "[Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "deepToString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered$PriorityIterator", "<init>", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecovered;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
