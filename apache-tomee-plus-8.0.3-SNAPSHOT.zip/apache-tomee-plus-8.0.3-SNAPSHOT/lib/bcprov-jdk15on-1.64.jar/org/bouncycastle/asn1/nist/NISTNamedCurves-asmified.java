package asm.org.bouncycastle.asn1.nist;
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
public class NISTNamedCurvesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/nist/NISTNamedCurves", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "objIds", "Ljava/util/Hashtable;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByName", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toUpperCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOID", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toUpperCase", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getName", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "names", "Ljava/util/Hashtable;");
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "keys", "()Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "objIds", "Ljava/util/Hashtable;");
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "names", "Ljava/util/Hashtable;");
methodVisitor.visitLdcInsn("B-571");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-409");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-283");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-233");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("B-163");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163r2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-571");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect571k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-409");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect409k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-283");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect283k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-233");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect233k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("K-163");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "sect163k1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-521");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp521r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-384");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp384r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-256");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp256r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-224");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp224r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitLdcInsn("P-192");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/sec/SECObjectIdentifiers", "secp192r1", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/nist/NISTNamedCurves", "defineCurve", "(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
