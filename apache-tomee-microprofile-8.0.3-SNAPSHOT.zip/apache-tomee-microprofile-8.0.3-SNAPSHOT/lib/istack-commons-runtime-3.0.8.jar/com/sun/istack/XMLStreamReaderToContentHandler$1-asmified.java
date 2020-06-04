package asm.com.sun.istack;
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
public class XMLStreamReaderToContentHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/istack/XMLStreamReaderToContentHandler$1", null, "java/lang/Object", new String[] { "org/xml/sax/Locator" });

classWriter.visitOuterClass("com/sun/istack/XMLStreamReaderToContentHandler", "handleStartDocument", "()V");

classWriter.visitInnerClass("com/sun/istack/XMLStreamReaderToContentHandler$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/istack/XMLStreamReaderToContentHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/istack/XMLStreamReaderToContentHandler$1", "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnNumber", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/istack/XMLStreamReaderToContentHandler$1", "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/istack/XMLStreamReaderToContentHandler", "access$000", "(Lcom/sun/istack/XMLStreamReaderToContentHandler;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getLocation", "()Ljavax/xml/stream/Location;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/Location", "getColumnNumber", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLineNumber", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/istack/XMLStreamReaderToContentHandler$1", "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/istack/XMLStreamReaderToContentHandler", "access$000", "(Lcom/sun/istack/XMLStreamReaderToContentHandler;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getLocation", "()Ljavax/xml/stream/Location;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/Location", "getLineNumber", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPublicId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/istack/XMLStreamReaderToContentHandler$1", "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/istack/XMLStreamReaderToContentHandler", "access$000", "(Lcom/sun/istack/XMLStreamReaderToContentHandler;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getLocation", "()Ljavax/xml/stream/Location;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/Location", "getPublicId", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSystemId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/istack/XMLStreamReaderToContentHandler$1", "this$0", "Lcom/sun/istack/XMLStreamReaderToContentHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/istack/XMLStreamReaderToContentHandler", "access$000", "(Lcom/sun/istack/XMLStreamReaderToContentHandler;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "getLocation", "()Ljavax/xml/stream/Location;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/Location", "getSystemId", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
