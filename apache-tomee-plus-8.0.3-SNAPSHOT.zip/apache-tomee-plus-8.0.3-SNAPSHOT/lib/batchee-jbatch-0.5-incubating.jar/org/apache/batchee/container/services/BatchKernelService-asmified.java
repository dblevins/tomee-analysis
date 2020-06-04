package asm.org.apache.batchee.container.services;
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
public class BatchKernelServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/container/services/BatchKernelService", null, "java/lang/Object", new String[] { "org/apache/batchee/spi/BatchService" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobExecution", "(J)Lorg/apache/batchee/container/services/InternalJobExecution;", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restartJob", "(JLjava/util/Properties;)Lorg/apache/batchee/container/services/InternalJobExecution;", null, new String[] { "jakarta/batch/operations/JobRestartException", "jakarta/batch/operations/JobExecutionAlreadyCompleteException", "jakarta/batch/operations/JobExecutionNotMostRecentException", "jakarta/batch/operations/NoSuchJobExecutionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startJob", "(Ljava/lang/String;Ljava/util/Properties;)Lorg/apache/batchee/container/services/InternalJobExecution;", null, new String[] { "jakarta/batch/operations/JobStartException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stopJob", "(J)V", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobExecutionNotRunningException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobExecutionDone", "(Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstanceCount", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstance", "(J)Ljakarta/batch/runtime/JobInstance;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildNewParallelPartitions", "(Lorg/apache/batchee/container/util/PartitionsBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;)Ljava/util/List;", "(Lorg/apache/batchee/container/util/PartitionsBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;)Ljava/util/List<Lorg/apache/batchee/container/util/BatchPartitionWorkUnit;>;", new String[] { "jakarta/batch/operations/JobRestartException", "jakarta/batch/operations/JobStartException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildOnRestartParallelPartitions", "(Lorg/apache/batchee/container/util/PartitionsBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;)Ljava/util/List;", "(Lorg/apache/batchee/container/util/PartitionsBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;Lorg/apache/batchee/container/impl/StepContextImpl;)Ljava/util/List<Lorg/apache/batchee/container/util/BatchPartitionWorkUnit;>;", new String[] { "jakarta/batch/operations/JobRestartException", "jakarta/batch/operations/JobExecutionAlreadyCompleteException", "jakarta/batch/operations/JobExecutionNotMostRecentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startGeneratedJob", "(Lorg/apache/batchee/container/util/BatchWorkUnit;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restartGeneratedJob", "(Lorg/apache/batchee/container/util/BatchWorkUnit;)V", null, new String[] { "jakarta/batch/operations/JobRestartException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isExecutionRunning", "(J)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildNewFlowInSplitWorkUnit", "(Lorg/apache/batchee/container/util/FlowInSplitBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;)Lorg/apache/batchee/container/util/BatchFlowInSplitWorkUnit;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildOnRestartFlowInSplitWorkUnit", "(Lorg/apache/batchee/container/util/FlowInSplitBuilderConfig;Lorg/apache/batchee/container/impl/JobContextImpl;)Lorg/apache/batchee/container/util/BatchFlowInSplitWorkUnit;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
