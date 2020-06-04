package asm.org.apache.xml.security.binding.xmlenc;
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
public class ObjectFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/binding/xmlenc/ObjectFactory", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRegistry;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_CipherData_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_CipherValue_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_CipherReference_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptedData_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptedKey_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_AgreementMethod_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptionProperties_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptionProperty_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ReferenceListDataReference_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_ReferenceListKeyReference_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptionMethodTypeKeySize_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_EncryptionMethodTypeOAEPparams_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_AgreementMethodTypeKANonce_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_AgreementMethodTypeOriginatorKeyInfo_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_AgreementMethodTypeRecipientKeyInfo_QNAME", "Ljavax/xml/namespace/QName;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherDataType", "()Lorg/apache/xml/security/binding/xmlenc/CipherDataType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/CipherDataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/CipherDataType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherValueType", "()Lorg/apache/xml/security/binding/xmlenc/CipherValueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/CipherValueType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/CipherValueType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherReferenceType", "()Lorg/apache/xml/security/binding/xmlenc/CipherReferenceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/CipherReferenceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/CipherReferenceType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptedDataType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/EncryptedDataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptedKeyType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptedKeyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/EncryptedKeyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/EncryptedKeyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAgreementMethodType", "()Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/AgreementMethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/AgreementMethodType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferenceList", "()Lorg/apache/xml/security/binding/xmlenc/ReferenceList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/ReferenceList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/ReferenceList", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferenceType", "()Lorg/apache/xml/security/binding/xmlenc/ReferenceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/ReferenceType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/ReferenceType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionPropertiesType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertiesType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/EncryptionPropertiesType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/EncryptionPropertiesType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionPropertyType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertyType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/EncryptionPropertyType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/EncryptionPropertyType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionMethodType", "()Lorg/apache/xml/security/binding/xmlenc/EncryptionMethodType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/EncryptionMethodType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/EncryptionMethodType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTransformsType", "()Lorg/apache/xml/security/binding/xmlenc/TransformsType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/binding/xmlenc/TransformsType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/binding/xmlenc/TransformsType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherData", "(Lorg/apache/xml/security/binding/xmlenc/CipherDataType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/CipherDataType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/CipherDataType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "CipherData");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/CipherDataType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherValue", "(Lorg/apache/xml/security/binding/xmlenc/CipherValueType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/CipherValueType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/CipherValueType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "CipherValue");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherValue_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/CipherValueType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCipherReference", "(Lorg/apache/xml/security/binding/xmlenc/CipherReferenceType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/CipherReferenceType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/CipherReferenceType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "CipherReference");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/CipherReferenceType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptedData", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "EncryptedData");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptedData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptedKey", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedKeyType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/EncryptedKeyType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/EncryptedKeyType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "EncryptedKey");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptedKey_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptedKeyType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAgreementMethod", "(Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "AgreementMethod");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethod_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionProperties", "(Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertiesType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertiesType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertiesType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "EncryptionProperties");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionProperties_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertiesType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionProperty", "(Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertyType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertyType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertyType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "EncryptionProperty");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionProperty_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionPropertyType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferenceListDataReference", "(Lorg/apache/xml/security/binding/xmlenc/ReferenceType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/ReferenceType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/ReferenceType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "DataReference");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceList;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_ReferenceListDataReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceList;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReferenceListKeyReference", "(Lorg/apache/xml/security/binding/xmlenc/ReferenceType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmlenc/ReferenceType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmlenc/ReferenceType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "KeyReference");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceList;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_ReferenceListKeyReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/ReferenceList;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionMethodTypeKeySize", "(Ljava/math/BigInteger;)Ljavax/xml/bind/JAXBElement;", "(Ljava/math/BigInteger;)Ljavax/xml/bind/JAXBElement<Ljava/math/BigInteger;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "KeySize");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionMethodType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionMethodTypeKeySize_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionMethodType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEncryptionMethodTypeOAEPparams", "([B)Ljavax/xml/bind/JAXBElement;", "([B)Ljavax/xml/bind/JAXBElement<[B>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "OAEPparams");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionMethodType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionMethodTypeOAEPparams_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/EncryptionMethodType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAgreementMethodTypeKANonce", "([B)Ljavax/xml/bind/JAXBElement;", "([B)Ljavax/xml/bind/JAXBElement<[B>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "KA-Nonce");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeKANonce_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAgreementMethodTypeOriginatorKeyInfo", "(Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "OriginatorKeyInfo");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeOriginatorKeyInfo_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAgreementMethodTypeRecipientKeyInfo", "(Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://www.w3.org/2001/04/xmlenc#");
annotationVisitor0.visit("name", "RecipientKeyInfo");
annotationVisitor0.visit("scope", Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeRecipientKeyInfo_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/binding/xmlenc/AgreementMethodType;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("CipherData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("CipherValue");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherValue_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("CipherReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_CipherReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("EncryptedData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptedData_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("EncryptedKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptedKey_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("AgreementMethod");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethod_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("EncryptionProperties");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionProperties_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("EncryptionProperty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionProperty_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("DataReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_ReferenceListDataReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("KeyReference");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_ReferenceListKeyReference_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("KeySize");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionMethodTypeKeySize_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("OAEPparams");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_EncryptionMethodTypeOAEPparams_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("KA-Nonce");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeKANonce_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("OriginatorKeyInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeOriginatorKeyInfo_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#");
methodVisitor.visitLdcInsn("RecipientKeyInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/binding/xmlenc/ObjectFactory", "_AgreementMethodTypeRecipientKeyInfo_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
