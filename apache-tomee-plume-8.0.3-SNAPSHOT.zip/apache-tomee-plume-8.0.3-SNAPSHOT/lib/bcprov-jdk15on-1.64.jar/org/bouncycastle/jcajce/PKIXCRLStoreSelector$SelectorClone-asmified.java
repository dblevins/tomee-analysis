package asm.org.bouncycastle.jcajce;
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
public class PKIXCRLStoreSelector$SelectorCloneDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", null, "java/security/cert/X509CRLSelector", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "org/bouncycastle/jcajce/PKIXCRLStoreSelector", "SelectorClone", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "selector", "Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/X509CRLSelector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "selector", "Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/PKIXCRLStoreSelector", "access$700", "(Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;)Ljava/security/cert/CRLSelector;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/cert/X509CRLSelector");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/PKIXCRLStoreSelector", "access$700", "(Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;)Ljava/security/cert/CRLSelector;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509CRLSelector");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRLSelector", "getCertificateChecking", "()Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "setCertificateChecking", "(Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRLSelector", "getDateAndTime", "()Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "setDateAndTime", "(Ljava/util/Date;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRLSelector", "getIssuers", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "setIssuers", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRLSelector", "getMinCRL", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "setMinCRLNumber", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRLSelector", "getMaxCRL", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "setMaxCRLNumber", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "match", "(Ljava/security/cert/CRL;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "selector", "Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/PKIXCRLStoreSelector$SelectorClone", "selector", "Lorg/bouncycastle/jcajce/PKIXCRLStoreSelector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/PKIXCRLStoreSelector", "match", "(Ljava/security/cert/CRL;)Z", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
