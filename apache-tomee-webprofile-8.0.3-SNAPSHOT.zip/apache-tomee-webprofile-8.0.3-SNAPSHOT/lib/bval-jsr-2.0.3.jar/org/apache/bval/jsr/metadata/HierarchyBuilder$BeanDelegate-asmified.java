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
public class HierarchyBuilder$BeanDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "<H:Ljava/lang/Object;T:TH;>Lorg/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate<Ljava/lang/Class<TH;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TH;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", "org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "BeanDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ContainerDelegate", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ExecutableDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ExecutableDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "HierarchyDelegate", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForClass", "org/apache/bval/jsr/metadata/Meta", "ForClass", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ClassDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForMethod", "org/apache/bval/jsr/metadata/Meta", "ForMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForField", "org/apache/bval/jsr/metadata/Meta", "ForField", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;Ljava/lang/Class;)V", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TH;>;Ljava/lang/Class<TH;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForClass", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFields", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Field;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getFields", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate;Ljava/util/Map;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "lambda$getFields$0", "(Ljava/util/Map;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false), Type.getType("(Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructors", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Constructor<+TT;>;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getConstructors", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate;Ljava/util/Map;Ljava/util/List;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "lambda$getGetters$1", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false), Type.getType("(Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/Liskov", "validateValidateOnExecution", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate;Ljava/util/Map;Ljava/util/List;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "lambda$getMethods$2", "(Ljava/util/Map;Ljava/util/List;Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/Liskov", "validateValidateOnExecution", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getMethods$2", "(Ljava/util/Map;Ljava/util/List;Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/HierarchyBuilder$ExecutableDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Signature", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Signature", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/reflection/Reflection", "getDeclaredMethod", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForMethod", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/BiFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEINTERFACE, "javax/validation/ParameterNameProvider", "getParameterNames", "(Ljava/lang/reflect/Method;)Ljava/util/List;", true), Type.getType("(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Method;)Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ExecutableDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/Meta;Ljava/util/function/BiFunction;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getGetters$1", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "getter", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Method"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalStateException;")});
methodVisitor.visitLdcInsn("delegate builder specified unknown getter");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseIf", "(ZLjava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForMethod", "<init>", "(Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getFields$0", "(Ljava/util/Map;Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/reflection/Reflection", "getDeclaredField", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Field"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalStateException;")});
methodVisitor.visitLdcInsn("delegate builder specified unknown field");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseIf", "(ZLjava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$BeanDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForField", "<init>", "(Ljava/lang/reflect/Field;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
