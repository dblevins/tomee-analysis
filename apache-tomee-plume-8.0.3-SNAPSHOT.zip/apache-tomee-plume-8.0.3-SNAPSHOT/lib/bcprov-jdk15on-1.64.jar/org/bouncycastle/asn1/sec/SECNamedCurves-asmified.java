package asm.org.bouncycastle.asn1.sec;
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
public class SECNamedCurvesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/sec/SECNamedCurves", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$15", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$16", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$17", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$18", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$19", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$20", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$21", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$22", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$23", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$24", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$25", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$26", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$27", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$28", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$29", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$30", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$31", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$32", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$33", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/math/ec/ECCurve$Config", "org/bouncycastle/math/ec/ECCurve", "Config", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp112r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp112r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "secp128r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "objIds", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "curves", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "names", "Ljava/util/Hashtable;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "fromHex", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/encoders/Hex", "decodeStrict", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(I[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "curves", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "curves", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "objIds", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "names", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "elements", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "fromHex", "(Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "configureCurve", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "configureCurveGLV", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp112r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp112r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$3", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$4", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp128r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$5", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$6", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$7", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$8", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp192k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$9", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$10", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp224k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$11", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$12", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp256k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$13", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$14", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$15");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$15", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp521r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$16");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$16", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect113r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$17");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$17", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect113r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$18");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$18", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect131r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$19");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$19", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect131r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$20");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$20", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$21");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$21", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$22");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$22", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$23");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$23", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect193r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$24");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$24", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect193r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$25");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$25", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect233k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$26");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$26", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect233r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$27");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$27", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect239k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$28");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$28", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect283k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$29");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$29", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect283r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$30");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$30", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect409k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$31");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$31", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect409r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$32");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$32", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect571k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/sec/SECNamedCurves$33");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/sec/SECNamedCurves$33", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect571r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "curves", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("secp112r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp112r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp112r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp112r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp112r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp112r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp128r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp128r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp128r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp128r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp128r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp128r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp160r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp160r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp160r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp192k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp192k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp192r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp224k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp224k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp224r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp256k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp256k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp256r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp384r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp384r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("secp521r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp521r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "secp521r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect113r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect113r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect113r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect113r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect113r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect113r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect131r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect131r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect131r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect131r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect131r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect131r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect163r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect163r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect193r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect193r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect193r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect193r2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect193r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect193r2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect233k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect233k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect233r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect233r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect239k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect239k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect239k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect283k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect283k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect283r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect283r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect409k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect409k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect409r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect409r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect571k1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect571k1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("sect571r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "sect571r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
