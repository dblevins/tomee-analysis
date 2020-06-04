package asm.org.bouncycastle.crypto.params;
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
public class SM2KeyExchangePrivateParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/CipherParameters" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "initiator", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "staticPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "staticPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ephemeralPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ephemeralPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZLorg/bouncycastle/crypto/params/ECPrivateKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("staticPrivateKey cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ephemeralPrivateKey cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Static and ephemeral private keys have different domain parameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/FixedPointCombMultiplier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/FixedPointCombMultiplier", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "initiator", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "staticPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getG", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getD", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/math/ec/ECMultiplier", "multiply", "(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "normalize", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "staticPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "ephemeralPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECDomainParameters", "getG", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPrivateKeyParameters", "getD", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/math/ec/ECMultiplier", "multiply", "(Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "normalize", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "ephemeralPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInitiator", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "initiator", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStaticPrivateKey", "()Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "staticPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStaticPublicPoint", "()Lorg/bouncycastle/math/ec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "staticPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEphemeralPrivateKey", "()Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "ephemeralPrivateKey", "Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEphemeralPublicPoint", "()Lorg/bouncycastle/math/ec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/params/SM2KeyExchangePrivateParameters", "ephemeralPublicPoint", "Lorg/bouncycastle/math/ec/ECPoint;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
