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
public class ProcessProducerFieldImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "<X:Ljava/lang/Object;T:Ljava/lang/Object;>Lorg/apache/webbeans/portable/events/ProcessBeanImpl<TT;>;Ljakarta/enterprise/inject/spi/ProcessProducerField<TX;TT;>;", "org/apache/webbeans/portable/events/ProcessBeanImpl", new String[] { "jakarta/enterprise/inject/spi/ProcessProducerField" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedField", "Ljakarta/enterprise/inject/spi/AnnotatedField;", "Ljakarta/enterprise/inject/spi/AnnotatedField<TX;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedParameter", "Ljakarta/enterprise/inject/spi/AnnotatedParameter;", "Ljakarta/enterprise/inject/spi/AnnotatedParameter<TX;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/component/ProducerFieldBean;Ljakarta/enterprise/inject/spi/AnnotatedField;Ljakarta/enterprise/inject/spi/AnnotatedParameter;)V", "(Lorg/apache/webbeans/component/ProducerFieldBean<TT;>;Ljakarta/enterprise/inject/spi/AnnotatedField<TX;>;Ljakarta/enterprise/inject/spi/AnnotatedParameter<TX;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/events/ProcessBeanImpl", "<init>", "(Ljakarta/enterprise/inject/spi/Bean;Ljakarta/enterprise/inject/spi/Annotated;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "annotatedField", "Ljakarta/enterprise/inject/spi/AnnotatedField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "annotatedParameter", "Ljakarta/enterprise/inject/spi/AnnotatedParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedProducerField", "()Ljakarta/enterprise/inject/spi/AnnotatedField;", "()Ljakarta/enterprise/inject/spi/AnnotatedField<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "annotatedField", "Ljakarta/enterprise/inject/spi/AnnotatedField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedDisposedParameter", "()Ljakarta/enterprise/inject/spi/AnnotatedParameter;", "()Ljakarta/enterprise/inject/spi/AnnotatedParameter<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "checkState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/events/ProcessProducerFieldImpl", "annotatedParameter", "Ljakarta/enterprise/inject/spi/AnnotatedParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
