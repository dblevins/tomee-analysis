package asm.org.bouncycastle.crypto.engines;
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
public class SM2Engine$ModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "Ljava/lang/Enum<Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/engines/SM2Engine$Mode", "org/bouncycastle/crypto/engines/SM2Engine", "Mode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "C1C2C3", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "C1C3C2", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "$VALUES", "[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/engines/SM2Engine$Mode");
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
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/SM2Engine$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("C1C2C3");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "C1C2C3", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/SM2Engine$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("C1C3C2");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "C1C3C2", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/crypto/engines/SM2Engine$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "C1C2C3", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "C1C3C2", "Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/SM2Engine$Mode", "$VALUES", "[Lorg/bouncycastle/crypto/engines/SM2Engine$Mode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
