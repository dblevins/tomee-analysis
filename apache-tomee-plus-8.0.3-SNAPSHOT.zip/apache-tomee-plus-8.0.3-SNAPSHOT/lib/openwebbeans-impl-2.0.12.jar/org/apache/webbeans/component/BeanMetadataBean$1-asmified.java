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
public class BeanMetadataBean$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/component/BeanMetadataBean$1", "Ljakarta/enterprise/util/TypeLiteral<Ljakarta/enterprise/inject/spi/Bean<TT;>;>;", "jakarta/enterprise/util/TypeLiteral", null);

classWriter.visitOuterClass("org/apache/webbeans/component/BeanMetadataBean", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V");

classWriter.visitInnerClass("org/apache/webbeans/component/BeanMetadataBean$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/util/TypeLiteral", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
