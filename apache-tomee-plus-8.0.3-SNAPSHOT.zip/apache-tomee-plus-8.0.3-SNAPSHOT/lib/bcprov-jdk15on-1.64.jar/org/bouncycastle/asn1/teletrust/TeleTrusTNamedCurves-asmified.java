package asm.org.bouncycastle.asn1.teletrust;
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
public class TeleTrusTNamedCurvesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$14", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$9", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP160t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP192t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP224t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP256t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP320r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP320t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP384t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP512r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC, "brainpoolP512t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;", null, null);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "curves", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toLowerCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "curves", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "objIds", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "names", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "elements", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOID", "(SZ)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("brainpoolP");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("t");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("r");
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "fromHex", "(Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "configureCurve", "(Lorg/bouncycastle/math/ec/ECCurve;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "configureBasepoint", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP160t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$3", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$4", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP192t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$5", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$6", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP224t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$7", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$8", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP256t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$9", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP320r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$10", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP320t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$11", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$12", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP384t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$13", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP512r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$14");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves$14", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP512t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "curves", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("brainpoolP160r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP160r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP160r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP160t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP160t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP160t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP192r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP192r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP192r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP192t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP192t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP192t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP224r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP224r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP224r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP224t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP224t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP224t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP256r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP256r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP256r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP256t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP256t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP256t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP320r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP320r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP320r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP320t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP320t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP320t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP384r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP384r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP384r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP384t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP384t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP384t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP512r1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP512r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP512r1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitLdcInsn("brainpoolP512t1");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTObjectIdentifiers", "brainpoolP512t1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "brainpoolP512t1", "Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/teletrust/TeleTrusTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
