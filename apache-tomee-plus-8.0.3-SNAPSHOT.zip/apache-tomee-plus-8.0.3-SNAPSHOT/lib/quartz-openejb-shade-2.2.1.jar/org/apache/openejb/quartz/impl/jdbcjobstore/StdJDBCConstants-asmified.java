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
public class StdJDBCConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/impl/jdbcjobstore/StdJDBCConstants", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/impl/jdbcjobstore/Constants" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_PREFIX_SUBST", "Ljava/lang/String;", null, "{0}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHED_NAME_SUBST", "Ljava/lang/String;", null, "{1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_STATES_FROM_OTHER_STATES", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND (TRIGGER_STATE = ? OR TRIGGER_STATE = ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_MISFIRED_TRIGGERS", "Ljava/lang/String;", null, "SELECT * FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGERS_IN_STATE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_MISFIRED_TRIGGERS_IN_STATE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ? ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COUNT_MISFIRED_TRIGGERS_IN_STATE", "Ljava/lang/String;", null, "SELECT COUNT(TRIGGER_NAME) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_HAS_MISFIRED_TRIGGERS_IN_STATE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_STATE = ? ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_MISFIRED_TRIGGERS_IN_GROUP_IN_STATE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND NOT (MISFIRE_INSTR = -1) AND NEXT_FIRE_TIME < ? AND TRIGGER_GROUP = ? AND TRIGGER_STATE = ? ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_FIRED_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_JOB_DETAIL", "Ljava/lang/String;", null, "INSERT INTO {0}JOB_DETAILS (SCHED_NAME, JOB_NAME, JOB_GROUP, DESCRIPTION, JOB_CLASS_NAME, IS_DURABLE, IS_NONCONCURRENT, IS_UPDATE_DATA, REQUESTS_RECOVERY, JOB_DATA)  VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_JOB_DETAIL", "Ljava/lang/String;", null, "UPDATE {0}JOB_DETAILS SET DESCRIPTION = ?, JOB_CLASS_NAME = ?, IS_DURABLE = ?, IS_NONCONCURRENT = ?, IS_UPDATE_DATA = ?, REQUESTS_RECOVERY = ?, JOB_DATA = ?  WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGERS_FOR_JOB", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGERS_FOR_CALENDAR", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_JOB_DETAIL", "Ljava/lang/String;", null, "DELETE FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_NONCONCURRENT", "Ljava/lang/String;", null, "SELECT IS_NONCONCURRENT FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_EXISTENCE", "Ljava/lang/String;", null, "SELECT JOB_NAME FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_JOB_DATA", "Ljava/lang/String;", null, "UPDATE {0}JOB_DETAILS SET JOB_DATA = ?  WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_DETAIL", "Ljava/lang/String;", null, "SELECT * FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_JOBS", "Ljava/lang/String;", null, "SELECT COUNT(JOB_NAME)  FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_GROUPS", "Ljava/lang/String;", null, "SELECT DISTINCT(JOB_GROUP) FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOBS_IN_GROUP_LIKE", "Ljava/lang/String;", null, "SELECT JOB_NAME, JOB_GROUP FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_GROUP LIKE ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOBS_IN_GROUP", "Ljava/lang/String;", null, "SELECT JOB_NAME, JOB_GROUP FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1} AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_TRIGGER", "Ljava/lang/String;", null, "INSERT INTO {0}TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, JOB_NAME, JOB_GROUP, DESCRIPTION, NEXT_FIRE_TIME, PREV_FIRE_TIME, TRIGGER_STATE, TRIGGER_TYPE, START_TIME, END_TIME, CALENDAR_NAME, MISFIRE_INSTR, JOB_DATA, PRIORITY)  VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_SIMPLE_TRIGGER", "Ljava/lang/String;", null, "INSERT INTO {0}SIMPLE_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, REPEAT_COUNT, REPEAT_INTERVAL, TIMES_TRIGGERED)  VALUES({1}, ?, ?, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_CRON_TRIGGER", "Ljava/lang/String;", null, "INSERT INTO {0}CRON_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, CRON_EXPRESSION, TIME_ZONE_ID)  VALUES({1}, ?, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_BLOB_TRIGGER", "Ljava/lang/String;", null, "INSERT INTO {0}BLOB_TRIGGERS (SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP, BLOB_DATA)  VALUES({1}, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_SKIP_DATA", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET JOB_NAME = ?, JOB_GROUP = ?, DESCRIPTION = ?, NEXT_FIRE_TIME = ?, PREV_FIRE_TIME = ?, TRIGGER_STATE = ?, TRIGGER_TYPE = ?, START_TIME = ?, END_TIME = ?, CALENDAR_NAME = ?, MISFIRE_INSTR = ?, PRIORITY = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET JOB_NAME = ?, JOB_GROUP = ?, DESCRIPTION = ?, NEXT_FIRE_TIME = ?, PREV_FIRE_TIME = ?, TRIGGER_STATE = ?, TRIGGER_TYPE = ?, START_TIME = ?, END_TIME = ?, CALENDAR_NAME = ?, MISFIRE_INSTR = ?, PRIORITY = ?, JOB_DATA = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_SIMPLE_TRIGGER", "Ljava/lang/String;", null, "UPDATE {0}SIMPLE_TRIGGERS SET REPEAT_COUNT = ?, REPEAT_INTERVAL = ?, TIMES_TRIGGERED = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_CRON_TRIGGER", "Ljava/lang/String;", null, "UPDATE {0}CRON_TRIGGERS SET CRON_EXPRESSION = ?, TIME_ZONE_ID = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_BLOB_TRIGGER", "Ljava/lang/String;", null, "UPDATE {0}BLOB_TRIGGERS SET BLOB_DATA = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_EXISTENCE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_STATE", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_STATE_FROM_STATE", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ? AND TRIGGER_STATE = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_GROUP_STATE_FROM_STATE", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ? AND TRIGGER_STATE = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_STATE_FROM_STATES", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ? AND (TRIGGER_STATE = ? OR TRIGGER_STATE = ? OR TRIGGER_STATE = ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_TRIGGER_GROUP_STATE_FROM_STATES", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ? AND (TRIGGER_STATE = ? OR TRIGGER_STATE = ? OR TRIGGER_STATE = ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_JOB_TRIGGER_STATES", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_JOB_TRIGGER_STATES_FROM_OTHER_STATE", "Ljava/lang/String;", null, "UPDATE {0}TRIGGERS SET TRIGGER_STATE = ? WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ? AND TRIGGER_STATE = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_SIMPLE_TRIGGER", "Ljava/lang/String;", null, "DELETE FROM {0}SIMPLE_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_CRON_TRIGGER", "Ljava/lang/String;", null, "DELETE FROM {0}CRON_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_BLOB_TRIGGER", "Ljava/lang/String;", null, "DELETE FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_TRIGGER", "Ljava/lang/String;", null, "DELETE FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_TRIGGERS_FOR_JOB", "Ljava/lang/String;", null, "SELECT COUNT(TRIGGER_NAME) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_FOR_TRIGGER", "Ljava/lang/String;", null, "SELECT J.JOB_NAME, J.JOB_GROUP, J.IS_DURABLE, J.JOB_CLASS_NAME, J.REQUESTS_RECOVERY FROM {0}TRIGGERS T, {0}JOB_DETAILS J WHERE T.SCHED_NAME = {1} AND J.SCHED_NAME = {1} AND T.TRIGGER_NAME = ? AND T.TRIGGER_GROUP = ? AND T.JOB_NAME = J.JOB_NAME AND T.JOB_GROUP = J.JOB_GROUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER", "Ljava/lang/String;", null, "SELECT * FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_DATA", "Ljava/lang/String;", null, "SELECT JOB_DATA FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_STATE", "Ljava/lang/String;", null, "SELECT TRIGGER_STATE FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_STATUS", "Ljava/lang/String;", null, "SELECT TRIGGER_STATE, NEXT_FIRE_TIME, JOB_NAME, JOB_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_SIMPLE_TRIGGER", "Ljava/lang/String;", null, "SELECT * FROM {0}SIMPLE_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_CRON_TRIGGER", "Ljava/lang/String;", null, "SELECT * FROM {0}CRON_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_BLOB_TRIGGER", "Ljava/lang/String;", null, "SELECT * FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_TRIGGERS", "Ljava/lang/String;", null, "SELECT COUNT(TRIGGER_NAME)  FROM {0}TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_TRIGGERS_IN_GROUP", "Ljava/lang/String;", null, "SELECT COUNT(TRIGGER_NAME)  FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_GROUPS", "Ljava/lang/String;", null, "SELECT DISTINCT(TRIGGER_GROUP) FROM {0}TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_GROUPS_FILTERED", "Ljava/lang/String;", null, "SELECT DISTINCT(TRIGGER_GROUP) FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGERS_IN_GROUP_LIKE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGERS_IN_GROUP", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_CALENDAR", "Ljava/lang/String;", null, "INSERT INTO {0}CALENDARS (SCHED_NAME, CALENDAR_NAME, CALENDAR)  VALUES({1}, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_CALENDAR", "Ljava/lang/String;", null, "UPDATE {0}CALENDARS SET CALENDAR = ?  WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_CALENDAR_EXISTENCE", "Ljava/lang/String;", null, "SELECT CALENDAR_NAME FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_CALENDAR", "Ljava/lang/String;", null, "SELECT * FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_REFERENCED_CALENDAR", "Ljava/lang/String;", null, "SELECT CALENDAR_NAME FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_CALENDAR", "Ljava/lang/String;", null, "DELETE FROM {0}CALENDARS WHERE SCHED_NAME = {1} AND CALENDAR_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NUM_CALENDARS", "Ljava/lang/String;", null, "SELECT COUNT(CALENDAR_NAME)  FROM {0}CALENDARS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_CALENDARS", "Ljava/lang/String;", null, "SELECT CALENDAR_NAME FROM {0}CALENDARS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NEXT_FIRE_TIME", "Ljava/lang/String;", null, "SELECT MIN(NEXT_FIRE_TIME) AS ALIAS_NXT_FR_TM FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ? AND NEXT_FIRE_TIME >= 0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TRIGGER_FOR_FIRE_TIME", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ? AND NEXT_FIRE_TIME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_NEXT_TRIGGER_TO_ACQUIRE", "Ljava/lang/String;", null, "SELECT TRIGGER_NAME, TRIGGER_GROUP, NEXT_FIRE_TIME, PRIORITY FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_STATE = ? AND NEXT_FIRE_TIME <= ? AND (MISFIRE_INSTR = -1 OR (MISFIRE_INSTR != -1 AND NEXT_FIRE_TIME >= ?)) ORDER BY NEXT_FIRE_TIME ASC, PRIORITY DESC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_FIRED_TRIGGER", "Ljava/lang/String;", null, "INSERT INTO {0}FIRED_TRIGGERS (SCHED_NAME, ENTRY_ID, TRIGGER_NAME, TRIGGER_GROUP, INSTANCE_NAME, FIRED_TIME, SCHED_TIME, STATE, JOB_NAME, JOB_GROUP, IS_NONCONCURRENT, REQUESTS_RECOVERY, PRIORITY) VALUES({1}, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_FIRED_TRIGGER", "Ljava/lang/String;", null, "UPDATE {0}FIRED_TRIGGERS SET INSTANCE_NAME = ?, FIRED_TIME = ?, SCHED_TIME = ?, STATE = ?, JOB_NAME = ?, JOB_GROUP = ?, IS_NONCONCURRENT = ?, REQUESTS_RECOVERY = ? WHERE SCHED_NAME = {1} AND ENTRY_ID = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_INSTANCES_FIRED_TRIGGERS", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_INSTANCES_RECOVERABLE_FIRED_TRIGGERS", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ? AND REQUESTS_RECOVERY = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_JOB_EXECUTION_COUNT", "Ljava/lang/String;", null, "SELECT COUNT(TRIGGER_NAME) FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGERS", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGER", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_NAME = ? AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGER_GROUP", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGERS_OF_JOB", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGERS_OF_JOB_GROUP", "Ljava/lang/String;", null, "SELECT * FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND JOB_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_FIRED_TRIGGER", "Ljava/lang/String;", null, "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND ENTRY_ID = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_INSTANCES_FIRED_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_NO_RECOVERY_FIRED_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?REQUESTS_RECOVERY = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_SIMPLE_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}SIMPLE_TRIGGERS  WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_SIMPROP_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}SIMPROP_TRIGGERS  WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_CRON_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}CRON_TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_BLOB_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}BLOB_TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_TRIGGERS", "Ljava/lang/String;", null, "DELETE FROM {0}TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_JOB_DETAILS", "Ljava/lang/String;", null, "DELETE FROM {0}JOB_DETAILS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_CALENDARS", "Ljava/lang/String;", null, "DELETE FROM {0}CALENDARS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_ALL_PAUSED_TRIGGER_GRPS", "Ljava/lang/String;", null, "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_FIRED_TRIGGER_INSTANCE_NAMES", "Ljava/lang/String;", null, "SELECT DISTINCT INSTANCE_NAME FROM {0}FIRED_TRIGGERS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_SCHEDULER_STATE", "Ljava/lang/String;", null, "INSERT INTO {0}SCHEDULER_STATE (SCHED_NAME, INSTANCE_NAME, LAST_CHECKIN_TIME, CHECKIN_INTERVAL) VALUES({1}, ?, ?, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_SCHEDULER_STATE", "Ljava/lang/String;", null, "SELECT * FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_SCHEDULER_STATES", "Ljava/lang/String;", null, "SELECT * FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_SCHEDULER_STATE", "Ljava/lang/String;", null, "DELETE FROM {0}SCHEDULER_STATE WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_SCHEDULER_STATE", "Ljava/lang/String;", null, "UPDATE {0}SCHEDULER_STATE SET LAST_CHECKIN_TIME = ? WHERE SCHED_NAME = {1} AND INSTANCE_NAME = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_PAUSED_TRIGGER_GROUP", "Ljava/lang/String;", null, "INSERT INTO {0}PAUSED_TRIGGER_GRPS (SCHED_NAME, TRIGGER_GROUP) VALUES({1}, ?)");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_PAUSED_TRIGGER_GROUP", "Ljava/lang/String;", null, "SELECT TRIGGER_GROUP FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP = ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_PAUSED_TRIGGER_GROUPS", "Ljava/lang/String;", null, "SELECT TRIGGER_GROUP FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_PAUSED_TRIGGER_GROUP", "Ljava/lang/String;", null, "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1} AND TRIGGER_GROUP LIKE ?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DELETE_PAUSED_TRIGGER_GROUPS", "Ljava/lang/String;", null, "DELETE FROM {0}PAUSED_TRIGGER_GRPS WHERE SCHED_NAME = {1}");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
