package asm.org.apache.webbeans.portable.events;
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
public class ProcessProducerImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/events/ProcessProducerImpl", "<X:Ljava/lang/Object;T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/events/EventBase;Ljavax/enterprise/inject/spi/ProcessProducer<TX;TT;>;", "org/apache/webbeans/portable/events/EventBase", new String[] { "javax/enterprise/inject/spi/ProcessProducer" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotateMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;", "Ljavax/enterprise/inject/spi/AnnotatedMember<TX;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producer", "Ljavax/enterprise/inject/spi/Producer;", "Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "customProducerSet", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/Producer;Ljavax/enterprise/inject/spi/AnnotatedMember;)V", "(Ljavax/enterprise/inject/spi/Producer<TT;>;Ljavax/enterprise/inject/spi/AnnotatedMember<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/events/EventBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "annotateMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDefinitionError", "(Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerImpl", "checkState", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "getInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getBeanManagerImpl", "()Lorg/apache/webbeans/container/BeanManagerImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "getErrorStack", "()Lorg/apache/webbeans/portable/events/discovery/ErrorStack;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/discovery/ErrorStack", "pushError", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureProducer", "()Ljavax/enterprise/inject/spi/configurator/ProducerConfigurator;", "()Ljavax/enterprise/inject/spi/configurator/ProducerConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "customProducerSet", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only one of setProducer() and configureProducer() must be used!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/configurator/ProducerConfiguratorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedMember", "()Ljavax/enterprise/inject/spi/AnnotatedMember;", "()Ljavax/enterprise/inject/spi/AnnotatedMember<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "annotateMember", "Ljavax/enterprise/inject/spi/AnnotatedMember;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProducer", "()Ljavax/enterprise/inject/spi/Producer;", "()Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/configurator/ProducerConfiguratorImpl", "getProducer", "()Ljavax/enterprise/inject/spi/Producer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProducer", "(Ljavax/enterprise/inject/spi/Producer;)V", "(Ljavax/enterprise/inject/spi/Producer<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producerConfigurator", "Lorg/apache/webbeans/configurator/ProducerConfiguratorImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Only one of setProducer() and configureProducer() must be used!");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerImpl", "customProducerSet", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
