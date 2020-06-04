package asm.com.sun.xml.bind.v2.runtime;
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
public class InternalBridgeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/bind/v2/runtime/InternalBridge", "<T:Ljava/lang/Object;>Lcom/sun/xml/bind/api/Bridge<TT;>;", "com/sun/xml/bind/api/Bridge", null);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/Bridge", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "()Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/InternalBridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "marshal", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getContext", "()Lcom/sun/xml/bind/api/JAXBRIContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/InternalBridge", "getContext", "()Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
