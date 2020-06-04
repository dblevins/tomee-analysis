package asm.org.apache.webbeans.component.creation;
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
public class BeanAttributesBuilder$BeanAttributesBuilderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "BeanAttributesBuilderFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedTypeBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedFieldBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMethodBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedMethodBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("WebBeansContetx");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/Asserts", "assertNotNull", "(Ljava/lang/Object;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBeanAttibutes", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "newBeanAttibutes", "(Ljavax/enterprise/inject/spi/AnnotatedType;Z)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBeanAttibutes", "(Ljavax/enterprise/inject/spi/AnnotatedType;Z)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;Z)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedType<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedType;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBeanAttibutes", "(Ljavax/enterprise/inject/spi/AnnotatedField;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedField<TT;>;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedField<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedField;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBeanAttibutes", "(Ljavax/enterprise/inject/spi/AnnotatedMethod;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/AnnotatedMethod<TT;>;)Lorg/apache/webbeans/component/creation/BeanAttributesBuilder<TT;Ljavax/enterprise/inject/spi/AnnotatedMethod<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMethodBeanAttributesBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMethodBeanAttributesBuilder", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedMethod;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/webbeans/component/creation/BeanAttributesBuilder$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$BeanAttributesBuilderFactory", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
