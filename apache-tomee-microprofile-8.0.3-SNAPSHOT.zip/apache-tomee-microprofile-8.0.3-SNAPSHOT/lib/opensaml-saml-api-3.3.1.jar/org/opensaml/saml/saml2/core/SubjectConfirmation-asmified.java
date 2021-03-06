package asm.org.opensaml.saml.saml2.core;
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
public class SubjectConfirmationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/opensaml/saml/saml2/core/SubjectConfirmation", null, "java/lang/Object", new String[] { "org/opensaml/saml/common/SAMLObject" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_LOCAL_NAME", "Ljava/lang/String;", null, "SubjectConfirmation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LOCAL_NAME", "Ljava/lang/String;", null, "SubjectConfirmationType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_ATTRIB_NAME", "Ljava/lang/String;", null, "Method");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_HOLDER_OF_KEY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:holder-of-key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_SENDER_VOUCHES", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:sender-vouches");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_BEARER", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:cm:bearer");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethod", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMethod", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBaseID", "()Lorg/opensaml/saml/saml2/core/BaseID;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBaseID", "(Lorg/opensaml/saml/saml2/core/BaseID;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNameID", "()Lorg/opensaml/saml/saml2/core/NameID;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNameID", "(Lorg/opensaml/saml/saml2/core/NameID;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptedID", "()Lorg/opensaml/saml/saml2/core/EncryptedID;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEncryptedID", "(Lorg/opensaml/saml/saml2/core/EncryptedID;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSubjectConfirmationData", "()Lorg/opensaml/saml/saml2/core/SubjectConfirmationData;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSubjectConfirmationData", "(Lorg/opensaml/saml/saml2/core/SubjectConfirmationData;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("SubjectConfirmation");
methodVisitor.visitLdcInsn("saml2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/SubjectConfirmation", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:assertion");
methodVisitor.visitLdcInsn("SubjectConfirmationType");
methodVisitor.visitLdcInsn("saml2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/SubjectConfirmation", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
