package asm.org.apache.openejb.terracotta.quartz.collections;
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
public class ToolkitDSHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/toolkit/store/ToolkitConfigFields$Consistency", "org/apache/openejb/terracotta/toolkit/store/ToolkitConfigFields", "Consistency", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JOBS_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_jobs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ALL_JOBS_GROUP_NAMES_SET_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_names");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PAUSED_GROUPS_SET_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_paused_names");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BLOCKED_JOBS_SET_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_blocked_jobs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JOBS_GROUP_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_jobs_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRIGGERS_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_triggers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRIGGERS_GROUP_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_triggers_");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ALL_TRIGGERS_GROUP_NAMES_SET_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_names_triggers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PAUSED_TRIGGER_GROUPS_SET_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_grp_paused_trogger_names");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TIME_TRIGGER_SORTED_SET_PREFIX", "Ljava/lang/String;", null, "_tc_time_trigger_sorted_set");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FIRED_TRIGGER_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_fired_trigger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CALENDAR_WRAPPER_MAP_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_calendar_wrapper");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SINGLE_LOCK_NAME_PREFIX", "Ljava/lang/String;", null, "_tc_quartz_single_lock");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DELIMETER", "Ljava/lang/String;", null, "|");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobStoreName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobsMapReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore<Lorg/apache/openejb/quartz/JobKey;Lorg/apache/openejb/terracotta/quartz/wrappers/JobWrapper;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "triggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore<Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allTriggersGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pausedGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "blockedJobsReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Lorg/apache/openejb/quartz/JobKey;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobsGroupSet", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "triggersGroupSet", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pausedTriggerGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "firedTriggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<Ljava/lang/String;Lorg/apache/openejb/terracotta/quartz/wrappers/FiredTrigger;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "calendarWrapperMapReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "timeTriggerSetReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference<Lorg/apache/openejb/terracotta/quartz/collections/TimeTriggerSet;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "toolkitMaps", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<**>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/Toolkit;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allTriggersGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "blockedJobsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedTriggerGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "firedTriggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "calendarWrapperMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicReference", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "timeTriggerSetReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkitMaps", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobStoreName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "generateName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("|");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobStoreName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateJobsMap", "()Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore;", "()Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore<Lorg/apache/openejb/quartz/JobKey;Lorg/apache/openejb/terracotta/quartz/wrappers/JobWrapper;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_jobs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore", "<init>", "(Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "toolkitMap", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<**>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkitMaps", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/store/ToolkitStore");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/store/ToolkitStore", "isDestroyed", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/terracotta/toolkit/store/ToolkitStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkitMaps", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/toolkit/store/ToolkitConfigFields$Consistency", "STRONG", "Lorg/apache/openejb/terracotta/toolkit/store/ToolkitConfigFields$Consistency;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder", "consistency", "(Lorg/apache/openejb/terracotta/toolkit/store/ToolkitConfigFields$Consistency;)Lorg/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder", "concurrency", "(I)Lorg/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/toolkit/builder/ToolkitStoreConfigBuilder", "build", "()Lorg/apache/openejb/terracotta/toolkit/config/Configuration;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getStore", "(Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/config/Configuration;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateTriggersMap", "()Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore;", "()Lorg/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore<Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_triggers");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore", "<init>", "(Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/collections/SerializedToolkitStore");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateFiredTriggersMap", "()Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", "()Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<Ljava/lang/String;Lorg/apache/openejb/terracotta/quartz/wrappers/FiredTrigger;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_fired_trigger");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "firedTriggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "firedTriggersMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/store/ToolkitStore");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateCalendarWrapperMap", "()Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", "()Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore<Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_calendar_wrapper");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "createStore", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/toolkit/store/ToolkitStore;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "calendarWrapperMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "calendarWrapperMapReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/store/ToolkitStore");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateAllGroupsSet", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_grp_names");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateBlockedJobsSet", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_blocked_jobs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/quartz/JobKey;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "blockedJobsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "blockedJobsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreatePausedGroupsSet", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_grp_paused_names");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreatePausedTriggerGroupsSet", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_grp_paused_trogger_names");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedTriggerGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "pausedTriggerGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateJobsGroupMap", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet", "isDestroyed", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/terracotta/toolkit/collections/ToolkitSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("_tc_quartz_grp_jobs_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeJobsGroupMap", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "jobsGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet", "destroy", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/terracotta/toolkit/collections/ToolkitSet"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateTriggersGroupMap", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet", "isDestroyed", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/terracotta/toolkit/collections/ToolkitSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("_tc_quartz_grp_triggers_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeTriggersGroupMap", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "triggersGroupSet", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/collections/ToolkitSet", "destroy", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/terracotta/toolkit/collections/ToolkitSet"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateAllTriggersGroupsSet", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_grp_names_triggers");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSet;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allTriggersGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "allTriggersGroupsReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrCreateTimeTriggerSet", "()Lorg/apache/openejb/terracotta/quartz/collections/TimeTriggerSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_time_trigger_sorted_set");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/collections/TimeTriggerSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/terracotta/quartz/collections/TimeTrigger;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/Toolkit", "getSortedSet", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSortedSet;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/collections/TimeTriggerSet", "<init>", "(Lorg/apache/openejb/terracotta/toolkit/collections/ToolkitSortedSet;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "timeTriggerSetReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "timeTriggerSetReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/collections/TimeTriggerSet");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLock", "(Lorg/apache/openejb/terracotta/toolkit/internal/concurrent/locks/ToolkitLockTypeInternal;)Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("_tc_quartz_single_lock");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "generateName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/collections/ToolkitDSHolder", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/Toolkit;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/internal/ToolkitInternal");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/internal/ToolkitInternal", "getLock", "(Ljava/lang/String;Lorg/apache/openejb/terracotta/toolkit/internal/concurrent/locks/ToolkitLockTypeInternal;)Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
