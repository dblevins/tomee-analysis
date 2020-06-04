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
public class PendingMessageHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "map", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/broker/region/cursors/PendingNode;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageSize", "Lorg/apache/activemq/management/SizeStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;Lorg/apache/activemq/management/SizeStatisticImpl;)V", "(Ljava/util/Map<Lorg/apache/activemq/command/MessageId;Lorg/apache/activemq/broker/region/cursors/PendingNode;>;Lorg/apache/activemq/management/SizeStatisticImpl;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "messageSize", "Lorg/apache/activemq/management/SizeStatisticImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToMap", "(Lorg/apache/activemq/broker/region/MessageReference;Lorg/apache/activemq/broker/region/cursors/PendingNode;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/cursors/PendingNode");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "messageSize", "Lorg/apache/activemq/management/SizeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/cursors/PendingNode", "getMessage", "()Lorg/apache/activemq/broker/region/MessageReference;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getSize", "()I", true);
methodVisitor.visitInsn(INEG);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/SizeStatisticImpl", "addSize", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/region/cursors/PendingMessageHelper", "org/apache/activemq/broker/region/MessageReference", "org/apache/activemq/broker/region/cursors/PendingNode", "org/apache/activemq/broker/region/cursors/PendingNode"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "messageSize", "Lorg/apache/activemq/management/SizeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getSize", "()I", true);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/SizeStatisticImpl", "addSize", "(J)V", false);
methodVisitor.visitLabel(label4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeFromMap", "(Lorg/apache/activemq/broker/region/MessageReference;)Lorg/apache/activemq/broker/region/cursors/PendingNode;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getMessageId", "()Lorg/apache/activemq/command/MessageId;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/cursors/PendingNode");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/cursors/PendingMessageHelper", "messageSize", "Lorg/apache/activemq/management/SizeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/cursors/PendingNode", "getMessage", "()Lorg/apache/activemq/broker/region/MessageReference;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/MessageReference", "getSize", "()I", true);
methodVisitor.visitInsn(INEG);
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/SizeStatisticImpl", "addSize", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/broker/region/cursors/PendingMessageHelper", "org/apache/activemq/broker/region/MessageReference", "org/apache/activemq/broker/region/cursors/PendingNode"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
