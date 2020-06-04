package asm.org.apache.activemq.usage;
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
public class JobSchedulerUsageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/usage/JobSchedulerUsage", "Lorg/apache/activemq/usage/Usage<Lorg/apache/activemq/usage/JobSchedulerUsage;>;", "org/apache/activemq/usage/Usage", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/Usage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/Usage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/usage/JobSchedulerUsage;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/usage/Usage", "<init>", "(Lorg/apache/activemq/usage/Usage;Ljava/lang/String;F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "retrieveUsage", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/scheduler/JobSchedulerStore", "size", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStore", "()Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStore", "(Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/usage/JobSchedulerUsage", "store", "Lorg/apache/activemq/broker/scheduler/JobSchedulerStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/JobSchedulerUsage", "onLimitChange", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
