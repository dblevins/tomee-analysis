package asm.org.apache.tomcat.dbcp.pool2.impl;
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
public class BaseGenericObjectPoolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "<T:Ljava/lang/Object;>Lorg/apache/tomcat/dbcp/pool2/BaseObject;", "org/apache/tomcat/dbcp/pool2/BaseObject", null);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$IdentityWrapper", "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "IdentityWrapper", ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$EvictionIterator", "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "EvictionIterator", 0);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "StatsStore", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor", "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "Evictor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MEAN_TIMING_STATS_CACHE_SIZE", "I", null, new Integer(100));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EVICTION_POLICY_TYPE_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "maxTotal", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "blockWhenExhausted", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "maxWaitMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "lifo", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "fairness", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "testOnCreate", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "testOnBorrow", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "testOnReturn", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "testWhileIdle", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "timeBetweenEvictionRunsMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "numTestsPerEvictionRun", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "minEvictableIdleTimeMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "softMinEvictableIdleTimeMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "evictorShutdownTimeoutMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "closeLock", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_VOLATILE, "closed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "evictionLock", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<TT;>.Evictor;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "evictionIterator", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$EvictionIterator;", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<TT;>.EvictionIterator;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factoryClassLoader", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference<Ljava/lang/ClassLoader;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "objectName", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "creationStackTrace", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "borrowedCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "returnedCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "createdCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "destroyedCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "destroyedByEvictorCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "destroyedByBorrowValidationCount", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "activeTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<TT;>.StatsStore;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "idleTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<TT;>.StatsStore;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "waitTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<TT;>.StatsStore;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "swallowedExceptionListener", "Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig;Ljava/lang/String;Ljava/lang/String;)V", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig<TT;>;Ljava/lang/String;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/BaseObject", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxTotal", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "blockWhenExhausted", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxWaitMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "lifo", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnCreate", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnBorrow", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnReturn", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testWhileIdle", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "timeBetweenEvictionRunsMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "numTestsPerEvictionRun", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1800000L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "minEvictableIdleTimeMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "softMinEvictableIdleTimeMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(10000L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictorShutdownTimeoutMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "closeLock", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "closed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionLock", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionIterator", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$EvictionIterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "borrowedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "returnedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "createdCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByEvictorCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByBorrowValidationCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "activeTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "idleTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "waitTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "swallowedExceptionListener", "Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getJmxEnabled", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "jmxRegister", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig;Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Exception");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Exception", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "getStackTrace", "(Ljava/lang/Exception;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "creationStackTrace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "factoryClassLoader", "Ljava/lang/ref/WeakReference;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ClassLoader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ref/WeakReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "factoryClassLoader", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getFairness", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "fairness", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxTotal", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxTotal", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setMaxTotal", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxTotal", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBlockWhenExhausted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "blockWhenExhausted", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setBlockWhenExhausted", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "blockWhenExhausted", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setConfig", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig;)V", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getLifo", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setLifo", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getMaxWaitMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setMaxWaitMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getBlockWhenExhausted", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setBlockWhenExhausted", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getTestOnCreate", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setTestOnCreate", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getTestOnBorrow", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setTestOnBorrow", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getTestOnReturn", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setTestOnReturn", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getTestWhileIdle", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setTestWhileIdle", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getNumTestsPerEvictionRun", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setNumTestsPerEvictionRun", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getMinEvictableIdleTimeMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setMinEvictableIdleTimeMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getTimeBetweenEvictionRunsMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setTimeBetweenEvictionRunsMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getSoftMinEvictableIdleTimeMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setSoftMinEvictableIdleTimeMillis", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getEvictionPolicy", "()Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getEvictionPolicyClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictionPolicyClassName", "(Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/EvictionPolicy"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictionPolicy", "(Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getEvictorShutdownTimeoutMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictorShutdownTimeoutMillis", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxWaitMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxWaitMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setMaxWaitMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxWaitMillis", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getLifo", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "lifo", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getFairness", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "fairness", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setLifo", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "lifo", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTestOnCreate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnCreate", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTestOnCreate", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnCreate", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTestOnBorrow", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnBorrow", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTestOnBorrow", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnBorrow", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTestOnReturn", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnReturn", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTestOnReturn", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnReturn", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTestWhileIdle", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testWhileIdle", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTestWhileIdle", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testWhileIdle", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTimeBetweenEvictionRunsMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "timeBetweenEvictionRunsMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setTimeBetweenEvictionRunsMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "timeBetweenEvictionRunsMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "startEvictor", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getNumTestsPerEvictionRun", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "numTestsPerEvictionRun", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setNumTestsPerEvictionRun", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "numTestsPerEvictionRun", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMinEvictableIdleTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "minEvictableIdleTimeMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setMinEvictableIdleTimeMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "minEvictableIdleTimeMillis", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getSoftMinEvictableIdleTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "softMinEvictableIdleTimeMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setSoftMinEvictableIdleTimeMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "softMinEvictableIdleTimeMillis", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getEvictionPolicyClassName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEvictionPolicy", "(Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;)V", "(Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setEvictionPolicyClassName", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassCastException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label3, label4, "java/lang/ClassCastException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label3, label5, "java/lang/ClassNotFoundException");
methodVisitor.visitTryCatchBlock(label0, label3, label5, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label0, label3, label5, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label0, label3, label5, "java/lang/reflect/InvocationTargetException");
methodVisitor.visitTryCatchBlock(label0, label3, label5, "java/lang/NoSuchMethodException");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;"));
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictionPolicy", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "java/lang/String", "java/lang/ClassLoader", "java/lang/Class", "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictionPolicy", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassCastException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Class ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" from class loaders [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("] do not implement ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "EVICTION_POLICY_TYPE_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ReflectiveOperationException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unable to create ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "EVICTION_POLICY_TYPE_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" instance of type ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setEvictionPolicy", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", null, new String[] { "java/lang/ClassNotFoundException", "java/lang/InstantiationException", "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "java/lang/NoSuchMethodException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/dbcp/pool2/impl/EvictionPolicy");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setEvictionPolicyClassName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "setEvictionPolicyClassName", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getEvictorShutdownTimeoutMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictorShutdownTimeoutMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setEvictorShutdownTimeoutMillis", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictorShutdownTimeoutMillis", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "close", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isClosed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "closed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "evict", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEvictionPolicy", "()Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;", "()Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "assertOpen", "()V", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "isClosed", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pool not open");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "startEvictor", "(J)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionLock", "Ljava/lang/Object;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictorShutdownTimeoutMillis", "J");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "cancel", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;JLjava/util/concurrent/TimeUnit;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionIterator", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$EvictionIterator;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "schedule", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;JJ)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "stopEvictor", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "startEvictor", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "ensureMinIdle", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getJmxName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getCreationStackTrace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "creationStackTrace", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBorrowedCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "borrowedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getReturnedCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "returnedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getCreatedCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "createdCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDestroyedCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDestroyedByEvictorCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByEvictorCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDestroyedByBorrowValidationCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByBorrowValidationCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMeanActiveTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "activeTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "getMean", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMeanIdleTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "idleTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "getMean", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMeanBorrowWaitTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "waitTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "getMean", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxBorrowWaitTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumIdle", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getSwallowedExceptionListener", "()Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "swallowedExceptionListener", "Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "setSwallowedExceptionListener", "(Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "swallowedExceptionListener", "Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "swallowException", "(Ljava/lang/Exception;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/VirtualMachineError");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "getSwallowedExceptionListener", "()Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/dbcp/pool2/SwallowedExceptionListener"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/SwallowedExceptionListener", "onSwallowException", "(Ljava/lang/Exception;)V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/VirtualMachineError"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "updateStatsBorrow", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;J)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<TT;>;J)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "borrowedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "idleTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getIdleTimeMillis", "()J", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "add", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "waitTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "add", "(J)V", false);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "compareAndSet", "(JJ)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "updateStatsReturn", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "returnedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "activeTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore", "add", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "markReturningState", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject;)V", "(Lorg/apache/tomcat/dbcp/pool2/PooledObject<TT;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "getState", "()Lorg/apache/tomcat/dbcp/pool2/PooledObjectState;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/PooledObjectState", "ALLOCATED", "Lorg/apache/tomcat/dbcp/pool2/PooledObjectState;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Object has already been returned to this pool or is invalid");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/apache/tomcat/dbcp/pool2/PooledObjectState"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/dbcp/pool2/PooledObject", "markReturning", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "org/apache/tomcat/dbcp/pool2/PooledObject", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_FINAL, "jmxUnregister", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/management/MBeanRegistrationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/management/InstanceNotFoundException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/management/ManagementFactory", "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "unregisterMBean", "(Ljavax/management/ObjectName;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/management/JMException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "swallowException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "jmxRegister", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig;Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig<TT;>;Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/management/MalformedObjectNameException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/management/InstanceAlreadyExistsException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "javax/management/MBeanRegistrationException");
methodVisitor.visitTryCatchBlock(label0, label1, label4, "javax/management/NotCompliantMBeanException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/management/ManagementFactory", "getPlatformMBeanServer", "()Ljavax/management/MBeanServer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "getJmxNameBase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "java/lang/String", "java/lang/String", "javax/management/ObjectName", "javax/management/MBeanServer", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label7);
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/management/ObjectName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/management/ObjectName", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/ObjectName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/management/MBeanServer", "registerMBean", "(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "org/apache/tomcat/dbcp/pool2/impl/BaseObjectPoolConfig", "java/lang/String", "java/lang/String", "javax/management/ObjectName", "javax/management/MBeanServer", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/String"}, 1, new Object[] {"javax/management/MalformedObjectNameException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLdcInsn("pool");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/management/MalformedObjectNameException"}, 0, null);
methodVisitor.visitLdcInsn("pool");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/management/InstanceAlreadyExistsException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/management/JMException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getStackTrace", "(Ljava/lang/Exception;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/StringWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/PrintWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/PrintWriter", "<init>", "(Ljava/io/Writer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "(Ljava/io/PrintWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "toStringAppendFields", "(Ljava/lang/StringBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("maxTotal=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxTotal", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", blockWhenExhausted=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "blockWhenExhausted", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", maxWaitMillis=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxWaitMillis", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", lifo=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "lifo", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", fairness=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "fairness", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", testOnCreate=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnCreate", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", testOnBorrow=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnBorrow", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", testOnReturn=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testOnReturn", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", testWhileIdle=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "testWhileIdle", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", timeBetweenEvictionRunsMillis=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "timeBetweenEvictionRunsMillis", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", numTestsPerEvictionRun=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "numTestsPerEvictionRun", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", minEvictableIdleTimeMillis=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "minEvictableIdleTimeMillis", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", softMinEvictableIdleTimeMillis=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "softMinEvictableIdleTimeMillis", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", evictionPolicy=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionPolicy", "Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", closeLock=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "closeLock", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", closed=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "closed", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", evictionLock=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionLock", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", evictor=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictor", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", evictionIterator=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "evictionIterator", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$EvictionIterator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", factoryClassLoader=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "factoryClassLoader", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", oname=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "objectName", "Ljavax/management/ObjectName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", creationStackTrace=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "creationStackTrace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", borrowedCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "borrowedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", returnedCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "returnedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", createdCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "createdCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", destroyedCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", destroyedByEvictorCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByEvictorCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", destroyedByBorrowValidationCount=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "destroyedByBorrowValidationCount", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", activeTimes=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "activeTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", idleTimes=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "idleTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", waitTimes=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "waitTimes", "Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$StatsStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", maxBorrowWaitTimeMillis=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "maxBorrowWaitTimeMillis", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", swallowedExceptionListener=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "swallowedExceptionListener", "Lorg/apache/tomcat/dbcp/pool2/SwallowedExceptionListener;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool;)Ljava/lang/ref/WeakReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "factoryClassLoader", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/dbcp/pool2/impl/EvictionPolicy;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "EVICTION_POLICY_TYPE_NAME", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
