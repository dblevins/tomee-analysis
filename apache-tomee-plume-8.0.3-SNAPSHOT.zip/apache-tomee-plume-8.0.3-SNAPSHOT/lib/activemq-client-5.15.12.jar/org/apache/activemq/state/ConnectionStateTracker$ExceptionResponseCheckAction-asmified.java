package asm.org.apache.activemq.state;
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
public class ConnectionStateTracker$ExceptionResponseCheckActionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", null, "java/lang/Object", new String[] { "org/apache/activemq/state/ResponseHandler" });

classWriter.visitInnerClass("org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "org/apache/activemq/state/ConnectionStateTracker", "ExceptionResponseCheckAction", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tracked", "Lorg/apache/activemq/command/Command;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/state/ConnectionStateTracker;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/state/ConnectionStateTracker;Lorg/apache/activemq/command/Command;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "this$0", "Lorg/apache/activemq/state/ConnectionStateTracker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "tracked", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onResponse", "(Lorg/apache/activemq/command/Command;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/command/Command", "getDataStructureType", "()B", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "tracked", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/command/Command", "getDataStructureType", "()B", true);
methodVisitor.visitInsn(ICONST_5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "this$0", "Lorg/apache/activemq/state/ConnectionStateTracker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "tracked", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ConsumerInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "getConsumerId", "()Lorg/apache/activemq/command/ConsumerId;", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/state/ConnectionStateTracker", "processRemoveConsumer", "(Lorg/apache/activemq/command/ConsumerId;J)Lorg/apache/activemq/command/Response;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "tracked", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/command/Command", "getDataStructureType", "()B", true);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "this$0", "Lorg/apache/activemq/state/ConnectionStateTracker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/state/ConnectionStateTracker$ExceptionResponseCheckAction", "tracked", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ProducerInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ProducerInfo", "getProducerId", "()Lorg/apache/activemq/command/ProducerId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/state/ConnectionStateTracker", "processRemoveProducer", "(Lorg/apache/activemq/command/ProducerId;)Lorg/apache/activemq/command/Response;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
