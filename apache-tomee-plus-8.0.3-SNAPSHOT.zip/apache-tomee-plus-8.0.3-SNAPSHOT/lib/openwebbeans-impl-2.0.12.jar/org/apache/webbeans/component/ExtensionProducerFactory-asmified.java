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
public class ExtensionProducerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/ExtensionProducerFactory", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/ProducerFactory<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/ProducerFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;", "Ljavax/enterprise/inject/spi/AnnotatedType<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Lorg/apache/webbeans/config/WebBeansContext;)V", "(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Lorg/apache/webbeans/config/WebBeansContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/ExtensionProducerFactory", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/ExtensionProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "(Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/Producer;", "<P:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/Bean<TP;>;)Ljavax/enterprise/inject/spi/Producer<TP;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/portable/ExtensionProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/ExtensionProducerFactory", "annotatedType", "Ljavax/enterprise/inject/spi/AnnotatedType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/ExtensionProducerFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/ExtensionProducer", "<init>", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljavax/enterprise/inject/spi/Bean;Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
