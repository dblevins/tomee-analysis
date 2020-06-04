package asm.org.apache.cxf.ws.security.sts.provider.model.utility;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRegistry;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Timestamp_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Expires_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_Created_QNAME", "Ljavax/xml/namespace/QName;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimestampType", "()Lorg/apache/cxf/ws/security/sts/provider/model/utility/TimestampType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/utility/TimestampType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/utility/TimestampType", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttributedDateTime", "()Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttributedURI", "()Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedURI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/sts/provider/model/utility/AttributedURI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/sts/provider/model/utility/AttributedURI", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTimestamp", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/TimestampType;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/TimestampType;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/utility/TimestampType;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
annotationVisitor0.visit("name", "Timestamp");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Timestamp_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/utility/TimestampType;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExpires", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
annotationVisitor0.visit("name", "Expires");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Expires_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCreated", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)Ljavax/xml/bind/JAXBElement;", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)Ljavax/xml/bind/JAXBElement<Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElementDecl;", true);
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
annotationVisitor0.visit("name", "Created");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Created_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;"));
methodVisitor.visitInsn(ACONST_NULL);
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
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Timestamp");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Timestamp_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Expires");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Expires_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Created");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory", "_Created_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
