package asm.jakarta.persistence;
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
public class LockModeTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/persistence/LockModeType", "Ljava/lang/Enum<Ljakarta/persistence/LockModeType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIMISTIC", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPTIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PESSIMISTIC_READ", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PESSIMISTIC_WRITE", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PESSIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/persistence/LockModeType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/persistence/LockModeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "$VALUES", "[Ljakarta/persistence/LockModeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/persistence/LockModeType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/persistence/LockModeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/LockModeType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/LockModeType");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "READ", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "WRITE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIMISTIC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "OPTIMISTIC", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPTIMISTIC_FORCE_INCREMENT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "OPTIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PESSIMISTIC_READ");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_READ", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PESSIMISTIC_WRITE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_WRITE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PESSIMISTIC_FORCE_INCREMENT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/persistence/LockModeType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "NONE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/LockModeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "READ", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "WRITE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "OPTIMISTIC", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "OPTIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_READ", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_WRITE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "PESSIMISTIC_FORCE_INCREMENT", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/LockModeType", "NONE", "Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/persistence/LockModeType", "$VALUES", "[Ljakarta/persistence/LockModeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
