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
public class ReflectionUtils$DeclaredMethodsIODH$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH$1", "Ljava/lang/Object;Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate<[Ljava/lang/reflect/Method;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/ReflectionUtils$Predicate" });

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH", "org/eclipse/persistence/jaxb/ReflectionUtils", "DeclaredMethodsIODH", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/ReflectionUtils$Predicate", "org/eclipse/persistence/jaxb/ReflectionUtils", "Predicate", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "clazz", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Ljava/lang/Class;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate;", "(Ljava/lang/Class<*>;)Lorg/eclipse/persistence/jaxb/ReflectionUtils$Predicate<[Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH$1", "clazz", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()[Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH$1", "clazz", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/ReflectionUtils", "access$2", "(Ljava/lang/Class;)[Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/ReflectionUtils$DeclaredMethodsIODH$1", "run", "()[Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
