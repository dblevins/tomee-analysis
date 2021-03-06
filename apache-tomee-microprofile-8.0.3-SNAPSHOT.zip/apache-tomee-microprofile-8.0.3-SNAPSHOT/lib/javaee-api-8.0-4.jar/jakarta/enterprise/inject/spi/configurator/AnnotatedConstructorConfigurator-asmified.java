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
public class AnnotatedConstructorConfiguratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedConstructor;", "()Ljakarta/enterprise/inject/spi/AnnotatedConstructor<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;", "(Ljava/util/function/Predicate<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;", "()Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "lambda$removeAll$0", "(Ljava/lang/annotation/Annotation;)Z", true), Type.getType("(Ljava/lang/annotation/Annotation;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "remove", "(Ljava/util/function/Predicate;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "params", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filterParams", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", "(Ljava/util/function/Predicate<Ljakarta/enterprise/inject/spi/AnnotatedParameter<TT;>;>;)Ljava/util/stream/Stream<Ljakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "params", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "jakarta/enterprise/inject/spi/configurator/AnnotatedConstructorConfigurator", "lambda$filterParams$1", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator;)Z", true), Type.getType("(Ljakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$filterParams$1", "(Ljava/util/function/Predicate;Ljakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator", "getAnnotated", "()Ljakarta/enterprise/inject/spi/AnnotatedParameter;", true);
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
