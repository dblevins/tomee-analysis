package asm.com.sun.xml.bind.v2.model.core;
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
public class TypeInfoSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/core/TypeInfoSet", "<T:Ljava/lang/Object;C:Ljava/lang/Object;F:Ljava/lang/Object;M:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNavigator", "()Lcom/sun/xml/bind/v2/model/nav/Navigator;", "()Lcom/sun/xml/bind/v2/model/nav/Navigator<TT;TC;TF;TM;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeInfo", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/model/core/NonElement;", "(TT;)Lcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnyTypeInfo", "()Lcom/sun/xml/bind/v2/model/core/NonElement;", "()Lcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassInfo", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/model/core/NonElement;", "(TC;)Lcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "arrays", "()Ljava/util/Map;", "()Ljava/util/Map<+TT;+Lcom/sun/xml/bind/v2/model/core/ArrayInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beans", "()Ljava/util/Map;", "()Ljava/util/Map<TC;+Lcom/sun/xml/bind/v2/model/core/ClassInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "builtins", "()Ljava/util/Map;", "()Ljava/util/Map<TT;+Lcom/sun/xml/bind/v2/model/core/BuiltinLeafInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "enums", "()Ljava/util/Map;", "()Ljava/util/Map<TC;+Lcom/sun/xml/bind/v2/model/core/EnumLeafInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementInfo", "(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/model/core/ElementInfo;", "(TC;Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/model/core/ElementInfo<TT;TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeInfo", "(Lcom/sun/xml/bind/v2/model/core/Ref;)Lcom/sun/xml/bind/v2/model/core/NonElement;", "(Lcom/sun/xml/bind/v2/model/core/Ref<TT;TC;>;)Lcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementMappings", "(Ljava/lang/Object;)Ljava/util/Map;", "(TC;)Ljava/util/Map<Ljavax/xml/namespace/QName;+Lcom/sun/xml/bind/v2/model/core/ElementInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllElements", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<+Lcom/sun/xml/bind/v2/model/core/ElementInfo<TT;TC;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXmlNs", "(Ljava/lang/String;)Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchemaLocations", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementFormDefault", "(Ljava/lang/String;)Ljakarta/xml/bind/annotation/XmlNsForm;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeFormDefault", "(Ljava/lang/String;)Ljakarta/xml/bind/annotation/XmlNsForm;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "dump", "(Ljavax/xml/transform/Result;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
