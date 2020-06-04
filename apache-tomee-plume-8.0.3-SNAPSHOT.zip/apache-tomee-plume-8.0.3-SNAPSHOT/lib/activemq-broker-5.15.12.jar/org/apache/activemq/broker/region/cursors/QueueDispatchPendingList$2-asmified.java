package asm.org.apache.activemq.broker.region.cursors;
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
public class QueueDispatchPendingList$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/apache/activemq/broker/region/MessageReference;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/activemq/broker/region/cursors/QueueDispatchPendingList", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "redeliveries", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/apache/activemq/broker/region/MessageReference;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "pendingDispatch", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/apache/activemq/broker/region/MessageReference;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "current", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/apache/activemq/broker/region/MessageReference;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "this$0", "Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "this$0", "Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList", "access$000", "(Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;)Lorg/apache/activemq/broker/region/cursors/PendingList;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingList", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "redeliveries", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "this$0", "Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList", "access$100", "(Lorg/apache/activemq/broker/region/cursors/QueueDispatchPendingList;)Lorg/apache/activemq/broker/region/cursors/PendingList;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingList", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "pendingDispatch", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "redeliveries", "Ljava/util/Iterator;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "redeliveries", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "redeliveries", "Ljava/util/Iterator;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "pendingDispatch", "Ljava/util/Iterator;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/activemq/broker/region/MessageReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/MessageReference");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "current", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/cursors/QueueDispatchPendingList$2", "next", "()Lorg/apache/activemq/broker/region/MessageReference;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
