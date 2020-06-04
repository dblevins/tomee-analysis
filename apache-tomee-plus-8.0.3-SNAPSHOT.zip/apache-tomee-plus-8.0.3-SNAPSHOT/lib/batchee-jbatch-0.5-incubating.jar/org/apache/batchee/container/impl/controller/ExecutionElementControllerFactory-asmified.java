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
public class ExecutionElementControllerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/ExecutionElementControllerFactory", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getStepController", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)Lorg/apache/batchee/container/impl/controller/BaseStepController;", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue<Lorg/apache/batchee/container/util/PartitionDataWrapper;>;Lorg/apache/batchee/container/services/ServicesManager;)Lorg/apache/batchee/container/impl/controller/BaseStepController;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Step", "getPartition", "()Lorg/apache/batchee/jaxb/Partition;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getMapper", "()Lorg/apache/batchee/jaxb/PartitionMapper;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/PartitionedStepController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/PartitionedStepController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/batchee/jaxb/Partition"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getPlan", "()Lorg/apache/batchee/jaxb/PartitionPlan;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Partition", "getPlan", "()Lorg/apache/batchee/jaxb/PartitionPlan;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/PartitionPlan", "getPartitions", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/PartitionedStepController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/PartitionedStepController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Step", "getBatchlet", "()Lorg/apache/batchee/jaxb/Batchlet;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Step", "getChunk", "()Lorg/apache/batchee/jaxb/Chunk;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Step contains both a batchlet and a chunk.  Aborting.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/batchee/jaxb/Batchlet"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/batchlet/BatchletStepController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/jaxb/Step", "getChunk", "()Lorg/apache/batchee/jaxb/Chunk;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Step does not contain either a batchlet or a chunk.  Aborting.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/batchee/jaxb/Chunk"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Step;Lorg/apache/batchee/container/impl/StepContextImpl;JLjava/util/concurrent/BlockingQueue;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDecisionController", "(Lorg/apache/batchee/container/services/ServicesManager;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Decision;)Lorg/apache/batchee/container/impl/controller/DecisionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/DecisionController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/DecisionController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Decision;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getFlowController", "(Lorg/apache/batchee/container/services/ServicesManager;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Flow;J)Lorg/apache/batchee/container/impl/controller/FlowController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/FlowController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/FlowController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Flow;JLorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSplitController", "(Lorg/apache/batchee/container/services/BatchKernelService;Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Split;J)Lorg/apache/batchee/container/impl/controller/SplitController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/SplitController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/SplitController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;Lorg/apache/batchee/jaxb/Split;JLorg/apache/batchee/container/services/BatchKernelService;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
