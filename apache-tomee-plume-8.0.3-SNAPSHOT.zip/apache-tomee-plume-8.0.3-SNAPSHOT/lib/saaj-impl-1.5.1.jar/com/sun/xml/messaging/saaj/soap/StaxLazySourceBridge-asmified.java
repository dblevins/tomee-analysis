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
public class StaxLazySourceBridgeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", null, "com/sun/xml/messaging/saaj/soap/StaxBridge", null);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge$1", null, null, 0);

classWriter.visitInnerClass("org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint", "org/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter", "Breakpoint", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;Lcom/sun/xml/messaging/saaj/soap/SOAPPartImpl;)V", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/StaxBridge", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPPartImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "getSOAPNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "readToBodyStarTag", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "saajWriter", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge$1", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/StaxLazySourceBridge;Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "breakpoint", "Lorg/jvnet/staxex/util/XMLStreamReaderToXMLStreamWriter$Breakpoint;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "java/lang/String"}, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/soap/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/soap/SOAPException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayloadReader", "()Ljavax/xml/stream/XMLStreamReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "readPayload", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayloadQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "getPayloadQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayloadAttributeValue", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "isPayloadStreamReader", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "readPayload", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getEventType", "()I", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getAttributeValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayloadAttributeValue", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "isPayloadStreamReader", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "readPayload", "()Ljavax/xml/stream/XMLStreamReader;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getEventType", "()I", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getAttributeValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bridgePayload", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "saajWriter", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "writePayloadTo", "(Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writePayloadTo", "(Ljavax/xml/stream/XMLStreamWriter;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/StaxLazySourceBridge", "lazySource", "Lcom/sun/xml/messaging/saaj/LazyEnvelopeSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/messaging/saaj/LazyEnvelopeSource", "writePayloadTo", "(Ljavax/xml/stream/XMLStreamWriter;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
