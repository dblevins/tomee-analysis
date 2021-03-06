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
public class TopicSubscription$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/TopicSubscription$2", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/broker/region/TopicSubscription", "pullMessage", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessagePull;)Lorg/apache/activemq/command/Response;");

classWriter.visitInnerClass("org/apache/activemq/broker/region/TopicSubscription$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$currentDispatchedCount", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$pull", "Lorg/apache/activemq/command/MessagePull;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/TopicSubscription;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/TopicSubscription;JLorg/apache/activemq/command/MessagePull;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "this$0", "Lorg/apache/activemq/broker/region/TopicSubscription;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "val$currentDispatchedCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "val$pull", "Lorg/apache/activemq/command/MessagePull;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "this$0", "Lorg/apache/activemq/broker/region/TopicSubscription;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "val$currentDispatchedCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TopicSubscription$2", "val$pull", "Lorg/apache/activemq/command/MessagePull;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessagePull", "isAlwaysSignalDone", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/TopicSubscription", "access$200", "(Lorg/apache/activemq/broker/region/TopicSubscription;JZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
