package asm.org.bouncycastle.x509;
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
public class X509CertStoreSelectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/x509/X509CertStoreSelector", null, "java/security/cert/X509CertSelector", new String[] { "org/bouncycastle/util/Selector" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/X509CertSelector", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "match", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/cert/X509Certificate");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/X509CertSelector", "match", "(Ljava/security/cert/Certificate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "match", "(Ljava/security/cert/Certificate;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "match", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/X509CertSelector", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/x509/X509CertStoreSelector");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/security/cert/X509CertSelector;)Lorg/bouncycastle/x509/X509CertStoreSelector;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot create from null selector");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/x509/X509CertStoreSelector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/x509/X509CertStoreSelector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getAuthorityKeyIdentifier", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setAuthorityKeyIdentifier", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getBasicConstraints", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setBasicConstraints", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getCertificate", "()Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setCertificate", "(Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getCertificateValid", "()Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setCertificateValid", "(Ljava/util/Date;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getMatchAllSubjectAltNames", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setMatchAllSubjectAltNames", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getPathToNames", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setPathToNames", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getExtendedKeyUsage", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setExtendedKeyUsage", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getNameConstraints", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setNameConstraints", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getPolicy", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setPolicy", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSubjectPublicKeyAlgID", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSubjectPublicKeyAlgID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSubjectAlternativeNames", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSubjectAlternativeNames", "(Ljava/util/Collection;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("error in passed in selector: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getIssuer", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setIssuer", "(Ljavax/security/auth/x500/X500Principal;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getKeyUsage", "()[Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setKeyUsage", "([Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getPrivateKeyValid", "()Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setPrivateKeyValid", "(Ljava/util/Date;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSerialNumber", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSerialNumber", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSubject", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSubject", "(Ljavax/security/auth/x500/X500Principal;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSubjectKeyIdentifier", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSubjectKeyIdentifier", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CertSelector", "getSubjectPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/x509/X509CertStoreSelector", "setSubjectPublicKey", "(Ljava/security/PublicKey;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
