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
public class DecisionControllerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/DecisionController", null, "java/lang/Object", new String[] { "org/apache/batchee/container/ExecutionElementController" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "decision", "Lorg/apache/batchee/jaxb/Decision;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "previousStepExecutions", "[Ljavax/batch/runtime/StepExecution;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "persistenceService", "Lorg/apache/batchee/spi/PersistenceManagerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Decision;Lorg/apache/batchee/container/services/ServicesManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "previousStepExecutions", "[Ljavax/batch/runtime/StepExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "decision", "Lorg/apache/batchee/jaxb/Decision;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/spi/PersistenceManagerService;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "service", "(Ljava/lang/Class;)Lorg/apache/batchee/spi/BatchService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/spi/PersistenceManagerService");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "persistenceService", "Lorg/apache/batchee/spi/PersistenceManagerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/spi/BatchArtifactFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "service", "(Ljava/lang/Class;)Lorg/apache/batchee/spi/BatchService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/spi/BatchArtifactFactory");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "()Lorg/apache/batchee/container/status/ExecutionStatus;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "decision", "Lorg/apache/batchee/jaxb/Decision;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Decision", "getRef", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "decision", "Lorg/apache/batchee/jaxb/Decision;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Decision", "getProperties", "()Lorg/apache/batchee/jaxb/JSLProperties;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "decision", "Lorg/apache/batchee/jaxb/Decision;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Decision", "getProperties", "()Lorg/apache/batchee/jaxb/JSLProperties;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/JSLProperties", "getPropertyList", "()Ljava/util/List;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/List"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/proxy/InjectionReferences");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/proxy/InjectionReferences", "<init>", "(Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "factory", "Lorg/apache/batchee/spi/BatchArtifactFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/proxy/ProxyFactory", "createDeciderProxy", "(Lorg/apache/batchee/spi/BatchArtifactFactory;Ljava/lang/String;Lorg/apache/batchee/container/proxy/InjectionReferences;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)Ljavax/batch/api/Decider;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "previousStepExecutions", "[Ljavax/batch/runtime/StepExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/Decider", "decide", "([Ljavax/batch/runtime/StepExecution;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/batchee/container/impl/controller/DecisionController", "java/lang/String", "java/util/List", "org/apache/batchee/container/proxy/InjectionReferences", "javax/batch/api/Decider", "java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/impl/controller/chunk/ExceptionConfig", "wrapBatchException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "jobExecution", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setExitStatus", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/status/ExecutionStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/status/ExtendedBatchStatus", "NORMAL_COMPLETION", "Lorg/apache/batchee/container/status/ExtendedBatchStatus;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/status/ExecutionStatus", "<init>", "(Lorg/apache/batchee/container/status/ExtendedBatchStatus;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setPreviousStepExecutions", "(Lorg/apache/batchee/container/jsl/ExecutionElement;Lorg/apache/batchee/container/ExecutionElementController;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/batchee/jaxb/Decision");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("A decision cannot precede another decision.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/ExecutionElementController", "getLastRunStepExecutions", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/batch/runtime/StepExecution");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/List", "[Ljavax/batch/runtime/StepExecution;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "persistenceService", "Lorg/apache/batchee/spi/PersistenceManagerService;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/spi/PersistenceManagerService", "getStepExecutionByStepExecutionId", "(J)Ljavax/batch/runtime/StepExecution;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/DecisionController", "previousStepExecutions", "[Ljavax/batch/runtime/StepExecution;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastRunStepExecutions", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
