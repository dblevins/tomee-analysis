package asm.org.apache.cxf.common.jaxb;
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
public class JAXBUtils$BridgeWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/common/jaxb/JAXBUtils$BridgeWrapper", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$BridgeWrapper", "org/apache/cxf/common/jaxb/JAXBUtils", "BridgeWrapper", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Lorg/w3c/dom/Node;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljava/lang/Object;Ljavax/xml/transform/stream/StreamResult;)V", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljava/lang/Object;Lorg/w3c/dom/Node;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
