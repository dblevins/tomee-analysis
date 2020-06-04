package asm.com.sun.xml.bind.v2.model.runtime;
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
public class RuntimeClassInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeClassInfo", "Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/ClassInfo<Ljava/lang/reflect/Type;Ljava/lang/Class;>;Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", "java/lang/Object", new String[] { "com/sun/xml/bind/v2/model/core/ClassInfo", "com/sun/xml/bind/v2/model/runtime/RuntimeNonElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBaseClass", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeClassInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperties", "()Ljava/util/List;", "()Ljava/util/List<+Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperty", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/model/runtime/RuntimePropertyInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFactoryMethod", "()Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeWildcard", "()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", "<BeanT:Ljava/lang/Object;>()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;Ljava/util/Map<Ljavax/xml/namespace/QName;Ljava/lang/String;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocatorField", "()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;", "<BeanT:Ljava/lang/Object;>()Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;Lorg/xml/sax/Locator;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
