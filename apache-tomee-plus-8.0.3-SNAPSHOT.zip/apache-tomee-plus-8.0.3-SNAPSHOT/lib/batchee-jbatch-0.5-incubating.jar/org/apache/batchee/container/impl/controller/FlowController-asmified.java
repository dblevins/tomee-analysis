package asm.org.apache.batchee.container.impl.controller;
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
public class FlowControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/FlowController", null, "java/lang/Object", new String[] { "org/apache/batchee/container/ExecutionElementController" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "manager", "Lorg/apache/batchee/container/services/ServicesManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "flowNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;", "Lorg/apache/batchee/container/navigator/ModelNavigator<Lorg/apache/batchee/jaxb/Flow;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "flow", "Lorg/apache/batchee/jaxb/Flow;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rootJobExecutionId", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transitioner", "Lorg/apache/batchee/container/impl/controller/ExecutionTransitioner;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Flow;JLorg/apache/batchee/container/services/ServicesManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/navigator/NavigatorFactory", "createFlowNavigator", "(Lorg/apache/batchee/jaxb/Flow;)Lorg/apache/batchee/container/navigator/FlowNavigator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "flowNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "flow", "Lorg/apache/batchee/jaxb/Flow;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "rootJobExecutionId", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "manager", "Lorg/apache/batchee/container/services/ServicesManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "()Lorg/apache/batchee/container/status/ExecutionStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getBatchStatus", "()Ljakarta/batch/runtime/BatchStatus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STOPPING", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/batch/runtime/BatchStatus", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/ExecutionTransitioner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "rootJobExecutionId", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "flowNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "manager", "Lorg/apache/batchee/container/services/ServicesManager;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/ExecutionTransitioner", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;JLorg/apache/batchee/container/navigator/ModelNavigator;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowController", "transitioner", "Lorg/apache/batchee/container/impl/controller/ExecutionTransitioner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "transitioner", "Lorg/apache/batchee/container/impl/controller/ExecutionTransitioner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/ExecutionTransitioner", "doExecutionLoop", "()Lorg/apache/batchee/container/status/ExecutionStatus;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/status/ExecutionStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/status/ExtendedBatchStatus", "JOB_OPERATOR_STOPPING", "Lorg/apache/batchee/container/status/ExtendedBatchStatus;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/status/ExecutionStatus", "<init>", "(Lorg/apache/batchee/container/status/ExtendedBatchStatus;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "transitioner", "Lorg/apache/batchee/container/impl/controller/ExecutionTransitioner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/ExecutionTransitioner", "getCurrentStoppableElementController", "()Lorg/apache/batchee/container/Controller;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/Controller", "stop", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/batchee/container/Controller"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastRunStepExecutions", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowController", "transitioner", "Lorg/apache/batchee/container/impl/controller/ExecutionTransitioner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/ExecutionTransitioner", "getStepExecIds", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
