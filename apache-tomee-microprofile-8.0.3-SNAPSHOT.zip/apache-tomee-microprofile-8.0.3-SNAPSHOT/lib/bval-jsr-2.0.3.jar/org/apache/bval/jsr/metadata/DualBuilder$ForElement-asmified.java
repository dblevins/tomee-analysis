package asm.org.apache.bval.jsr.metadata;
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
public class DualBuilder$ForElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/DualBuilder$ForElement", "<DELEGATE::Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;E::Ljava/lang/reflect/AnnotatedElement;>Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator<TDELEGATE;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;", "org/apache/bval/jsr/metadata/DualBuilder$Delegator", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForElement" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$Delegator", "org/apache/bval/jsr/metadata/DualBuilder", "Delegator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForElement", "org/apache/bval/jsr/metadata/DualBuilder", "ForElement", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)V", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator<*>;TDELEGATE;TDELEGATE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$Delegator", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/DualBuilder$ForElement", "activeDelegates", "()Ljava/util/stream/Stream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForElement", "lambda$getDeclaredConstraints$0", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)[Ljava/lang/annotation/Annotation;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)[Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true), Type.getType("([Ljava/lang/annotation/Annotation;)Ljava/util/stream/Stream;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "flatMap", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForElement", "lambda$getDeclaredConstraints$1", "(I)[Ljava/lang/annotation/Annotation;", false), Type.getType("(I)[Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "toArray", "(Ljava/util/function/IntFunction;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getDeclaredConstraints$1", "(I)[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getDeclaredConstraints$0", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
