package asm.javax.enterprise.inject.spi.configurator;
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
public class BeanConfiguratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/inject/spi/configurator/BeanConfigurator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beanClass", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/Class<*>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addInjectionPoint", "(Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addInjectionPoints", "([Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addInjectionPoints", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "injectionPoints", "([Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "injectionPoints", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "id", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createWith", "(Ljava/util/function/Function;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "<U:TT;>(Ljava/util/function/Function<Ljavax/enterprise/context/spi/CreationalContext<TU;>;TU;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "produceWith", "(Ljava/util/function/Function;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "<U:TT;>(Ljava/util/function/Function<Ljavax/enterprise/inject/Instance<Ljava/lang/Object;>;TU;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroyWith", "(Ljava/util/function/BiConsumer;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/function/BiConsumer<TT;Ljavax/enterprise/context/spi/CreationalContext<TT;>;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "disposeWith", "(Ljava/util/function/BiConsumer;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/function/BiConsumer<TT;Ljavax/enterprise/inject/Instance<Ljava/lang/Object;>;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "<U:TT;>(Ljavax/enterprise/inject/spi/AnnotatedType<TU;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TU;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljavax/enterprise/inject/spi/BeanAttributes;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljavax/enterprise/inject/spi/BeanAttributes<*>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addType", "(Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addType", "(Ljavax/enterprise/util/TypeLiteral;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljavax/enterprise/util/TypeLiteral<*>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addTypes", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTypes", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/reflect/Type;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTransitiveTypeClosure", "(Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "types", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljava/lang/reflect/Type;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "types", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/reflect/Type;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "scope", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifier", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addQualifiers", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifiers", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "([Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qualifiers", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addStereotype", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addStereotypes", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stereotypes", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/util/Set<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;>;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "name", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Ljava/lang/String;)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "alternative", "(Z)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "(Z)Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
