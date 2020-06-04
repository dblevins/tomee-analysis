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
public class BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "<M:Ljava/lang/Object;>Lorg/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMemberBeanAttributesBuilder<TM;Ljavax/enterprise/inject/spi/AnnotatedField<TM;>;>;", "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMemberBeanAttributesBuilder", null);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedFieldBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMemberBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedMemberBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedField;)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedField<TM;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedMemberBeanAttributesBuilder", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedMember;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineScope", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Annotated producer field: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getJavaMember", "()Ljava/lang/reflect/Field;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("must declare default @Scope annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "defineScope", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineName", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "lambda$defineName$0", "()Ljava/lang/String;", false), Type.getType("()Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "defineName", "(Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Supplier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineNullable", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getJavaMember", "()Ljava/lang/reflect/Field;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder"}, 2, new Object[] {"org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "defineNullable", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedField;", "()Ljavax/enterprise/inject/spi/AnnotatedField<-TM;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getSuperType", "()Ljavax/enterprise/inject/spi/AnnotatedType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getFields", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/enterprise/inject/spi/AnnotatedField", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedField");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getJavaMember", "()Ljava/lang/reflect/Field;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getJavaMember", "()Ljava/lang/reflect/Field;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getBaseType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedField", "getBaseType", "()Ljava/lang/reflect/Type;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedField;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$defineName$0", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedMember");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedFieldBeanAttributesBuilder", "getProducerDefaultName", "(Ljavax/enterprise/inject/spi/AnnotatedMember;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
