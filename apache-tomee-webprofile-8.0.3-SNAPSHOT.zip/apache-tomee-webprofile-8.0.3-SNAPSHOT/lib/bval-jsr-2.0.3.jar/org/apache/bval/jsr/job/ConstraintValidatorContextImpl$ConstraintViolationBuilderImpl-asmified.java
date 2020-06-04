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
public class ConstraintValidatorContextImpl$ConstraintViolationBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", null, "java/lang/Object", new String[] { "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder" });

classWriter.visitInnerClass("org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "ConstraintViolationBuilderImpl", ACC_PUBLIC);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "javax/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/util/Exceptions$FormatArgs", "org/apache/bval/util/Exceptions", "FormatArgs", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "ParameterNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("javax/validation/Path$Node", "javax/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "template", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "path", "Lorg/apache/bval/jsr/util/PathImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "complete", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;Ljava/lang/String;Lorg/apache/bval/jsr/util/PathImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "template", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNode", "(Ljava/lang/String;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeBuilderDefinedContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "extensiblePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addProperty", "(Ljava/lang/String;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeBuilderDefinedContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addPropertyNode", "(Ljava/lang/String;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "extensiblePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBeanNode", "()Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "extensiblePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addParameterNode", "(I)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "access$000", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$Frame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/validation/metadata/CrossParameterDescriptor");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljavax/validation/ValidationException;")});
methodVisitor.visitLdcInsn("Cannot add parameter node for %s");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "lambda$addParameterNode$0", "(Lorg/apache/bval/util/Exceptions$FormatArgs;)V", false), Type.getType("(Lorg/apache/bval/util/Exceptions$FormatArgs;)V")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseUnless", "(ZLjava/util/function/Function;Ljava/lang/String;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "access$000", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$Frame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/descriptor/CrossParameterD;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/descriptor/ComposedD", "unwrap", "(Ljavax/validation/metadata/ElementDescriptor;Ljava/lang/Class;)Ljava/util/stream/Stream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "findFirst", "()Ljava/util/Optional;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/CrossParameterD");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/CrossParameterD", "getParent", "()Lorg/apache/bval/jsr/descriptor/ElementD;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/ExecutableD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/ExecutableD", "getParameterDescriptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/metadata/ParameterDescriptor");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/metadata/ParameterDescriptor", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "removeLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeBuilderDefinedContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$ParameterNodeImpl", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljavax/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeBuilderDefinedContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "()Ljavax/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "addConstraintViolation", "(Lorg/apache/bval/jsr/util/PathImpl;)Ljavax/validation/ConstraintValidatorContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<TT;>.ConstraintViolationBuilderImpl;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "complete", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("#addConstraintViolation() already called");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "validState", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "(Lorg/apache/bval/jsr/util/PathImpl;)Ljavax/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "complete", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "org/apache/bval/jsr/util/PathImpl", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "template", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "access$100", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;Ljava/lang/String;Lorg/apache/bval/jsr/util/PathImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addContainerElementNode", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/Integer;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "extensiblePath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extensiblePath", "()Lorg/apache/bval/jsr/util/PathImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "isRootPath", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/PathImpl", "create", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/PathImpl", "copy", "(Ljavax/validation/Path;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "getKind", "()Ljavax/validation/ElementKind;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ElementKind", "BEAN", "Ljavax/validation/ElementKind;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "isInIterable", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "getContainerClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "removeLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/bval/jsr/util/PathImpl", "org/apache/bval/jsr/util/NodeImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$addParameterNode$0", "(Lorg/apache/bval/util/Exceptions$FormatArgs;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "this$0", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "access$000", "(Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$Frame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/util/Exceptions$FormatArgs", "args", "([Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
