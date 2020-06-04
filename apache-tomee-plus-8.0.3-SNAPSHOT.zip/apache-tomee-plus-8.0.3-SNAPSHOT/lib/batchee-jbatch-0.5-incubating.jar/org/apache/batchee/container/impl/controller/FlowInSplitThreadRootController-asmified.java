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
public class FlowInSplitThreadRootControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController", null, "org/apache/batchee/container/impl/controller/JobThreadRootController", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flowInSplitExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;Lorg/apache/batchee/container/util/FlowInSplitBuilderConfig;Lorg/apache/batchee/container/services/ServicesManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/FlowInSplitBuilderConfig", "getRootJobExecutionId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/JobThreadRootController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;JLorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController", "flowInSplitExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "originateExecutionOnThread", "()Lorg/apache/batchee/container/status/ExecutionStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/JobThreadRootController", "originateExecutionOnThread", "()Lorg/apache/batchee/container/status/ExecutionStatus;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController", "flowInSplitExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution", "setFlowStatus", "(Lorg/apache/batchee/container/status/ExecutionStatus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "batchStatusFailedFromException", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/JobThreadRootController", "batchStatusFailedFromException", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController", "flowInSplitExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution", "getFlowStatus", "()Lorg/apache/batchee/container/status/ExecutionStatus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/status/ExtendedBatchStatus", "EXCEPTION_THROWN", "Lorg/apache/batchee/container/status/ExtendedBatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/status/ExecutionStatus", "setExtendedBatchStatus", "(Lorg/apache/batchee/container/status/ExtendedBatchStatus;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
