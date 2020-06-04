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
public class ObserverMethodConfiguratorImpl$ConfiguredObserverMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/enterprise/inject/spi/ObserverMethod<TT;>;", "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/ObserverMethod" });

classWriter.visitInnerClass("org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "ConfiguredObserverMethod", ACC_PUBLIC);

classWriter.visitInnerClass("jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer", "jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator", "EventConsumer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeanClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$000", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljava/lang/Class;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$000", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljava/lang/Class;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$100", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/inject/spi/Extension;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObservedType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$200", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObservedQualifiers", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$300", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReception", "()Ljakarta/enterprise/event/Reception;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$400", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/event/Reception;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionPhase", "()Ljakarta/enterprise/event/TransactionPhase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$500", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/event/TransactionPhase;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notify", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/event/EventContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/event/EventContextImpl", "<init>", "(Ljava/lang/Object;Ljakarta/enterprise/inject/spi/EventMetadata;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "notify", "(Ljakarta/enterprise/inject/spi/EventContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notify", "(Ljakarta/enterprise/inject/spi/EventContext;)V", "(Ljakarta/enterprise/inject/spi/EventContext<TT;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$600", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$700", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/inject/spi/ObserverMethod;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$700", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/inject/spi/ObserverMethod;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/ObserverMethod", "notify", "(Ljakarta/enterprise/inject/spi/EventContext;)V", true);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$600", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Ljakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/inject/spi/configurator/ObserverMethodConfigurator$EventConsumer", "accept", "(Ljakarta/enterprise/inject/spi/EventContext;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAsync", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$800", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPriority", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl$ConfiguredObserverMethod", "this$0", "Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/ObserverMethodConfiguratorImpl", "access$900", "(Lorg/apache/webbeans/configurator/ObserverMethodConfiguratorImpl;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
