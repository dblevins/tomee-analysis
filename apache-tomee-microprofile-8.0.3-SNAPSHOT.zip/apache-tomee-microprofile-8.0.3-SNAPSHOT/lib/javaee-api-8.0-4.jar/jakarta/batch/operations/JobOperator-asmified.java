package asm.jakarta.batch.operations;
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
public class JobOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/batch/operations/JobOperator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobNames", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", new String[] { "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstanceCount", "(Ljava/lang/String;)I", null, new String[] { "jakarta/batch/operations/NoSuchJobException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstances", "(Ljava/lang/String;II)Ljava/util/List;", "(Ljava/lang/String;II)Ljava/util/List<Ljakarta/batch/runtime/JobInstance;>;", new String[] { "jakarta/batch/operations/NoSuchJobException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRunningExecutions", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Long;>;", new String[] { "jakarta/batch/operations/NoSuchJobException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "(J)Ljava/util/Properties;", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "start", "(Ljava/lang/String;Ljava/util/Properties;)J", null, new String[] { "jakarta/batch/operations/JobStartException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restart", "(JLjava/util/Properties;)J", null, new String[] { "jakarta/batch/operations/JobExecutionAlreadyCompleteException", "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobExecutionNotMostRecentException", "jakarta/batch/operations/JobRestartException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "(J)V", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobExecutionNotRunningException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abandon", "(J)V", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobExecutionIsRunningException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstance", "(J)Ljakarta/batch/runtime/JobInstance;", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobExecutions", "(Ljakarta/batch/runtime/JobInstance;)Ljava/util/List;", "(Ljakarta/batch/runtime/JobInstance;)Ljava/util/List<Ljakarta/batch/runtime/JobExecution;>;", new String[] { "jakarta/batch/operations/NoSuchJobInstanceException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobExecution", "(J)Ljakarta/batch/runtime/JobExecution;", null, new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepExecutions", "(J)Ljava/util/List;", "(J)Ljava/util/List<Ljakarta/batch/runtime/StepExecution;>;", new String[] { "jakarta/batch/operations/NoSuchJobExecutionException", "jakarta/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
