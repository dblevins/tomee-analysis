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
public class BCFKSLoadStoreParameter$SignatureAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "Ljava/lang/Enum<Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "SignatureAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA3_512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA3_512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SHA3_512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
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
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA512withDSA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA3_512withDSA");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA512withECDSA");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA3_512withECDSA");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA512withRSA");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA3_512withRSA");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withECDSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "SHA3_512withRSA", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "$VALUES", "[Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
