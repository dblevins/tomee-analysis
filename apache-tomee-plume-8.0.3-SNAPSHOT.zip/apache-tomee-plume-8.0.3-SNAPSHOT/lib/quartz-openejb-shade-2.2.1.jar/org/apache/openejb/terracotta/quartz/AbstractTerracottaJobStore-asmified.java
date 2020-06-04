package asm.org.apache.openejb.terracotta.quartz;
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
public class AbstractTerracottaJobStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/spi/JobStore" });

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$TriggerState", "org/apache/openejb/quartz/Trigger", "TriggerState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/Trigger$CompletedExecutionInstruction", "org/apache/openejb/quartz/Trigger", "CompletedExecutionInstruction", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TC_CONFIG_PROP", "Ljava/lang/String;", null, "org.apache.openejb.quartz.jobStore.tcConfig");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TC_CONFIGURL_PROP", "Ljava/lang/String;", null, "org.apache.openejb.quartz.jobStore.tcConfigUrl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TC_REJOIN_PROP", "Ljava/lang/String;", null, "org.apache.openejb.quartz.jobStore.rejoin");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "toolkit", "Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcConfig", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcConfigUrl", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "schedInstId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "schedName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "misFireThreshold", "Ljava/lang/Long;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "synchWrite", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rejoin", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "estimatedTimeToReleaseAndAcquireTrigger", "Ljava/lang/Long;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tcRetryInterval", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedInstId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "misFireThreshold", "Ljava/lang/Long;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "synchWrite", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "rejoin", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "estimatedTimeToReleaseAndAcquireTrigger", "Ljava/lang/Long;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitLdcInsn(new Long(15L));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/TimeUnit", "toMillis", "(J)J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcRetryInterval", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerConfigException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerConfigException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Both org.quartz.jobStore.tcConfig and org.quartz.jobStore.tcConfigUrl are set in your properties. Please define only one of them");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerConfigException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerConfigException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Neither org.quartz.jobStore.tcConfig or org.quartz.jobStore.tcConfigUrl are set in your properties. Please define one of them");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerConfigException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "setTCConfigUrl", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder;", false);
methodVisitor.visitInsn(POP);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "setTCConfigSnippet", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "rejoin", "Ljava/lang/String;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "rejoin", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "setRejoin", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("quartz");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "addTunnelledMBeanDomain", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TerracottaToolkitBuilder", "buildToolkit", "()Lorg/apache/openejb/terracotta/toolkit/Toolkit;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/internal/ToolkitInternal");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "getRealStore", "(Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;)Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitLabel(label1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/SchedulerConfigException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to create Terracotta client");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/SchedulerConfigException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getRealStore", "(Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;)Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUUID", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "init", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getUUID", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMisfireThreshold", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "misFireThreshold", "Ljava/lang/Long;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTcRetryInterval", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcRetryInterval", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acquireNextTriggers", "(JIJ)Ljava/util/List;", "(JIJ)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "acquireNextTriggers", "(JIJ)Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger acquisition failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCalendarNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getCalendarNames", "()Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Calendar name retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getJobGroupNames", "()Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Job name retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/JobKey;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getJobKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Job key retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumberOfCalendars", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getNumberOfCalendars", "()I", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Calendar count retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumberOfJobs", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getNumberOfJobs", "()I", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Job count retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNumberOfTriggers", "()I", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getNumberOfTriggers", "()I", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger count retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPausedTriggerGroups", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getPausedTriggerGroups", "()Ljava/util/Set;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Paused trigger group retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTriggerGroupNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getTriggerGroupNames", "()Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger group retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTriggerKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Set<Lorg/apache/openejb/quartz/TriggerKey;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getTriggerKeys", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Set;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger key retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTriggersForJob", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getTriggersForJob", "(Lorg/apache/openejb/quartz/JobKey;)Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTriggerState", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/Trigger$TriggerState;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getTriggerState", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/Trigger$TriggerState;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger state retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/spi/SchedulerSignaler;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerConfigException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "init", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedInstId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setInstanceId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setInstanceName", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcRetryInterval", "J");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setTcRetryInterval", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "misFireThreshold", "Ljava/lang/Long;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "misFireThreshold", "Ljava/lang/Long;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setMisfireThreshold", "(J)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "synchWrite", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "synchWrite", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setSynchronousWrite", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "estimatedTimeToReleaseAndAcquireTrigger", "Ljava/lang/Long;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "estimatedTimeToReleaseAndAcquireTrigger", "Ljava/lang/Long;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setEstimatedTimeToReleaseAndAcquireTrigger", "(J)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "initialize", "(Lorg/apache/openejb/quartz/spi/ClassLoadHelper;Lorg/apache/openejb/quartz/spi/SchedulerSignaler;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pauseAll", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "pauseAll", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pausing failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pauseJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "pauseJob", "(Lorg/apache/openejb/quartz/JobKey;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pausing job failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pauseJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "pauseJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pausing jobs failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pauseTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "pauseTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pausing trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pauseTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "pauseTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Pausing triggers failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "releaseAcquiredTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "releaseAcquiredTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeCalendar", "(Ljava/lang/String;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "removeCalendar", "(Ljava/lang/String;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Removing calendar failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeJob", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "removeJob", "(Lorg/apache/openejb/quartz/JobKey;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Removing job failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "removeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Removing trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replaceTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/quartz/spi/OperableTrigger;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "replaceTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;Lorg/apache/openejb/quartz/spi/OperableTrigger;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Replacing trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeAll", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "resumeAll", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Resuming failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeJob", "(Lorg/apache/openejb/quartz/JobKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "resumeJob", "(Lorg/apache/openejb/quartz/JobKey;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Reusming job failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "resumeJobs", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Resuming jobs failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "resumeTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Resuming trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resumeTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;)Ljava/util/Collection<Ljava/lang/String;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "resumeTriggers", "(Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;)Ljava/util/Collection;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Resuming triggers failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retrieveCalendar", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Calendar;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "retrieveCalendar", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/Calendar;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Calendar retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retrieveJob", "(Lorg/apache/openejb/quartz/JobKey;)Lorg/apache/openejb/quartz/JobDetail;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "retrieveJob", "(Lorg/apache/openejb/quartz/JobKey;)Lorg/apache/openejb/quartz/JobDetail;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Job retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retrieveTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/spi/OperableTrigger;", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "retrieveTrigger", "(Lorg/apache/openejb/quartz/TriggerKey;)Lorg/apache/openejb/quartz/spi/OperableTrigger;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger retrieval failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schedulerStarted", "()V", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "schedulerStarted", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Scheduler start failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schedulerPaused", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "schedulerPaused", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schedulerResumed", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "schedulerResumed", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstanceId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedInstId", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstanceName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "schedName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setThreadPoolSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "setThreadPoolSize", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shutdown", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "shutdown", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "toolkit", "Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/internal/ToolkitInternal", "shutdown", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeCalendar", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;ZZ)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "storeCalendar", "(Ljava/lang/String;Lorg/apache/openejb/quartz/Calendar;ZZ)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Storing calendar failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeJob", "(Lorg/apache/openejb/quartz/JobDetail;Z)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "storeJob", "(Lorg/apache/openejb/quartz/JobDetail;Z)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Storing job failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeJobAndTrigger", "(Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "storeJobAndTrigger", "(Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/spi/OperableTrigger;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Storing job and trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Z)V", null, new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "storeTrigger", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Z)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Storing trigger failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsPersistence", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "triggeredJobComplete", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "triggeredJobComplete", "(Lorg/apache/openejb/quartz/spi/OperableTrigger;Lorg/apache/openejb/quartz/JobDetail;Lorg/apache/openejb/quartz/Trigger$CompletedExecutionInstruction;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "triggersFired", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List<Lorg/apache/openejb/quartz/spi/OperableTrigger;>;)Ljava/util/List<Lorg/apache/openejb/quartz/spi/TriggerFiredResult;>;", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "triggersFired", "(Ljava/util/List;)Ljava/util/List;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger fire marking failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTcConfig", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfig", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTcConfigUrl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "tcConfigUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSynchronousWrite", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "synchWrite", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRejoin", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "rejoin", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "setSynchronousWrite", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEstimatedTimeToReleaseAndAcquireTrigger", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "getEstimatedTimeToReleaseAndAcquireTrigger", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEstimatedTimeToReleaseAndAcquireTrigger", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "estimatedTimeToReleaseAndAcquireTrigger", "Ljava/lang/Long;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isClustered", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkExists", "(Lorg/apache/openejb/quartz/JobKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "checkExists", "(Lorg/apache/openejb/quartz/JobKey;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Job existence check failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkExists", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "checkExists", "(Lorg/apache/openejb/quartz/TriggerKey;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Trigger existence check failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearAllSchedulingData", "()V", null, new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "clearAllSchedulingData", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Scheduler data clear failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeTriggers", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/TriggerKey;>;)Z", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "removeTriggers", "(Ljava/util/List;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Remvoing triggers failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeJobs", "(Ljava/util/List;)Z", "(Ljava/util/List<Lorg/apache/openejb/quartz/JobKey;>;)Z", new String[] { "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "removeJobs", "(Ljava/util/List;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Removing jobs failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeJobsAndTriggers", "(Ljava/util/Map;Z)V", "(Ljava/util/Map<Lorg/apache/openejb/quartz/JobDetail;Ljava/util/Set<+Lorg/apache/openejb/quartz/Trigger;>;>;Z)V", new String[] { "org/apache/openejb/quartz/ObjectAlreadyExistsException", "org/apache/openejb/quartz/JobPersistenceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions", "storeJobsAndTriggers", "(Ljava/util/Map;Z)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/JobPersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Store jobs and triggers failed due to client rejoin");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/JobPersistenceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRealJobStore", "()Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/AbstractTerracottaJobStore", "realJobStore", "Lorg/apache/openejb/terracotta/quartz/TerracottaJobStoreExtensions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
