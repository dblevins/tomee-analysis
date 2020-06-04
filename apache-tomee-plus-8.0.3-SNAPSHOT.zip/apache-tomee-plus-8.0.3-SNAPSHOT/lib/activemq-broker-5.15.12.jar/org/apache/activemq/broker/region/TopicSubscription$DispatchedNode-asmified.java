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
public class TopicSubscription$DispatchedNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "org/apache/activemq/broker/region/TopicSubscription", "DispatchedNode", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/command/Message$MessageDestination", "org/apache/activemq/command/Message", "MessageDestination", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageId", "Lorg/apache/activemq/command/MessageId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "destination", "Lorg/apache/activemq/broker/region/Destination;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/region/MessageReference;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getSize", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "messageId", "Lorg/apache/activemq/command/MessageId;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getRegionDestination", "()Lorg/apache/activemq/command/Message$MessageDestination;", true);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/broker/region/Destination");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getRegionDestination", "()Lorg/apache/activemq/command/Message$MessageDestination;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Destination");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "org/apache/activemq/broker/region/MessageReference"}, 1, new Object[] {"org/apache/activemq/broker/region/TopicSubscription$DispatchedNode"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "org/apache/activemq/broker/region/MessageReference"}, 2, new Object[] {"org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "org/apache/activemq/broker/region/Destination"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "size", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageId", "()Lorg/apache/activemq/command/MessageId;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "messageId", "Lorg/apache/activemq/command/MessageId;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestination", "()Lorg/apache/activemq/broker/region/Destination;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$DispatchedNode", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
