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
public class ConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/quartz/impl/jdbcjobstore/Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_JOB_DETAILS", "Ljava/lang/String;", null, "JOB_DETAILS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_TRIGGERS", "Ljava/lang/String;", null, "TRIGGERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_SIMPLE_TRIGGERS", "Ljava/lang/String;", null, "SIMPLE_TRIGGERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_CRON_TRIGGERS", "Ljava/lang/String;", null, "CRON_TRIGGERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_BLOB_TRIGGERS", "Ljava/lang/String;", null, "BLOB_TRIGGERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_FIRED_TRIGGERS", "Ljava/lang/String;", null, "FIRED_TRIGGERS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_CALENDARS", "Ljava/lang/String;", null, "CALENDARS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_PAUSED_TRIGGERS", "Ljava/lang/String;", null, "PAUSED_TRIGGER_GRPS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_LOCKS", "Ljava/lang/String;", null, "LOCKS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_SCHEDULER_STATE", "Ljava/lang/String;", null, "SCHEDULER_STATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_SCHEDULER_NAME", "Ljava/lang/String;", null, "SCHED_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_JOB_NAME", "Ljava/lang/String;", null, "JOB_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_JOB_GROUP", "Ljava/lang/String;", null, "JOB_GROUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_IS_DURABLE", "Ljava/lang/String;", null, "IS_DURABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_IS_VOLATILE", "Ljava/lang/String;", null, "IS_VOLATILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_IS_NONCONCURRENT", "Ljava/lang/String;", null, "IS_NONCONCURRENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_IS_UPDATE_DATA", "Ljava/lang/String;", null, "IS_UPDATE_DATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_REQUESTS_RECOVERY", "Ljava/lang/String;", null, "REQUESTS_RECOVERY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_JOB_DATAMAP", "Ljava/lang/String;", null, "JOB_DATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_JOB_CLASS", "Ljava/lang/String;", null, "JOB_CLASS_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_DESCRIPTION", "Ljava/lang/String;", null, "DESCRIPTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TRIGGER_NAME", "Ljava/lang/String;", null, "TRIGGER_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TRIGGER_GROUP", "Ljava/lang/String;", null, "TRIGGER_GROUP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_NEXT_FIRE_TIME", "Ljava/lang/String;", null, "NEXT_FIRE_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_PREV_FIRE_TIME", "Ljava/lang/String;", null, "PREV_FIRE_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TRIGGER_STATE", "Ljava/lang/String;", null, "TRIGGER_STATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TRIGGER_TYPE", "Ljava/lang/String;", null, "TRIGGER_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_START_TIME", "Ljava/lang/String;", null, "START_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_END_TIME", "Ljava/lang/String;", null, "END_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_PRIORITY", "Ljava/lang/String;", null, "PRIORITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_MISFIRE_INSTRUCTION", "Ljava/lang/String;", null, "MISFIRE_INSTR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALIAS_COL_NEXT_FIRE_TIME", "Ljava/lang/String;", null, "ALIAS_NXT_FR_TM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_REPEAT_COUNT", "Ljava/lang/String;", null, "REPEAT_COUNT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_REPEAT_INTERVAL", "Ljava/lang/String;", null, "REPEAT_INTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TIMES_TRIGGERED", "Ljava/lang/String;", null, "TIMES_TRIGGERED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_CRON_EXPRESSION", "Ljava/lang/String;", null, "CRON_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_BLOB", "Ljava/lang/String;", null, "BLOB_DATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_TIME_ZONE_ID", "Ljava/lang/String;", null, "TIME_ZONE_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_INSTANCE_NAME", "Ljava/lang/String;", null, "INSTANCE_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_FIRED_TIME", "Ljava/lang/String;", null, "FIRED_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_SCHED_TIME", "Ljava/lang/String;", null, "SCHED_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_ENTRY_ID", "Ljava/lang/String;", null, "ENTRY_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_ENTRY_STATE", "Ljava/lang/String;", null, "STATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_CALENDAR_NAME", "Ljava/lang/String;", null, "CALENDAR_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_CALENDAR", "Ljava/lang/String;", null, "CALENDAR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_LOCK_NAME", "Ljava/lang/String;", null, "LOCK_NAME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_LAST_CHECKIN_TIME", "Ljava/lang/String;", null, "LAST_CHECKIN_TIME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COL_CHECKIN_INTERVAL", "Ljava/lang/String;", null, "CHECKIN_INTERVAL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_TABLE_PREFIX", "Ljava/lang/String;", null, "QRTZ_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_WAITING", "Ljava/lang/String;", null, "WAITING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_ACQUIRED", "Ljava/lang/String;", null, "ACQUIRED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_EXECUTING", "Ljava/lang/String;", null, "EXECUTING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_COMPLETE", "Ljava/lang/String;", null, "COMPLETE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_BLOCKED", "Ljava/lang/String;", null, "BLOCKED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_ERROR", "Ljava/lang/String;", null, "ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_PAUSED", "Ljava/lang/String;", null, "PAUSED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_PAUSED_BLOCKED", "Ljava/lang/String;", null, "PAUSED_BLOCKED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATE_DELETED", "Ljava/lang/String;", null, "DELETED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "STATE_MISFIRED", "Ljava/lang/String;", null, "MISFIRED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALL_GROUPS_PAUSED", "Ljava/lang/String;", null, "_$_ALL_GROUPS_PAUSED_$_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTYPE_SIMPLE", "Ljava/lang/String;", null, "SIMPLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTYPE_CRON", "Ljava/lang/String;", null, "CRON");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTYPE_CAL_INT", "Ljava/lang/String;", null, "CAL_INT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTYPE_DAILY_TIME_INT", "Ljava/lang/String;", null, "DAILY_I");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTYPE_BLOB", "Ljava/lang/String;", null, "BLOB");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
