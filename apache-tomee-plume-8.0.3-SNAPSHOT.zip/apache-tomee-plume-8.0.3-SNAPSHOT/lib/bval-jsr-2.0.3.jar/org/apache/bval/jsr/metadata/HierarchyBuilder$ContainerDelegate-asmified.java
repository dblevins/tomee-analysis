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
public class HierarchyBuilder$ContainerDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "<E::Ljava/lang/reflect/AnnotatedElement;>Lorg/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate<TE;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;", "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ContainerDelegate", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ElementDelegate", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForContainerElement", "org/apache/bval/jsr/metadata/Meta", "ForContainerElement", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/Meta;)V", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;Lorg/apache/bval/jsr/metadata/Meta<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isCascade", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "isCascade", "(Lorg/apache/bval/jsr/metadata/Meta;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isCascade", "(Lorg/apache/bval/jsr/metadata/Meta;)Z", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "isCascade", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getGroupConversions", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/bval/jsr/groups/GroupConversion;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "getGroupConversions", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getGroupConversions", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Set;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Ljava/util/Set<Lorg/apache/bval/jsr/groups/GroupConversion;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "getGroupConversions", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContainerElementTypes", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/AnnotatedType;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "getContainerElementTypes", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate;Ljava/util/Map;)Ljava/util/function/BiConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "lambda$getContainerElementTypes$0", "(Ljava/util/Map;Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "forEach", "(Ljava/util/function/BiConsumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "getDeclaredConstraints", "()[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getContainerElementTypes$0", "(Ljava/util/Map;Lorg/apache/bval/jsr/metadata/ContainerElementKey;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForContainerElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForContainerElement", "<init>", "(Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/ContainerElementKey;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
