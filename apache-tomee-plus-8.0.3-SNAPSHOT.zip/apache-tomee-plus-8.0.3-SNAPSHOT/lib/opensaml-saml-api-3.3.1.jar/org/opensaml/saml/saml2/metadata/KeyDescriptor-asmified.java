package asm.org.opensaml.saml.saml2.metadata;
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
public class KeyDescriptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/opensaml/saml/saml2/metadata/KeyDescriptor", null, "java/lang/Object", new String[] { "org/opensaml/saml/common/SAMLObject" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_LOCAL_NAME", "Ljava/lang/String;", null, "KeyDescriptor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LOCAL_NAME", "Ljava/lang/String;", null, "KeyDescriptorType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_ATTRIB_NAME", "Ljava/lang/String;", null, "use");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUse", "()Lorg/opensaml/security/credential/UsageType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setUse", "(Lorg/opensaml/security/credential/UsageType;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getKeyInfo", "()Lorg/opensaml/xmlsec/signature/KeyInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncryptionMethods", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/saml/saml2/metadata/EncryptionMethod;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:metadata");
methodVisitor.visitLdcInsn("KeyDescriptor");
methodVisitor.visitLdcInsn("md");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/KeyDescriptor", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:metadata");
methodVisitor.visitLdcInsn("KeyDescriptorType");
methodVisitor.visitLdcInsn("md");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/KeyDescriptor", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
