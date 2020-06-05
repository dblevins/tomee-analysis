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
public class XJCJavaFieldImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/javamodel/JavaField" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xjcField", "Lcom/sun/codemodel/JFieldVar;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jCodeModel", "Lcom/sun/codemodel/JCodeModel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "owningClass", "Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "JVAR_ANNOTATIONS", "Ljava/lang/reflect/Field;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "JARRAYCLASS_COMPONENTTYPE", "Ljava/lang/reflect/Field;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/codemodel/JFieldVar;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "owningClass", "Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JVAR_ANNOTATIONS", "Ljava/lang/reflect/Field;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getValueFromField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "org/eclipse/persistence/jaxb/javamodel/JavaClass", "java/util/Collection"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JAnnotationUse");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl", "<init>", "(Lcom/sun/codemodel/JAnnotationUse;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl", "getJavaAnnotationClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getCanonicalName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jaxb/javamodel/JavaClass", "getQualifiedName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotations", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JVAR_ANNOTATIONS", "Ljava/lang/reflect/Field;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getValueFromField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "java/util/ArrayList", "java/util/Collection"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JAnnotationUse");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaAnnotationImpl", "<init>", "(Lcom/sun/codemodel/JAnnotationUse;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getModifiers", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JFieldVar", "mods", "()Lcom/sun/codemodel/JMods;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JMods", "getValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JFieldVar", "name", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResolvedType", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "com/sun/codemodel/JClassAlreadyExistsException");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "xjcField", "Lcom/sun/codemodel/JFieldVar;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JFieldVar", "type", "()Lcom/sun/codemodel/JType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn("basis");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getValueFromField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JClass");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "com/sun/codemodel/JType", "com/sun/codemodel/JType", Opcodes.INTEGER, Opcodes.INTEGER}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "isPrimitive", "()Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JPrimitiveType");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JPrimitiveType", "boxify", "()Lcom/sun/codemodel/JClass;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/codemodel/JClass"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("JArrayClass");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JClass");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JARRAYCLASS_COMPONENTTYPE", "Ljava/lang/reflect/Field;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getValueFromField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JType");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "isPrimitive", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "fullName", "()Ljava/lang/String;", false);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/codemodel/JCodeModel"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "fullName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "com/sun/codemodel/JType", "com/sun/codemodel/JType", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/codemodel/JClass"}, 2, new Object[] {"com/sun/codemodel/JCodeModel", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_class", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/codemodel/JClassAlreadyExistsException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label17);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "fullName", "()Ljava/lang/String;", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "com/sun/codemodel/JType", "com/sun/codemodel/JType", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/codemodel/JClass", "com/sun/codemodel/JClassAlreadyExistsException"}, 1, new Object[] {"com/sun/codemodel/JCodeModel"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JType", "fullName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "com/sun/codemodel/JType", "com/sun/codemodel/JType", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/codemodel/JClass", "com/sun/codemodel/JClassAlreadyExistsException"}, 2, new Object[] {"com/sun/codemodel/JCodeModel", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JCodeModel", "_getClass", "(Ljava/lang/String;)Lcom/sun/codemodel/JDefinedClass;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn("args");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getValueFromField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label20 = new Label();
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/reflect/Field", "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JClass");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JDefinedClass");
methodVisitor.visitLdcInsn("param");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JDefinedClass", "generify", "(Ljava/lang/String;Lcom/sun/codemodel/JClass;)Lcom/sun/codemodel/JTypeVar;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/codemodel/JClass", "fullName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label21);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("[]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getOwningClass", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "getJavaModel", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaModel;", false);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label22);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getOwningClass", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "getJavaModel", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaModel;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jaxb/javamodel/JavaModel", "getClass", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/codemodel/JDefinedClass");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "jCodeModel", "Lcom/sun/codemodel/JCodeModel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "dynamicClassLoader", "Lorg/eclipse/persistence/dynamic/DynamicClassLoader;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaClassImpl", "<init>", "(Lcom/sun/codemodel/JDefinedClass;Lcom/sun/codemodel/JCodeModel;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;ZZ)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFinal", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isFinal", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAbstract", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isAbstract", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPrivate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isPrivate", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isProtected", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isProtected", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPublic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isPublic", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStatic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Modifier", "isStatic", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSynthetic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("isSynthetic");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnumConstant", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getOwningClass", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/jaxb/javamodel/JavaClass", "isEnum", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredAnnotation", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getAnnotation", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredAnnotations", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/eclipse/persistence/jaxb/javamodel/JavaAnnotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "getAnnotations", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOwningClass", "(Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "owningClass", "Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOwningClass", "()Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "owningClass", "Lorg/eclipse/persistence/jaxb/javamodel/JavaClass;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JVAR_ANNOTATIONS", "Ljava/lang/reflect/Field;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JARRAYCLASS_COMPONENTTYPE", "Ljava/lang/reflect/Field;");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/codemodel/JVar;"));
methodVisitor.visitLdcInsn("annotations");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JVAR_ANNOTATIONS", "Ljava/lang/reflect/Field;");
methodVisitor.visitLdcInsn("com.sun.codemodel.JArrayClass");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("componentType");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/javamodel/xjc/XJCJavaFieldImpl", "JARRAYCLASS_COMPONENTTYPE", "Ljava/lang/reflect/Field;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}