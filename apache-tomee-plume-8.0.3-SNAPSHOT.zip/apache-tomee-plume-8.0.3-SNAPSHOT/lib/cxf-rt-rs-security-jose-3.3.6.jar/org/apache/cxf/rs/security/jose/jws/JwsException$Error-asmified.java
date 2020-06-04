package asm.org.apache.cxf.rs.security.jose.jws;
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
public class JwsException$ErrorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "Ljava/lang/Enum<Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/JwsException$Error", "org/apache/cxf/rs/security/jose/jws/JwsException", "Error", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_PROVIDER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_VERIFIER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_INIT_PROPERTIES", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALGORITHM_NOT_SET", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_ALGORITHM", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_KEY", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIGNATURE_FAILURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_SIGNATURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_COMPACT_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_JSON_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_PROVIDER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_PROVIDER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_VERIFIER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_VERIFIER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_INIT_PROPERTIES");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_INIT_PROPERTIES", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALGORITHM_NOT_SET");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "ALGORITHM_NOT_SET", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_ALGORITHM");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_ALGORITHM", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_KEY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_KEY", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIGNATURE_FAILURE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "SIGNATURE_FAILURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_SIGNATURE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_SIGNATURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_COMPACT_JWS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_COMPACT_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_JSON_JWS");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_JSON_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/cxf/rs/security/jose/jws/JwsException$Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_PROVIDER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_VERIFIER", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "NO_INIT_PROPERTIES", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "ALGORITHM_NOT_SET", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_ALGORITHM", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_KEY", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "SIGNATURE_FAILURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_SIGNATURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_COMPACT_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_JSON_JWS", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "$VALUES", "[Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
