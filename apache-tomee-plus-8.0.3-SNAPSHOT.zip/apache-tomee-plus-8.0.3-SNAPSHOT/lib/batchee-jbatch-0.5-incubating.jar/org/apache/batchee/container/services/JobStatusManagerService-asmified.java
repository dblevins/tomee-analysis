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
public class JobStatusManagerServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/batchee/container/services/JobStatusManagerService", null, "java/lang/Object", new String[] { "org/apache/batchee/spi/BatchService" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createJobStatus", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobStatus", "(Lorg/apache/batchee/container/status/JobStatus;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobStatus", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobStatusFromExecutionId", "(J)Lorg/apache/batchee/container/status/JobStatus;", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobBatchStatus", "(JLjavax/batch/runtime/BatchStatus;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobExecutionStatus", "(JLjavax/batch/runtime/BatchStatus;Ljava/lang/String;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobStatusFromJSLStop", "(JLjava/lang/String;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobStatusWithNewExecution", "(JJ)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobCurrentStep", "(JLjava/lang/String;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createStepStatus", "(J)Lorg/apache/batchee/container/status/StepStatus;", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateStepStatus", "(JLorg/apache/batchee/container/status/StepStatus;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepStatus", "(JLjava/lang/String;)Lorg/apache/batchee/container/status/StepStatus;", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
