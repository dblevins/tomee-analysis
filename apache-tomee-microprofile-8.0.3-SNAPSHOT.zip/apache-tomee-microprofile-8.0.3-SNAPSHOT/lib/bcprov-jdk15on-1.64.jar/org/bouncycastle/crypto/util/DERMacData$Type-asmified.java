package asm.org.bouncycastle.crypto.util;
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
public class DERMacData$TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/bouncycastle/crypto/util/DERMacData$Type", "Ljava/lang/Enum<Lorg/bouncycastle/crypto/util/DERMacData$Type;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/DERMacData$Type", "org/bouncycastle/crypto/util/DERMacData", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "enc", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "$VALUES", "[Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/bouncycastle/crypto/util/DERMacData$Type;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/crypto/util/DERMacData$Type;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/util/DERMacData$Type");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Type", "enc", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeader", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Type", "enc", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toByteArray", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNILATERALU");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("KC_1_U");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "UNILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNILATERALV");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("KC_1_V");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "UNILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BILATERALU");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("KC_2_U");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "BILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BILATERALV");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("KC_2_V");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "BILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/crypto/util/DERMacData$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "UNILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "UNILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "BILATERALU", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "BILATERALV", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/util/DERMacData$Type", "$VALUES", "[Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
