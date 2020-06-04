package asm.com.sun.xml.messaging.saaj.soap.impl;
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
public class BodyElementImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/messaging/saaj/soap/impl/BodyElementImpl", null, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", new String[] { "javax/xml/soap/SOAPBodyElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/soap/Name;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/soap/Name;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/Element;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParentElement", "(Ljavax/xml/soap/SOAPElement;)V", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/soap/SOAPBody");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/messaging/saaj/soap/impl/BodyElementImpl", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("SAAJ0101.impl.parent.of.body.elem.mustbe.body");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "severe", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/xml/soap/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Parent of a SOAPBodyElement has to be a SOAPBody");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/soap/SOAPException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "setParentElement", "(Ljavax/xml/soap/SOAPElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
