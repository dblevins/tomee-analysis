package asm.com.sun.xml.messaging.saaj.soap.ver1_1;
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
public class SOAPPart1_1ImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", null, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", new String[] { "javax/xml/soap/SOAPConstants" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "log", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/MessageImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/SOAPPartImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/MessageImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getContentType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "isFastInfoset", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("application/fastinfoset");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("text/xml");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEnvelopeFromSource", "()Lcom/sun/xml/messaging/saaj/soap/Envelope;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "lookForXmlDecl", "()Lcom/sun/xml/messaging/saaj/util/XMLDeclarationParser;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "source", "Ljavax/xml/transform/Source;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "source", "Ljavax/xml/transform/Source;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/messaging/saaj/soap/EnvelopeFactory", "createEnvelope", "(Ljavax/xml/transform/Source;Lcom/sun/xml/messaging/saaj/soap/SOAPPartImpl;)Lcom/sun/xml/messaging/saaj/soap/Envelope;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("SAAJ0304.ver1_1.msg.invalid.SOAP1.1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "severe", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/xml/soap/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InputStream does not represent a valid SOAP 1.1 Message");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/soap/SOAPException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"com/sun/xml/messaging/saaj/util/XMLDeclarationParser", "javax/xml/transform/Source", "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "omitXmlDecl", "Z");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("no");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl", "setOmitXmlDecl", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/XMLDeclarationParser", "getXmlDeclaration", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl", "setXmlDecl", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/util/XMLDeclarationParser", "getEncoding", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/EnvelopeImpl", "setCharsetEncoding", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEmptyEnvelope", "(Ljava/lang/String;)Lcom/sun/xml/messaging/saaj/soap/Envelope;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/ver1_1/Envelope1_1Impl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "getDocument", "()Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/ver1_1/Envelope1_1Impl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;ZZ)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "duplicateType", "()Lcom/sun/xml/messaging/saaj/soap/SOAPPartImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSOAPNamespace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("com.sun.xml.messaging.saaj.soap.ver1_1");
methodVisitor.visitLdcInsn("com.sun.xml.messaging.saaj.soap.ver1_1.LocalStrings");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPPart1_1Impl", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
