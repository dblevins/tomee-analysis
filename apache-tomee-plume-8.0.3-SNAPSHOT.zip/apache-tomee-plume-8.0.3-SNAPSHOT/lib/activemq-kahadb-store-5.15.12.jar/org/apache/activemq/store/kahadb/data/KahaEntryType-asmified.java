package asm.org.apache.activemq.store.kahadb.data;
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
public class KahaEntryTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/activemq/store/kahadb/data/KahaEntryType", "Ljava/lang/Enum<Lorg/apache/activemq/store/kahadb/data/KahaEntryType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/data/KahaEntryType$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_TRACE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_ADD_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_REMOVE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_PREPARE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_COMMIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_ROLLBACK_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_REMOVE_DESTINATION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_SUBSCRIPTION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_PRODUCER_AUDIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_ACK_MESSAGE_FILE_MAP_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_UPDATE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_ADD_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_RESCHEDULE_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_REMOVE_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_REMOVE_SCHEDULED_JOBS_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_DESTROY_SCHEDULER_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KAHA_REWRITTEN_DATA_FILE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/data/KahaEntryType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "(Ljava/lang/String;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/data/KahaEntryType", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/data/KahaEntryType", "value", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getNumber", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaEntryType", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaEntryType", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(I)Lorg/apache/activemq/store/kahadb/data/KahaEntryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTableSwitchInsn(0, 16, label17, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_TRACE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PREPARE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_COMMIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ROLLBACK_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_DESTINATION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_SUBSCRIPTION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PRODUCER_AUDIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ACK_MESSAGE_FILE_MAP_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_UPDATE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_RESCHEDULE_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOBS_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_DESTROY_SCHEDULER_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REWRITTEN_DATA_FILE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessage", "()Lorg/apache/activemq/protobuf/Message;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType$1", "$SwitchMap$org$apache$activemq$store$kahadb$data$KahaEntryType", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTableSwitchInsn(1, 17, label17, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaTraceCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaTraceCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaAddMessageCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveMessageCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaPrepareCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaPrepareCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaCommitCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaCommitCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRollbackCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRollbackCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveDestinationCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaSubscriptionCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaSubscriptionCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaProducerAuditCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaProducerAuditCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaAckMessageFileMapCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaAckMessageFileMapCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaUpdateMessageCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaUpdateMessageCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaAddScheduledJobCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaAddScheduledJobCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRescheduleJobCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRescheduleJobCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveScheduledJobCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveScheduledJobCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRemoveScheduledJobsCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRemoveScheduledJobsCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestroySchedulerCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestroySchedulerCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaRewrittenDataFileCommand");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaRewrittenDataFileCommand", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_TRACE_COMMAND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("KAHA_TRACE_COMMAND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_TRACE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_ADD_MESSAGE_COMMAND");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("KAHA_ADD_MESSAGE_COMMAND");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_REMOVE_MESSAGE_COMMAND");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("KAHA_REMOVE_MESSAGE_COMMAND");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_PREPARE_COMMAND");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("KAHA_PREPARE_COMMAND");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PREPARE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_COMMIT_COMMAND");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("KAHA_COMMIT_COMMAND");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_COMMIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_ROLLBACK_COMMAND");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("KAHA_ROLLBACK_COMMAND");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ROLLBACK_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_REMOVE_DESTINATION_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("KAHA_REMOVE_DESTINATION_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_DESTINATION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_SUBSCRIPTION_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("KAHA_SUBSCRIPTION_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_SUBSCRIPTION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_PRODUCER_AUDIT_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("KAHA_PRODUCER_AUDIT_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PRODUCER_AUDIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_ACK_MESSAGE_FILE_MAP_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("KAHA_ACK_MESSAGE_FILE_MAP_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ACK_MESSAGE_FILE_MAP_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_UPDATE_MESSAGE_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("KAHA_UPDATE_MESSAGE_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_UPDATE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_ADD_SCHEDULED_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("KAHA_ADD_SCHEDULED_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_RESCHEDULE_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("KAHA_RESCHEDULE_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_RESCHEDULE_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_REMOVE_SCHEDULED_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("KAHA_REMOVE_SCHEDULED_JOB_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_REMOVE_SCHEDULED_JOBS_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("KAHA_REMOVE_SCHEDULED_JOBS_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOBS_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_DESTROY_SCHEDULER_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("KAHA_DESTROY_SCHEDULER_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_DESTROY_SCHEDULER_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KAHA_REWRITTEN_DATA_FILE_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("KAHA_REWRITTEN_DATA_FILE_COMMAND");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaEntryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REWRITTEN_DATA_FILE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/store/kahadb/data/KahaEntryType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_TRACE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PREPARE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_COMMIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ROLLBACK_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_DESTINATION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_SUBSCRIPTION_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_PRODUCER_AUDIT_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ACK_MESSAGE_FILE_MAP_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_UPDATE_MESSAGE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_ADD_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_RESCHEDULE_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOB_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REMOVE_SCHEDULED_JOBS_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_DESTROY_SCHEDULER_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "KAHA_REWRITTEN_DATA_FILE_COMMAND", "Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaEntryType", "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaEntryType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
