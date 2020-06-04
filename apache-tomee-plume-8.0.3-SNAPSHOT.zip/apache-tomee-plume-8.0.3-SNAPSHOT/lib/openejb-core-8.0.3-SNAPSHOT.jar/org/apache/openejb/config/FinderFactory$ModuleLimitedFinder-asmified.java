package asm.org.apache.openejb.config;
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
public class FinderFactory$ModuleLimitedFinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", null, "java/lang/Object", new String[] { "org/apache/xbean/finder/IAnnotationFinder" });

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "org/apache/openejb/config/FinderFactory", "ModuleLimitedFinder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "AnnotatedFieldPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedMethodPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "AnnotatedMethodPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedClassPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "AnnotatedClassPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ConstructorPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "ConstructorPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$FieldPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "FieldPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$MethodPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "MethodPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "ClassPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "Predicate", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "org/apache/openejb/config/FinderFactory", "OpenEJBAnnotationFinder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$ClassInfo", "org/apache/xbean/finder/AnnotationFinder", "ClassInfo", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAnnotationPresent", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "isAnnotationPresent", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassesNotLoaded", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "getClassesNotLoaded", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAnnotatedPackages", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Package;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findAnnotatedPackages", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/TypeNotPresentException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/TypeNotPresentException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "handleException", "(Ljava/lang/TypeNotPresentException;Ljava/lang/Class;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "handleException", "(Ljava/lang/TypeNotPresentException;Ljava/lang/Class;)Ljava/lang/RuntimeException;", "(Ljava/lang/TypeNotPresentException;Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/lang/RuntimeException;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/TypeNotPresentException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/ThreadDeath");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/Throwable");
methodVisitor.visitLabel(label4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xbean/finder/AnnotationFinder;"));
methodVisitor.visitLdcInsn("getAnnotationInfos");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "setAccessible", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/reflect/Method", "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/xbean/finder/AnnotationFinder$ClassInfo");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/AnnotationFinder$ClassInfo");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AnnotationFinder$ClassInfo", "get", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAnnotationPresent", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "java/lang/TypeNotPresentException", "java/lang/Class", "java/lang/reflect/Method", "java/util/List", "java/util/Iterator", "java/lang/Object", "org/apache/xbean/finder/AnnotationFinder$ClassInfo"}, 1, new Object[] {"java/lang/TypeNotPresentException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Missing type for annotation ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" on class ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AnnotationFinder$ClassInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ThreadDeath"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findInheritedAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findInheritedAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$MethodPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$MethodPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAnnotatedConstructors", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Constructor;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findAnnotatedConstructors", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ConstructorPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ConstructorPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Ljava/lang/reflect/Field;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$FieldPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$FieldPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findClassesInPackage", "(Ljava/lang/String;Z)Ljava/util/List;", "(Ljava/lang/String;Z)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findClassesInPackage", "(Ljava/lang/String;Z)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findSubclasses", "(Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<Ljava/lang/Class<+TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findSubclasses", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findImplementations", "(Ljava/lang/Class;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<Ljava/lang/Class<+TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findImplementations", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$ClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findMetaAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findMetaAnnotatedMethods", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedMethodPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedMethodPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findMetaAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Field;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findMetaAnnotatedFields", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findMetaAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)Ljava/util/List<Lorg/apache/xbean/finder/Annotated<Ljava/lang/Class<*>;>;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/TypeNotPresentException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "findMetaAnnotatedClasses", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedClassPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedClassPredicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/TypeNotPresentException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "handleException", "(Ljava/lang/TypeNotPresentException;Ljava/lang/Class;)Ljava/lang/RuntimeException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedClassNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder", "getAnnotatedClassNames", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "filter", "(Ljava/util/List;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate;)Ljava/util/List;", "<T:Ljava/lang/Object;>(Ljava/util/List<TT;>;Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate<TT;>;)Ljava/util/List<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate", "accept", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Lorg/apache/xbean/finder/IAnnotationFinder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "delegate", "Lorg/apache/openejb/config/FinderFactory$OpenEJBAnnotationFinder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
