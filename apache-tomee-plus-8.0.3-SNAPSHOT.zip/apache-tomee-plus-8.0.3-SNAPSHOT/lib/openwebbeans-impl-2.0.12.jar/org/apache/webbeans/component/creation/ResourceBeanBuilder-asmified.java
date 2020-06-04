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
public class ResourceBeanBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "<T:Ljava/lang/Object;R::Ljava/lang/annotation/Annotation;>Lorg/apache/webbeans/component/creation/ProducerFieldBeanBuilder<TT;Lorg/apache/webbeans/component/ResourceBean<TT;TR;>;>;", "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceRef", "Lorg/apache/webbeans/spi/api/ResourceReference;", "Lorg/apache/webbeans/spi/api/ResourceReference<TT;TR;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Lorg/apache/webbeans/spi/api/ResourceReference;Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/BeanAttributes;)V", "(Lorg/apache/webbeans/component/InjectionTargetBean<*>;Lorg/apache/webbeans/spi/api/ResourceReference<TT;TR;>;Ljavax/enterprise/inject/spi/AnnotatedField<*>;Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/BeanAttributes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "resourceRef", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ResourceBean;", "<X:Ljava/lang/Object;>(Lorg/apache/webbeans/component/InjectionTargetBean<TX;>;Ljava/lang/Class<TT;>;)Lorg/apache/webbeans/component/ResourceBean<TT;TR;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/ResourceBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "resourceRef", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/ResourceProducerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/Dependent;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanAttributes", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/component/creation/ResourceBeanBuilder", "org/apache/webbeans/component/InjectionTargetBean", "java/lang/Class"}, 8, new Object[] {label0, label0, "org/apache/webbeans/component/InjectionTargetBean", "org/apache/webbeans/spi/api/ResourceReference", "javax/enterprise/inject/spi/BeanAttributes", "java/lang/Class", label1, label1});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/component/creation/ResourceBeanBuilder", "org/apache/webbeans/component/InjectionTargetBean", "java/lang/Class"}, 9, new Object[] {label0, label0, "org/apache/webbeans/component/InjectionTargetBean", "org/apache/webbeans/spi/api/ResourceReference", "javax/enterprise/inject/spi/BeanAttributes", "java/lang/Class", label1, label1, Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/ResourceProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "resourceRef", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/InjectionTargetBean", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ResourceProvider", "<init>", "(Lorg/apache/webbeans/spi/api/ResourceReference;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/InjectionTargetBean", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "resourceRef", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/ResourceProducerFactory", "<init>", "(ZLjavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/component/ResourceProvider;Ljava/lang/Class;Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedField;Lorg/apache/webbeans/spi/api/ResourceReference;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ResourceBean", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Lorg/apache/webbeans/spi/api/ResourceReference;Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(15, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ProducerFieldBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ResourceBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/AbstractProducerBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ResourceBeanBuilder", "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ResourceBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
