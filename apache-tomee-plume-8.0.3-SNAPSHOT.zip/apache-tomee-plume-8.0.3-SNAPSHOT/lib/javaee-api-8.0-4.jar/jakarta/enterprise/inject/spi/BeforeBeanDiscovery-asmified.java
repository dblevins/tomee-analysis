package asm.jakarta.enterprise.inject.spi;
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
public class BeforeBeanDiscoveryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/inject/spi/BeforeBeanDiscovery", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifier", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifier", "(Ljakarta/enterprise/inject/spi/AnnotatedType;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addScope", "(Ljava/lang/Class;ZZ)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;ZZ)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addStereotype", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;[Ljava/lang/annotation/Annotation;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addInterceptorBinding", "(Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)V", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;[Ljava/lang/annotation/Annotation;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addInterceptorBinding", "(Ljakarta/enterprise/inject/spi/AnnotatedType;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAnnotatedType", "(Ljakarta/enterprise/inject/spi/AnnotatedType;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAnnotatedType", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Ljava/lang/String;)V", "(Ljakarta/enterprise/inject/spi/AnnotatedType<*>;Ljava/lang/String;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAnnotatedType", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "configureInterceptorBinding", "(Ljava/lang/Class;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "configureQualifier", "(Ljava/lang/Class;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator;", "<T::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TT;>;)Ljakarta/enterprise/inject/spi/configurator/AnnotatedTypeConfigurator<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
