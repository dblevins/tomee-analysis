package asm.org.bouncycastle.jcajce;
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
public class BCFKSLoadStoreParameter$EncryptionAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "Ljava/lang/Enum<Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "EncryptionAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES256_KWP", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm");
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
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256_CCM");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES256_KWP");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_KWP", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_CCM", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "AES256_KWP", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
