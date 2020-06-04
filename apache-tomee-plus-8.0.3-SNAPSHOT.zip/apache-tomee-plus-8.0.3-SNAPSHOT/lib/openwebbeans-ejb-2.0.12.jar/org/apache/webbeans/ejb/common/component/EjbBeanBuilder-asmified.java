package asm.org.apache.webbeans.ejb.common.component;
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
public class EjbBeanBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "<T:Ljava/lang/Object;E:Lorg/apache/webbeans/ejb/common/component/BaseEjbBean<TT;>;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/ejb/common/component/EjbBeanBuilder$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;", "Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;", "Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedType;Ljavax/enterprise/inject/spi/BeanAttributes;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("WebBeansContetx");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("annotated type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("beanAttributes");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List;Ljava/util/List;)Ljavax/enterprise/inject/spi/InjectionTarget;", "(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/List<Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;>;Ljava/util/List<Ljavax/enterprise/inject/spi/AnnotatedMethod<*>;>;)Ljavax/enterprise/inject/spi/InjectionTarget<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder$1", "<init>", "(Lorg/apache/webbeans/ejb/common/component/EjbBeanBuilder;Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "createBean", "(Ljava/lang/Class;)Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;", "(Ljava/lang/Class<TT;>;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getWebBeansUtil", "()Lorg/apache/webbeans/util/WebBeansUtil;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "beanAttributes", "Ljavax/enterprise/inject/spi/BeanAttributes;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanAttributes", "getStereotypes", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/util/WebBeansUtil", "isBeanEnabled", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/util/Set;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "createBean", "(Ljava/lang/Class;Z)Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "createBean", "(Ljava/lang/Class;Z)Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;", "(Ljava/lang/Class<TT;>;Z)TE;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBean", "()Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ejb/common/component/EjbBeanBuilder", "createBean", "(Ljava/lang/Class;)Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ejb/common/component/BaseEjbBean", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/ejb/common/util/EjbValidator", "validateDecoratorOrInterceptor", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/ejb/common/util/EjbValidator", "validateEjbScopeType", "(Lorg/apache/webbeans/ejb/common/component/BaseEjbBean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ejb/common/component/BaseEjbBean", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/ejb/common/component/BaseEjbBean", "getScope", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/ejb/common/util/EjbValidator", "validateGenericBeanType", "(Ljava/lang/Class;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getInstance", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
