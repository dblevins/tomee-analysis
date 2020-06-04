package asm.org.apache.openejb.quartz.core;
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
public class SampledStatisticsImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/core/SampledStatisticsImpl", null, "org/apache/openejb/quartz/listeners/SchedulerListenerSupport", new String[] { "org/apache/openejb/quartz/core/SampledStatistics", "org/apache/openejb/quartz/JobListener", "org/apache/openejb/quartz/SchedulerListener" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "scheduler", "Lorg/apache/openejb/quartz/core/QuartzScheduler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NAME", "Ljava/lang/String;", null, "QuartzSampledStatistics");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_HISTORY_SIZE", "I", null, new Integer(30));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_INTERVAL_SECS", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_SAMPLED_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_SAMPLED_RATE_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledRateCounterConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "counterManager", "Lorg/apache/openejb/quartz/utils/counter/CounterManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobsScheduledCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobsExecutingCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobsCompletedCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/quartz/core/QuartzScheduler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/listeners/SchedulerListenerSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "scheduler", "Lorg/apache/openejb/quartz/core/QuartzScheduler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/counter/CounterManagerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/util/Timer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QuartzSampledStatisticsTimer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Timer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/CounterManagerImpl", "<init>", "(Ljava/util/Timer;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "counterManager", "Lorg/apache/openejb/quartz/utils/counter/CounterManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "DEFAULT_SAMPLED_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "createSampledCounter", "(Lorg/apache/openejb/quartz/utils/counter/CounterConfig;)Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsScheduledCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "DEFAULT_SAMPLED_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "createSampledCounter", "(Lorg/apache/openejb/quartz/utils/counter/CounterConfig;)Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsExecutingCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "DEFAULT_SAMPLED_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "createSampledCounter", "(Lorg/apache/openejb/quartz/utils/counter/CounterConfig;)Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsCompletedCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "addInternalSchedulerListener", "(Lorg/apache/openejb/quartz/SchedulerListener;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzScheduler", "addInternalJobListener", "(Lorg/apache/openejb/quartz/JobListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shutdown", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "counterManager", "Lorg/apache/openejb/quartz/utils/counter/CounterManager;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/CounterManager", "shutdown", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createSampledCounter", "(Lorg/apache/openejb/quartz/utils/counter/CounterConfig;)Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "counterManager", "Lorg/apache/openejb/quartz/utils/counter/CounterManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/CounterManager", "createCounter", "(Lorg/apache/openejb/quartz/utils/counter/CounterConfig;)Lorg/apache/openejb/quartz/utils/counter/Counter;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearStatistics", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsScheduledCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getAndReset", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsExecutingCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getAndReset", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsCompletedCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getAndReset", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobsCompletedMostRecentSample", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsCompletedCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getMostRecentSample", "()Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue", "getCounterValue", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobsExecutingMostRecentSample", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsExecutingCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getMostRecentSample", "()Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue", "getCounterValue", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobsScheduledMostRecentSample", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsScheduledCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "getMostRecentSample", "()Lorg/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/counter/sampled/TimeStampedCounterValue", "getCounterValue", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("QuartzSampledStatistics");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobScheduled", "(Lorg/apache/openejb/quartz/Trigger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsScheduledCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "increment", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobExecutionVetoed", "(Lorg/apache/openejb/quartz/JobExecutionContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobToBeExecuted", "(Lorg/apache/openejb/quartz/JobExecutionContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsExecutingCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "increment", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobWasExecuted", "(Lorg/apache/openejb/quartz/JobExecutionContext;Lorg/apache/openejb/quartz/JobExecutionException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "jobsCompletedCount", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounter", "increment", "()J", true);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobAdded", "(Lorg/apache/openejb/quartz/JobDetail;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jobDeleted", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig", "<init>", "(IIZJ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "DEFAULT_SAMPLED_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledCounterConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/utils/counter/sampled/SampledRateCounterConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/counter/sampled/SampledRateCounterConfig", "<init>", "(IIZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/core/SampledStatisticsImpl", "DEFAULT_SAMPLED_RATE_COUNTER_CONFIG", "Lorg/apache/openejb/quartz/utils/counter/sampled/SampledRateCounterConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
