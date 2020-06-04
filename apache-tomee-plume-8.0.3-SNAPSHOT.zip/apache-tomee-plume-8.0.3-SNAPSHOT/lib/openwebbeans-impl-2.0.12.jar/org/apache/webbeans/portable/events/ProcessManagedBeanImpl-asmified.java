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
public class ProcessManagedBeanImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/events/ProcessManagedBeanImpl", "<X:Ljava/lang/Object;>Lorg/apache/webbeans/portable/events/ProcessBeanImpl<TX;>;Ljavax/enterprise/inject/spi/ProcessManagedBean<TX;>;", "org/apache/webbeans/portable/events/ProcessBeanImpl", new String[] { "javax/enterprise/inject/spi/ProcessManagedBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedBeanClass", "Ljavax/enterprise/inject/spi/AnnotatedType;", "Ljavax/enterprise/inject/spi/AnnotatedType<TX;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/ManagedBean;Ljavax/enterprise/inject/spi/AnnotatedType;)V", "(Lorg/apache/webbeans/component/ManagedBean<TX;>;Ljavax/enterprise/inject/spi/AnnotatedType<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/events/ProcessBeanImpl", "<init>", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/Annotated;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessManagedBeanImpl", "annotatedBeanClass", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedBeanClass", "()Ljavax/enterprise/inject/spi/AnnotatedType;", "()Ljavax/enterprise/inject/spi/AnnotatedType<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessManagedBeanImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessManagedBeanImpl", "annotatedBeanClass", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
