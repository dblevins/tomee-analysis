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
public class BeanConfiguratorImpl$ConstructedBean$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "Ljava/lang/Object;Ljavax/enterprise/inject/spi/Producer<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Producer" });

classWriter.visitOuterClass("org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "getProducer", "()Ljavax/enterprise/inject/spi/Producer;");

classWriter.visitInnerClass("org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "org/apache/webbeans/configurator/BeanConfiguratorImpl", "ConstructedBean", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instance", "Ljavax/enterprise/inject/Instance;", "Ljavax/enterprise/inject/Instance<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/inject/spi/CDI", "current", "()Ljavax/enterprise/inject/spi/CDI;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "instance", "Ljavax/enterprise/inject/Instance;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produce", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "(Ljavax/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "this$0", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/BeanConfiguratorImpl", "access$500", "(Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;)Ljava/util/function/Function;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "instance", "Ljavax/enterprise/inject/Instance;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "this$0", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/BeanConfiguratorImpl", "access$800", "(Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;)Ljava/util/function/BiConsumer;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "this$0", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/BeanConfiguratorImpl", "access$800", "(Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;)Ljava/util/function/BiConsumer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "instance", "Ljavax/enterprise/inject/Instance;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/BiConsumer", "accept", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionPoints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean$1", "this$1", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/BeanConfiguratorImpl$ConstructedBean", "this$0", "Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/configurator/BeanConfiguratorImpl", "access$600", "(Lorg/apache/webbeans/configurator/BeanConfiguratorImpl;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
