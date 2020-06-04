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
public class FaultElement1_1ImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", null, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/messaging/saaj/soap/name/NameImpl", "createFaultElement1_1Name", "(Ljava/lang/String;)Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/messaging/saaj/soap/name/NameImpl", "createFaultElement1_1Name", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lcom/sun/xml/messaging/saaj/soap/name/NameImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isStandardFaultElement", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", "elementQName", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("faultcode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("faultstring");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("faultactor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setElementQName", "(Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", "isStandardFaultElement", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", "getOwnerDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/ver1_1/FaultElement1_1Impl", "replaceElementWithSOAPElement", "(Lorg/w3c/dom/Element;Lcom/sun/xml/messaging/saaj/soap/impl/ElementImpl;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/FaultElementImpl", "setElementQName", "(Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
