package asm.jakarta.batch.api.partition;
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
public class PartitionReducer$PartitionStatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "Ljava/lang/Enum<Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "jakarta/batch/api/partition/PartitionReducer", "PartitionStatus", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMIT", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ROLLBACK", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "$VALUES", "[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMIT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "COMMIT", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ROLLBACK");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "ROLLBACK", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "COMMIT", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "ROLLBACK", "Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/api/partition/PartitionReducer$PartitionStatus", "$VALUES", "[Ljakarta/batch/api/partition/PartitionReducer$PartitionStatus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
