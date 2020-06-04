package asm.org.apache.batchee.container.impl.jobinstance;
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
public class RuntimeJobExecutionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jobNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;", "Lorg/apache/batchee/container/navigator/ModelNavigator<Lorg/apache/batchee/jaxb/JSLJob;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jobInstance", "Ljavax/batch/runtime/JobInstance;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "executionId", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "restartOn", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "listenerFactory", "Lorg/apache/batchee/container/proxy/ListenerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "partitionInstance", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "releasables", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/io/Closeable;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/batch/runtime/JobInstance;JLorg/apache/batchee/spi/PersistenceManagerService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "partitionInstance", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "releasables", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobInstance", "Ljavax/batch/runtime/JobInstance;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "executionId", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/JobExecutionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/runtime/JobInstance", "getInstanceId", "()J", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/JobExecutionImpl", "<init>", "(JJLorg/apache/batchee/spi/PersistenceManagerService;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareForExecution", "(Lorg/apache/batchee/container/impl/JobContextImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getNavigator", "()Lorg/apache/batchee/container/navigator/ModelNavigator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "executionId", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setExecutionId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobInstance", "Ljavax/batch/runtime/JobInstance;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/runtime/JobInstance", "getInstanceId", "()J", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setInstanceId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "restartOn", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setJobContext", "(Lorg/apache/batchee/container/impl/JobContextImpl;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareForExecution", "(Lorg/apache/batchee/container/impl/JobContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "prepareForExecution", "(Lorg/apache/batchee/container/impl/JobContextImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inheritJobContext", "(Lorg/apache/batchee/container/impl/JobContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getExecutionId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setExecutionId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getInstanceId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setInstanceId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getJobName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "setJobName", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRestartOn", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "restartOn", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExecutionId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "executionId", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstanceId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobInstance", "Ljavax/batch/runtime/JobInstance;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/runtime/JobInstance", "getInstanceId", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobInstance", "()Ljavax/batch/runtime/JobInstance;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobInstance", "Ljavax/batch/runtime/JobInstance;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobNavigator", "()Lorg/apache/batchee/container/navigator/ModelNavigator;", "()Lorg/apache/batchee/container/navigator/ModelNavigator<Lorg/apache/batchee/jaxb/JSLJob;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobNavigator", "Lorg/apache/batchee/container/navigator/ModelNavigator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobContext", "()Lorg/apache/batchee/container/impl/JobContextImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRestartOn", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "restartOn", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getListenerFactory", "()Lorg/apache/batchee/container/proxy/ListenerFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "listenerFactory", "Lorg/apache/batchee/container/proxy/ListenerFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setListenerFactory", "(Lorg/apache/batchee/container/proxy/ListenerFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "listenerFactory", "Lorg/apache/batchee/container/proxy/ListenerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobOperatorJobExecution", "()Lorg/apache/batchee/container/services/InternalJobExecution;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBatchStatus", "()Ljavax/batch/runtime/BatchStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getBatchStatus", "()Ljavax/batch/runtime/BatchStatus;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExitStatus", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobContext", "Lorg/apache/batchee/container/impl/JobContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/JobContextImpl", "getExitStatus", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBatchStatus", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setBatchStatus", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCreateTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setCreateTime", "(Ljava/sql/Timestamp;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEndTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setEndTime", "(Ljava/sql/Timestamp;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExitStatus", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setExitStatus", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLastUpdateTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setLastUpdateTime", "(Ljava/sql/Timestamp;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStartTime", "(Ljava/sql/Timestamp;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setStartTime", "(Ljava/sql/Timestamp;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJobParameters", "(Ljava/util/Properties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "setJobParameters", "(Ljava/util/Properties;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobParameters", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "getJobParameters", "()Ljava/util/Properties;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStartTime", "()Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "getStartTime", "()Ljava/util/Date;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEndTime", "()Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "getEndTime", "()Ljava/util/Date;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastUpdatedTime", "()Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "getLastUpdatedTime", "()Ljava/util/Date;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateTime", "()Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "operatorJobExecution", "Lorg/apache/batchee/container/services/InternalJobExecution;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/container/services/InternalJobExecution", "getCreateTime", "()Ljava/util/Date;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(" executionId: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "executionId", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" restartOn: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "restartOn", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\n-----------------------\njobInstance: \n   ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "jobInstance", "Ljavax/batch/runtime/JobInstance;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPartitionInstance", "()Ljava/lang/Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "partitionInstance", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPartitionInstance", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "partitionInstance", "Ljava/lang/Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReleasables", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/io/Closeable;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "releasables", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "addReleasable", "(Ljava/io/Closeable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/jobinstance/RuntimeJobExecution", "releasables", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
