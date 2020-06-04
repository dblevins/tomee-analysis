package asm.org.apache.openejb.quartz.impl;
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
public class DirectSchedulerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/SchedulerFactory" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_INSTANCE_ID", "Ljava/lang/String;", null, "SIMPLE_NON_CLUSTERED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_SCHEDULER_NAME", "Ljava/lang/String;", null, "SimpleQuartzScheduler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_JMX_EXPORT", "Z", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_JMX_OBJECTNAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_THREAD_EXECUTOR", "Lorg/apache/openejb/quartz/impl/DefaultThreadExecutor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_BATCH_MAX_SIZE", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_BATCH_TIME_WINDOW", "J", null, new Long(0L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "initialized", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "instance", "Lorg/apache/openejb/quartz/impl/DirectSchedulerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getLog", "()Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "initialized", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/apache/openejb/quartz/impl/DirectSchedulerFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "instance", "Lorg/apache/openejb/quartz/impl/DirectSchedulerFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createVolatileScheduler", "(I)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/simpl/SimpleThreadPool");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/simpl/SimpleThreadPool", "<init>", "(II)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/simpl/SimpleThreadPool", "initialize", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/simpl/RAMJobStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/simpl/RAMJobStore", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRemoteScheduler", "(Ljava/lang/String;I)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SimpleQuartzScheduler");
methodVisitor.visitLdcInsn("SIMPLE_NON_CLUSTERED");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createRemoteScheduler", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRemoteScheduler", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createRemoteScheduler", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRemoteScheduler", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "getUniqueIdentifier", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/RemoteScheduler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/RemoteScheduler", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerRepository", "getInstance", "()Lorg/apache/openejb/quartz/impl/SchedulerRepository;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/SchedulerRepository", "bind", "(Lorg/apache/openejb/quartz/Scheduler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "initialized", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SimpleQuartzScheduler");
methodVisitor.visitLdcInsn("SIMPLE_NON_CLUSTERED");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/lang/String;IJJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/lang/String;IJJ)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "DEFAULT_JMX_OBJECTNAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(14, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/quartz/spi/SchedulerPlugin;>;Ljava/lang/String;IJJZLjava/lang/String;)V", new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "DEFAULT_THREAD_EXECUTOR", "Lorg/apache/openejb/quartz/impl/DefaultThreadExecutor;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(15, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/quartz/spi/SchedulerPlugin;>;Ljava/lang/String;IJJZLjava/lang/String;)V", new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "DEFAULT_THREAD_EXECUTOR", "Lorg/apache/openejb/quartz/impl/DefaultThreadExecutor;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitVarInsn(LLOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;IJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(18, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createScheduler", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map;Ljava/lang/String;IJJZLjava/lang/String;IJ)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ThreadPool;Lorg/apache/openejb/quartz/spi/ThreadExecutor;Lorg/apache/openejb/quartz/spi/JobStore;Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/quartz/spi/SchedulerPlugin;>;Ljava/lang/String;IJJZLjava/lang/String;IJ)V", new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/StdJobRunShellFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/StdJobRunShellFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/spi/ThreadPool", "initialize", "()V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/core/QuartzSchedulerResources");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 19);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setInstanceId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerDetailsSetter", "setDetails", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setJobRunShellFactory", "(Lorg/apache/openejb/quartz/core/JobRunShellFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setThreadPool", "(Lorg/apache/openejb/quartz/spi/ThreadPool;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setThreadExecutor", "(Lorg/apache/openejb/quartz/spi/ThreadExecutor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setJobStore", "(Lorg/apache/openejb/quartz/spi/JobStore;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ILOAD, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setMaxBatchSize", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(LLOAD, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setBatchTimeWindow", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setRMIRegistryHost", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setRMIRegistryPort", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setJMXExport", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 14);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "setJMXObjectName", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/quartz/core/JobRunShellFactory", "org/apache/openejb/quartz/core/QuartzSchedulerResources"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 20);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/spi/SchedulerPlugin");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerResources", "addSchedulerPlugin", "(Lorg/apache/openejb/quartz/spi/SchedulerPlugin;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/core/QuartzScheduler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 19);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitVarInsn(LLOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/QuartzScheduler", "<init>", "(Lorg/apache/openejb/quartz/core/QuartzSchedulerResources;JJ)V", false);
methodVisitor.visitVarInsn(ASTORE, 20);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/simpl/CascadingClassLoadHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/simpl/CascadingClassLoadHelper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 21);
methodVisitor.visitVarInsn(ALOAD, 21);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/spi/ClassLoadHelper", "initialize", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerDetailsSetter", "setDetails", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 21);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "getSchedulerSignaler", "()Lorg/apache/openejb/quartz/spi/SchedulerSignaler;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/spi/JobStore", "initialize", "(Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/spi/SchedulerSignaler;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/StdScheduler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/StdScheduler", "<init>", "(Lorg/apache/openejb/quartz/core/QuartzScheduler;)V", false);
methodVisitor.visitVarInsn(ASTORE, 22);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/core/JobRunShellFactory", "initialize", "(Lorg/apache/openejb/quartz/Scheduler;)V", true);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 23);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 21, new Object[] {"org/apache/openejb/quartz/impl/DirectSchedulerFactory", "java/lang/String", "java/lang/String", "org/apache/openejb/quartz/spi/ThreadPool", "org/apache/openejb/quartz/spi/ThreadExecutor", "org/apache/openejb/quartz/spi/JobStore", "java/util/Map", "java/lang/String", Opcodes.INTEGER, Opcodes.LONG, Opcodes.LONG, Opcodes.INTEGER, "java/lang/String", Opcodes.INTEGER, Opcodes.LONG, "org/apache/openejb/quartz/core/JobRunShellFactory", "org/apache/openejb/quartz/core/QuartzSchedulerResources", "org/apache/openejb/quartz/core/QuartzScheduler", "org/apache/openejb/quartz/spi/ClassLoadHelper", "org/apache/openejb/quartz/Scheduler", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 23);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 23);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 24);
methodVisitor.visitVarInsn(ALOAD, 24);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/spi/SchedulerPlugin");
methodVisitor.visitVarInsn(ALOAD, 24);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitVarInsn(ALOAD, 21);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/spi/SchedulerPlugin", "initialize", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Scheduler;Lorg/apache/openejb/quartz/spi/ClassLoadHelper;)V", true);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "getLog", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Quartz scheduler '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/Scheduler", "getSchedulerName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "getLog", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Quartz scheduler version: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerRepository", "getInstance", "()Lorg/apache/openejb/quartz/impl/SchedulerRepository;", false);
methodVisitor.visitVarInsn(ASTORE, 23);
methodVisitor.visitVarInsn(ALOAD, 20);
methodVisitor.visitVarInsn(ALOAD, 23);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "addNoGCObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 23);
methodVisitor.visitVarInsn(ALOAD, 22);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/SchedulerRepository", "bind", "(Lorg/apache/openejb/quartz/Scheduler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "initialized", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 25);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScheduler", "()Lorg/apache/openejb/quartz/Scheduler;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "initialized", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("you must call createRemoteScheduler or createScheduler methods before calling getScheduler()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SimpleQuartzScheduler");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "getScheduler", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Scheduler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScheduler", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Scheduler;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerRepository", "getInstance", "()Lorg/apache/openejb/quartz/impl/SchedulerRepository;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/SchedulerRepository", "lookup", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Scheduler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllSchedulers", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/openejb/quartz/Scheduler;>;", new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/SchedulerRepository", "getInstance", "()Lorg/apache/openejb/quartz/impl/SchedulerRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/SchedulerRepository", "lookupAll", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "DEFAULT_JMX_OBJECTNAME", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/DefaultThreadExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/DefaultThreadExecutor", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "DEFAULT_THREAD_EXECUTOR", "Lorg/apache/openejb/quartz/impl/DefaultThreadExecutor;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/DirectSchedulerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/DirectSchedulerFactory", "instance", "Lorg/apache/openejb/quartz/impl/DirectSchedulerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
