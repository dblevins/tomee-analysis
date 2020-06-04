package asm.jakarta.security.auth.message;
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
public class AuthStatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/security/auth/message/AuthStatus", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUCCESS", "Ljakarta/security/auth/message/AuthStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FAILURE", "Ljakarta/security/auth/message/AuthStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEND_SUCCESS", "Ljakarta/security/auth/message/AuthStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEND_FAILURE", "Ljakarta/security/auth/message/AuthStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEND_CONTINUE", "Ljakarta/security/auth/message/AuthStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/auth/message/AuthStatus", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/auth/message/AuthStatus", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/security/auth/message/AuthStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUCCESS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/auth/message/AuthStatus", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/auth/message/AuthStatus", "SUCCESS", "Ljakarta/security/auth/message/AuthStatus;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/auth/message/AuthStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILURE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/auth/message/AuthStatus", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/auth/message/AuthStatus", "FAILURE", "Ljakarta/security/auth/message/AuthStatus;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/auth/message/AuthStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEND_SUCCESS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/auth/message/AuthStatus", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/auth/message/AuthStatus", "SEND_SUCCESS", "Ljakarta/security/auth/message/AuthStatus;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/auth/message/AuthStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEND_FAILURE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/auth/message/AuthStatus", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/auth/message/AuthStatus", "SEND_FAILURE", "Ljakarta/security/auth/message/AuthStatus;");
methodVisitor.visitTypeInsn(NEW, "jakarta/security/auth/message/AuthStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEND_CONTINUE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/security/auth/message/AuthStatus", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/security/auth/message/AuthStatus", "SEND_CONTINUE", "Ljakarta/security/auth/message/AuthStatus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
