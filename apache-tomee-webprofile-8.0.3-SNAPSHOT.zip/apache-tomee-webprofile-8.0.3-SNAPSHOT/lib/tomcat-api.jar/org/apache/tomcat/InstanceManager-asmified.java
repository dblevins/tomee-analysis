package asm.org.apache.tomcat;
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
public class InstanceManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/tomcat/InstanceManager", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newInstance", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class<*>;)Ljava/lang/Object;", new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "javax/naming/NamingException", "java/lang/InstantiationException", "java/lang/IllegalArgumentException", "java/lang/NoSuchMethodException", "java/lang/SecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newInstance", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "javax/naming/NamingException", "java/lang/InstantiationException", "java/lang/ClassNotFoundException", "java/lang/IllegalArgumentException", "java/lang/NoSuchMethodException", "java/lang/SecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newInstance", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "javax/naming/NamingException", "java/lang/InstantiationException", "java/lang/ClassNotFoundException", "java/lang/IllegalArgumentException", "java/lang/NoSuchMethodException", "java/lang/SecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newInstance", "(Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException", "javax/naming/NamingException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroyInstance", "(Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalAccessException", "java/lang/reflect/InvocationTargetException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "backgroundProcess", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
