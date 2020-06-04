package asm.org.apache.batchee.container.services.executor;
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
public class AbstractThreadPoolServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", null, "java/lang/Object", new String[] { "org/apache/batchee/spi/BatchThreadPoolService" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "executorService", "Ljava/util/concurrent/ExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "newExecutorService", "(Ljava/util/Properties;)Ljava/util/concurrent/ExecutorService;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljava/util/Properties;)V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "newExecutorService", "(Ljava/util/Properties;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shutdown", "()V", null, new String[] { "org/apache/batchee/container/exception/BatchContainerServiceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdownNow", "()Ljava/util/List;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "executeTask", "(Ljava/lang/Runnable;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "executorService", "Ljava/util/concurrent/ExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/util/ClassLoaderAwareHandler", "runnableLoaderAware", "(Ljava/lang/Object;)Ljava/lang/Runnable;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "execute", "(Ljava/lang/Runnable;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
