package asm.org.apache.wss4j.common.ext;
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
public class WSSecurityException$ErrorCodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "Ljava/lang/Enum<Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_ALGORITHM", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_SECURITY", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED_AUTHENTICATION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED_CHECK", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECURITY_TOKEN_UNAVAILABLE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MESSAGE_EXPIRED", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED_ENCRYPTION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED_SIGNATURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECURITY_ERROR", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "qName", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "$VALUES", "[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", "(Ljavax/xml/namespace/QName;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "qName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "qName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILURE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_SECURITY_TOKEN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "UNSUPPORTED_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "UNSUPPORTED_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_ALGORITHM");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "UNSUPPORTED_ALGORITHM", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "UNSUPPORTED_ALGORITHM", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_SECURITY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "INVALID_SECURITY", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_SECURITY_TOKEN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "INVALID_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED_AUTHENTICATION");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "FAILED_AUTHENTICATION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_AUTHENTICATION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED_CHECK");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "FAILED_CHECK", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_CHECK", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECURITY_TOKEN_UNAVAILABLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "SECURITY_TOKEN_UNAVAILABLE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "SECURITY_TOKEN_UNAVAILABLE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MESSAGE_EXPIRED");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "MESSAGE_EXPIRED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "MESSAGE_EXPIRED", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED_ENCRYPTION");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_ENCRYPTION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED_SIGNATURE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_SIGNATURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECURITY_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException", "SECURITY_ERROR", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "<init>", "(Ljava/lang/String;ILjavax/xml/namespace/QName;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "SECURITY_ERROR", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "UNSUPPORTED_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "UNSUPPORTED_ALGORITHM", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY_TOKEN", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_AUTHENTICATION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_CHECK", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "SECURITY_TOKEN_UNAVAILABLE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "MESSAGE_EXPIRED", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_ENCRYPTION", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "FAILED_SIGNATURE", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "SECURITY_ERROR", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "$VALUES", "[Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
