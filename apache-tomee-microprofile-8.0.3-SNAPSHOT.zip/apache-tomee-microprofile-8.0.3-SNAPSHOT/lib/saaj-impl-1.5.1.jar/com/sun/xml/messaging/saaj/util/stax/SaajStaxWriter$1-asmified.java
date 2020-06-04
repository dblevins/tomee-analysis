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
public class SaajStaxWriter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", null, "java/lang/Object", new String[] { "javax/xml/namespace/NamespaceContext" });

classWriter.visitOuterClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;");

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", "this$0", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", "this$0", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljavax/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/soap/SOAPElement", "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1", "this$0", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter", "currentElement", "Ljavax/xml/soap/SOAPElement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/soap/SOAPElement", "lookupPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefixes", "(Ljava/lang/String;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1$1", "<init>", "(Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriter$1;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
