package asm.org.apache.bval.jsr.job;
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
public class ValidateParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/jsr/job/ValidateParameters", "<E:Ljava/lang/reflect/Executable;T:Ljava/lang/Object;>Lorg/apache/bval/jsr/job/ValidateExecutable<TE;TT;>;", "org/apache/bval/jsr/job/ValidateExecutable", null);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "org/apache/bval/jsr/job/ValidateParameters", "ParametersFrame", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateParameters$ForConstructor", "org/apache/bval/jsr/job/ValidateParameters", "ForConstructor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateParameters$ForMethod", "org/apache/bval/jsr/job/ValidateParameters", "ForMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$CrossParameterNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "CrossParameterNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "ParameterNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Path$Node", "javax/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PARAMETERS_DO_NOT_MATCH", "Ljava/lang/String;", null, "Parameters do not match");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "object", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "parameterNames", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Ljava/util/List<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parameterValues", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Ljava/lang/Object;Ljava/lang/reflect/Executable;[Ljava/lang/Object;[Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/Meta;)V", "(Lorg/apache/bval/jsr/ApacheFactoryContext;TT;TE;[Ljava/lang/Object;[Ljava/lang/Class<*>;Lorg/apache/bval/jsr/metadata/Meta<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateExecutable", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;[Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/job/ValidateParameters;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters", "lambda$new$0", "()Ljava/util/List;", false), Type.getType("()Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterNames", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateParameters", "object", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;")});
methodVisitor.visitLdcInsn("null parameter values");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljava/lang/Object;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterValues", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Executable", "getGenericParameterTypes", "()[Ljava/lang/reflect/Type;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/bval/jsr/job/ValidateParameters", "org/apache/bval/jsr/ApacheFactoryContext", "java/lang/Object", "java/lang/reflect/Executable", "[Ljava/lang/Object;", "[Ljava/lang/Class;", "org/apache/bval/jsr/metadata/Meta", "[Ljava/lang/reflect/Type;"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;")});
methodVisitor.visitLdcInsn("Parameters do not match");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseUnless", "(ZLjava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/IntStream", "range", "(II)Ljava/util/stream/IntStream;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInvokeDynamicInsn("accept", "([Ljava/lang/Object;[Ljava/lang/reflect/Type;)Ljava/util/function/IntConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidateParameters", "lambda$new$1", "([Ljava/lang/Object;[Ljava/lang/reflect/Type;I)V", false), Type.getType("(I)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/IntStream", "forEach", "(Ljava/util/function/IntConsumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "computeBaseFrame", "()Lorg/apache/bval/jsr/job/ValidationJob$Frame;", "()Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "describe", "()Ljavax/validation/metadata/ExecutableDescriptor;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/GraphContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "createBasePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$CrossParameterNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$CrossParameterNodeImpl", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljavax/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterValues", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/GraphContext", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidateParameters;Ljavax/validation/metadata/ExecutableDescriptor;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "hasWork", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "describe", "()Ljavax/validation/metadata/ExecutableDescriptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "describe", "()Ljavax/validation/metadata/ExecutableDescriptor;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getParameterNames", "(Ljavax/validation/ParameterNameProvider;)Ljava/util/List;", "(Ljavax/validation/ParameterNameProvider;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getRootBean", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "createViolation", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/ConstraintViolationImpl;", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<TT;>;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/ConstraintViolationImpl<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintViolationImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "getRootBean", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "getFrame", "()Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "getBean", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "getFrame", "()Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$Frame", "context", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "getConstraintDescriptor", "()Ljavax/validation/metadata/ConstraintDescriptor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "getRootBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "getConstraintDescriptor", "()Ljavax/validation/metadata/ConstraintDescriptor;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/descriptor/ConstraintD;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/metadata/ConstraintDescriptor", "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/ConstraintD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/ConstraintD", "getDeclaredOn", "()Ljava/lang/annotation/ElementType;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterValues", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintViolationImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljavax/validation/Path;Ljava/lang/Object;Ljavax/validation/metadata/ConstraintDescriptor;Ljava/lang/Class;Ljava/lang/annotation/ElementType;Ljava/lang/Object;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(13, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "parameter", "(I)Lorg/apache/bval/jsr/GraphContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "createBasePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterNames", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljavax/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/GraphContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "parameterValues", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/GraphContext", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$1", "([Ljava/lang/Object;[Ljava/lang/reflect/Type;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/reflection/TypeUtils", "isInstance", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;")});
methodVisitor.visitLdcInsn("Parameters do not match");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseUnless", "(ZLjava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$0", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheFactoryContext", "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "getParameterNames", "(Ljavax/validation/ParameterNameProvider;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/bval/jsr/job/ValidateParameters;I)Lorg/apache/bval/jsr/GraphContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters", "parameter", "(I)Lorg/apache/bval/jsr/GraphContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
