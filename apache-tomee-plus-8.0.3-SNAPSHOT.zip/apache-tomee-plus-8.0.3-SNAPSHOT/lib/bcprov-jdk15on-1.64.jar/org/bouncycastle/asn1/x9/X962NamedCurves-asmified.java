package asm.org.bouncycastle.asn1.x9;
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
public class X962NamedCurvesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/x9/X962NamedCurves", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$15", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$16", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$17", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$18", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$19", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$20", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$21", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$22", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$23", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x9/X962NamedCurves$9", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime192v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime192v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime192v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "prime256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb163v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb163v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb163v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb176w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb191v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb191v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb191v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb208w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb272w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb304w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb359v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2pnb368w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "c2tnb431r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "curves", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "curves", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/x9/X9ECParametersHolder");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/X9ECParametersHolder", "getParameters", "()Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "objIds", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "names", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "keys", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "fromHex", "(Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "configureCurve", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$3", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$4", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$5", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$6", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$7", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$8", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$9", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$10", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$11", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb176w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$12", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$13", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$14", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$15");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$15", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb208w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$16");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$16", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$17");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$17", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$18");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$18", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$19");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$19", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb272w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$20");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$20", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb304w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$21");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$21", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb359v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$22");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$22", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb368w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X962NamedCurves$23");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X962NamedCurves$23", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb431r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "curves", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("prime192v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime192v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime192v2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime192v2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime192v3");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime192v3", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime192v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime239v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime239v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime239v2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime239v2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime239v3");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime239v3", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("prime256v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "prime256v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "prime256v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb163v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb163v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb163v2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb163v2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb163v3");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb163v3", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb163v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb176w1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb176w1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb176w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb191v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb191v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb191v2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb191v2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb191v3");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb191v3", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb191v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb208w1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb208w1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb208w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb239v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb239v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb239v2");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb239v2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v2", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb239v3");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb239v3", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb239v3", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb272w1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb272w1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb272w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb304w1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb304w1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb304w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb359v1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb359v1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb359v1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2pnb368w1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2pnb368w1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2pnb368w1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("c2tnb431r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "c2tnb431r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "c2tnb431r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/X962NamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
