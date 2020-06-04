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
public class SimpleProducerFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/SimpleProducerFactory", "<P:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/ProducerFactory<TP;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/ProducerFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "producer", "Ljavax/enterprise/inject/spi/Producer;", "Ljavax/enterprise/inject/spi/Producer<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/enterprise/inject/spi/Producer;)V", "(Ljavax/enterprise/inject/spi/Producer<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/SimpleProducerFactory", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "(Ljavax/enterprise/inject/spi/Bean;)Ljavax/enterprise/inject/spi/Producer;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/Bean<TT;>;)Ljavax/enterprise/inject/spi/Producer<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/SimpleProducerFactory", "producer", "Ljavax/enterprise/inject/spi/Producer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
