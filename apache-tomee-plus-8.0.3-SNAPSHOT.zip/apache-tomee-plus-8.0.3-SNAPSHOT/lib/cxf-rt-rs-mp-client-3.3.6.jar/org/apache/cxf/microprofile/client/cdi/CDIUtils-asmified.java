package asm.org.apache.cxf.microprofile.client.cdi;
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
public class CDIUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/microprofile/client/cdi/CDIUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getCurrentBeanManager", "(Lorg/apache/cxf/Bus;)Ljavax/enterprise/inject/spi/BeanManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/BeanManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/BeanManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "getCurrentBeanManager", "()Ljavax/enterprise/inject/spi/BeanManager;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/BeanManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "setExtension", "(Ljava/lang/Object;Ljava/lang/Class;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/inject/spi/BeanManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getCurrentBeanManager", "()Ljavax/enterprise/inject/spi/BeanManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/enterprise/inject/spi/CDI", "current", "()Ljavax/enterprise/inject/spi/CDI;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/enterprise/inject/spi/CDI", "getBeanManager", "()Ljavax/enterprise/inject/spi/BeanManager;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getInstanceFromCDI", "(Ljava/lang/Class;)Lorg/apache/cxf/microprofile/client/cdi/Instance;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/cxf/microprofile/client/cdi/Instance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "getInstanceFromCDI", "(Ljava/lang/Class;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getInstanceFromCDI", "(Ljava/lang/Class;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance<TT;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ExceptionInInitializerError");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoClassDefFoundError");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalStateException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/util/NoSuchElementException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "findBean", "(Ljava/lang/Class;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/NoSuchElementException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/microprofile/client/cdi/Instance"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "findBean", "(Ljava/lang/Class;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/microprofile/client/cdi/Instance<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "getCurrentBeanManager", "()Ljavax/enterprise/inject/spi/BeanManager;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "getCurrentBeanManager", "(Lorg/apache/cxf/Bus;)Ljavax/enterprise/inject/spi/BeanManager;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/enterprise/inject/spi/BeanManager"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/Bean");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/microprofile/client/cdi/Instance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "isNormalScope", "(Ljava/lang/Class;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInvokeDynamicInsn("run", "()Ljava/lang/Runnable;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/cxf/microprofile/client/cdi/CDIUtils", "lambda$findBean$0", "()V", false), Type.getType("()V")});
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"java/lang/Class", "org/apache/cxf/Bus", "javax/enterprise/inject/spi/BeanManager", "javax/enterprise/inject/spi/Bean", "javax/enterprise/context/spi/CreationalContext"}, 3, new Object[] {label2, label2, "java/lang/Object"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("run", "(Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Runnable;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()V"), new Handle(Opcodes.H_INVOKEINTERFACE, "javax/enterprise/context/spi/CreationalContext", "release", "()V", true), Type.getType("()V")});
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"java/lang/Class", "org/apache/cxf/Bus", "javax/enterprise/inject/spi/BeanManager", "javax/enterprise/inject/spi/Bean", "javax/enterprise/context/spi/CreationalContext"}, 4, new Object[] {label2, label2, "java/lang/Object", "java/lang/Runnable"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/microprofile/client/cdi/Instance", "<init>", "(Ljava/lang/Object;Ljava/lang/Runnable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$findBean$0", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
