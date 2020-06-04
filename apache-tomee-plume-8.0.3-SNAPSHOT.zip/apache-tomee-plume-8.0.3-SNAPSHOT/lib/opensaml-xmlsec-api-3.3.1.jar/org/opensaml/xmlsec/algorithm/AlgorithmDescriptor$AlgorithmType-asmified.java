package asm.org.opensaml.xmlsec.algorithm;
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
public class AlgorithmDescriptor$AlgorithmTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "Ljava/lang/Enum<Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor", "AlgorithmType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BlockEncryption", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Mac", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MessageDigest", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyAgreement", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyTransport", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Signature", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SymmetricKeyWrap", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "$VALUES", "[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
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
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BlockEncryption");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "BlockEncryption", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Mac");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "Mac", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MessageDigest");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "MessageDigest", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyAgreement");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "KeyAgreement", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyTransport");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "KeyTransport", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Signature");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "Signature", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SymmetricKeyWrap");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "SymmetricKeyWrap", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "BlockEncryption", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "Mac", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "MessageDigest", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "KeyAgreement", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "KeyTransport", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "Signature", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "SymmetricKeyWrap", "Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType", "$VALUES", "[Lorg/opensaml/xmlsec/algorithm/AlgorithmDescriptor$AlgorithmType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
