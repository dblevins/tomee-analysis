package asm.org.apache.myfaces.cdi.util;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/cdi/util/CDIUtils", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getBeanManager", "(Ljavax/faces/context/ExternalContext;)Ljavax/enterprise/inject/spi/BeanManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("oam.cdi.BEAN_MANAGER_INSTANCE");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/BeanManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookup", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "resolveInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/util/Set;Ljava/lang/reflect/Type;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "lookup", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/String;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "resolveInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/util/Set;Ljava/lang/reflect/Type;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "resolveInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/util/Set;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanManager;Ljava/util/Set<Ljavax/enterprise/inject/spi/Bean<*>;>;Ljava/lang/reflect/Type;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "resolve", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/Bean;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class<TT;>;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/Bean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Set", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/Bean");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getBeanClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "getInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class;Z[Ljava/lang/annotation/Annotation;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class<TT;>;Z[Ljava/lang/annotation/Annotation;)TT;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/enterprise/context/ContextNotActiveException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "resolve", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/lang/Class;[Ljava/lang/annotation/Annotation;)Ljavax/enterprise/inject/spi/Bean;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/cdi/util/CDIUtils", "getInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljavax/enterprise/inject/spi/Bean;Z)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/inject/spi/Bean"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Object"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"javax/enterprise/inject/spi/BeanManager", "java/lang/Class", Opcodes.INTEGER, "[Ljava/lang/annotation/Annotation;"}, 1, new Object[] {"javax/enterprise/context/ContextNotActiveException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljavax/enterprise/inject/spi/BeanManager;Ljavax/enterprise/inject/spi/Bean;Z)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/enterprise/inject/spi/BeanManager;Ljavax/enterprise/inject/spi/Bean<TT;>;Z)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/Context", "get", "(Ljavax/enterprise/context/spi/Contextual;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/context/spi/Context"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/Context", "get", "(Ljavax/enterprise/context/spi/Contextual;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isSessionScopeActive", "(Ljavax/enterprise/inject/spi/BeanManager;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/enterprise/context/ContextNotActiveException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/SessionScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/context/spi/Context"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"javax/enterprise/inject/spi/BeanManager"}, 1, new Object[] {"javax/enterprise/context/ContextNotActiveException"});
methodVisitor.visitVarInsn(ASTORE, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isViewScopeActive", "(Ljavax/enterprise/inject/spi/BeanManager;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/enterprise/context/ContextNotActiveException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/view/ViewScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getContext", "(Ljava/lang/Class;)Ljavax/enterprise/context/spi/Context;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/enterprise/context/spi/Context"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"javax/enterprise/inject/spi/BeanManager"}, 1, new Object[] {"javax/enterprise/context/ContextNotActiveException"});
methodVisitor.visitVarInsn(ASTORE, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
