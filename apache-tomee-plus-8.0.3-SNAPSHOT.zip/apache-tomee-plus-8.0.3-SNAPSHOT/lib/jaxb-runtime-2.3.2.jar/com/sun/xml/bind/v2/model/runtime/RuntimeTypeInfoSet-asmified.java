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
public class RuntimeTypeInfoSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeTypeInfoSet", "Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/TypeInfoSet<Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;>;", "java/lang/Object", new String[] { "com/sun/xml/bind/v2/model/core/TypeInfoSet" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "arrays", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;+Lcom/sun/xml/bind/v2/model/runtime/RuntimeArrayInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beans", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;+Lcom/sun/xml/bind/v2/model/runtime/RuntimeClassInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "builtins", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/reflect/Type;+Lcom/sun/xml/bind/v2/model/runtime/RuntimeBuiltinLeafInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "enums", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;+Lcom/sun/xml/bind/v2/model/runtime/RuntimeEnumLeafInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeInfo", "(Ljava/lang/reflect/Type;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnyTypeInfo", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassInfo", "(Ljava/lang/Class;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementInfo", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/model/runtime/RuntimeElementInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementMappings", "(Ljava/lang/Class;)Ljava/util/Map;", "(Ljava/lang/Class;)Ljava/util/Map<Ljavax/xml/namespace/QName;+Lcom/sun/xml/bind/v2/model/runtime/RuntimeElementInfo;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllElements", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<+Lcom/sun/xml/bind/v2/model/runtime/RuntimeElementInfo;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
