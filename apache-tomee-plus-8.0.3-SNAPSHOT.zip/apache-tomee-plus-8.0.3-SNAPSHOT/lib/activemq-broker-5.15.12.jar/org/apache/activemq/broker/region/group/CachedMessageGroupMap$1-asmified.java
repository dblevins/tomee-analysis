package asm.org.apache.activemq.broker.region.group;
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
public class CachedMessageGroupMap$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", "Lorg/apache/activemq/memory/LRUMap<Ljava/lang/String;Lorg/apache/activemq/command/ConsumerId;>;", "org/apache/activemq/memory/LRUMap", null);

classWriter.visitOuterClass("org/apache/activemq/broker/region/group/CachedMessageGroupMap", "<init>", "(I)V");

classWriter.visitInnerClass("org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", "this$0", "Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/memory/LRUMap", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/memory/LRUMap", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", "this$0", "Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", "this$0", "Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getConsumers", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Subscription");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Subscription", "getConsumerInfo", "()Lorg/apache/activemq/command/ConsumerInfo;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "getConsumerId", "()Lorg/apache/activemq/command/ConsumerId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerId", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Subscription", "getConsumerInfo", "()Lorg/apache/activemq/command/ConsumerInfo;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap$1", "this$0", "Lorg/apache/activemq/broker/region/group/CachedMessageGroupMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/group/CachedMessageGroupMap", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getActiveMQDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "decrementAssignedGroupCount", "(Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
