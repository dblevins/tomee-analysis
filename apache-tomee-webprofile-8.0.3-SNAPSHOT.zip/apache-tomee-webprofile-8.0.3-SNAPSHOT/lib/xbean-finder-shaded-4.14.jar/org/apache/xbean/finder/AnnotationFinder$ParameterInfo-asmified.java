package asm.org.apache.xbean.finder;
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
public class AnnotationFinder$ParameterInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", null, "org/apache/xbean/finder/AnnotationFinder$Annotatable", new String[] { "org/apache/xbean/finder/AnnotationFinder$Info" });

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$MethodInfo", "org/apache/xbean/finder/AnnotationFinder", "MethodInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$AnnotationInfo", "org/apache/xbean/finder/AnnotationFinder", "AnnotationInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "org/apache/xbean/finder/AnnotationFinder", "ParameterInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$Annotatable", "org/apache/xbean/finder/AnnotationFinder", "Annotatable", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AnnotationFinder$Info", "org/apache/xbean/finder/AnnotationFinder", "Info", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotations", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xbean/finder/AnnotationFinder$AnnotationInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameter", "Lorg/apache/xbean/finder/Parameter;", "Lorg/apache/xbean/finder/Parameter<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xbean/finder/AnnotationFinder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/finder/AnnotationFinder;Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "this$0", "Lorg/apache/xbean/finder/AnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AnnotationFinder$Annotatable", "<init>", "(Lorg/apache/xbean/finder/AnnotationFinder;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "annotations", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/finder/AnnotationFinder;Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;Lorg/apache/xbean/finder/Parameter;)V", "(Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;Lorg/apache/xbean/finder/Parameter<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "this$0", "Lorg/apache/xbean/finder/AnnotationFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AnnotationFinder$Annotatable", "<init>", "(Lorg/apache/xbean/finder/AnnotationFinder;Ljava/lang/reflect/AnnotatedElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "annotations", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/Parameter", "getIndex", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "parameter", "Lorg/apache/xbean/finder/Parameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Lorg/apache/xbean/finder/Parameter;", "()Lorg/apache/xbean/finder/Parameter<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "parameter", "Lorg/apache/xbean/finder/Parameter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AnnotationFinder$MethodInfo", "get", "()Ljava/lang/reflect/Member;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/Method");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/Parameter", "declaredBy", "(Ljava/lang/reflect/Method;I)Lorg/apache/xbean/finder/Parameter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "parameter", "Lorg/apache/xbean/finder/Parameter;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/Constructor");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/Parameter", "declaredBy", "(Ljava/lang/reflect/Constructor;I)Lorg/apache/xbean/finder/Parameter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "parameter", "Lorg/apache/xbean/finder/Parameter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "parameter", "Lorg/apache/xbean/finder/Parameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "get", "()Lorg/apache/xbean/finder/Parameter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/Parameter", "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AnnotationFinder$Annotatable", "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaringMethod", "()Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("%s(arg%s)");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "declaringMethod", "Lorg/apache/xbean/finder/AnnotationFinder$MethodInfo;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AnnotationFinder$ParameterInfo", "index", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
