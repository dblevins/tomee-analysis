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
public class BatchFlowInSplitWorkUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", null, "org/apache/batchee/container/util/BatchParallelWorkUnit", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "completedThreadQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/BlockingQueue<Lorg/apache/batchee/container/util/BatchFlowInSplitWorkUnit;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;Lorg/apache/batchee/container/util/FlowInSplitBuilderConfig;Lorg/apache/batchee/container/services/ServicesManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/util/BatchParallelWorkUnit", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;ZLorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/FlowInSplitBuilderConfig", "getCompletedQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "completedThreadQueue", "Ljava/util/concurrent/BlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/FlowInSplitThreadRootController", "<init>", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;Lorg/apache/batchee/container/util/FlowInSplitBuilderConfig;Lorg/apache/batchee/container/services/ServicesManager;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "controller", "Lorg/apache/batchee/container/ThreadRootController;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "markThreadCompleted", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "completedThreadQueue", "Ljava/util/concurrent/BlockingQueue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "completedThreadQueue", "Ljava/util/concurrent/BlockingQueue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "jobExecutionImpl", "Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/util/BatchFlowInSplitWorkUnit", "getJobExecutionImpl", "()Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
