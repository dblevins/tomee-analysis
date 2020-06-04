package asm.org.apache.batchee.container.util;
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
public class BatchWorkUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/util/BatchWorkUnit", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "batchKernel", "Lorg/apache/batchee/container/services/BatchKernelService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "controller", "Lorg/apache/batchee/container/ThreadRootController;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "notifyCallbackWhenDone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/services/ServicesManager;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/util/BatchWorkUnit", "<init>", "(Lorg/apache/batchee/container/services/ServicesManager;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/services/ServicesManager;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "batchKernel", "Lorg/apache/batchee/container/services/BatchKernelService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/container/services/BatchKernelService;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "service", "(Ljava/lang/Class;)Lorg/apache/batchee/spi/BatchService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/container/services/BatchKernelService");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "setBatchKernel", "(Lorg/apache/batchee/container/services/BatchKernelService;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "setJobExecutionImpl", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "setNotifyCallbackWhenDone", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/JobController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/JobController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "controller", "Lorg/apache/batchee/container/ThreadRootController;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getController", "()Lorg/apache/batchee/container/ThreadRootController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "controller", "Lorg/apache/batchee/container/ThreadRootController;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "controller", "Lorg/apache/batchee/container/ThreadRootController;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/ThreadRootController", "originateExecutionOnThread", "()Lorg/apache/batchee/container/status/ExecutionStatus;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "isNotifyCallbackWhenDone", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "getBatchKernel", "()Lorg/apache/batchee/container/services/BatchKernelService;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/BatchKernelService", "jobExecutionDone", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "markThreadCompleted", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/io/StringWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/PrintWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/PrintWriter", "<init>", "(Ljava/io/Writer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "printStackTrace", "(Ljava/io/PrintWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "isNotifyCallbackWhenDone", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "getBatchKernel", "()Lorg/apache/batchee/container/services/BatchKernelService;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/BatchKernelService", "jobExecutionDone", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/Throwable", "java/io/StringWriter", "java/io/PrintWriter"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("This job failed unexpectedly.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/batchee/container/util/BatchWorkUnit"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchWorkUnit", "markThreadCompleted", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getBatchStatus", "()Ljavax/batch/runtime/BatchStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getBatchStatus", "()Ljavax/batch/runtime/BatchStatus;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getExitStatus", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getExitStatus", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBatchKernel", "(Lorg/apache/batchee/container/services/BatchKernelService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "batchKernel", "Lorg/apache/batchee/container/services/BatchKernelService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBatchKernel", "()Lorg/apache/batchee/container/services/BatchKernelService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "batchKernel", "Lorg/apache/batchee/container/services/BatchKernelService;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJobExecutionImpl", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNotifyCallbackWhenDone", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "notifyCallbackWhenDone", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotifyCallbackWhenDone", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchWorkUnit", "notifyCallbackWhenDone", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "markThreadCompleted", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
