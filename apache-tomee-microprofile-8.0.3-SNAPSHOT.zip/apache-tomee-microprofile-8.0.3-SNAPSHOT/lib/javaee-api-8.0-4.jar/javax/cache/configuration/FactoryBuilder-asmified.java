package asm.javax.cache.configuration;
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
public class FactoryBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/cache/configuration/FactoryBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/cache/configuration/FactoryBuilder$SingletonFactory", "javax/cache/configuration/FactoryBuilder", "SingletonFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/cache/configuration/FactoryBuilder$ClassFactory", "javax/cache/configuration/FactoryBuilder", "ClassFactory", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "factoryOf", "(Ljava/lang/Class;)Ljavax/cache/configuration/Factory;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/cache/configuration/Factory<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/cache/configuration/FactoryBuilder$ClassFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/cache/configuration/FactoryBuilder$ClassFactory", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "factoryOf", "(Ljava/lang/String;)Ljavax/cache/configuration/Factory;", "<T:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/cache/configuration/Factory<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/cache/configuration/FactoryBuilder$ClassFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/cache/configuration/FactoryBuilder$ClassFactory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "factoryOf", "(Ljava/io/Serializable;)Ljavax/cache/configuration/Factory;", "<T::Ljava/io/Serializable;>(TT;)Ljavax/cache/configuration/Factory<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/cache/configuration/FactoryBuilder$SingletonFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/cache/configuration/FactoryBuilder$SingletonFactory", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
