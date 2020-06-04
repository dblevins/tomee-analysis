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
public class BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "<C:Ljava/lang/Object;>Lorg/apache/webbeans/component/creation/BeanAttributesBuilder<TC;Ljavax/enterprise/inject/spi/AnnotatedType<TC;>;>;", "org/apache/webbeans/component/creation/BeanAttributesBuilder", null);

classWriter.visitInnerClass("org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "org/apache/webbeans/component/creation/BeanAttributesBuilder", "AnnotatedTypeBeanAttributesBuilder", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "onlyScopedBeans", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedType;Z)V", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/AnnotatedType<TC;>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder", "<init>", "(Lorg/apache/webbeans/config/WebBeansContext;Ljavax/enterprise/inject/spi/Annotated;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "onlyScopedBeans", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineScope", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "onlyScopedBeans", "Z");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("TEXT_MB_IMPL");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "getTokenString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("TEXT_SAME_SCOPE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "getTokenString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "defineScope", "(Ljava/lang/Class;ZLjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineName", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/Specializes;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/inject/spi/AnnotatedType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("@Specialized Class : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" must not directly extend Object.class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getAnnotatedElementFactory", "()Lorg/apache/webbeans/portable/AnnotatedElementFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedElementFactory", "newAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/Specializes;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder;Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "lambda$defineName$0", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/lang/String;", false), Type.getType("()Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "defineName", "(Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Supplier;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "name", "Ljava/lang/String;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "lambda$defineName$1", "()Ljava/lang/String;", false), Type.getType("()Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "defineName", "(Ljavax/enterprise/inject/spi/Annotated;Ljava/util/function/Supplier;)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/inject/Named;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAnnotationPresent", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/exception/WebBeansConfigurationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("@Specialized Class : ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" may not explicitly declare a bean name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/exception/WebBeansConfigurationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "defineNullable", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "defineNullable", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedType;", "()Ljavax/enterprise/inject/spi/AnnotatedType<-TC;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/inject/spi/AnnotatedType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSuperclass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getAnnotatedElementFactory", "()Lorg/apache/webbeans/portable/AnnotatedElementFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/portable/AnnotatedElementFactory", "newAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/Specializes;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getSuperAnnotated", "()Ljavax/enterprise/inject/spi/AnnotatedType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$defineName$1", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/AnnotatedType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getManagedBeanDefaultName", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$defineName$0", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/component/creation/BeanAttributesBuilder$AnnotatedTypeBeanAttributesBuilder", "getManagedBeanDefaultName", "(Ljavax/enterprise/inject/spi/AnnotatedType;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
