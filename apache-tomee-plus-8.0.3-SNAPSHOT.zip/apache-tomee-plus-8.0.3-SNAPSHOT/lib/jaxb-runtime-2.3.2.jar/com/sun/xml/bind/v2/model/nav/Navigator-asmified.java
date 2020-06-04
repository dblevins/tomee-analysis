package asm.com.sun.xml.bind.v2.model.nav;
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
public class NavigatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/nav/Navigator", "<T:Ljava/lang/Object;C:Ljava/lang/Object;F:Ljava/lang/Object;M:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSuperClass", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TC;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBaseClass", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(TT;TC;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TC;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TT;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassShortName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TC;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredFields", "(Ljava/lang/Object;)Ljava/util/Collection;", "(TC;)Ljava/util/Collection<+TF;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredField", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "(TC;Ljava/lang/String;)TF;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredMethods", "(Ljava/lang/Object;)Ljava/util/Collection;", "(TC;)Ljava/util/Collection<+TM;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaringClassForField", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TF;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaringClassForMethod", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TM;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldType", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TF;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TF;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TM;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getReturnType", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TM;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodParameters", "(Ljava/lang/Object;)[Ljava/lang/Object;", "(TM;)[TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStaticMethod", "(Ljava/lang/Object;)Z", "(TM;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSubClassOf", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "(TT;TT;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ref", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "use", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TC;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asDecl", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TT;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asDecl", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isArray", "(Ljava/lang/Object;)Z", "(TT;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isArrayButNotByteArray", "(Ljava/lang/Object;)Z", "(TT;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getComponentType", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TT;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeArgument", "(Ljava/lang/Object;I)Ljava/lang/Object;", "(TT;I)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isParameterizedType", "(Ljava/lang/Object;)Z", "(TT;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPrimitive", "(Ljava/lang/Object;)Z", "(TT;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimitive", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassLocation", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/runtime/Location;", "(TC;)Lcom/sun/xml/bind/v2/runtime/Location;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldLocation", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/runtime/Location;", "(TF;)Lcom/sun/xml/bind/v2/runtime/Location;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMethodLocation", "(Ljava/lang/Object;)Lcom/sun/xml/bind/v2/runtime/Location;", "(TM;)Lcom/sun/xml/bind/v2/runtime/Location;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasDefaultConstructor", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStaticField", "(Ljava/lang/Object;)Z", "(TF;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPublicMethod", "(Ljava/lang/Object;)Z", "(TM;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFinalMethod", "(Ljava/lang/Object;)Z", "(TM;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPublicField", "(Ljava/lang/Object;)Z", "(TF;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEnum", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "erasure", "(Ljava/lang/Object;)Ljava/lang/Object;", "<P:Ljava/lang/Object;>(TT;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAbstract", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFinal", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEnumConstants", "(Ljava/lang/Object;)[Ljava/lang/Object;", "(TC;)[TF;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVoidType", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPackageName", "(Ljava/lang/Object;)Ljava/lang/String;", "(TC;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "loadObjectFactory", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "(TC;Ljava/lang/String;)TC;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isBridgeMethod", "(Ljava/lang/Object;)Z", "(TM;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isOverriding", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "(TM;TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInterface", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isTransient", "(Ljava/lang/Object;)Z", "(TF;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInnerClass", "(Ljava/lang/Object;)Z", "(TC;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSameType", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "(TT;TT;)Z", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
