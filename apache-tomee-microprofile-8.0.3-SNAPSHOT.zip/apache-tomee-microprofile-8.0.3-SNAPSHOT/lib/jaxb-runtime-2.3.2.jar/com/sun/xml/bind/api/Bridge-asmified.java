package asm.com.sun.xml.bind.api;
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
public class BridgeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/sun/xml/bind/api/Bridge", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "()Lcom/sun/xml/bind/api/JAXBRIContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;)V", "(TT;Ljavax/xml/stream/XMLStreamWriter;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", "(TT;Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;)V", "(Lcom/sun/xml/bind/api/BridgeContext;TT;Ljavax/xml/stream/XMLStreamWriter;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "marshaller", "Lcom/sun/xml/bind/v2/runtime/MarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/stream/XMLStreamWriter;)V", "(Ljavax/xml/bind/Marshaller;TT;Ljavax/xml/stream/XMLStreamWriter;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshal", "(Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", "(TT;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshal", "(Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", "(TT;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", "(Lcom/sun/xml/bind/api/BridgeContext;TT;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(4, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "marshaller", "Lcom/sun/xml/bind/v2/runtime/MarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", "(Ljavax/xml/bind/Marshaller;TT;Ljava/io/OutputStream;Ljavax/xml/namespace/NamespaceContext;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(4, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Lorg/w3c/dom/Node;)V", "(TT;Lorg/w3c/dom/Node;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/lang/Object;Lorg/w3c/dom/Node;)V", "(Lcom/sun/xml/bind/api/BridgeContext;TT;Lorg/w3c/dom/Node;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "marshaller", "Lcom/sun/xml/bind/v2/runtime/MarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/w3c/dom/Node;)V", "(Ljavax/xml/bind/Marshaller;TT;Lorg/w3c/dom/Node;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Lorg/xml/sax/ContentHandler;)V", "(TT;Lorg/xml/sax/ContentHandler;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljava/lang/Object;Lorg/xml/sax/ContentHandler;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Lorg/xml/sax/ContentHandler;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", "(TT;Lorg/xml/sax/ContentHandler;Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/xml/sax/ContentHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Marshaller", "setAttachmentMarshaller", "(Ljavax/xml/bind/attachment/AttachmentMarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/lang/Object;Lorg/xml/sax/ContentHandler;)V", "(Lcom/sun/xml/bind/api/BridgeContext;TT;Lorg/xml/sax/ContentHandler;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "marshaller", "Lcom/sun/xml/bind/v2/runtime/MarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/xml/sax/ContentHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Lorg/xml/sax/ContentHandler;)V", "(Ljavax/xml/bind/Marshaller;TT;Lorg/xml/sax/ContentHandler;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Ljava/lang/Object;Ljavax/xml/transform/Result;)V", "(TT;Ljavax/xml/transform/Result;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "marshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "marshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", "(Lcom/sun/xml/bind/api/BridgeContext;TT;Ljavax/xml/transform/Result;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "marshaller", "Lcom/sun/xml/bind/v2/runtime/MarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshal", "(Ljavax/xml/bind/Marshaller;Ljava/lang/Object;Ljavax/xml/transform/Result;)V", "(Ljavax/xml/bind/Marshaller;TT;Ljavax/xml/transform/Result;)V", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "exit", "(Ljava/lang/Object;Ljavax/xml/bind/Unmarshaller;)Ljava/lang/Object;", "(TT;Ljavax/xml/bind/Unmarshaller;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Unmarshaller", "setAttachmentUnmarshaller", "(Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "unmarshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "recycle", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", "(Ljavax/xml/stream/XMLStreamReader;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "unmarshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Unmarshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Unmarshaller", "setAttachmentUnmarshaller", "(Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/Bridge", "exit", "(Ljava/lang/Object;Ljavax/xml/bind/Unmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/api/BridgeContext;Ljavax/xml/stream/XMLStreamReader;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "unmarshaller", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/stream/XMLStreamReader;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Ljavax/xml/transform/Source;)Ljava/lang/Object;", "(Ljavax/xml/transform/Source;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/transform/Source;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Ljavax/xml/transform/Source;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", "(Ljavax/xml/transform/Source;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "unmarshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Unmarshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Unmarshaller", "setAttachmentUnmarshaller", "(Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/transform/Source;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/Bridge", "exit", "(Ljava/lang/Object;Ljavax/xml/bind/Unmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljavax/xml/transform/Source;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/api/BridgeContext;Ljavax/xml/transform/Source;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "unmarshaller", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/transform/Source;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/transform/Source;)Ljava/lang/Object;", "(Ljavax/xml/bind/Unmarshaller;Ljavax/xml/transform/Source;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Ljava/io/InputStream;)Ljava/lang/Object;", "(Ljava/io/InputStream;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "unmarshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Unmarshaller");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/Bridge", "exit", "(Ljava/lang/Object;Ljavax/xml/bind/Unmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/io/InputStream;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/api/BridgeContext;Ljava/io/InputStream;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "unmarshaller", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Ljava/io/InputStream;)Ljava/lang/Object;", "(Ljavax/xml/bind/Unmarshaller;Ljava/io/InputStream;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lorg/w3c/dom/Node;)Ljava/lang/Object;", "(Lorg/w3c/dom/Node;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Lorg/w3c/dom/Node;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lorg/w3c/dom/Node;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)Ljava/lang/Object;", "(Lorg/w3c/dom/Node;Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/Nullable;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/api/Bridge", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "unmarshallerPool", "Lcom/sun/istack/Pool;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/istack/Pool", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/Unmarshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/Unmarshaller", "setAttachmentUnmarshaller", "(Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Lorg/w3c/dom/Node;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/api/Bridge", "exit", "(Ljava/lang/Object;Ljavax/xml/bind/Unmarshaller;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "unmarshal", "(Lcom/sun/xml/bind/api/BridgeContext;Lorg/w3c/dom/Node;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/api/BridgeContext;Lorg/w3c/dom/Node;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/BridgeContextImpl");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/BridgeContextImpl", "unmarshaller", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallerImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/api/Bridge", "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Lorg/w3c/dom/Node;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/bind/Unmarshaller;Lorg/w3c/dom/Node;)Ljava/lang/Object;", "(Ljavax/xml/bind/Unmarshaller;Lorg/w3c/dom/Node;)TT;", new String[] { "javax/xml/bind/JAXBException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeReference", "()Lcom/sun/xml/bind/api/TypeReference;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
