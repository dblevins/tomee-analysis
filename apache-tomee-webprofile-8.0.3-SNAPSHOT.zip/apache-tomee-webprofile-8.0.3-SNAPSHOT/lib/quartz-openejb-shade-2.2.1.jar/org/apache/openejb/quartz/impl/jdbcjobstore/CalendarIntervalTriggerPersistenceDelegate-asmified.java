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
public class CalendarIntervalTriggerPersistenceDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/jdbcjobstore/CalendarIntervalTriggerPersistenceDelegate", null, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerPersistenceDelegateSupport", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate", "TriggerPropertyBundle", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/quartz/DateBuilder$IntervalUnit", "org/apache/openejb/quartz/DateBuilder", "IntervalUnit", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerPersistenceDelegateSupport", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canHandleTriggerType", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "hasAdditionalProperties", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHandledTriggerTypeDiscriminator", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("CAL_INT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getTriggerProperties", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)Lorg/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "getRepeatInterval", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setInt1", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "getRepeatIntervalUnit", "()Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setString1", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "getTimesTriggered", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setInt2", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "getTimeZone", "()Ljava/util/TimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimeZone", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setString2", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "isPreserveHourOfDayAcrossDaylightSavings", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setBoolean1", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/triggers/CalendarIntervalTriggerImpl", "isSkipDayIfHourDoesNotExist", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "setBoolean2", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getTriggerPropertyBundle", "(Lorg/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties;)Lorg/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "getString2", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/TimeZone", "getTimeZone", "(Ljava/lang/String;)Ljava/util/TimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/TimeZone", "java/lang/String"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/CalendarIntervalScheduleBuilder", "calendarIntervalSchedule", "()Lorg/apache/openejb/quartz/CalendarIntervalScheduleBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "getInt1", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "getString1", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/CalendarIntervalScheduleBuilder", "withInterval", "(ILorg/apache/openejb/quartz/DateBuilder$IntervalUnit;)Lorg/apache/openejb/quartz/CalendarIntervalScheduleBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/CalendarIntervalScheduleBuilder", "inTimeZone", "(Ljava/util/TimeZone;)Lorg/apache/openejb/quartz/CalendarIntervalScheduleBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "isBoolean1", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/CalendarIntervalScheduleBuilder", "preserveHourOfDayAcrossDaylightSavings", "(Z)Lorg/apache/openejb/quartz/CalendarIntervalScheduleBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "isBoolean2", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/CalendarIntervalScheduleBuilder", "skipDayIfHourDoesNotExist", "(Z)Lorg/apache/openejb/quartz/CalendarIntervalScheduleBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/impl/jdbcjobstore/SimplePropertiesTriggerProperties", "getInt2", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("timesTriggered");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/jdbcjobstore/TriggerPersistenceDelegate$TriggerPropertyBundle", "<init>", "(Lorg/apache/openejb/quartz/ScheduleBuilder;[Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
