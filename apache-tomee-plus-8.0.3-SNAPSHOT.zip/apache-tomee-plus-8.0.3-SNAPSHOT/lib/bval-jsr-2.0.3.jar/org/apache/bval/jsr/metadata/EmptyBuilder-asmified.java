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
public class EmptyBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/metadata/EmptyBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForExecutable", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForContainer", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForContainer", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForClass", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForClass", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForElement", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForElement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForBean", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForBean", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$Level", "org/apache/bval/jsr/metadata/EmptyBuilder", "Level", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCES", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/bval/jsr/metadata/AnnotationBehavior;Lorg/apache/bval/jsr/metadata/EmptyBuilder;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "annotationBehavior", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "forBean", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForBean;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "forContainer", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForContainer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "forExecutable", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "forElement", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForElement;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/AnnotationBehavior", "ABSTAIN", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "(Lorg/apache/bval/jsr/metadata/AnnotationBehavior;)Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instance", "(Lorg/apache/bval/jsr/metadata/AnnotationBehavior;)Lorg/apache/bval/jsr/metadata/EmptyBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "INSTANCES", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "<init>", "(Lorg/apache/bval/jsr/metadata/AnnotationBehavior;)V", false), Type.getType("(Lorg/apache/bval/jsr/metadata/AnnotationBehavior;)Lorg/apache/bval/jsr/metadata/EmptyBuilder;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/EmptyBuilder");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/bval/jsr/metadata/AnnotationBehavior;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("annotationBehavior");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/AnnotationBehavior");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "annotationBehavior", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "lambda$new$0", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForBean;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForBean;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forBean", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "lambda$new$1", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForContainer;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "lambda$new$2", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "lambda$new$3", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForElement;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForElement;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forElement", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forBean", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;", "<T:Ljava/lang/Object;>()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forBean", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forContainer", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", "<E::Ljava/lang/reflect/AnnotatedElement;>()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forExecutable", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", "<E:Ljava/lang/reflect/Executable;>()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forElement", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", "<E::Ljava/lang/reflect/AnnotatedElement;>()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forElement", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForElement");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$3", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/EmptyBuilder$ForElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForElement", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$2", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForExecutable", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$1", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/EmptyBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$0", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/EmptyBuilder$ForBean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForBean", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Lorg/apache/bval/jsr/metadata/AnnotationBehavior;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "annotationBehavior", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Lorg/apache/bval/util/Lazy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forElement", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)Lorg/apache/bval/util/Lazy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/EnumMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/metadata/AnnotationBehavior;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/EnumMap", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "INSTANCES", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
