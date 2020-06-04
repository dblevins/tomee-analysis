package asm.org.apache.webbeans.container;
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
public class InjectableBeanManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/container/InjectableBeanManager", null, "java/lang/Object", new String[] { "javax/enterprise/inject/spi/BeanManager", "java/io/Externalizable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "getInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getBeanManagerImpl", "()Lorg/apache/webbeans/container/BeanManagerImpl;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "<init>", "(Lorg/apache/webbeans/container/BeanManagerImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/container/BeanManagerImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/context/spi/Contextual<TT;>;)Ljavax/enterprise/context/spi/CreationalContext<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Lorg/apache/webbeans/context/creational/CreationalContextImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/InjectionTarget<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "fireEvent", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "fireEvent", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEvent", "()Ljavax/enterprise/event/Event;", "()Ljavax/enterprise/event/Event<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getEvent", "()Ljavax/enterprise/event/Event;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeans", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call getBeans(String) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getBeans", "(Ljava/lang/String;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call getBeans(Type, Annotation...) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/context/spi/Context;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInstance", "()Ljavax/enterprise/inject/Instance;", "()Ljavax/enterprise/inject/Instance<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call createInstance() before AfterDeploymentValidation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterDeploymentValidationFired", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createInstance", "()Ljavax/enterprise/inject/Instance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getELResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectableReference", "(Ljavax/enterprise/inject/spi/InjectionPoint;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/inject/spi/InjectionPoint;Ljavax/enterprise/context/spi/CreationalContext<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call getInjectableReference(InjectionPoin, CreationalContext) before AfterDeploymentValidation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterDeploymentValidationFired", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getInjectableReference", "(Ljavax/enterprise/inject/spi/InjectionPoint;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterceptorBindingDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getInterceptorBindingDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPassivationCapableBean", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/Bean;", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/Bean<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call getPassivationCapableBean(String) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getPassivationCapableBean", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/inject/spi/Bean<*>;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call getReference(Bean, Type, CreationalContext) before AfterDeploymentValidation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterDeploymentValidationFired", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStereotypeDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getStereotypeDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInterceptorBinding", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isInterceptorBinding", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNormalScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isNormalScope", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPassivatingScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isPassivatingScope", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isQualifier", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isQualifier", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isScope", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStereotype", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isStereotype", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", "<X:Ljava/lang/Object;>(Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<+TX;>;>;)Ljavax/enterprise/inject/spi/Bean<+TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call resolve(Set<Bean>) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInterceptionFactory", "(Ljavax/enterprise/context/spi/CreationalContext;Ljava/lang/Class;)Ljavax/enterprise/inject/spi/InterceptionFactory;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/context/spi/CreationalContext<TT;>;Ljava/lang/Class<TT;>;)Ljavax/enterprise/inject/spi/InterceptionFactory<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createInterceptionFactory", "(Ljavax/enterprise/context/spi/CreationalContext;Ljava/lang/Class;)Ljavax/enterprise/inject/spi/InterceptionFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "resolveDecorators", "(Ljava/util/Set;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", "(Ljava/util/Set<Ljava/lang/reflect/Type;>;[Ljava/lang/annotation/Annotation;)Ljava/util/List<Ljavax/enterprise/inject/spi/Decorator<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call resolveDecorators(Set<Type>, Annotation...) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "resolveDecorators", "(Ljava/util/Set;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "resolveInterceptors", "(Ljavax/enterprise/inject/spi/InterceptionType;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", "(Ljavax/enterprise/inject/spi/InterceptionType;[Ljava/lang/annotation/Annotation;)Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call resolveInterceptors(InterceptionType, Annotation...) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "resolveInterceptors", "(Ljavax/enterprise/inject/spi/InterceptionType;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "resolveObserverMethods", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;[Ljava/lang/annotation/Annotation;)Ljava/util/Set<Ljavax/enterprise/inject/spi/ObserverMethod<-TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call resolveObserverMethods(Object, Annotation...) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "resolveObserverMethods", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Ljavax/enterprise/inject/spi/InjectionPoint;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("It's not allowed to call validate(InjectionPoint) before AfterBeanDiscovery");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/container/InjectableBeanManager", "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "validate", "(Ljavax/enterprise/inject/spi/InjectionPoint;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wrapExpressionFactory", "(Ljavax/el/ExpressionFactory;)Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "wrapExpressionFactory", "(Ljavax/el/ExpressionFactory;)Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "areQualifiersEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "areQualifiersEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQualifierHashCode", "(Ljava/lang/annotation/Annotation;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getQualifierHashCode", "(Ljava/lang/annotation/Annotation;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "areInterceptorBindingsEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "areInterceptorBindingsEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterceptorBindingHashCode", "(Ljava/lang/annotation/Annotation;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getInterceptorBindingHashCode", "(Ljava/lang/annotation/Annotation;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedField;)Ljavax/enterprise/inject/spi/InjectionPoint;", "(Ljavax/enterprise/inject/spi/AnnotatedField<*>;)Ljavax/enterprise/inject/spi/InjectionPoint;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedField;)Ljavax/enterprise/inject/spi/InjectionPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Ljavax/enterprise/inject/spi/InjectionPoint;", "(Ljavax/enterprise/inject/spi/AnnotatedParameter<*>;)Ljavax/enterprise/inject/spi/InjectionPoint;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Ljavax/enterprise/inject/spi/InjectionPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionTargetFactory", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTargetFactory;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/InjectionTargetFactory<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getInjectionTargetFactory", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTargetFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", "<X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedField<-TX;>;Ljavax/enterprise/inject/spi/Bean<TX;>;)Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", "<X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedMethod<-TX;>;Ljavax/enterprise/inject/spi/Bean<TX;>;)Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/BeanAttributes;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/BeanAttributes;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedMember;)Ljavax/enterprise/inject/spi/BeanAttributes;", "(Ljavax/enterprise/inject/spi/AnnotatedMember<*>;)Ljavax/enterprise/inject/spi/BeanAttributes<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedMember;)Ljavax/enterprise/inject/spi/BeanAttributes;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/InjectionTargetFactory;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;Ljava/lang/Class<TT;>;Ljavax/enterprise/inject/spi/InjectionTargetFactory<TT;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/InjectionTargetFactory;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;Ljava/lang/Class<TX;>;Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExtension", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/Extension;", "<T::Ljavax/enterprise/inject/spi/Extension;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getExtension", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/Extension;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeExternal", "(Ljava/io/ObjectOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readExternal", "(Ljava/io/ObjectInput;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "currentInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getBeanManagerImpl", "()Lorg/apache/webbeans/container/BeanManagerImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/container/InjectableBeanManager", Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/container/InjectableBeanManager", Opcodes.INTEGER, Opcodes.INTEGER}, 2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/container/InjectableBeanManager");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/webbeans/container/InjectableBeanManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkAfterBeanDiscoveryProcessed", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isAfterBeanDiscoveryDone", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isAfterBeanDiscovery", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkAfterDeploymentValidationFired", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/container/InjectableBeanManager", "bm", "Lorg/apache/webbeans/container/BeanManagerImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "isAfterDeploymentValidationFired", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
