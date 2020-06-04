package asm.org.apache.webbeans.component;
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
public class NewManagedBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/NewManagedBean", "<T:Ljava/lang/Object;>Lorg/apache/webbeans/component/ManagedBean<TT;>;Lorg/apache/webbeans/component/NewBean<TT;>;", "org/apache/webbeans/component/ManagedBean", new String[] { "org/apache/webbeans/component/NewBean" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljavax/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/component/BeanAttributesImpl;Ljava/lang/Class;Ljava/util/Set;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Lorg/apache/webbeans/component/BeanAttributesImpl<TT;>;Ljava/lang/Class<TT;>;Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ManagedBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljavax/enterprise/inject/spi/AnnotatedType;Ljavax/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/NewManagedBean", "getProducer", "()Ljavax/enterprise/inject/spi/InjectionTarget;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/webbeans/portable/AbstractProducer");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/NewManagedBean", "getProducer", "()Ljavax/enterprise/inject/spi/InjectionTarget;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/portable/AbstractProducer");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AbstractProducer", "defineInterceptorStack", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/webbeans/component/NewManagedBean", "org/apache/webbeans/config/WebBeansContext", "org/apache/webbeans/component/WebBeansType", "javax/enterprise/inject/spi/AnnotatedType", "org/apache/webbeans/component/BeanAttributesImpl", "java/lang/Class", "java/util/Set"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDependent", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAlternative", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
