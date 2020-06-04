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
public class ValidationJob$BeanFrameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "<B:Ljava/lang/Object;>Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<Lorg/apache/bval/jsr/descriptor/BeanD<TB;>;>;", "org/apache/bval/jsr/job/ValidationJob$Frame", null);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$BeanFrame", "org/apache/bval/jsr/job/ValidationJob", "BeanFrame", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$SproutFrame", "org/apache/bval/jsr/job/ValidationJob", "SproutFrame", ACC_PUBLIC);

classWriter.visitInnerClass("javax/validation/Path$Node", "javax/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "realContext", "Lorg/apache/bval/jsr/GraphContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/GraphContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/GraphContext;)V", "(Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;Lorg/apache/bval/jsr/GraphContext;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob", "access$300", "(Lorg/apache/bval/jsr/job/ValidationJob;Ljava/lang/Object;)Lorg/apache/bval/jsr/descriptor/BeanD;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getPath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addBean", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "child", "(Ljavax/validation/Path;Ljava/lang/Object;)Lorg/apache/bval/jsr/GraphContext;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "realContext", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
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
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/job/ValidationJob$BeanFrame;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "propertyFrames", "()Ljava/util/Set;", false), Type.getType("()Ljava/util/Set;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/groups/Group", "DEFAULT", "Lorg/apache/bval/jsr/groups/Group;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/BeanD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/BeanD", "getGroupStrategy", "()Lorg/apache/bval/jsr/groups/GroupStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/groups/GroupStrategy", "redefining", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/Map;)Lorg/apache/bval/jsr/groups/GroupStrategy;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/job/ValidationJob$BeanFrame;Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$process$1", "(Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;)V", false), Type.getType("(Lorg/apache/bval/jsr/groups/GroupStrategy;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob", "noViolations", "(Ljava/util/function/Consumer;)Ljava/util/function/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/groups/GroupStrategy", "applyTo", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$process$2", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", false), Type.getType("(Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/bval/util/Lazy", "org/apache/bval/jsr/groups/GroupStrategy"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "propertyFrame", "(Lorg/apache/bval/jsr/descriptor/PropertyD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", "(Lorg/apache/bval/jsr/descriptor/PropertyD<*>;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidationJob$SproutFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$SproutFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getBean", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "context", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "propertyFrames", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "descriptor", "Lorg/apache/bval/jsr/descriptor/ElementD;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/BeanD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/BeanD", "getConstrainedProperties", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$propertyFrames$3", "(Ljavax/validation/metadata/PropertyDescriptor;)Ljava/util/stream/Stream;", false), Type.getType("(Ljavax/validation/metadata/PropertyDescriptor;)Ljava/util/stream/Stream;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "flatMap", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$propertyFrames$4", "(Lorg/apache/bval/jsr/descriptor/PropertyD;)Lorg/apache/bval/jsr/descriptor/PropertyD;", false), Type.getType("(Lorg/apache/bval/jsr/descriptor/PropertyD;)Lorg/apache/bval/jsr/descriptor/PropertyD;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheFactoryContext", "getTraversableResolver", "()Ljavax/validation/TraversableResolver;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("test", "(Lorg/apache/bval/jsr/job/ValidationJob$BeanFrame;Ljavax/validation/TraversableResolver;)Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$propertyFrames$5", "(Ljavax/validation/TraversableResolver;Lorg/apache/bval/jsr/descriptor/PropertyD;)Z", false), Type.getType("(Lorg/apache/bval/jsr/descriptor/PropertyD;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/job/ValidationJob$BeanFrame;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$propertyFrames$8", "(Lorg/apache/bval/jsr/descriptor/PropertyD;)Ljava/util/stream/Stream;", false), Type.getType("(Lorg/apache/bval/jsr/descriptor/PropertyD;)Ljava/util/stream/Stream;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "flatMap", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toSet", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$propertyFrames$8", "(Lorg/apache/bval/jsr/descriptor/PropertyD;)Ljava/util/stream/Stream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "realContext", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/PropertyD", "read", "(Lorg/apache/bval/jsr/GraphContext;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$null$6", "(Lorg/apache/bval/jsr/GraphContext;)Z", false), Type.getType("(Lorg/apache/bval/jsr/GraphContext;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/job/ValidationJob$BeanFrame;Lorg/apache/bval/jsr/descriptor/PropertyD;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$null$7", "(Lorg/apache/bval/jsr/descriptor/PropertyD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false), Type.getType("(Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$null$7", "(Lorg/apache/bval/jsr/descriptor/PropertyD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "propertyFrame", "(Lorg/apache/bval/jsr/descriptor/PropertyD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$6", "(Lorg/apache/bval/jsr/GraphContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "isRecursive", "()Z", false);
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
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$propertyFrames$5", "(Ljavax/validation/TraversableResolver;Lorg/apache/bval/jsr/descriptor/PropertyD;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/validation/ValidationException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "realContext", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getPath", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/PropertyD", "getPropertyName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addProperty", "(Ljava/lang/String;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "context", "Lorg/apache/bval/jsr/GraphContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/GraphContext", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "removeLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidationJob;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob", "getRootBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/PropertyD", "getElementType", "()Ljava/lang/annotation/ElementType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/TraversableResolver", "isReachable", "(Ljava/lang/Object;Ljavax/validation/Path$Node;Ljava/lang/Class;Ljavax/validation/Path;Ljava/lang/annotation/ElementType;)Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/bval/jsr/job/ValidationJob$BeanFrame", "javax/validation/TraversableResolver", "org/apache/bval/jsr/descriptor/PropertyD", "org/apache/bval/jsr/util/PathImpl"}, 1, new Object[] {"javax/validation/ValidationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "javax/validation/ValidationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$propertyFrames$4", "(Lorg/apache/bval/jsr/descriptor/PropertyD;)Lorg/apache/bval/jsr/descriptor/PropertyD;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$propertyFrames$3", "(Ljavax/validation/metadata/PropertyDescriptor;)Ljava/util/stream/Stream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/descriptor/PropertyD;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/descriptor/ComposedD", "unwrap", "(Ljavax/validation/metadata/ElementDescriptor;Ljava/lang/Class;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$process$1", "(Ljava/util/function/Consumer;Lorg/apache/bval/util/Lazy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "validateDescriptorConstraints", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "lambda$null$0", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", false), Type.getType("(Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$0", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/groups/GroupStrategy;Lorg/apache/bval/jsr/job/ValidationJob$Frame;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "validateDescriptorConstraints", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidationJob$Frame", "recurse", "(Lorg/apache/bval/jsr/groups/GroupStrategy;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
