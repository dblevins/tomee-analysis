package asm.jakarta.enterprise.inject.se;
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
public class SeContainerInitializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/enterprise/inject/se/SeContainerInitializer", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "()Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/inject/se/SeContainerInitializer;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ServiceLoader", "load", "(Ljava/lang/Class;)Ljava/util/ServiceLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ServiceLoader", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No valid implementation of SeContainerInitializer found via ServiceLoader");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/enterprise/inject/se/SeContainerInitializer");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Multiple implementations of SeContainerInitializer found via ServiceLoader");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/enterprise/inject/se/SeContainerInitializer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addBeanClasses", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addPackages", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addPackages", "(Z[Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "(Z[Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addPackages", "([Ljava/lang/Package;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addPackages", "(Z[Ljava/lang/Package;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addExtensions", "([Ljakarta/enterprise/inject/spi/Extension;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addExtensions", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<+Ljakarta/enterprise/inject/spi/Extension;>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "enableInterceptors", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "enableDecorators", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "selectAlternatives", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "selectAlternativeStereotypes", "([Ljava/lang/Class;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "([Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperties", "(Ljava/util/Map;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "disableDiscovery", "()Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setClassLoader", "(Ljava/lang/ClassLoader;)Ljakarta/enterprise/inject/se/SeContainerInitializer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "()Ljakarta/enterprise/inject/se/SeContainer;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
