package asm.org.apache.webbeans.configurator;
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
public class ProducerConfiguratorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator<TT;>;", "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/configurator/ProducerConfigurator" });

classWriter.visitInnerClass("org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "ConfiguredProducer", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "produceWithCallback", "Ljava/util/function/Function;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "disposeWithCallback", "Ljava/util/function/Consumer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "injectionPoints", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/enterprise/inject/spi/InjectionPoint;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "injectionPoints", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produceWith", "(Ljava/util/function/Function;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator;", "<U:TT;>(Ljava/util/function/Function<Ljakarta/enterprise/context/spi/CreationalContext<TU;>;TU;>;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "produceWithCallback", "Ljava/util/function/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disposeWith", "(Ljava/util/function/Consumer;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator;", "(Ljava/util/function/Consumer<TT;>;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "disposeWithCallback", "Ljava/util/function/Consumer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addInjectionPoint", "(Ljakarta/enterprise/inject/spi/InjectionPoint;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator;", "(Ljakarta/enterprise/inject/spi/InjectionPoint;)Ljakarta/enterprise/inject/spi/configurator/ProducerConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "injectionPoints", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducer", "()Ljakarta/enterprise/inject/spi/Producer;", "<T:Ljava/lang/Object;>()Ljakarta/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "<init>", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/function/Function;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "produceWithCallback", "Ljava/util/function/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/function/Consumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "disposeWithCallback", "Ljava/util/function/Consumer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "injectionPoints", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
