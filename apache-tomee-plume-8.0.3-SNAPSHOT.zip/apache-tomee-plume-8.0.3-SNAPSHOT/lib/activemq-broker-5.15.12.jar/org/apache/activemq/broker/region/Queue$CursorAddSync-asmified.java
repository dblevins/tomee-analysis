package asm.org.apache.activemq.broker.region;
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
public class Queue$CursorAddSyncDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/activemq/broker/region/Queue$CursorAddSync", null, "org/apache/activemq/transaction/Synchronization", null);

classWriter.visitInnerClass("org/apache/activemq/store/IndexListener$MessageContext", "org/apache/activemq/store/IndexListener", "MessageContext", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/broker/region/Queue$CursorAddSync", "org/apache/activemq/broker/region/Queue", "CursorAddSync", ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/Queue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/Queue;Lorg/apache/activemq/store/IndexListener$MessageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "this$0", "Lorg/apache/activemq/broker/region/Queue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transaction/Synchronization", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "incrementReferenceCount", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCommit", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "this$0", "Lorg/apache/activemq/broker/region/Queue;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue", "store", "Lorg/apache/activemq/store/MessageStore;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "isPersistent", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "this$0", "Lorg/apache/activemq/broker/region/Queue;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/Queue", "access$600", "(Lorg/apache/activemq/broker/region/Queue;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "this$0", "Lorg/apache/activemq/broker/region/Queue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/Queue", "access$700", "(Lorg/apache/activemq/broker/region/Queue;Lorg/apache/activemq/command/Message;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "this$0", "Lorg/apache/activemq/broker/region/Queue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "context", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "messageSent", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "decrementReferenceCount", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterRollback", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/Queue$CursorAddSync", "messageContext", "Lorg/apache/activemq/store/IndexListener$MessageContext;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/IndexListener$MessageContext", "message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "decrementReferenceCount", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
