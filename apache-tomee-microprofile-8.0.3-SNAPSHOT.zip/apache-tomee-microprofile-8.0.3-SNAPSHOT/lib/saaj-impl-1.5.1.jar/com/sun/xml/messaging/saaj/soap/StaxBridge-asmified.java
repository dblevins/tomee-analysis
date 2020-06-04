package asm.com.sun.xml.messaging.saaj.soap;
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
public class StaxBridgeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/messaging/saaj/soap/StaxBridge", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint", "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter", "Breakpoint", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "saajWriter", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readerToWriter", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "breakpoint", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPPartImpl;)V", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "readerToWriter", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "message", "Lcom/sun/xml/messaging/saaj/soap/MessageImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "getSOAPNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "<init>", "(Ljakarta/xml/soap/SOAPMessage;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "saajWriter", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bridgeEnvelopeAndHeaders", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "readerToWriter", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "breakpoint", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter", "bridge", "(Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bridgePayload", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "readerToWriter", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxBridge", "breakpoint", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter", "bridge", "(Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPayloadReader", "()Ljavax/xml/stream/XMLStreamReader;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPayloadQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPayloadAttributeValue", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPayloadAttributeValue", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
