package asm.jakarta.security.auth.message.callback;
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
public class PrivateKeyCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/security/auth/message/callback/PrivateKeyCallback", null, "java/lang/Object", new String[] { "javax/security/auth/callback/Callback" });

classWriter.visitInnerClass("jakarta/security/auth/message/callback/PrivateKeyCallback$IssuerSerialNumRequest", "jakarta/security/auth/message/callback/PrivateKeyCallback", "IssuerSerialNumRequest", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/security/auth/message/callback/PrivateKeyCallback$SubjectKeyIDRequest", "jakarta/security/auth/message/callback/PrivateKeyCallback", "SubjectKeyIDRequest", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/security/auth/message/callback/PrivateKeyCallback$DigestRequest", "jakarta/security/auth/message/callback/PrivateKeyCallback", "DigestRequest", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/security/auth/message/callback/PrivateKeyCallback$AliasRequest", "jakarta/security/auth/message/callback/PrivateKeyCallback", "AliasRequest", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/security/auth/message/callback/PrivateKeyCallback$Request", "jakarta/security/auth/message/callback/PrivateKeyCallback", "Request", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "request", "Ljakarta/security/auth/message/callback/PrivateKeyCallback$Request;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "chain", "[Ljava/security/cert/Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "key", "Ljava/security/PrivateKey;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/security/auth/message/callback/PrivateKeyCallback$Request;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "request", "Ljakarta/security/auth/message/callback/PrivateKeyCallback$Request;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequest", "()Ljakarta/security/auth/message/callback/PrivateKeyCallback$Request;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "request", "Ljakarta/security/auth/message/callback/PrivateKeyCallback$Request;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setKey", "(Ljava/security/PrivateKey;[Ljava/security/cert/Certificate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "key", "Ljava/security/PrivateKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "chain", "[Ljava/security/cert/Certificate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "()Ljava/security/PrivateKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "key", "Ljava/security/PrivateKey;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChain", "()[Ljava/security/cert/Certificate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/security/auth/message/callback/PrivateKeyCallback", "chain", "[Ljava/security/cert/Certificate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
