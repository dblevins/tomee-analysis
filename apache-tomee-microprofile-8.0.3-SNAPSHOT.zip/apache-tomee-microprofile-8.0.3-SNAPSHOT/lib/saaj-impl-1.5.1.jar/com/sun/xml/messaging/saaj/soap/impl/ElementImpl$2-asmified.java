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
public class ElementImpl$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/w3c/dom/Node;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "getChildElementsFromDOM", "(Lorg/w3c/dom/Element;)Ljava/util/Iterator;");

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextNext", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "last", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "soapElement", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$el", "Lorg/w3c/dom/Element;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/messaging/saaj/soap/impl/ElementImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/impl/ElementImpl;Lorg/w3c/dom/Element;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "this$0", "Lcom/sun/xml/messaging/saaj/soap/impl/ElementImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "val$el", "Lorg/w3c/dom/Element;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "val$el", "Lorg/w3c/dom/Element;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getFirstChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "nextNext", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "this$0", "Lcom/sun/xml/messaging/saaj/soap/impl/ElementImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "getSoapDocument", "()Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "val$el", "Lorg/w3c/dom/Element;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "soapElement", "Lorg/w3c/dom/Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "nextNext", "Lorg/w3c/dom/Node;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "nextNext", "Lorg/w3c/dom/Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "soapElement", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/w3c/dom/Element");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "soapElement", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "convertToSoapElement", "(Lorg/w3c/dom/Element;)Ljavax/xml/soap/SOAPElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "soapElement", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/w3c/dom/CharacterData");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "soapElement", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/CharacterData");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl", "convertToSoapText", "(Lorg/w3c/dom/CharacterData;)Lcom/sun/xml/messaging/saaj/soap/impl/TextImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNextSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "nextNext", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "last", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "val$el", "Lorg/w3c/dom/Element;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "removeChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/ElementImpl$2", "next", "()Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
