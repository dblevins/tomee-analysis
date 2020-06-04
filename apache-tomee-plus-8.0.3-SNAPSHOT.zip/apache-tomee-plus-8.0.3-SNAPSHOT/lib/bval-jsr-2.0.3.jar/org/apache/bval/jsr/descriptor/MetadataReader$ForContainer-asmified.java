package asm.org.apache.bval.jsr.descriptor;
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
public class MetadataReader$ForContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "<E::Ljava/lang/reflect/AnnotatedElement;>Lorg/apache/bval/jsr/descriptor/MetadataReader$ForElement<TE;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;>;", "org/apache/bval/jsr/descriptor/MetadataReader$ForElement", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "org/apache/bval/jsr/descriptor/MetadataReader", "ForContainer", 0);

classWriter.visitInnerClass("org/apache/bval/util/Exceptions$FormatArgs", "org/apache/bval/util/Exceptions", "FormatArgs", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForElement", "org/apache/bval/jsr/descriptor/MetadataReader", "ForElement", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForContainerElement", "org/apache/bval/jsr/metadata/Meta", "ForContainerElement", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForElement", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isCascaded", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "builder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "isCascade", "(Lorg/apache/bval/jsr/metadata/Meta;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getGroupConversions", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/bval/jsr/groups/GroupConversion;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "builder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "getGroupConversions", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "isCascaded", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "javax/validation/ConstraintDeclarationException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljavax/validation/ConstraintDeclarationException;")});
methodVisitor.visitLdcInsn("@%s declared without @%s on %s");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/groups/ConvertGroup;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/Valid;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "describeHost", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raise", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Set"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/groups/GroupConversion", "getFrom", "()Ljava/lang/Class;", false), Type.getType("(Lorg/apache/bval/jsr/groups/GroupConversion;)Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "distinct", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "count", "()J", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "javax/validation/ConstraintDeclarationException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljavax/validation/ConstraintDeclarationException;")});
methodVisitor.visitLdcInsn("%s has duplicate 'from' group conversions");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "describeHost", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raise", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/groups/GroupConversion", "getFrom", "()Ljava/lang/Class;", false), Type.getType("(Lorg/apache/bval/jsr/groups/GroupConversion;)Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "lambda$getGroupConversions$1", "(Ljava/lang/Class;)V", false), Type.getType("(Ljava/lang/Class;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getContainerElementTypes", "(Lorg/apache/bval/jsr/descriptor/CascadableContainerD;)Ljava/util/Set;", "(Lorg/apache/bval/jsr/descriptor/CascadableContainerD<**>;)Ljava/util/Set<Lorg/apache/bval/jsr/descriptor/ContainerElementTypeD;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "builder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "getContainerElementTypes", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/ContainerElementTypeD", "getKey", "()Lorg/apache/bval/jsr/metadata/ContainerElementKey;", false), Type.getType("(Lorg/apache/bval/jsr/descriptor/ContainerElementTypeD;)Lorg/apache/bval/jsr/metadata/ContainerElementKey;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Comparator", "comparing", "(Ljava/util/function/Function;)Ljava/util/Comparator;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeSet", "<init>", "(Ljava/util/Comparator;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;Ljava/util/Set;Lorg/apache/bval/jsr/descriptor/CascadableContainerD;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "lambda$getContainerElementTypes$2", "(Ljava/util/Set;Lorg/apache/bval/jsr/descriptor/CascadableContainerD;Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getContainerElementTypes$2", "(Ljava/util/Set;Lorg/apache/bval/jsr/descriptor/CascadableContainerD;Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/ContainerElementTypeD");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForContainerElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForContainerElement", "<init>", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/ContainerElementKey;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ContainerElementTypeD", "<init>", "(Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;Lorg/apache/bval/jsr/descriptor/CascadableContainerD;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getGroupConversions$1", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/GroupSequence;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAnnotationPresent", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "javax/validation/ConstraintDeclarationException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljavax/validation/ConstraintDeclarationException;")});
methodVisitor.visitLdcInsn("Invalid group conversion declared on %s from group sequence %s");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;Ljava/lang/Class;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "lambda$null$0", "(Ljava/lang/Class;Lorg/apache/bval/util/Exceptions$FormatArgs;)V", false), Type.getType("(Lorg/apache/bval/util/Exceptions$FormatArgs;)V")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raiseIf", "(ZLjava/util/function/Function;Ljava/lang/String;Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$null$0", "(Ljava/lang/Class;Lorg/apache/bval/util/Exceptions$FormatArgs;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "describeHost", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/util/Exceptions$FormatArgs", "args", "([Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
