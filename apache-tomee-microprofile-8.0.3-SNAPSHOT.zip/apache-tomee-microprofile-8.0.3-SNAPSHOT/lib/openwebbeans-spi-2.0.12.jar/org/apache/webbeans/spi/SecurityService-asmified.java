package asm.org.apache.webbeans.spi;
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
public class SecurityServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/webbeans/spi/SecurityService", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "doPrivilegedGetDeclaredConstructor", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "doPrivilegedGetConstructor", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Constructor<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetDeclaredConstructors", "(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Constructor<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "doPrivilegedGetDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetDeclaredMethods", "(Ljava/lang/Class;)[Ljava/lang/reflect/Method;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Method;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljava/lang/reflect/Field;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetDeclaredFields", "(Ljava/lang/Class;)[Ljava/lang/reflect/Field;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)[Ljava/lang/reflect/Field;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedSetAccessible", "(Ljava/lang/reflect/AccessibleObject;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedIsAccessible", "(Ljava/lang/reflect/AccessibleObject;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedObjectCreate", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", new String[] { "java/security/PrivilegedActionException", "java/lang/IllegalAccessException", "java/lang/InstantiationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedSetSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetSystemProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "doPrivilegedGetSystemProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
