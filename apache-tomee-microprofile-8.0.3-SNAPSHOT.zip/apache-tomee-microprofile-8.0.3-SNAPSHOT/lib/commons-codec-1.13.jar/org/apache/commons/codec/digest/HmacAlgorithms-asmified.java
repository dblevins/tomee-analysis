package asm.org.apache.commons.codec.digest;
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
public class HmacAlgorithmsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/codec/digest/HmacAlgorithms", "Ljava/lang/Enum<Lorg/apache/commons/codec/digest/HmacAlgorithms;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_MD5", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_SHA_1", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_SHA_224", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_SHA_256", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_SHA_384", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HMAC_SHA_512", "Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "$VALUES", "[Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/codec/digest/HmacAlgorithms;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/codec/digest/HmacAlgorithms;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/codec/digest/HmacAlgorithms;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/codec/digest/HmacAlgorithms", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/HmacAlgorithms", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/codec/digest/HmacAlgorithms", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_MD5");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("HmacMD5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_MD5", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_SHA_1");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("HmacSHA1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_1", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_SHA_224");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("HmacSHA224");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_224", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_SHA_256");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("HmacSHA256");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_256", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_SHA_384");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("HmacSHA384");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_384", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HMAC_SHA_512");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("HmacSHA512");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/codec/digest/HmacAlgorithms", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_512", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/codec/digest/HmacAlgorithms");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_MD5", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_1", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_224", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_256", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_384", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "HMAC_SHA_512", "Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/codec/digest/HmacAlgorithms", "$VALUES", "[Lorg/apache/commons/codec/digest/HmacAlgorithms;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
