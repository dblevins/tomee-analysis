package asm.org.eclipse.persistence.jaxb.javamodel.xjc;
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
public class XJCJavaModelImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/javamodel/JavaModel" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jCodeModel", "Lcom/sun/codemodel/JCodeModel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "javaModelClasses", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Ljava/lang/Class;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", "(Ljava/lang/Class<*>;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/codemodel/JClassAlreadyExistsException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/javamodel/JavaClass");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/jaxb/javamodel/JavaClass"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_class", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "<init>", "(Lcom/sun/codemodel/JDefinedClass;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "setJavaModel", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaModel;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/codemodel/JClassAlreadyExistsException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_getClass", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "<init>", "(Lcom/sun/codemodel/JDefinedClass;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "setJavaModel", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaModel;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "com/sun/codemodel/JClassAlreadyExistsException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/javamodel/JavaClass");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/jaxb/javamodel/JavaClass"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("[]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("[]");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("<");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/oxm/XMLConversionManager", "getPrimitiveClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_class", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "<init>", "(Lcom/sun/codemodel/JDefinedClass;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;ZZ)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "java/lang/String", "org/eclipse/persistence/jaxb/javamodel/JavaClass", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {"com/sun/codemodel/JClassAlreadyExistsException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_getClass", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "<init>", "(Lcom/sun/codemodel/JDefinedClass;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;ZZ)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;Ljava/lang/Class<*>;)Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl", "getJavaAnnotation", "()Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaModelClasses", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJavaModelClasses", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "javaModelClasses", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassLoader", "()Ljava/lang/ClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaModelImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}