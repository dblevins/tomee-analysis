package asm.org.eclipse.persistence.jaxb;
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
public class ReflectionUtils$ForNameIODH$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH$1", "Ljava/lang/Object;Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException<Ljava/lang/Class<*>;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException" });

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH", "org/eclipse/persistence/jaxb/ReflectionUtils", "ForNameIODH", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException", "org/eclipse/persistence/jaxb/ReflectionUtils", "PredicateWithException", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "clazz", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException;", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH$1", "clazz", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/lang/Class;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException;", "(Ljava/lang/Class<*>;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "([Ljava/lang/Class;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException;", "([Ljava/lang/Class<*>;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$PredicateWithException<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", new String[] { "java/lang/NoSuchMethodException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH$1", "clazz", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/ReflectionUtils", "access$0", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/ReflectionUtils$ForNameIODH$1", "run", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
