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
public class ValuePropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "<BeanT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/property/PropertyImpl<TBeanT;>;", "com/sun/xml/bind/v2/runtime/property/PropertyImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor<TBeanT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeValuePropertyInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "<init>", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "get", "(Lcom/sun/xml/bind/v2/runtime/JAXBContextImpl;Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElementRef;)Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeValuePropertyInfo", "getAccessor", "()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "serializeBody", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;)V", new String[] { "org/xml/sax/SAXException", "com/sun/xml/bind/api/AccessorException", "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "hasValue", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "fieldName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "writeText", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serializeURIs", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "org/xml/sax/SAXException", "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "declareNamespace", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasSerializeURIAction", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "useNamespace", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildChildElementUnmarshallers", "(Lcom/sun/xml/bind/v2/runtime/property/UnmarshallerChain;Lcom/sun/xml/bind/v2/util/QNameMap;)V", "(Lcom/sun/xml/bind/v2/runtime/property/UnmarshallerChain;Lcom/sun/xml/bind/v2/util/QNameMap<Lcom/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/runtime/property/StructureLoaderBuilder", "TEXT_HANDLER", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/unmarshaller/ValuePropertyLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/ValuePropertyLoader", "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/unmarshaller/ChildLoader", "<init>", "(Lcom/sun/xml/bind/v2/runtime/unmarshaller/Loader;Lcom/sun/xml/bind/v2/runtime/unmarshaller/Receiver;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/util/QNameMap", "put", "(Ljavax/xml/namespace/QName;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Lcom/sun/xml/bind/v2/model/core/PropertyKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/core/PropertyKind", "VALUE", "Lcom/sun/xml/bind/v2/model/core/PropertyKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Ljava/lang/Object;)V", "(TBeanT;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "acc", "Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIdValue", "(Ljava/lang/Object;)Ljava/lang/String;", "(TBeanT;)Ljava/lang/String;", new String[] { "com/sun/xml/bind/api/AccessorException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/property/ValueProperty", "xacc", "Lcom/sun/xml/bind/v2/runtime/reflect/TransducedAccessor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/TransducedAccessor", "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getFieldName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "getFieldName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setHiddenByOverride", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "setHiddenByOverride", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isHiddenByOverride", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "isHiddenByOverride", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "wrapUp", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "wrapUp", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getElementPropertyAccessor", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "getElementPropertyAccessor", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getInfo", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/property/PropertyImpl", "getInfo", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
