package asm.com.sun.xml.messaging.saaj.util.stax;
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
public class SaajStaxWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", null, "java/lang/Object", new String[] { "javax/xml/stream/XMLStreamWriter" });

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$AttributeDeclaration", "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "AttributeDeclaration", ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$NamespaceDeclaration", "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "NamespaceDeclaration", ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "DeferredElement", ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "soap", "Ljakarta/xml/soap/SOAPMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "envURI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "currentElement", "Ljakarta/xml/soap/SOAPElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "Envelope", "Ljava/lang/String;", null, "Envelope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "Header", "Ljava/lang/String;", null, "Header");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "Body", "Ljava/lang/String;", null, "Body");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "xmlns", "Ljava/lang/String;", null, "xmlns");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/soap/SOAPMessage;Ljava/lang/String;)V", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "envURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSOAPMessage", "()Ljakarta/xml/soap/SOAPMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getEnvelope", "()Ljakarta/xml/soap/SOAPElement;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "getEnvelope", "()Ljakarta/xml/soap/SOAPEnvelope;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "setLocalName", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "jakarta/xml/soap/SOAPException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "envURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("Envelope");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "getEnvelope", "()Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "fixPrefix", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Header");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPHeader", "()Ljakarta/xml/soap/SOAPHeader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "fixPrefix", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPBody", "()Ljakarta/xml/soap/SOAPBody;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "fixPrefix", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "setLocalName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "setNamespaceUri", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "setPrefix", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fixPrefix", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "fixPrefix", "(Ljava/lang/String;Ljakarta/xml/soap/SOAPElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fixPrefix", "(Ljava/lang/String;Ljakarta/xml/soap/SOAPElement;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "setPrefix", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEmptyElement", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEmptyElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEmptyElement", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEndElement", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "getParentElement", "()Ljakarta/xml/soap/SOAPElement;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEndDocument", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "isInitialized", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "addAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "addAttibuteToElement", "(Ljakarta/xml/soap/SOAPElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "isInitialized", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "addNamespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "addNamespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/xml/soap/SOAPElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDefaultNamespace", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeComment", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "createComment", "(Ljava/lang/String;)Lorg/w3c/dom/Comment;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeProcessingInstruction", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "createProcessingInstruction", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/ProcessingInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeProcessingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "createProcessingInstruction", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/ProcessingInstruction;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeCData", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "createCDATASection", "(Ljava/lang/String;)Lorg/w3c/dom/CDATASection;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDTD", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEntityRef", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "createEntityReference", "(Ljava/lang/String;)Lorg/w3c/dom/EntityReference;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartDocument", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartDocument", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "setXmlVersion", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartDocument", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "getSOAPPart", "()Ljakarta/xml/soap/SOAPPart;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPPart", "setXmlVersion", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "soap", "Ljakarta/xml/soap/SOAPMessage;");
methodVisitor.visitLdcInsn("jakarta.xml.soap.character-set-encoding");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/soap/SOAPMessage", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeCharacters", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "addTextNode", "(Ljava/lang/String;)Ljakarta/xml/soap/SOAPElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeCharacters", "([CII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "flushTo", "(Ljakarta/xml/soap/SOAPElement;)Ljakarta/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "copyOfRange", "([CII)[C", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[C"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([C)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "addTextNode", "(Ljava/lang/String;)Ljakarta/xml/soap/SOAPElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "[C", Opcodes.INTEGER, Opcodes.INTEGER, "[C"}, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljakarta/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "lookupPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrefix", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "isInitialized", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "deferredElement", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$DeferredElement", "addNamespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Namespace not associated with any element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultNamespace", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "setPrefix", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("javax.xml.stream.isRepairingNamespaces");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", "<init>", "(Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "addAttibuteToElement", "(Ljakarta/xml/soap/SOAPElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/soap/SOAPException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/namespace/QName"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/soap/SOAPElement", "addAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljakarta/xml/soap/SOAPElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/soap/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
