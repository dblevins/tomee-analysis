package asm.org.apache.webbeans.ee.beans;
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
public class ValidatorFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/ee/beans/ValidatorFactoryBean", "Lorg/apache/webbeans/component/BuiltInOwbBean<Ljakarta/validation/ValidatorFactory;>;", "org/apache/webbeans/component/BuiltInOwbBean", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "VALIDATIONFACT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/ValidatorFactory;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/SimpleProducerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/ProviderBasedProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/ValidatorFactory;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/ee/beans/ValidatorFactoryProvider");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/ee/beans/ValidatorFactoryProvider", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/ProviderBasedProducer", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljava/lang/Class;Ljakarta/inject/Provider;Z)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/SimpleProducerFactory", "<init>", "(Ljakarta/enterprise/inject/spi/Producer;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/BuiltInOwbBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/WebBeansType;Ljava/lang/Class;Ljakarta/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(13, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPassivationCapable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "proxyableType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
