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
public class ProducerConfiguratorImpl$ConfiguredProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/Producer<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Producer" });

classWriter.visitInnerClass("org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "ConfiguredProducer", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "this$0", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produce", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "this$0", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "access$000", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/function/Function;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "this$0", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "access$100", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/function/Consumer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Consumer", "accept", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionPoints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ProducerConfiguratorImpl$ConfiguredProducer", "this$0", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "access$200", "(Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
