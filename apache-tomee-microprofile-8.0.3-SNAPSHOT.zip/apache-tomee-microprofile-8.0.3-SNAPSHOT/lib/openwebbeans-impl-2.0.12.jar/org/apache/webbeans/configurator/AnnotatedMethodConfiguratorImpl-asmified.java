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
public class AnnotatedMethodConfiguratorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedParameterConfigurators", "Ljava/util/List;", "Ljava/util/List<Ljavax/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator<TT;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/portable/AnnotatedMethodImpl;)V", "(Lorg/apache/webbeans/portable/AnnotatedMethodImpl<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedMethodImpl", "getParameters", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "lambda$new$0", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/webbeans/configurator/AnnotatedParameterConfiguratorImpl;", false), Type.getType("(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/webbeans/configurator/AnnotatedParameterConfiguratorImpl;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedParameterConfigurators", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedMethod;", "()Ljavax/enterprise/inject/spi/AnnotatedMethod<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedMethodImpl", "addAnnotation", "(Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/util/function/Predicate;)Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;", "(Ljava/util/function/Predicate<Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedMethodImpl", "getAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "removeIf", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator;", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedMethodConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedMethod", "Lorg/apache/webbeans/portable/AnnotatedMethodImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedMethodImpl", "getAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "params", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/enterprise/inject/spi/configurator/AnnotatedParameterConfigurator<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedMethodConfiguratorImpl", "annotatedParameterConfigurators", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Lorg/apache/webbeans/configurator/AnnotatedParameterConfiguratorImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/AnnotatedParameterConfiguratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/AnnotatedParameterConfiguratorImpl", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
