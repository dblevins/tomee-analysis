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
public class ResourceBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/ResourceBean", "<X:Ljava/lang/Object;T::Ljava/lang/annotation/Annotation;>Lorg/apache/webbeans/component/ProducerFieldBean<TX;>;", "org/apache/webbeans/component/ProducerFieldBean", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resourceReference", "Lorg/apache/webbeans/spi/api/ResourceReference;", "Lorg/apache/webbeans/spi/api/ResourceReference<TX;TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Lorg/apache/webbeans/spi/api/ResourceReference;Ljakarta/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljakarta/enterprise/inject/spi/ProducerFactory;)V", "(Lorg/apache/webbeans/component/InjectionTargetBean<*>;Lorg/apache/webbeans/spi/api/ResourceReference<TX;TT;>;Ljakarta/enterprise/inject/spi/BeanAttributes<TX;>;Ljava/lang/Class<TX;>;Ljakarta/enterprise/inject/spi/ProducerFactory<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/ProducerFieldBean", "<init>", "(Lorg/apache/webbeans/component/InjectionTargetBean;Ljakarta/enterprise/inject/spi/BeanAttributes;Ljava/lang/Class;Ljakarta/enterprise/inject/spi/ProducerFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/ResourceBean", "resourceReference", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReference", "()Lorg/apache/webbeans/spi/api/ResourceReference;", "()Lorg/apache/webbeans/spi/api/ResourceReference<TX;TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/ResourceBean", "resourceReference", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActualInstance", "()Ljava/lang/Object;", "()TX;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/ResourceBean", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/spi/ResourceInjectionService;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/spi/ResourceInjectionService");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/ResourceBean", "resourceReference", "Lorg/apache/webbeans/spi/api/ResourceReference;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ResourceInjectionService", "getResourceReference", "(Lorg/apache/webbeans/spi/api/ResourceReference;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
