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
public class ReflectionBuilder$ForExecutableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "<E:Ljava/lang/reflect/Executable;>Ljava/lang/Object;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<TE;>;", "java/lang/Object", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "org/apache/bval/jsr/metadata/ReflectionBuilder", "ForExecutable", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$2", null, null, 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", null, null, 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer", "org/apache/bval/jsr/metadata/ReflectionBuilder", "ForContainer", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "org/apache/bval/jsr/ConstraintAnnotationAttributes", "Worker", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForParameter", "org/apache/bval/jsr/metadata/Meta", "ForParameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "meta", "Lorg/apache/bval/jsr/metadata/Meta;", "Lorg/apache/bval/jsr/metadata/Meta<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "getParameterNames", "Ljava/util/function/BiFunction;", "Ljava/util/function/BiFunction<Ljavax/validation/ParameterNameProvider;TE;Ljava/util/List<Ljava/lang/String;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder;Lorg/apache/bval/jsr/metadata/Meta;Ljava/util/function/BiFunction;)V", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;Ljava/util/function/BiFunction<Ljavax/validation/ParameterNameProvider;TE;Ljava/util/List<Ljava/lang/String;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("meta");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/Meta");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("getParameterNames");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/function/BiFunction");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getParameterNames", "Ljava/util/function/BiFunction;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Ljava/util/List<Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Parameter;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Executable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Executable", "getParameters", "()[Ljava/lang/reflect/Parameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/reflect/Parameter;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getParameterNames", "Ljava/util/function/BiFunction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder", "access$100", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder;)Lorg/apache/bval/jsr/ApacheValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/BiFunction", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/IntStream", "range", "(II)Ljava/util/stream/IntStream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;[Ljava/lang/reflect/Parameter;Ljava/util/List;)Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getParameters$0", "([Ljava/lang/reflect/Parameter;Ljava/util/List;I)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;", false), Type.getType("(I)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/IntStream", "mapToObj", "(Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/ToUnmodifiable", "list", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCrossParameter", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$2", "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getConstraints", "(Ljavax/validation/ConstraintTarget;)[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getConstraintsByTarget", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "of", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljavax/validation/ConstraintTarget;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getConstraints$1", "(Ljavax/validation/ConstraintTarget;Ljava/util/Map;)Ljava/util/List;", false), Type.getType("(Ljava/util/Map;)Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getConstraints$2", "(Ljava/util/List;)[Ljava/lang/annotation/Annotation;", false), Type.getType("(Ljava/util/List;)[Ljava/lang/annotation/Annotation;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/ObjectUtils", "EMPTY_ANNOTATION_ARRAY", "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getConstraintsByTarget", "()Ljava/util/Map;", "()Ljava/util/Map<Ljavax/validation/ConstraintTarget;Ljava/util/List<Ljava/lang/annotation/Annotation;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/AnnotationsManager", "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/ObjectUtils", "isEmptyArray", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/annotation/Annotation;"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/EnumMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/ConstraintTarget;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/EnumMap", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "[Ljava/lang/annotation/Annotation;", "java/util/Map", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/annotation/Annotation", "annotationType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALIDATION_APPLIES_TO", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "analyze", "(Ljava/lang/Class;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "of", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "isValid", "()Z", false), Type.getType("(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;)Z")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "filter", "(Ljava/util/function/Predicate;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/lang/annotation/Annotation;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getConstraintsByTarget$3", "(Ljava/lang/annotation/Annotation;Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;)Ljavax/validation/ConstraintTarget;", false), Type.getType("(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;)Ljavax/validation/ConstraintTarget;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "map", "(Ljava/util/function/Function;)Ljava/util/Optional;", false);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getConstraintsByTarget$4", "(Ljavax/validation/ConstraintTarget;)Z", false), Type.getType("(Ljavax/validation/ConstraintTarget;)Z")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "filter", "(Ljava/util/function/Predicate;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "isPresent", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/ConstraintTarget");
methodVisitor.visitVarInsn(ASTORE, 9);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/annotation/Annotation", "java/lang/Class", "java/util/Optional"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder", "access$100", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder;)Lorg/apache/bval/jsr/ApacheValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "getAnnotationsManager", "()Lorg/apache/bval/jsr/util/AnnotationsManager;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/AnnotationsManager", "supportedTargets", "(Ljava/lang/Class;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/constraintvalidation/ValidationTarget");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$1", "$SwitchMap$javax$validation$constraintvalidation$ValidationTarget", "[I");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/validation/constraintvalidation/ValidationTarget", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitLookupSwitchInsn(label8, new int[] { 1, 2 }, new Label[] { label6, label7 });
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, "java/util/Set", "javax/validation/constraintvalidation/ValidationTarget"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "PARAMETERS", "Ljavax/validation/ConstraintTarget;");
methodVisitor.visitVarInsn(ASTORE, 9);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "RETURN_VALUE", "Ljavax/validation/ConstraintTarget;");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalStateException;")});
methodVisitor.visitLdcInsn("Unknown %s %s for %s");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/constraintvalidation/ValidationTarget;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "create", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Exception;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/IllegalStateException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "[Ljava/lang/annotation/Annotation;", "java/util/Map", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/annotation/Annotation", "java/lang/Class", "java/util/Optional", "javax/validation/ConstraintTarget", "java/util/Set"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "[Ljava/lang/annotation/Annotation;", "java/util/Map", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/annotation/Annotation", "java/lang/Class", "java/util/Optional", Opcodes.TOP, "java/util/Set"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "impliedConstraintTarget", "()Ljavax/validation/ConstraintTarget;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "javax/validation/ConstraintDeclarationException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljavax/validation/ConstraintDeclarationException;")});
methodVisitor.visitLdcInsn("Found %d possible %s types for constraint type %s and no explicit assignment via #%s()");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/constraintvalidation/ValidationTarget;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALIDATION_APPLIES_TO", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raise", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "[Ljava/lang/annotation/Annotation;", "java/util/Map", "[Ljava/lang/annotation/Annotation;", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/annotation/Annotation", "java/lang/Class", "java/util/Optional", "javax/validation/ConstraintTarget"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "lambda$getConstraintsByTarget$5", "(Ljavax/validation/ConstraintTarget;)Ljava/util/List;", false), Type.getType("(Ljavax/validation/ConstraintTarget;)Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "[Ljava/lang/annotation/Annotation;", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "impliedConstraintTarget", "()Ljavax/validation/ConstraintTarget;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Executable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Executable", "getParameterCount", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "RETURN_VALUE", "Ljavax/validation/ConstraintTarget;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Void", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "PARAMETERS", "Ljavax/validation/ConstraintTarget;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstraintsByTarget$5", "(Ljavax/validation/ConstraintTarget;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstraintsByTarget$4", "(Ljavax/validation/ConstraintTarget;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "IMPLICIT", "Ljavax/validation/ConstraintTarget;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstraintsByTarget$3", "(Ljava/lang/annotation/Annotation;Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;)Ljavax/validation/ConstraintTarget;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "read", "(Ljava/lang/annotation/Annotation;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/ConstraintTarget");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstraints$2", "(Ljava/util/List;)[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstraints$1", "(Ljavax/validation/ConstraintTarget;Ljava/util/Map;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getParameters$0", "([Ljava/lang/reflect/Parameter;Ljava/util/List;I)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "<init>", "(Ljava/lang/reflect/Parameter;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;Ljavax/validation/ConstraintTarget;)[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getConstraints", "(Ljavax/validation/ConstraintTarget;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
