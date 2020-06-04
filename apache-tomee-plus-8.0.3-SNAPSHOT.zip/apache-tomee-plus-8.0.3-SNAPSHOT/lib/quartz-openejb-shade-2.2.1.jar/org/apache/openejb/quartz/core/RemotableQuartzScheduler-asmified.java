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
public class RemotableQuartzSchedulerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/core/RemotableQuartzScheduler", null, "java/lang/Object", new String[] { "java/rmi/Remote" });

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$TriggerState", "org/apache/openejb/quartz/Trigger", "TriggerState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedulerName", "()Ljava/lang/String;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedulerInstanceId", "()Ljava/lang/String;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchedulerContext", "()Lorg/apache/openejb/quartz/SchedulerContext;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "start", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startDelayed", "(I)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "standby", "()V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInStandbyMode", "()Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shutdown", "()V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shutdown", "(Z)V", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isShutdown", "()Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "runningSince", "()Ljava/util/Date;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVersion", "()Ljava/lang/String;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "numJobsExecuted", "()I", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobStoreClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "supportsPersistence", "()Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isClustered", "()Z", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getThreadPoolClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getThreadPoolSize", "()I", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clear", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentlyExecutingJobs", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/openejb/quartz/JobExecutionContext;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleJob", "(Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger;)Ljava/util/Date;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleJob", "(Lorg/apache/openejb/quartz/Trigger;)Ljava/util/Date;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJob", "(Lorg/apache/openejb/quartz/JobDetail;Z)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addJob", "(Lorg/apache/openejb/quartz/JobDetail;ZZ)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteJob", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unscheduleJob", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rescheduleJob", "(Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/quartz/Trigger;)Ljava/util/Date;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "triggerJob", "(Lorg/apache/openejb/quartz/JobKey;Lorg/apache/openejb/quartz/JobDataMap;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "triggerJob", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)V", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)V", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)V", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPausedTriggerGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)V", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseAll", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeAll", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/JobKey;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggersOfJob", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List<+Lorg/apache/openejb/quartz/Trigger;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobDetail", "(Lorg/apache/openejb/quartz/JobKey;)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/Trigger;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerState", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/Trigger$TriggerState;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addCalendar", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;ZZ)V", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteCalendar", "(Ljava/lang/String;)Z", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalendar", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Calendar;", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalendarNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "interrupt", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/UnableToInterruptJobException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "interrupt", "(Ljava/lang/String;)Z", null, new String[] { "org/apache/openejb/quartz/UnableToInterruptJobException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkExists", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkExists", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteJobs", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/JobKey;>;)Z", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleJobs", "(Ljava/util/Map;Z)V", "(Ljava/util/Map<Lorg/apache/openejb/quartz/JobDetail;Ljava/util/Set<+Lorg/apache/openejb/quartz/Trigger;>;>;Z)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scheduleJob", "(Lorg/apache/openejb/quartz/JobDetail;Ljava/util/Set;Z)V", "(Lorg/apache/openejb/quartz/JobDetail;Ljava/util/Set<+Lorg/apache/openejb/quartz/Trigger;>;Z)V", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unscheduleJobs", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", new String[] { "org/apache/openejb/quartz/SchedulerException", "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
