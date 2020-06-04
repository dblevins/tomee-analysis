package asm.org.apache.cxf.rs.security.jose.jwa;
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
public class SignatureAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "Ljava/lang/Enum<Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ES256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ES384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ES512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jwaName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "javaName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keySizeBits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "jwaName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "javaName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "keySizeBits", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJwaName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "jwaName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "javaName", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "name", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "javaName", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaAlgoName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJavaName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/AlgorithmUtils", "stripAlgoProperties", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeySizeBits", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "keySizeBits", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAlgorithm", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "NONE", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitIntInsn(BIPUSH, 95);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isPublicKeyAlgorithm", "(Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("RS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("PS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "getJwaName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("ES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HS256");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("HS256");
methodVisitor.visitLdcInsn("HmacSHA256");
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HS384");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("HS384");
methodVisitor.visitLdcInsn("HmacSHA384");
methodVisitor.visitIntInsn(SIPUSH, 384);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HS512");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("HS512");
methodVisitor.visitLdcInsn("HmacSHA512");
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RS256");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("RS256");
methodVisitor.visitLdcInsn("SHA256withRSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RS384");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("RS384");
methodVisitor.visitLdcInsn("SHA384withRSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RS512");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("RS512");
methodVisitor.visitLdcInsn("SHA512withRSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PS256");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("PS256");
methodVisitor.visitLdcInsn("SHA256withRSAandMGF1");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PS384");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("PS384");
methodVisitor.visitLdcInsn("SHA384withRSAandMGF1");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PS512");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("PS512");
methodVisitor.visitLdcInsn("SHA512withRSAandMGF1");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ES256");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("ES256");
methodVisitor.visitLdcInsn("SHA256withECDSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ES384");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("ES384");
methodVisitor.visitLdcInsn("SHA384withECDSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ES512");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("ES512");
methodVisitor.visitLdcInsn("SHA512withECDSA");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "NONE", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "HS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "RS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "PS512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES256", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES384", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "ES512", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "NONE", "Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jwa/SignatureAlgorithm;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
