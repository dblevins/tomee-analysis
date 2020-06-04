package asm.org.apache.webbeans.configurator;
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
public class AnnotatedTypeConfiguratorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "originalAnnotatedType", "Ljakarta/enterprise/inject/spi/AnnotatedType;", "Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotatedConstructorConfigurators", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotatedMethodConfigurators", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<-TT;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotatedFieldConfigurators", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<-TT;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/AnnotatedType;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "originalAnnotatedType", "Ljakarta/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/AnnotatedTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljakarta/enterprise/inject/spi/AnnotatedType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "getConstructors", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "lambda$new$0", "(Ljakarta/enterprise/inject/spi/AnnotatedConstructor;)Lorg/apache/webbeans/configurator/AnnotatedConstructorConfiguratorImpl;", false), Type.getType("(Ljakarta/enterprise/inject/spi/AnnotatedConstructor;)Lorg/apache/webbeans/configurator/AnnotatedConstructorConfiguratorImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toSet", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedConstructorConfigurators", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "getMethods", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "lambda$new$1", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl;", false), Type.getType("(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toSet", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedMethodConfigurators", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "getFields", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "lambda$new$2", "(Ljakarta/enterprise/inject/spi/AnnotatedField;)Lorg/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl;", false), Type.getType("(Ljakarta/enterprise/inject/spi/AnnotatedField;)Lorg/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toSet", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedFieldConfigurators", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedType;", "()Ljakarta/enterprise/inject/spi/AnnotatedType<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "originalAnnotatedType", "Ljakarta/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "addAnnotation", "(Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "getAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "removeIf", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedTypeImpl", "clearAnnotations", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "methods", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedMethodConfigurators", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fields", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedFieldConfigurators", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constructors", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "annotatedConstructorConfigurators", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewAnnotatedType", "()Lorg/apache/webbeans/portable/AnnotatedTypeImpl;", "()Lorg/apache/webbeans/portable/AnnotatedTypeImpl<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedTypeConfiguratorImpl", "newAnnotatedType", "Lorg/apache/webbeans/portable/AnnotatedTypeImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$2", "(Ljakarta/enterprise/inject/spi/AnnotatedField;)Lorg/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/portable/AnnotatedFieldImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "<init>", "(Lorg/apache/webbeans/portable/AnnotatedFieldImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$1", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/portable/AnnotatedMethodImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "<init>", "(Lorg/apache/webbeans/portable/AnnotatedMethodImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(Ljakarta/enterprise/inject/spi/AnnotatedConstructor;)Lorg/apache/webbeans/configurator/AnnotatedConstructorConfiguratorImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/AnnotatedConstructorConfiguratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/portable/AnnotatedConstructorImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/AnnotatedConstructorConfiguratorImpl", "<init>", "(Lorg/apache/webbeans/portable/AnnotatedConstructorImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
