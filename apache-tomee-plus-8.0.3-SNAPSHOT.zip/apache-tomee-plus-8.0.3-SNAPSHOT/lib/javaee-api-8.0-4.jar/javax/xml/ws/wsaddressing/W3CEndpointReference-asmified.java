package asm.javax.xml.ws.wsaddressing;
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
public class W3CEndpointReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/xml/ws/wsaddressing/W3CEndpointReference", null, "javax/xml/ws/EndpointReference", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlRootElement;", true);
annotationVisitor0.visit("name", "EndpointReference");
annotationVisitor0.visit("namespace", "http://www.w3.org/2005/08/addressing");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "EndpointReferenceType");
annotationVisitor0.visit("namespace", "http://www.w3.org/2005/08/addressing");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("javax/xml/ws/wsaddressing/W3CEndpointReference$MetadataType", "javax/xml/ws/wsaddressing/W3CEndpointReference", "MetadataType", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/xml/ws/wsaddressing/W3CEndpointReference$ReferenceParametersType", "javax/xml/ws/wsaddressing/W3CEndpointReference", "ReferenceParametersType", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/xml/ws/wsaddressing/W3CEndpointReference$AttributedURIType", "javax/xml/ws/wsaddressing/W3CEndpointReference", "AttributedURIType", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NS", "Ljava/lang/String;", null, "http://www.w3.org/2005/08/addressing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "jaxbContext", "Ljavax/xml/bind/JAXBContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "address", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$AttributedURIType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "Address");
annotationVisitor0.visit("namespace", "http://www.w3.org/2005/08/addressing");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referenceParameters", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$ReferenceParametersType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "ReferenceParameters");
annotationVisitor0.visit("namespace", "http://www.w3.org/2005/08/addressing");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "metadata", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$MetadataType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "Metadata");
annotationVisitor0.visit("namespace", "http://www.w3.org/2005/08/addressing");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "any", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/Object;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlAnyElement;", true);
annotationVisitor0.visit("lax", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "otherAttributes", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/String;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlAnyAttribute;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/ws/EndpointReference", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "otherAttributes", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/transform/Source;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/ws/EndpointReference", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "otherAttributes", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/ws/wsaddressing/W3CEndpointReference", "jaxbContext", "Ljavax/xml/bind/JAXBContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/bind/JAXBContext", "createUnmarshaller", "()Ljavax/xml/bind/Unmarshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Unmarshaller", "unmarshal", "(Ljavax/xml/transform/Source;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/ws/wsaddressing/W3CEndpointReference");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "address", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$AttributedURIType;");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "address", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$AttributedURIType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "referenceParameters", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$ReferenceParametersType;");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "referenceParameters", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$ReferenceParametersType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "metadata", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$MetadataType;");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "metadata", "Ljavax/xml/ws/wsaddressing/W3CEndpointReference$MetadataType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "any", "Ljava/util/List;");
methodVisitor.visitFieldInsn(PUTFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "any", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "otherAttributes", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "javax/xml/ws/wsaddressing/W3CEndpointReference", "otherAttributes", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putAll", "(Ljava/util/Map;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/ws/WebServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to create W3C endpoint reference.");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/ws/WebServiceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljavax/xml/transform/Result;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Null is not allowed.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/ws/wsaddressing/W3CEndpointReference", "jaxbContext", "Ljavax/xml/bind/JAXBContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/bind/JAXBContext", "createMarshaller", "()Ljavax/xml/bind/Marshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("jaxb.fragment");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "marshal", "(Ljava/lang/Object;Ljavax/xml/transform/Result;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/ws/WebServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("writeTo failure.");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/ws/WebServiceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/ws/wsaddressing/W3CEndpointReference;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/bind/JAXBContext", "newInstance", "([Ljava/lang/Class;)Ljavax/xml/bind/JAXBContext;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/xml/ws/wsaddressing/W3CEndpointReference", "jaxbContext", "Ljavax/xml/bind/JAXBContext;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/ws/WebServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXBContext creation failed.");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/ws/WebServiceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
