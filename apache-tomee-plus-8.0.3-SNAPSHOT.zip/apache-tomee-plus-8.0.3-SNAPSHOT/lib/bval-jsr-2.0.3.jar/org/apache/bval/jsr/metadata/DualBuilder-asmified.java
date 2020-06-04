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
public class DualBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/metadata/DualBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper", "org/apache/bval/jsr/metadata/DualBuilder", "CustomWrapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForExecutable", "org/apache/bval/jsr/metadata/DualBuilder", "ForExecutable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForContainer", "org/apache/bval/jsr/metadata/DualBuilder", "ForContainer", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForClass", "org/apache/bval/jsr/metadata/DualBuilder", "ForClass", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForElement", "org/apache/bval/jsr/metadata/DualBuilder", "ForElement", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForBean", "org/apache/bval/jsr/metadata/DualBuilder", "ForBean", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$Delegator", "org/apache/bval/jsr/metadata/DualBuilder", "Delegator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForClass", "org/apache/bval/jsr/metadata/Meta", "ForClass", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForBean", "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper", "ForBean", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForMethod", "org/apache/bval/jsr/metadata/Meta", "ForMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForGetterMethod", "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper", "ForGetterMethod", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "forBean", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Lorg/apache/bval/jsr/ApacheValidatorFactory;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;Lorg/apache/bval/jsr/ApacheValidatorFactory;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$ForBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder", "wrapCustom", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Ljava/lang/Class;Lorg/apache/bval/jsr/ApacheValidatorFactory;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForBean", "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "wrapCustom", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Ljava/lang/Class;Lorg/apache/bval/jsr/ApacheValidatorFactory;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;", "<T:Ljava/lang/Object;>(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;Ljava/lang/Class<TT;>;Lorg/apache/bval/jsr/ApacheValidatorFactory;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForClass", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Signature", "isGetter", "()Z", false), Type.getType("(Lorg/apache/bval/jsr/metadata/Signature;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "noneMatch", "(Ljava/util/function/Predicate;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/bval/jsr/metadata/Meta$ForClass", "java/util/Map", "java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/AnnotationBehaviorMergeStrategy", "consensus", "()Lorg/apache/bval/jsr/metadata/AnnotationBehaviorMergeStrategy;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/CompositeBuilder", "with", "(Lorg/apache/bval/jsr/ApacheValidatorFactory;Lorg/apache/bval/jsr/metadata/AnnotationBehaviorMergeStrategy;)Lorg/apache/bval/jsr/metadata/CompositeBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/util/Map;Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/CompositeBuilder;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder", "lambda$wrapCustom$1", "(Ljava/util/Map;Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/lang/Class;Ljava/util/Map;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/util/Map;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder", "lambda$wrapCustom$2", "(Ljava/lang/Class;Ljava/util/Map;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/util/Map;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false), Type.getType("(Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForBean", "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Ljava/util/Map;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$wrapCustom$2", "(Ljava/lang/Class;Ljava/util/Map;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/util/Map;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "getter", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/Signature", "of", "(Ljava/lang/reflect/Executable;)Lorg/apache/bval/jsr/metadata/Signature;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForMethod", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/CompositeBuilder", "composeContainer", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ASTORE, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/reflect/Method", "org/apache/bval/jsr/metadata/Signature"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForGetterMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$CustomWrapper$ForGetterMethod", "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/DualBuilder$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$wrapCustom$1", "(Ljava/util/Map;Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Signature", "isGetter", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Signature", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "propertyName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/CompositeBuilder;)Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/DualBuilder", "lambda$null$0", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("(Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "compute", "(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$0", "(Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "getter", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForMethod", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "java/util/Objects", "nonNull", "(Ljava/lang/Object;)Z", false), Type.getType("(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)Z")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "filter", "(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/CompositeBuilder", "composeContainer", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
