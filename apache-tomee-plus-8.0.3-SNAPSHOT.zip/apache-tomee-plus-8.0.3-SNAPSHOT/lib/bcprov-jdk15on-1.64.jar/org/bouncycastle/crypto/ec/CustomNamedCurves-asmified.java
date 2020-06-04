package asm.org.bouncycastle.crypto.ec;
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
public class CustomNamedCurvesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/ec/CustomNamedCurves", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$15", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$16", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$17", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$18", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$19", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$20", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$21", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$22", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$23", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$24", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$25", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$26", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$27", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$28", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$29", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$30", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$31", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$32", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/ec/CustomNamedCurves$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/math/ec/ECCurve$Config", "org/bouncycastle/math/ec/ECCurve", "Config", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "curve25519", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp160k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp160r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp192k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp224k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp256k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp521r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect113r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect113r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect131r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect131r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect163k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect163r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect163r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect193r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect193r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect233k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect233r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect239k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect283k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect283r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect409k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect409r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect571k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sect571r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "sm2p256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "nameToCurve", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "nameToOID", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "oidToCurve", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "oidToName", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "names", "Ljava/util/Vector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X9ECPoint");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/encoders/Hex", "decodeStrict", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X9ECPoint", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9ECPoint", "getPoint", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/WNafUtil", "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECPoint;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "configureCurve", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "configureCurveGLV", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECCurve", "configure", "()Lorg/bouncycastle/math/ec/ECCurve$Config;", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/endo/GLVTypeBEndomorphism");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/endo/GLVTypeBEndomorphism", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECCurve$Config", "setEndomorphism", "(Lorg/bouncycastle/math/ec/endo/ECEndomorphism;)Lorg/bouncycastle/math/ec/ECCurve$Config;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECCurve$Config", "create", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "names", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "names", "Ljava/util/Vector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToName", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToOID", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToOID", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByName", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/x9/X9ECParametersHolder");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9ECParametersHolder", "getParameters", "()Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/x9/X9ECParametersHolder");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9ECParametersHolder", "getParameters", "()Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToOID", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getName", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToName", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNames", "()Ljava/util/Enumeration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "names", "Ljava/util/Vector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "elements", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "configureCurve", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "configureCurveGLV", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "curve25519", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$3", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$4", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$5", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$6", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp192k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$7", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$8", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp224k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$9", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$10", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp256k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$11", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$12", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$13", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp521r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$14", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect113r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$15");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$15", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect113r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$16");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$16", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect131r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$17");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$17", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect131r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$18");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$18", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$19");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$19", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$20");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$20", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$21");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$21", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect193r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$22");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$22", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect193r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$23");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$23", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect233k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$24");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$24", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect233r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$25");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$25", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect239k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$26");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$26", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect283k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$27");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$27", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect283r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$28");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$28", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect409k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$29");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$29", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect409r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$30");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$30", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect571k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$31");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$31", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect571r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/ec/CustomNamedCurves$32");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/ec/CustomNamedCurves$32", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sm2p256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "nameToOID", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToCurve", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "oidToName", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "names", "Ljava/util/Vector;");
methodVisitor.visitLdcInsn("curve25519");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cryptlib/CryptlibObjectIdentifiers", "curvey25519", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "curve25519", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp128r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp128r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp160r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp192k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp192k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp192r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp224k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp224k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp224r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp256k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp256k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp256r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp384r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp384r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp521r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp521r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "secp521r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect113r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect113r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect113r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect113r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect113r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect113r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect131r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect131r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect131r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect131r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect131r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect131r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect163r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect193r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect193r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect193r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect193r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect193r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect193r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect233k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect233k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect233r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect233r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect239k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect239k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect239k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect283k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect283k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect283r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect283r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect409k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect409k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect409r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect409r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect571k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect571k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect571r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sect571r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sm2p256v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/gm/GMObjectIdentifiers", "sm2p256v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "sm2p256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveWithOID", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("B-163");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-233");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-283");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-409");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-571");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-163");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-233");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-283");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-409");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-571");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-192");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-224");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-384");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp384r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-521");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp521r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/ec/CustomNamedCurves", "defineCurveAlias", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
