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
public class InjectionPointConfiguratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "type", "(Ljava/lang/reflect/Type;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifier", "(Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addQualifiers", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQualifiers", "(Ljava/util/Set;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "qualifiers", "([Ljava/lang/annotation/Annotation;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "qualifiers", "(Ljava/util/Set;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", "(Ljava/util/Set<Ljava/lang/annotation/Annotation;>;)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delegate", "(Z)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "transientField", "(Z)Ljakarta/enterprise/inject/spi/configurator/InjectionPointConfigurator;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
