package asm.jakarta.enterprise.inject.spi.configurator;
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
public class AnnotatedTypeConfiguratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedType;", "()Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "(Ljava/util/function/Predicate<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "lambda$removeAll$0", "(Ljava/lang/annotation/Annotation;)Z", true), Type.getType("(Ljava/lang/annotation/Annotation;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "remove", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "methods", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<-TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filterMethods", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", "(Ljava/util/function/Predicate<Ljakarta/enterprise/inject/spi/AnnotatedMethod<-TT;>;>;)Ljava/util/stream/Stream<Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "methods", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "lambda$filterMethods$1", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)Z", true), Type.getType("(Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fields", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<-TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filterFields", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", "(Ljava/util/function/Predicate<Ljakarta/enterprise/inject/spi/AnnotatedField<-TT;>;>;)Ljava/util/stream/Stream<Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "fields", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "lambda$filterFields$2", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;)Z", true), Type.getType("(Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "constructors", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filterConstructors", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", "(Ljava/util/function/Predicate<Ljakarta/enterprise/inject/spi/AnnotatedConstructor<TT;>;>;)Ljava/util/stream/Stream<Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "constructors", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator", "lambda$filterConstructors$3", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;)Z", true), Type.getType("(Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$filterConstructors$3", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedConstructor;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "test", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$filterFields$2", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator", "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedField;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "test", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$filterMethods$1", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator", "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedMethod;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "test", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$removeAll$0", "(Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
