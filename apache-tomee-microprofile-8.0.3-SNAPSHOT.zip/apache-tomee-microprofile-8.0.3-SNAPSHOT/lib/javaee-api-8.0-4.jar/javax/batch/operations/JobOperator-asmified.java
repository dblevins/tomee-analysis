package asm.javax.batch.operations;
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

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/batch/operations/JobOperator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobNames", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", new String[] { "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstanceCount", "(Ljava/lang/String;)I", null, new String[] { "javax/batch/operations/NoSuchJobException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstances", "(Ljava/lang/String;II)Ljava/util/List;", "(Ljava/lang/String;II)Ljava/util/List<Ljavax/batch/runtime/JobInstance;>;", new String[] { "javax/batch/operations/NoSuchJobException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRunningExecutions", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Long;>;", new String[] { "javax/batch/operations/NoSuchJobException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "(J)Ljava/util/Properties;", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "start", "(Ljava/lang/String;Ljava/util/Properties;)J", null, new String[] { "javax/batch/operations/JobStartException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restart", "(JLjava/util/Properties;)J", null, new String[] { "javax/batch/operations/JobExecutionAlreadyCompleteException", "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobExecutionNotMostRecentException", "javax/batch/operations/JobRestartException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "(J)V", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobExecutionNotRunningException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abandon", "(J)V", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobExecutionIsRunningException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobInstance", "(J)Ljavax/batch/runtime/JobInstance;", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobExecutions", "(Ljavax/batch/runtime/JobInstance;)Ljava/util/List;", "(Ljavax/batch/runtime/JobInstance;)Ljava/util/List<Ljavax/batch/runtime/JobExecution;>;", new String[] { "javax/batch/operations/NoSuchJobInstanceException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobExecution", "(J)Ljavax/batch/runtime/JobExecution;", null, new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStepExecutions", "(J)Ljava/util/List;", "(J)Ljava/util/List<Ljavax/batch/runtime/StepExecution;>;", new String[] { "javax/batch/operations/NoSuchJobExecutionException", "javax/batch/operations/JobSecurityException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
