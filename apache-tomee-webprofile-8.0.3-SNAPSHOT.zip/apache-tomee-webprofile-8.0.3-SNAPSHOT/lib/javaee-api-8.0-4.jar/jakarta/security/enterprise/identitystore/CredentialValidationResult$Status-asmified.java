package asm.jakarta.security.enterprise.identitystore;
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
public class CredentialValidationResult$StatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "Ljava/lang/Enum<Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "jakarta/security/enterprise/identitystore/CredentialValidationResult", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_VALIDATED", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "$VALUES", "[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_VALIDATED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "NOT_VALIDATED", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "INVALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALID");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "VALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "NOT_VALIDATED", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "INVALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "VALID", "Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/enterprise/identitystore/CredentialValidationResult$Status", "$VALUES", "[Ljakarta/security/enterprise/identitystore/CredentialValidationResult$Status;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
