package asm.org.opensaml.xmlsec.signature.impl;
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
public class X509CertificateImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", null, "org/opensaml/core/xml/AbstractXMLObject", new String[] { "org/opensaml/xmlsec/signature/X509Certificate" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "b64CertIndex", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/AbstractXMLObject", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "b64CertIndex", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "get", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "b64CertIndex", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "get", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "prepareForAssignment", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "b64CertIndex", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "remove", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "put", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "b64CertIndex", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderedChildren", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/core/xml/XMLObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "finalize", "()V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "finalize", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "b64CertIndex", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "remove", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/IndexingObjectStore", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/signature/impl/X509CertificateImpl", "B64_CERT_STORE", "Lnet/shibboleth/utilities/java/support/collection/IndexingObjectStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
