package asm.org.eclipse.microprofile.config.spi;
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
public class ConfigBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/microprofile/config/spi/ConfigBuilder", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/osgi/annotation/versioning/ProviderType;", false);
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDefaultSources", "()Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDiscoveredSources", "()Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDiscoveredConverters", "()Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "forClassLoader", "(Ljava/lang/ClassLoader;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "withSources", "([Lorg/eclipse/microprofile/config/spi/ConfigSource;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "withConverters", "([Lorg/eclipse/microprofile/config/spi/Converter;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", "([Lorg/eclipse/microprofile/config/spi/Converter<*>;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "withConverter", "(Ljava/lang/Class;ILorg/eclipse/microprofile/config/spi/Converter;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;ILorg/eclipse/microprofile/config/spi/Converter<TT;>;)Lorg/eclipse/microprofile/config/spi/ConfigBuilder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "()Lorg/eclipse/microprofile/config/Config;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
