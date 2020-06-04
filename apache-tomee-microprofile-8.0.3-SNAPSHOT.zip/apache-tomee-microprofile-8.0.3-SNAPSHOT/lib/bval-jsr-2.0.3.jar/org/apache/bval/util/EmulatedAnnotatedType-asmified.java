package asm.org.apache.bval.util;
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
public class EmulatedAnnotatedTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/util/EmulatedAnnotatedType", "<T::Ljava/lang/reflect/Type;>Ljava/lang/Object;Ljava/lang/reflect/AnnotatedType;", "java/lang/Object", new String[] { "java/lang/reflect/AnnotatedType" });

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$Wildcard", "org/apache/bval/util/EmulatedAnnotatedType", "Wildcard", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$Variable", "org/apache/bval/util/EmulatedAnnotatedType", "Variable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$Parameterized", "org/apache/bval/util/EmulatedAnnotatedType", "Parameterized", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EMPTY_ANNOTATION_ARRAY", "[Ljava/lang/annotation/Annotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "wrapped", "Ljava/lang/reflect/Type;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotated", "Ljava/util/Optional;", "Ljava/util/Optional<Ljava/lang/reflect/AnnotatedElement;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "wrap", "(Ljava/lang/reflect/Type;)Lorg/apache/bval/util/EmulatedAnnotatedType;", "(Ljava/lang/reflect/Type;)Lorg/apache/bval/util/EmulatedAnnotatedType<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/ParameterizedType");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/EmulatedAnnotatedType$Parameterized");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/ParameterizedType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType$Parameterized", "<init>", "(Ljava/lang/reflect/ParameterizedType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/TypeVariable");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/EmulatedAnnotatedType$Variable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/TypeVariable");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType$Variable", "<init>", "(Ljava/lang/reflect/TypeVariable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/WildcardType");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/EmulatedAnnotatedType$Wildcard");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/WildcardType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType$Wildcard", "<init>", "(Ljava/lang/reflect/WildcardType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/EmulatedAnnotatedType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType", "<init>", "(Ljava/lang/reflect/Type;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "wrapArray", "([Ljava/lang/reflect/Type;)[Lorg/apache/bval/util/EmulatedAnnotatedType;", "([Ljava/lang/reflect/Type;)[Lorg/apache/bval/util/EmulatedAnnotatedType<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "wrap", "(Ljava/lang/reflect/Type;)Lorg/apache/bval/util/EmulatedAnnotatedType;", false), Type.getType("(Ljava/lang/reflect/Type;)Lorg/apache/bval/util/EmulatedAnnotatedType;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "lambda$wrapArray$0", "(I)[Lorg/apache/bval/util/EmulatedAnnotatedType;", false), Type.getType("(I)[Lorg/apache/bval/util/EmulatedAnnotatedType;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "toArray", "(Ljava/util/function/IntFunction;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/util/EmulatedAnnotatedType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/reflect/Type;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Type");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "wrapped", "Ljava/lang/reflect/Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "of", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/reflect/AnnotatedElement;"));
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("test", "(Ljava/lang/Class;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/reflect/Type;)Z")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "filter", "(Ljava/util/function/Predicate;)Ljava/util/Optional;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/reflect/AnnotatedElement;"));
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/lang/Class;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false), Type.getType("(Ljava/lang/reflect/Type;)Ljava/lang/reflect/AnnotatedElement;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "annotated", "Ljava/util/Optional;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)TA;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "annotated", "Ljava/util/Optional;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/lang/Class;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "lambda$getAnnotation$1", "(Ljava/lang/Class;Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;", false), Type.getType("(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotations", "()[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "annotated", "Ljava/util/Optional;");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "java/lang/reflect/AnnotatedElement", "getAnnotations", "()[Ljava/lang/annotation/Annotation;", true), Type.getType("(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "EMPTY_ANNOTATION_ARRAY", "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "annotated", "Ljava/util/Optional;");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "java/lang/reflect/AnnotatedElement", "getDeclaredAnnotations", "()[Ljava/lang/annotation/Annotation;", true), Type.getType("(Ljava/lang/reflect/AnnotatedElement;)[Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "EMPTY_ANNOTATION_ARRAY", "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/util/EmulatedAnnotatedType", "wrapped", "Ljava/lang/reflect/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getAnnotation$1", "(Ljava/lang/Class;Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/AnnotatedElement", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$wrapArray$0", "(I)[Lorg/apache/bval/util/EmulatedAnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/util/EmulatedAnnotatedType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/reflect/Type;Lorg/apache/bval/util/EmulatedAnnotatedType$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType", "<init>", "(Ljava/lang/reflect/Type;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "([Ljava/lang/reflect/Type;)[Lorg/apache/bval/util/EmulatedAnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "wrapArray", "([Ljava/lang/reflect/Type;)[Lorg/apache/bval/util/EmulatedAnnotatedType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/util/EmulatedAnnotatedType", "EMPTY_ANNOTATION_ARRAY", "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
