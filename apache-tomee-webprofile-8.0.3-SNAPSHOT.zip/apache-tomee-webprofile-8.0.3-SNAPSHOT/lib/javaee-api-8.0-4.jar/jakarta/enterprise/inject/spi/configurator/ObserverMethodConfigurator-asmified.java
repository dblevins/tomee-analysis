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
public class ObserverMethodConfiguratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer", "jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator", "EventConsumer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljava/lang/reflect/Method;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/lang/reflect/Method;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Ljakarta/enterprise/inject/spi/ObserverMethod;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljakarta/enterprise/inject/spi/ObserverMethod<TT;>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beanClass", "(Ljava/lang/Class;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/lang/Class<*>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "observedType", "(Ljava/lang/reflect/Type;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/lang/reflect/Type;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifier", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addQualifiers", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifiers", "(Ljava/util/Set;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qualifiers", "(Ljava/util/Set;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "reception", "(Ljakarta/enterprise/event/Reception;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljakarta/enterprise/event/Reception;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "transactionPhase", "(Ljakarta/enterprise/event/TransactionPhase;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljakarta/enterprise/event/TransactionPhase;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "priority", "(I)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(I)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notifyWith", "(Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer<TT;>;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "async", "(Z)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "(Z)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
