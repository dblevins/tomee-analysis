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
public class AfterBeanDiscoveryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/inject/spi/AfterBeanDiscovery", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDefinitionError", "(Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBean", "(Ljavax/enterprise/inject/spi/Bean;)V", "(Ljavax/enterprise/inject/spi/Bean<*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addObserverMethod", "(Ljavax/enterprise/inject/spi/ObserverMethod;)V", "(Ljavax/enterprise/inject/spi/ObserverMethod<*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addContext", "(Ljavax/enterprise/context/spi/Context;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotatedType", "(Ljava/lang/Class;Ljava/lang/String;)Ljavax/enterprise/inject/spi/AnnotatedType;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotatedTypes", "(Ljava/lang/Class;)Ljava/lang/Iterable;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/lang/Iterable<Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBean", "()Ljavax/enterprise/inject/spi/configurator/BeanConfigurator;", "<T:Ljava/lang/Object;>()Ljavax/enterprise/inject/spi/configurator/BeanConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addObserverMethod", "()Ljavax/enterprise/inject/spi/configurator/ObserverMethodConfigurator;", "<T:Ljava/lang/Object;>()Ljavax/enterprise/inject/spi/configurator/ObserverMethodConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
