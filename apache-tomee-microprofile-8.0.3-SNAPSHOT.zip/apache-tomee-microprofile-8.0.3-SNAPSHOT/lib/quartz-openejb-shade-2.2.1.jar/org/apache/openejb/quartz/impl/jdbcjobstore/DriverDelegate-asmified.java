package asm.org.apache.openejb.quartz.impl.jdbcjobstore;
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
public class DriverDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/impl/jdbcjobstore/DriverDelegate", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Lorg/slf4j/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/quartz/spi/ClassLoadHelper;ZLjava/lang/String;)V", null, new String[] { "org/apache/openejb/quartz/impl/jdbcjobstore/NoSuchDelegateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerStatesFromOtherStates", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectMisfiredTriggers", "(Ljava/sql/Connection;J)Ljava/util/List;", "(Ljava/sql/Connection;J)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectMisfiredTriggersInState", "(Ljava/sql/Connection;Ljava/lang/String;J)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;J)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasMisfiredTriggersInState", "(Ljava/sql/Connection;Ljava/lang/String;JILjava/util/List;)Z", "(Ljava/sql/Connection;Ljava/lang/String;JILjava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "countMisfiredTriggersInState", "(Ljava/sql/Connection;Ljava/lang/String;J)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectMisfiredTriggersInGroupInState", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;J)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;J)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggersForRecoveringJobs", "(Ljava/sql/Connection;)Ljava/util/List;", "(Ljava/sql/Connection;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "java/sql/SQLException", "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteFiredTriggers", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteFiredTriggers", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertJobDetail", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobDetail", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerKeysForJob", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteJobDetail", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isJobNonConcurrent", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "jobExists", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateJobData", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobDetail", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;Lorg/apache/openejb/quartz/spi/ClassLoadHelper;)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "java/lang/ClassNotFoundException", "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNumJobs", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobGroups", "(Ljava/sql/Connection;)Ljava/util/List;", "(Ljava/sql/Connection;)Ljava/util/List<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobsInGroup", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/JobKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "triggerExists", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerState", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerStateFromOtherState", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerStateFromOtherStates", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerGroupStateFromOtherStates", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerGroupStateFromOtherState", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;Ljava/lang/String;Ljava/lang/String;)I", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;Ljava/lang/String;Ljava/lang/String;)I", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerStatesForJob", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateTriggerStatesForJobFromOtherState", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNumTriggersForJob", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobForTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "java/lang/ClassNotFoundException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobForTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/TriggerKey;Z)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "java/lang/ClassNotFoundException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggersForJob", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "java/sql/SQLException", "java/lang/ClassNotFoundException", "java/io/IOException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggersForCalendar", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "java/sql/SQLException", "java/lang/ClassNotFoundException", "java/io/IOException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/spi/OperableTrigger;", null, new String[] { "java/sql/SQLException", "java/lang/ClassNotFoundException", "java/io/IOException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerJobDataMap", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/quartz/JobDataMap;", null, new String[] { "java/sql/SQLException", "java/lang/ClassNotFoundException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerState", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Ljava/lang/String;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerStatus", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/impl/jdbcjobstore/TriggerStatus;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNumTriggers", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerGroups", "(Ljava/sql/Connection;)Ljava/util/List;", "(Ljava/sql/Connection;)Ljava/util/List<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerGroups", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/List;", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/List<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggersInGroup", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggersInState", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertPausedTriggerGroup", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deletePausedTriggerGroup", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deletePausedTriggerGroup", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)I", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)I", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteAllPausedTriggerGroups", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isTriggerGroupPaused", "(Ljava/sql/Connection;Ljava/lang/String;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectPausedTriggerGroups", "(Ljava/sql/Connection;)Ljava/util/Set;", "(Ljava/sql/Connection;)Ljava/util/Set<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isExistingTriggerGroup", "(Ljava/sql/Connection;Ljava/lang/String;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertCalendar", "(Ljava/sql/Connection;Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;)I", null, new String[] { "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateCalendar", "(Ljava/sql/Connection;Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;)I", null, new String[] { "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calendarExists", "(Ljava/sql/Connection;Ljava/lang/String;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCalendar", "(Ljava/sql/Connection;Ljava/lang/String;)Lorg/apache/openejb/quartz/Calendar;", null, new String[] { "java/lang/ClassNotFoundException", "java/io/IOException", "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calendarIsReferenced", "(Ljava/sql/Connection;Ljava/lang/String;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteCalendar", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNumCalendars", "(Ljava/sql/Connection;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCalendars", "(Ljava/sql/Connection;)Ljava/util/List;", "(Ljava/sql/Connection;)Ljava/util/List<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "selectNextFireTime", "(Ljava/sql/Connection;)J", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerForFireTime", "(Ljava/sql/Connection;J)Lorg/apache/openejb/quartz/utils/Key;", "(Ljava/sql/Connection;J)Lorg/apache/openejb/quartz/utils/Key<*>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "selectTriggerToAcquire", "(Ljava/sql/Connection;JJ)Ljava/util/List;", "(Ljava/sql/Connection;JJ)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectTriggerToAcquire", "(Ljava/sql/Connection;JJI)Ljava/util/List;", "(Ljava/sql/Connection;JJI)Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertFiredTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateFiredTrigger", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/spi/OperableTrigger;Ljava/lang/String;Lorg/apache/openejb/quartz/JobDetail;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectFiredTriggerRecords", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/impl/jdbcjobstore/FiredTriggerRecord;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectFiredTriggerRecordsByJob", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/impl/jdbcjobstore/FiredTriggerRecord;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectInstancesFiredTriggerRecords", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/impl/jdbcjobstore/FiredTriggerRecord;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectFiredTriggerInstanceNames", "(Ljava/sql/Connection;)Ljava/util/Set;", "(Ljava/sql/Connection;)Ljava/util/Set<Ljava/lang/String;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteFiredTrigger", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectJobExecutionCount", "(Ljava/sql/Connection;Lorg/apache/openejb/quartz/JobKey;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertSchedulerState", "(Ljava/sql/Connection;Ljava/lang/String;JJ)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteSchedulerState", "(Ljava/sql/Connection;Ljava/lang/String;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateSchedulerState", "(Ljava/sql/Connection;Ljava/lang/String;J)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectSchedulerStateRecords", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List;", "(Ljava/sql/Connection;Ljava/lang/String;)Ljava/util/List<Lorg/apache/openejb/quartz/impl/jdbcjobstore/SchedulerStateRecord;>;", new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearData", "(Ljava/sql/Connection;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
