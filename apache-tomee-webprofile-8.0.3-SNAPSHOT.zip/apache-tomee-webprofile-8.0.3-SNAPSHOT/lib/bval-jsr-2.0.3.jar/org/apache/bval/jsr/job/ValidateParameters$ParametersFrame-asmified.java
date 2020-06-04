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
public class ValidateParameters$ParametersFrameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<Lorg/apache/bval/jsr/descriptor/CrossParameterD<**>;>;", "org/apache/bval/jsr/job/ValidationJob$Frame", null);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "org/apache/bval/jsr/job/ValidateParameters", "ParametersFrame", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$SproutFrame", "org/apache/bval/jsr/job/ValidationJob", "SproutFrame", ACC_PUBLIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "executableDescriptor", "Ljavax/validation/metadata/ExecutableDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/bval/jsr/job/ValidateParameters;Ljavax/validation/metadata/ExecutableDescriptor;Lorg/apache/bval/jsr/GraphContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("executableDescriptor");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/metadata/ExecutableDescriptor");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/metadata/ExecutableDescriptor", "getCrossParameterDescriptor", "()Ljavax/validation/metadata/CrossParameterDescriptor;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/CrossParameterD");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "executableDescriptor", "Ljavax/validation/metadata/ExecutableDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValidationTarget", "()Ljavax/validation/constraintvalidation/ValidationTarget;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/constraintvalidation/ValidationTarget", "PARAMETERS", "Ljavax/validation/constraintvalidation/ValidationTarget;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "process", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer<Ljavax/validation/ConstraintViolation<TT;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("sink");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/job/ValidateParameters$ParametersFrame;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "parameterFrames", "()Ljava/util/Set;", false), Type.getType("()Ljava/util/Set;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/groups/Group", "DEFAULT", "Lorg/apache/bval/jsr/groups/Group;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/CrossParameterD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/CrossParameterD", "getGroupStrategy", "()Lorg/apache/bval/jsr/groups/GroupStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/groups/GroupStrategy", "redefining", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/Map;)Lorg/apache/bval/jsr/groups/GroupStrategy;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/job/ValidateParameters$ParametersFrame;Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "lambda$process$1", "(Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;Lorg/apache/bval/jsr/groups/GroupStrategy;)V", false), Type.getType("(Lorg/apache/bval/jsr/groups/GroupStrategy;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters", "noViolations", "(Ljava/util/function/Consumer;)Ljava/util/function/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/groups/GroupStrategy", "applyTo", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "lambda$process$2", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", false), Type.getType("(Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getBean", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters", "object", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "parameterFrames", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "executableDescriptor", "Ljavax/validation/metadata/ExecutableDescriptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/metadata/ExecutableDescriptor", "getParameterDescriptors", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/job/ValidateParameters$ParametersFrame;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "lambda$parameterFrames$3", "(Ljavax/validation/metadata/ParameterDescriptor;)Lorg/apache/bval/jsr/job/ValidationJob$SproutFrame;", false), Type.getType("(Ljavax/validation/metadata/ParameterDescriptor;)Lorg/apache/bval/jsr/job/ValidationJob$SproutFrame;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toSet", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$parameterFrames$3", "(Ljavax/validation/metadata/ParameterDescriptor;)Lorg/apache/bval/jsr/job/ValidationJob$SproutFrame;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidationJob$SproutFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/ParameterD");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateParameters;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/metadata/ParameterDescriptor", "getIndex", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ValidateParameters", "access$000", "(Lorg/apache/bval/jsr/job/ValidateParameters;I)Lorg/apache/bval/jsr/GraphContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$SproutFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$process$2", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "recurse", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$process$1", "(Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;Lorg/apache/bval/jsr/groups/GroupStrategy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "validateDescriptorConstraints", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidateParameters$ParametersFrame", "lambda$null$0", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", false), Type.getType("(Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$0", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "validateDescriptorConstraints", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
