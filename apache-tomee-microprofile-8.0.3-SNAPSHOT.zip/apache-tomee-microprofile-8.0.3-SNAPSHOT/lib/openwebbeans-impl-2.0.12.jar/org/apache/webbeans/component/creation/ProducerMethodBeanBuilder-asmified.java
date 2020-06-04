package asm.org.apache.webbeans.component.creation;
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
public class ProducerMethodBeanBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/component/creation/AbstractProducerBeanBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;Lorg/apache/webbeans/component/ProducerMethodBean<TT;>;>;", "org/apache/webbeans/component/creation/AbstractProducerBeanBuilder", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/BeanAttributes;)V", "(Lorg/apache/webbeans/component/InjectionTargetBean<TT;>;Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/AbstractProducerBeanBuilder", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/AnnotatedMember;Ljavax/enterprise/inject/spi/BeanAttributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ProducerMethodBean;", "<P:Ljava/lang/Object;>(Lorg/apache/webbeans/component/InjectionTargetBean<TP;>;Ljava/lang/Class<TT;>;)Lorg/apache/webbeans/component/ProducerMethodBean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedMethod");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/ProducerMethodBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/MethodProducerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/InjectionTargetBean", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/MethodProducerFactory", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ProducerMethodBean", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Lorg/apache/webbeans/component/creation/MethodProducerFactory;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBean", "()Lorg/apache/webbeans/component/ProducerMethodBean;", "()Lorg/apache/webbeans/component/ProducerMethodBean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedMethod");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getJavaMember", "()Ljava/lang/reflect/Method;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "createBean", "(Ljava/lang/Class;)Lorg/apache/webbeans/component/AbstractProducerBean;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/component/ProducerMethodBean");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "()V", null, new String[] { "javax/enterprise/inject/spi/DefinitionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/AbstractProducerBeanBuilder", "validate", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedMethod");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getParameters", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedParameter");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedParameter", "getBaseType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/Bean;"));
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/ClassUtil", "getClass", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedMethod");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedMethod", "getBaseType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/ClassUtil", "getActualTypeArguments", "(Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Type parameter of the injected bean must be the same as the return type. Producer method: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/AbstractProducerBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ProducerMethodBeanBuilder", "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ProducerMethodBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
