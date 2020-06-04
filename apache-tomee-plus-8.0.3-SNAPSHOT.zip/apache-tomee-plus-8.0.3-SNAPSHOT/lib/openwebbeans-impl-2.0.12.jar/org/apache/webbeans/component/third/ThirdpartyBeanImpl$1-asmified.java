package asm.org.apache.webbeans.component.third;
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
public class ThirdpartyBeanImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", "Ljava/lang/Object;Ljavax/enterprise/inject/spi/Producer<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Producer" });

classWriter.visitOuterClass("org/apache/webbeans/component/third/ThirdpartyBeanImpl", "getProducer", "()Ljavax/enterprise/inject/spi/Producer;");

classWriter.visitInnerClass("org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", "this$0", "Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", "this$0", "Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/component/third/ThirdpartyBeanImpl", "access$000", "(Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "create", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", "this$0", "Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/component/third/ThirdpartyBeanImpl", "access$000", "(Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "destroy", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionPoints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/third/ThirdpartyBeanImpl$1", "this$0", "Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/component/third/ThirdpartyBeanImpl", "access$000", "(Lorg/apache/webbeans/component/third/ThirdpartyBeanImpl;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getInjectionPoints", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
