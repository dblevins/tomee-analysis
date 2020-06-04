package asm.org.apache.batchee.container.impl.controller.batchlet;
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
public class BatchletStepControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", null, "org/apache/batchee/container/impl/controller/SingleThreadedStepController", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "batchletProxy", "Ljakarta/batch/api/Batchlet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)V", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue<Lorg/apache/batchee/container/util/PartitionDataWrapper;>;Lorg/apache/batchee/container/services/ServicesManager;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/SingleThreadedStepController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/spi/BatchArtifactFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "service", "(Ljava/lang/Class;)Lorg/apache/batchee/spi/BatchService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/spi/BatchArtifactFactory");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "invokeBatchlet", "(Lorg/apache/batchee/jaxb/Batchlet;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Batchlet", "getRef", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Batchlet", "getProperties", "()Lorg/apache/batchee/jaxb/JSLProperties;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Batchlet", "getProperties", "()Lorg/apache/batchee/jaxb/JSLProperties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/JSLProperties", "getPropertyList", "()Ljava/util/List;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/List"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/proxy/InjectionReferences");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/proxy/InjectionReferences", "<init>", "(Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/proxy/ProxyFactory", "createBatchletProxy", "(Lorg/apache/batchee/spi/BatchArtifactFactory;Ljava/lang/String;Lorg/apache/batchee/container/proxy/InjectionReferences;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)Ljakarta/batch/api/Batchlet;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "batchletProxy", "Ljakarta/batch/api/Batchlet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "wasStopIssued", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "batchletProxy", "Ljakarta/batch/api/Batchlet;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/batch/api/Batchlet", "process", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "org/apache/batchee/jaxb/Batchlet", "java/lang/String", "java/util/List", "org/apache/batchee/container/proxy/InjectionReferences", "java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/impl/controller/chunk/ExceptionConfig", "wrapBatchException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "setBatchletProcessRetVal", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "wasStopIssued", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getBatchStatus", "()Ljakarta/batch/runtime/BatchStatus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STOPPING", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/batch/runtime/BatchStatus", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STOPPING", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "setBatchStatus", "(Ljakarta/batch/runtime/BatchStatus;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "invokeCoreStep", "()V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "step", "Lorg/apache/batchee/jaxb/Step;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Step", "getBatchlet", "()Lorg/apache/batchee/jaxb/Batchlet;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "invokeBatchlet", "(Lorg/apache/batchee/jaxb/Batchlet;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "invokeCollectorIfPresent", "()V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "invokeCollectorIfPresent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "stop", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STARTING", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "getBatchStatus", "()Ljakarta/batch/runtime/BatchStatus;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/batch/runtime/BatchStatus", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STARTED", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "getBatchStatus", "()Ljakarta/batch/runtime/BatchStatus;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/batch/runtime/BatchStatus", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "stepContext", "Lorg/apache/batchee/container/impl/StepContextImpl;");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/BatchStatus", "STOPPING", "Ljakarta/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/StepContextImpl", "setBatchStatus", "(Ljakarta/batch/runtime/BatchStatus;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "batchletProxy", "Ljakarta/batch/api/Batchlet;");
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "batchletProxy", "Ljakarta/batch/api/Batchlet;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/batch/api/Batchlet", "stop", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/impl/controller/chunk/ExceptionConfig", "wrapBatchException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
