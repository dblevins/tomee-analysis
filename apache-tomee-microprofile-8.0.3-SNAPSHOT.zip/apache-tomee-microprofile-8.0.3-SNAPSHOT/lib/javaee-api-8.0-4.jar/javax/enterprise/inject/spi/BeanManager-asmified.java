package asm.javax.enterprise.inject.spi;
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
public class BeanManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/inject/spi/BeanManager", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/inject/spi/Bean<*>;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext<*>;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInjectableReference", "(Ljavax/enterprise/inject/spi/InjectionPoint;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/inject/spi/InjectionPoint;Ljavax/enterprise/context/spi/CreationalContext<*>;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/context/spi/Contextual<TT;>;)Ljavax/enterprise/context/spi/CreationalContext<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBeans", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPassivationCapableBean", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/Bean;", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/Bean<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", "<X:Ljava/lang/Object;>(Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<+TX;>;>;)Ljavax/enterprise/inject/spi/Bean<+TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInterceptionFactory", "(Ljavax/enterprise/context/spi/CreationalContext;Ljava/lang/Class;)Ljavax/enterprise/inject/spi/InterceptionFactory;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/context/spi/CreationalContext<TT;>;Ljava/lang/Class<TT;>;)Ljavax/enterprise/inject/spi/InterceptionFactory<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "fireEvent", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEvent", "()Ljavax/enterprise/event/Event;", "()Ljavax/enterprise/event/Event<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "resolveObserverMethods", "(Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;[Ljava/lang/annotation/Annotation;)Ljava/util/Set<Ljavax/enterprise/inject/spi/ObserverMethod<-TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "resolveDecorators", "(Ljava/util/Set;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", "(Ljava/util/Set<Ljava/lang/reflect/Type;>;[Ljava/lang/annotation/Annotation;)Ljava/util/List<Ljavax/enterprise/inject/spi/Decorator<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "resolveInterceptors", "(Ljavax/enterprise/inject/spi/InterceptionType;[Ljava/lang/annotation/Annotation;)Ljava/util/List;", "(Ljavax/enterprise/inject/spi/InterceptionType;[Ljava/lang/annotation/Annotation;)Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Ljavax/enterprise/inject/spi/InjectionPoint;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNormalScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPassivatingScope", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isQualifier", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "areQualifiersEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQualifierHashCode", "(Ljava/lang/annotation/Annotation;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInterceptorBinding", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "areInterceptorBindingsEquivalent", "(Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInterceptorBindingHashCode", "(Ljava/lang/annotation/Annotation;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStereotype", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInterceptorBindingDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStereotypeDefinition", "(Ljava/lang/Class;)Ljava/util/Set;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/context/spi/Context;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInstance", "()Ljavax/enterprise/inject/Instance;", "()Ljavax/enterprise/inject/Instance<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getELResolver", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInjectionTarget", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTarget;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/InjectionTarget<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedField;)Ljavax/enterprise/inject/spi/InjectionPoint;", "(Ljavax/enterprise/inject/spi/AnnotatedField<*>;)Ljavax/enterprise/inject/spi/InjectionPoint;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createInjectionPoint", "(Ljavax/enterprise/inject/spi/AnnotatedParameter;)Ljavax/enterprise/inject/spi/InjectionPoint;", "(Ljavax/enterprise/inject/spi/AnnotatedParameter<*>;)Ljavax/enterprise/inject/spi/InjectionPoint;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInjectionTargetFactory", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/InjectionTargetFactory;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/InjectionTargetFactory<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedField;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", "<X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedField<-TX;>;Ljavax/enterprise/inject/spi/Bean<TX;>;)Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProducerFactory", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/ProducerFactory;", "<X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedMethod<-TX;>;Ljavax/enterprise/inject/spi/Bean<TX;>;)Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/BeanAttributes;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBeanAttributes", "(Ljavax/enterprise/inject/spi/AnnotatedMember;)Ljavax/enterprise/inject/spi/BeanAttributes;", "(Ljavax/enterprise/inject/spi/AnnotatedMember<*>;)Ljavax/enterprise/inject/spi/BeanAttributes<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/InjectionTargetFactory;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;Ljava/lang/Class<TT;>;Ljavax/enterprise/inject/spi/InjectionTargetFactory<TT;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createBean", "(Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljavax/enterprise/inject/spi/ProducerFactory;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;X:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanAttributes<TT;>;Ljava/lang/Class<TX;>;Ljavax/enterprise/inject/spi/ProducerFactory<TX;>;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExtension", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/Extension;", "<T::Ljavax/enterprise/inject/spi/Extension;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrapExpressionFactory", "(Ljavax/el/ExpressionFactory;)Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
