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
public class JDBCTopicMessageStore$LastRecoveredAwareListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", null, "java/lang/Object", new String[] { "org/apache/activemq/store/jdbc/JDBCMessageRecoveryListener" });

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecoveredEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "LastRecoveredAwareListener", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "maxMessages", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastRecovered", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "recoveredCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "recoveredMarker", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;Lorg/apache/activemq/store/MessageRecoveryListener;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "this$0", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "maxMessages", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recoverMessage", "(J[B)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "hasSpace", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "maxMessages", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "this$0", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/ByteSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/ByteSequence", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "unmarshal", "(Lorg/apache/activemq/util/ByteSequence;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/Message");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageId", "setBrokerSequenceId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "lastRecovered", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry", "recovered", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "recoverMessage", "(Lorg/apache/activemq/command/Message;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recoverMessageReference", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/MessageId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/MessageId", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "recoverMessageReference", "(Lorg/apache/activemq/command/MessageId;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLastRecovered", "(Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "lastRecovered", "Lorg/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredMarker", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "complete", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "delegate", "Lorg/apache/activemq/store/MessageRecoveryListener;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageRecoveryListener", "hasSpace", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "maxMessages", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stalled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredMarker", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/jdbc/JDBCTopicMessageStore$LastRecoveredAwareListener", "recoveredCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
