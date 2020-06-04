package asm.org.apache.batchee.spi;
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
public class PersistenceManagerServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/spi/PersistenceManagerService", null, "java/lang/Object", new String[] { "org/apache/batchee/spi/BatchService" });

classWriter.visitInnerClass("org/apache/batchee/spi/PersistenceManagerService$TimestampType", "org/apache/batchee/spi/PersistenceManagerService", "TimestampType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorGetJobInstanceCount", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobNames", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorGetJobInstanceIds", "(Ljava/lang/String;II)Ljava/util/List;", "(Ljava/lang/String;II)Ljava/util/List<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorQueryJobExecutionTimestamp", "(JLorg/apache/batchee/spi/PersistenceManagerService$TimestampType;)Ljava/sql/Timestamp;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorQueryJobExecutionBatchStatus", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorQueryJobExecutionExitStatus", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepExecutionsForJobExecution", "(J)Ljava/util/List;", "(J)Ljava/util/List<Ljavax/batch/runtime/StepExecution;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateBatchStatusOnly", "(JLjavax/batch/runtime/BatchStatus;Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "markJobStarted", "(JLjava/sql/Timestamp;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateWithFinalExecutionStatusesAndTimestamps", "(JLjavax/batch/runtime/BatchStatus;Ljava/lang/String;Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorGetJobExecution", "(J)Lorg/apache/batchee/container/services/InternalJobExecution;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "(J)Ljava/util/Properties;", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorGetJobExecutions", "(J)Ljava/util/List;", "(J)Ljava/util/List<Lorg/apache/batchee/container/services/InternalJobExecution;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobOperatorGetRunningExecutions", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobStatusFromExecution", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstanceIdByExecutionId", "(J)J", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createJobInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/batch/runtime/JobInstance;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createJobExecution", "(Ljavax/batch/runtime/JobInstance;Ljava/util/Properties;Ljavax/batch/runtime/BatchStatus;)Lorg/apache/batchee/container/impl/jobinstance/RuntimeJobExecution;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createStepExecution", "(JLorg/apache/batchee/container/impl/StepContextImpl;)Lorg/apache/batchee/container/impl/StepExecutionImpl;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateStepExecution", "(JLorg/apache/batchee/container/impl/StepContextImpl;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createJobStatus", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobStatus", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobStatus", "(JLorg/apache/batchee/container/status/JobStatus;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createStepStatus", "(J)Lorg/apache/batchee/container/status/StepStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepStatus", "(JLjava/lang/String;)Lorg/apache/batchee/container/status/StepStatus;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateStepStatus", "(JLorg/apache/batchee/container/status/StepStatus;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCheckpointData", "(Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCheckpointData", "(Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;)Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMostRecentExecutionId", "(J)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubJobInstance", "(Ljava/lang/String;)Ljavax/batch/runtime/JobInstance;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createFlowInSplitExecution", "(Ljavax/batch/runtime/JobInstance;Ljavax/batch/runtime/BatchStatus;)Lorg/apache/batchee/container/impl/jobinstance/RuntimeFlowInSplitExecution;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepExecutionByStepExecutionId", "(J)Ljavax/batch/runtime/StepExecution;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cleanUp", "(J)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cleanUp", "(Ljava/util/Date;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
