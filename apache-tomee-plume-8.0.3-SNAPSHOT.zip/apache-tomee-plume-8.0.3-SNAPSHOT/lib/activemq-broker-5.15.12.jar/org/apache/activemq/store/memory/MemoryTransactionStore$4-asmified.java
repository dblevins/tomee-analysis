package asm.org.apache.activemq.store.memory;
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
public class MemoryTransactionStore$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/memory/MemoryTransactionStore$4", null, "java/lang/Object", new String[] { "org/apache/activemq/store/memory/MemoryTransactionStore$RemoveMessageCommand" });

classWriter.visitOuterClass("org/apache/activemq/store/memory/MemoryTransactionStore", "removeMessage", "(Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/command/MessageAck;)V");

classWriter.visitInnerClass("org/apache/activemq/store/memory/MemoryTransactionStore$4", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/memory/MemoryTransactionStore$RemoveMessageCommand", "org/apache/activemq/store/memory/MemoryTransactionStore", "RemoveMessageCommand", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ack", "Lorg/apache/activemq/command/MessageAck;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$destination", "Lorg/apache/activemq/store/MessageStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/memory/MemoryTransactionStore;Lorg/apache/activemq/command/MessageAck;Lorg/apache/activemq/store/MessageStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "this$0", "Lorg/apache/activemq/store/memory/MemoryTransactionStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$ack", "Lorg/apache/activemq/command/MessageAck;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$destination", "Lorg/apache/activemq/store/MessageStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageAck", "()Lorg/apache/activemq/command/MessageAck;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$ack", "Lorg/apache/activemq/command/MessageAck;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$destination", "Lorg/apache/activemq/store/MessageStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$ack", "Lorg/apache/activemq/command/MessageAck;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/store/MessageStore", "removeMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessageAck;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageStore", "()Lorg/apache/activemq/store/MessageStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/memory/MemoryTransactionStore$4", "val$destination", "Lorg/apache/activemq/store/MessageStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
