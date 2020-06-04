package asm.org.apache.activemq.network;
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
public class ConditionalNetworkBridgeFilterFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", null, "java/lang/Object", new String[] { "org/apache/activemq/network/NetworkBridgeFilterFactory" });

classWriter.visitInnerClass("org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "ConditionalNetworkBridgeFilter", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "replayWhenNoConsumers", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "replayDelay", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "rateLimit", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "rateDuration", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayWhenNoConsumers", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayDelay", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateLimit", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateDuration", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Lorg/apache/activemq/command/ConsumerInfo;[Lorg/apache/activemq/command/BrokerId;II)Lorg/apache/activemq/command/NetworkBridgeFilter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "<init>", "(Lorg/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setNetworkBrokerId", "(Lorg/apache/activemq/command/BrokerId;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setMessageTTL", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setConsumerTTL", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "isReplayWhenNoConsumers", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setAllowReplayWhenNoConsumers", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "getRateLimit", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setRateLimit", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "getRateDuration", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setRateDuration", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "getReplayDelay", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory$ConditionalNetworkBridgeFilter", "setReplayDelay", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReplayWhenNoConsumers", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayWhenNoConsumers", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReplayWhenNoConsumers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayWhenNoConsumers", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRateLimit", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateLimit", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRateLimit", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateLimit", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRateDuration", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateDuration", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRateDuration", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "rateDuration", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReplayDelay", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayDelay", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReplayDelay", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/ConditionalNetworkBridgeFilterFactory", "replayDelay", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
