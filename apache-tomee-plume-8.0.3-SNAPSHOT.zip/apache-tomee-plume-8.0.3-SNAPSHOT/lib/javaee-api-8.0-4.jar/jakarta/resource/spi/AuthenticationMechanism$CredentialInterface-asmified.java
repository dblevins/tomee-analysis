package asm.jakarta.resource.spi;
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
public class AuthenticationMechanism$CredentialInterfaceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "Ljava/lang/Enum<Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "jakarta/resource/spi/AuthenticationMechanism", "CredentialInterface", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GenericCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GSSCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PasswordCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "$VALUES", "[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GenericCredential");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "GenericCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GSSCredential");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "GSSCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PasswordCredential");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "PasswordCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "GenericCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "GSSCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "PasswordCredential", "Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/AuthenticationMechanism$CredentialInterface", "$VALUES", "[Ljakarta/resource/spi/AuthenticationMechanism$CredentialInterface;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
