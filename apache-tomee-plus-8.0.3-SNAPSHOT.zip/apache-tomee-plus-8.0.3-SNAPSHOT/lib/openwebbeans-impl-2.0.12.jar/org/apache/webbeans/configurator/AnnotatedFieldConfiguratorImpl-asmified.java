package asm.org.apache.webbeans.configurator;
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
public class AnnotatedFieldConfiguratorImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<TT;>;", "java/lang/Object", new String[] { "javax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/portable/AnnotatedFieldImpl;)V", "(Lorg/apache/webbeans/portable/AnnotatedFieldImpl<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedField;", "()Ljavax/enterprise/inject/spi/AnnotatedField<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;", "(Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedFieldImpl", "addAnnotation", "(Ljava/lang/annotation/Annotation;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/util/function/Predicate;)Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;", "(Ljava/util/function/Predicate;)Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedFieldImpl", "getAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "removeIf", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAll", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator;", "()Ljavax/enterprise/inject/spi/configurator/AnnotatedFieldConfigurator<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/configurator/AnnotatedFieldConfiguratorImpl", "annotatedField", "Lorg/apache/webbeans/portable/AnnotatedFieldImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedFieldImpl", "getAnnotations", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
