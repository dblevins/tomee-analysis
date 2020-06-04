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
public class DualBuilder$ForBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "<T:Ljava/lang/Object;>Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator<Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", "org/apache/bval/jsr/metadata/DualBuilder$Delegator", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForBean", "org/apache/bval/jsr/metadata/DualBuilder", "ForBean", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$Delegator", "org/apache/bval/jsr/metadata/DualBuilder", "Delegator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForClass", "org/apache/bval/jsr/metadata/DualBuilder", "ForClass", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForExecutable", "org/apache/bval/jsr/metadata/DualBuilder", "ForExecutable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForContainer", "org/apache/bval/jsr/metadata/DualBuilder", "ForContainer", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$Delegator", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "primaryDelegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "customDelegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForClass", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFields", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Field;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getFields$0", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/DualBuilder$ForBean;)Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getFields$1", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "merge", "(Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Supplier;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getGetters$2", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/DualBuilder$ForBean;)Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getGetters$3", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "merge", "(Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Supplier;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructors", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Constructor<+TT;>;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getConstructors$4", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/DualBuilder$ForBean;)Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getConstructors$5", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "merge", "(Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Supplier;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getMethods$6", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/DualBuilder$ForBean;)Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "lambda$getMethods$7", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "merge", "(Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Supplier;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getMethods$7", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForExecutable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForExecutable", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getMethods$6", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getConstructors$5", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForExecutable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForExecutable", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstructors$4", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getConstructors", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getGetters$3", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getGetters$2", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getFields$1", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getFields$0", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getFields", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
