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
public class LeafBeanInfoImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "<BeanT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo<TBeanT;>;", "com/sun/xml/bind/v2/runtime/JaxBeanInfo", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "loader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "loaderWithSubst", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;", "Lcom/sun/xml/bind/v2/runtime/Transducer<TBeanT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo", "getClazz", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo", "getTypeNames", "()[Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo", "isElement", "()Z", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;Ljava/lang/Class;[Ljavax/xml/namespace/QName;ZZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo", "getTransducer", "()Lcom/sun/xml/bind/v2/runtime/Transducer;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/TextLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/TextLoader", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "loader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/XsiTypeLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/XsiTypeLoader", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "loaderWithSubst", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "isElement", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "nameBuilder", "Lcom/sun/xml/bind/v2/runtime/NameBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo", "getElementName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/NameBuilder", "createElementName", "(Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "com/sun/xml/bind/v2/model/runtime/RuntimeLeafInfo"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypeName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", "(TBeanT;)Ljavax/xml/namespace/QName;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "getTypeName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getTypeName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getElementNamespaceURI", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/Name", "nsUri", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getElementLocalName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/Name", "localName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInstance", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Ljava/lang/Object;", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)TBeanT;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "reset", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Z", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/unmarshaller/UnmarshallingContext;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getId", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Ljava/lang/String;", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "serializeBody", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "writeText", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/api/AccessorException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "reportError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "serializeAttributes", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "serializeRoot", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/helpers/ValidationEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/Messages", "UNABLE_TO_MARSHAL_NON_ELEMENT", "Lcom/sun/xml/bind/v2/runtime/Messages;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/helpers/ValidationEventImpl", "<init>", "(ILjava/lang/String;Ljavax/xml/bind/ValidationEventLocator;Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "reportError", "(Ljavax/xml/bind/ValidationEvent;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "startElement", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "childAsSoleContent", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "serializeURIs", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/xml/bind/api/AccessorException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "useNamespace", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "declareNamespace", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/api/AccessorException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "reportError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getLoader", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Z)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "loaderWithSubst", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "loader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransducer", "()Lcom/sun/xml/bind/v2/runtime/Transducer;", "()Lcom/sun/xml/bind/v2/runtime/Transducer<TBeanT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/LeafBeanInfoImpl", "xducer", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
