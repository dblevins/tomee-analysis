package asm.org.apache.openejb.quartz.spi;
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
public class JobStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/spi/JobStore", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$TriggerState", "org/apache/openejb/quartz/Trigger", "TriggerState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$CompletedExecutionInstruction", "org/apache/openejb/quartz/Trigger", "CompletedExecutionInstruction", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/spi/SchedulerSignaler;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerConfigException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schedulerStarted", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schedulerPaused", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "schedulerResumed", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shutdown", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "supportsPersistence", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEstimatedTimeToReleaseAndAcquireTrigger", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isClustered", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeJobAndTrigger", "(Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeJob", "(Lorg/apache/openejb/quartz/JobDetail;Z)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeJobsAndTriggers", "(Ljava/util/Map;Z)V", "(Ljava/util/Map<Lorg/apache/openejb/quartz/JobDetail;Ljava/util/Set<+Lorg/apache/openejb/quartz/Trigger;>;>;Z)V", new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeJob", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeJobs", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/JobKey;>;)Z", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "retrieveJob", "(Lorg/apache/openejb/quartz/JobKey;)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Z)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTriggers", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "replaceTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/quartz/spi/OperableTrigger;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "retrieveTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/spi/OperableTrigger;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkExists", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "checkExists", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearAllSchedulingData", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeCalendar", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;ZZ)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeCalendar", "(Ljava/lang/String;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "retrieveCalendar", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Calendar;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumberOfJobs", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumberOfTriggers", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNumberOfCalendars", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/JobKey;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCalendarNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggersForJob", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTriggerState", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/Trigger$TriggerState;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPausedTriggerGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pauseAll", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resumeAll", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "acquireNextTriggers", "(JIJ)Ljava/util/List;", "(JIJ)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "releaseAcquiredTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "triggersFired", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/TriggerFiredResult;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "triggeredJobComplete", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInstanceId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInstanceName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setThreadPoolSize", "(I)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
