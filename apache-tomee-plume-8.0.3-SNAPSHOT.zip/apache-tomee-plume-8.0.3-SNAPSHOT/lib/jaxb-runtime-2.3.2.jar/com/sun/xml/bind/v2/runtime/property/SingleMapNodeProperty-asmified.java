package asm.com.sun.xml.bind.v2.runtime.property;
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
public class SingleMapNodePropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "<BeanT:Ljava/lang/Object;ValueT::Ljava/util/Map;>Lcom/sun/xml/bind/v2/runtime/property/PropertyImpl<TBeanT;>;", "com/sun/xml/bind/v2/runtime/property/PropertyImpl", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$Stack", "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "Stack", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$ReceiverImpl", "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "ReceiverImpl", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$2", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TValueT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "entryTag", "Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyTag", "Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "valueTag", "Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nillable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "valueBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mapImplClass", "Ljava/lang/Class;", "Ljava/lang/Class<+TValueT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "knownImplClasses", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "valueLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "itemsLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "entryLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "keyReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "valueReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$1", "<init>", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "itemsLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$2", "<init>", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "entryLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "getAccessor", "()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "optimize", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "nameBuilder", "Lcom/sun/xml/bind/v2/runtime/NameBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "getXmlName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/NameBuilder", "createElementName", "(Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "nameBuilder", "Lcom/sun/xml/bind/v2/runtime/NameBuilder;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("entry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/NameBuilder", "createElementName", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "entryTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "nameBuilder", "Lcom/sun/xml/bind/v2/runtime/NameBuilder;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("key");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/NameBuilder", "createElementName", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "nameBuilder", "Lcom/sun/xml/bind/v2/runtime/NameBuilder;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/NameBuilder", "createElementName", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "isCollectionNillable", "()Z", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "nillable", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "getKeyType", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "getOrCreate", "(Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;)Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "getValueType", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JAXBContextImpl", "getOrCreate", "(Lcom/sun/xml/bind/v2/model/runtime/RuntimeTypeInfo;)Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/Utils", "REFLECTION_NAVIGATOR", "Lcom/sun/xml/bind/v2/model/nav/Navigator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeMapPropertyInfo", "getRawType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/nav/Navigator", "erasure", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "knownImplClasses", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/ClassFactory", "inferImplClass", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "mapImplClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Ljava/lang/Object;)V", "(TBeanT;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIdValue", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Lcom/sun/xml/bind/v2/model/core/PropertyKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/core/PropertyKind", "MAP", "Lcom/sun/xml/bind/v2/model/core/PropertyKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildChildElementUnmarshallers", "(Lcom/sun/xml/bind/v2/runtime/property/UnmarshallerChain;Lcom/sun/xml/bind/v2/util/QNameMap;)V", "(Lcom/sun/xml/bind/v2/runtime/property/UnmarshallerChain;Lcom/sun/xml/bind/v2/util/QNameMap<Lcom/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/UnmarshallerChain", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getLoader", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Z)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/UnmarshallerChain", "context", "Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/JaxBeanInfo", "getLoader", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Z)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "itemsLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader", "<init>", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/util/QNameMap", "put", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serializeBody", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;)V", new String[] { "org/xml/sax/SAXException", "com/sun/xml/bind/api/AccessorException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "bareStartTag", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "entryTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "bareStartTag", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "startElement", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "fieldName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "childAsXsiType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "startElement", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "fieldName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueBeanInfo", "Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "childAsXsiType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/sun/xml/bind/v2/runtime/JaxBeanInfo;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "java/lang/Object", "com/sun/xml/bind/v2/runtime/XMLSerializer", "java/lang/Object", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "nillable", "Z");
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "startElement", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "writeXsiNilTrue", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endElement", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "bareStartTag", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "startElement", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endNamespaceDecls", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "endAttributes", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementPropertyAccessor", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "tagName", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/Name", "equals", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "mapImplClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "entryTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "entryLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueTag", "Lcom/sun/xml/bind/v2/runtime/Name;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lcom/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty;)Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueLoader", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "()Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/HashMap;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/TreeMap;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/LinkedHashMap;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "knownImplClasses", "[Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$ReceiverImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$ReceiverImpl", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "keyReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$ReceiverImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty$ReceiverImpl", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/runtime/property/SingleMapNodeProperty", "valueReceiver", "Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
