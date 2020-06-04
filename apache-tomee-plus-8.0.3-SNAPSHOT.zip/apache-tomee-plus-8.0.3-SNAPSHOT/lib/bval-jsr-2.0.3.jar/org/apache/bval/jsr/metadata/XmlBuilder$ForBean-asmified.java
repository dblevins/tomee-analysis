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
public class XmlBuilder$ForBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean<TT;>;", "java/lang/Object", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "org/apache/bval/jsr/metadata/XmlBuilder", "ForBean", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForClass", "org/apache/bval/jsr/metadata/XmlBuilder", "ForClass", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForMethod", "org/apache/bval/jsr/metadata/XmlBuilder", "ForMethod", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "org/apache/bval/jsr/metadata/XmlBuilder", "ForConstructor", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForGetter", "org/apache/bval/jsr/metadata/XmlBuilder", "ForGetter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForField", "org/apache/bval/jsr/metadata/XmlBuilder", "ForField", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$Version", "org/apache/bval/jsr/metadata/XmlBuilder", "Version", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/BeanType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("descriptor");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/BeanType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getBeanClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getClazz", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder", "resolveClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getClassType", "()Lorg/apache/bval/jsr/xml/ClassType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forBean", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForBean;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForBean", "getClass", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/xml/ClassType"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForClass", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/ClassType;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/bval/jsr/metadata/MetadataBuilder$ForClass"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFields", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Field;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getField", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/FieldType", "getName", "()Ljava/lang/String;", false), Type.getType("(Lorg/apache/bval/jsr/xml/FieldType;)Ljava/lang/String;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getFields$0", "(Lorg/apache/bval/jsr/xml/FieldType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("(Lorg/apache/bval/jsr/xml/FieldType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/ToUnmodifiable", "map", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGetters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Ljava/lang/String;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getGetter", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/GetterType", "getName", "()Ljava/lang/String;", false), Type.getType("(Lorg/apache/bval/jsr/xml/GetterType;)Ljava/lang/String;")});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getGetters$1", "(Lorg/apache/bval/jsr/xml/GetterType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false), Type.getType("(Lorg/apache/bval/jsr/xml/GetterType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/ToUnmodifiable", "map", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructors", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Constructor<+TT;>;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$Version", "v11", "Lorg/apache/bval/jsr/metadata/XmlBuilder$Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder", "atLeast", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$Version;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getConstructors$3", "(Lorg/apache/bval/jsr/xml/ConstructorType;)[Ljava/lang/Class;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)[Ljava/lang/Class;")});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/Meta;Ljava/util/function/Function;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getConstructors$4", "(Lorg/apache/bval/jsr/metadata/Meta;Ljava/util/function/Function;Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/Signature;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/Signature;")});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getConstructor", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getConstructors$5", "(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toMap", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethods", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/Map;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/Map<Lorg/apache/bval/jsr/metadata/Signature;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Method;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$Version", "v11", "Lorg/apache/bval/jsr/metadata/XmlBuilder$Version;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder", "atLeast", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$Version;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getMethods$7", "(Lorg/apache/bval/jsr/xml/MethodType;)[Ljava/lang/Class;", false), Type.getType("(Lorg/apache/bval/jsr/xml/MethodType;)[Ljava/lang/Class;")});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Ljava/util/function/Function;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getMethods$8", "(Ljava/util/function/Function;Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/Signature;", false), Type.getType("(Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/Signature;")});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getMethod", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForBean;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$getMethods$9", "(Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false), Type.getType("(Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toMap", "(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAnnotationBehavior", "()Lorg/apache/bval/jsr/metadata/AnnotationBehavior;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "descriptor", "Lorg/apache/bval/jsr/xml/BeanType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/BeanType", "getIgnoreAnnotations", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/AnnotationBehavior", "EXCLUDE", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/AnnotationBehavior", "INCLUDE", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/bval/jsr/metadata/AnnotationBehavior"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getMethods$9", "(Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForMethod", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/MethodType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getMethods$8", "(Ljava/util/function/Function;Lorg/apache/bval/jsr/xml/MethodType;)Lorg/apache/bval/jsr/metadata/Signature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Signature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/MethodType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Signature", "<init>", "(Ljava/lang/String;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getMethods$7", "(Lorg/apache/bval/jsr/xml/MethodType;)[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/MethodType", "getParameter", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ParameterType", "getType", "()Ljava/lang/String;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ParameterType;)Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder", "resolveClass", "(Ljava/lang/String;)Ljava/lang/Class;", false), Type.getType("(Ljava/lang/String;)Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$null$6", "(I)[Ljava/lang/Class;", false), Type.getType("(I)[Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "toArray", "(Ljava/util/function/IntFunction;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$6", "(I)[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getConstructors$5", "(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/ConstructorType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getConstructors$4", "(Lorg/apache/bval/jsr/metadata/Meta;Ljava/util/function/Function;Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/metadata/Signature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Signature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Signature", "<init>", "(Ljava/lang/String;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getConstructors$3", "(Lorg/apache/bval/jsr/xml/ConstructorType;)[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ConstructorType", "getParameter", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ParameterType", "getType", "()Ljava/lang/String;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ParameterType;)Ljava/lang/String;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder", "resolveClass", "(Ljava/lang/String;)Ljava/lang/Class;", false), Type.getType("(Ljava/lang/String;)Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "lambda$null$2", "(I)[Ljava/lang/Class;", false), Type.getType("(I)[Ljava/lang/Class;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "toArray", "(Ljava/util/function/IntFunction;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$2", "(I)[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getGetters$1", "(Lorg/apache/bval/jsr/xml/GetterType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForGetter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForGetter", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/GetterType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getFields$0", "(Lorg/apache/bval/jsr/xml/FieldType;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForBean", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForField", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/FieldType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
