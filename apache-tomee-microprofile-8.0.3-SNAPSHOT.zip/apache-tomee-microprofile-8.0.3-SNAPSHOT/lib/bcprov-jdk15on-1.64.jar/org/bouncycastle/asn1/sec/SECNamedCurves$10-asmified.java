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
public class SECNamedCurves$10Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/bouncycastle/asn1/sec/SECNamedCurves$10", null, "org/bouncycastle/asn1/x9/X9ECParametersHolder", null);

classWriter.visitOuterClass("org/bouncycastle/asn1/sec/SECNamedCurves", null, null);

classWriter.visitInnerClass("org/bouncycastle/asn1/sec/SECNamedCurves$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/math/ec/ECCurve$Fp", "org/bouncycastle/math/ec/ECCurve", "Fp", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X9ECParametersHolder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createParameters", "()Lorg/bouncycastle/asn1/x9/X9ECParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "access$000", "(Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/ECConstants", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "access$000", "(Ljava/lang/String;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/endo/GLVTypeBParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/endo/ScalarSplitParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("6b8cf07d4ca75c88957d9d670591");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("-b8adf1378a6eb73409fa6c9c637d");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1243ae1b4d71613bc9f780a03690e");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("6b8cf07d4ca75c88957d9d670591");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("6b8cf07d4ca75c88957d9d67059037a4");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("b8adf1378a6eb73409fa6c9c637ba7f5");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/endo/ScalarSplitParameters", "<init>", "([Ljava/math/BigInteger;[Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/endo/GLVTypeBParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/math/ec/endo/ScalarSplitParameters;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/ECCurve$Fp");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/ECCurve$Fp", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "access$300", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/endo/GLVTypeBParameters;)Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/sec/SECNamedCurves", "access$200", "(Lorg/bouncycastle/math/ec/ECCurve;Ljava/lang/String;)Lorg/bouncycastle/asn1/x9/X9ECPoint;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x9/X9ECParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x9/X9ECParameters", "<init>", "(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/asn1/x9/X9ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(14, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
