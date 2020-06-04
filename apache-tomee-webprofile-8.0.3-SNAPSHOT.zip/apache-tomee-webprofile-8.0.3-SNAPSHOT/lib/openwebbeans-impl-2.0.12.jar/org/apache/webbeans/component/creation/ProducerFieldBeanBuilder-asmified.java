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
public class ProducerFieldBeanBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "<T:Ljava/lang/Object;P:Lorg/apache/webbeans/component/ProducerFieldBean<TT;>;>Lorg/apache/webbeans/component/creation/AbstractProducerBeanBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedField<*>;TP;>;", "org/apache/webbeans/component/creation/AbstractProducerBeanBuilder", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/BeanAttributes;)V", "(Lorg/apache/webbeans/component/InjectionTargetBean<*>;Ljavax/enterprise/inject/spi/AnnotatedField<*>;Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;)V", null);
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
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ProducerFieldBean;", "<X:Ljava/lang/Object;>(Lorg/apache/webbeans/component/InjectionTargetBean<TX;>;Ljava/lang/Class<TT;>;)TP;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/ProducerFieldBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/FieldProducerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/InjectionTargetBean", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/FieldProducerFactory", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ProducerFieldBean", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBean", "()Lorg/apache/webbeans/component/ProducerFieldBean;", "()TP;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "annotatedMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getJavaMember", "()Ljava/lang/reflect/Field;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "createBean", "(Ljava/lang/Class;)Lorg/apache/webbeans/component/AbstractProducerBean;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/component/ProducerFieldBean");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/AbstractProducerBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/ProducerFieldBeanBuilder", "createBean", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljava/lang/Class;)Lorg/apache/webbeans/component/ProducerFieldBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
