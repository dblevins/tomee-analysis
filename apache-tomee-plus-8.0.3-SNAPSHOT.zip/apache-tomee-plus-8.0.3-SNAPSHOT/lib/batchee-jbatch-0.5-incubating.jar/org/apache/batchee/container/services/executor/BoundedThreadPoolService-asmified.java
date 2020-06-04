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
public class BoundedThreadPoolServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/services/executor/BoundedThreadPoolService", null, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOUNDED_THREADPOOL_MAX_POOL_SIZE", "Ljava/lang/String;", null, "BOUNDED_THREADPOOL_MAX_POOL_SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOUNDED_THREADPOOL_MIN_POOL_SIZE", "Ljava/lang/String;", null, "BOUNDED_THREADPOOL_MIN_POOL_SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOUNDED_THREADPOOL_KEEP_ALIVE_TIME", "Ljava/lang/String;", null, "BOUNDED_THREADPOOL_KEEP_ALIVE_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOUNDED_THREADPOOL_QUEUE_SIZE", "Ljava/lang/String;", null, "BOUNDED_THREADPOOL_QUEUE_SIZE");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/services/executor/AbstractThreadPoolService", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newExecutorService", "(Ljava/util/Properties;)Ljava/util/concurrent/ExecutorService;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ThreadPoolExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("BOUNDED_THREADPOOL_MIN_POOL_SIZE");
methodVisitor.visitLdcInsn("3");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/executor/BoundedThreadPoolService", "getInt", "(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("BOUNDED_THREADPOOL_MAX_POOL_SIZE");
methodVisitor.visitLdcInsn("10");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/executor/BoundedThreadPoolService", "getInt", "(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("BOUNDED_THREADPOOL_KEEP_ALIVE_TIME");
methodVisitor.visitLdcInsn("900");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/executor/BoundedThreadPoolService", "getInt", "(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/LinkedBlockingQueue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("BOUNDED_THREADPOOL_QUEUE_SIZE");
methodVisitor.visitLdcInsn("4096");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/batchee/container/services/executor/BoundedThreadPoolService", "getInt", "(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/LinkedBlockingQueue", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/services/executor/BatcheeThreadFactory", "INSTANCE", "Ljava/util/concurrent/ThreadFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ThreadPoolExecutor", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(12, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getInt", "(Ljava/util/Properties;Ljava/lang/String;Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
