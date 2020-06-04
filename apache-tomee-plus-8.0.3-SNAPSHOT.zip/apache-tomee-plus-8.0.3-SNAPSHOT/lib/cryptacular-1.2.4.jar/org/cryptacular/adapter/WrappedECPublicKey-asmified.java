package asm.org.cryptacular.adapter;
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
public class WrappedECPublicKeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/adapter/WrappedECPublicKey", "Lorg/cryptacular/adapter/AbstractWrappedECKey<Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;>;Ljava/security/interfaces/ECPublicKey;", "org/cryptacular/adapter/AbstractWrappedECKey", new String[] { "java/security/interfaces/ECPublicKey" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/adapter/AbstractWrappedECKey", "<init>", "(Lorg/bouncycastle/crypto/params/ECKeyParameters;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getW", "()Ljava/security/spec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/security/spec/ECPoint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/adapter/WrappedECPublicKey", "delegate", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPublicKeyParameters", "getQ", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "normalize", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "getXCoord", "()Lorg/bouncycastle/math/ec/ECFieldElement;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECFieldElement", "toBigInteger", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/adapter/WrappedECPublicKey", "delegate", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECPublicKeyParameters", "getQ", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "normalize", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "getYCoord", "()Lorg/bouncycastle/math/ec/ECFieldElement;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECFieldElement", "toBigInteger", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/spec/ECPoint", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
