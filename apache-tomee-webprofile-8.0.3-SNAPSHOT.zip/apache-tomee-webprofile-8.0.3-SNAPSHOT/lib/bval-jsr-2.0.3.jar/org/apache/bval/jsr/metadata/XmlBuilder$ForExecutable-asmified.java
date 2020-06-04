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
public class XmlBuilder$ForExecutableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "<SELF:Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable<TSELF;TE;TD;>;E:Ljava/lang/reflect/Executable;D:Ljava/lang/Object;>Lorg/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel<TSELF;TD;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<TE;>;", "org/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "org/apache/bval/jsr/metadata/XmlBuilder", "ForExecutable", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForParameter", "org/apache/bval/jsr/metadata/XmlBuilder", "ForParameter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel", "org/apache/bval/jsr/metadata/XmlBuilder", "NonRootLevel", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForCrossParameter", "org/apache/bval/jsr/metadata/XmlBuilder", "ForCrossParameter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForReturnValue", "org/apache/bval/jsr/metadata/XmlBuilder", "ForReturnValue", ACC_PRIVATE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "getReturnValue", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/xml/ReturnValueType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "getCrossParameter", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/xml/CrossParameterType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "getParameters", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Ljava/util/List<Lorg/apache/bval/jsr/xml/ParameterType;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Ljava/lang/Object;)V", "(TD;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCrossParameter", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getCrossParameter", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitLdcInsn("getCrossParameter");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder", "access$000", "(Lorg/apache/bval/util/Lazy;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/CrossParameterType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getCrossParameter", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/xml/CrossParameterType"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForCrossParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForCrossParameter", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/CrossParameterType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getReturnValue", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitLdcInsn("getReturnValue");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder", "access$000", "(Lorg/apache/bval/util/Lazy;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/ReturnValueType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forExecutable", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/xml/ReturnValueType"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForReturnValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForReturnValue", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/ReturnValueType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)Ljava/util/List<Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer<Ljava/lang/reflect/Parameter;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getParameters", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitLdcInsn("getParameters");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/XmlBuilder", "access$000", "(Lorg/apache/bval/util/Lazy;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "lambda$getParameters$0", "(Lorg/apache/bval/jsr/xml/ParameterType;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForParameter;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ParameterType;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForParameter;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "withGetReturnValue", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", "(Ljava/util/function/Function<TD;Lorg/apache/bval/jsr/xml/ReturnValueType;>;)TSELF;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;Ljava/util/function/Function;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "lambda$withGetReturnValue$1", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/xml/ReturnValueType;", false), Type.getType("()Lorg/apache/bval/jsr/xml/ReturnValueType;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getReturnValue", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "withGetCrossParameter", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", "(Ljava/util/function/Function<TD;Lorg/apache/bval/jsr/xml/CrossParameterType;>;)TSELF;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;Ljava/util/function/Function;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "lambda$withGetCrossParameter$2", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/xml/CrossParameterType;", false), Type.getType("()Lorg/apache/bval/jsr/xml/CrossParameterType;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getCrossParameter", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "withGetParameters", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", "(Ljava/util/function/Function<TD;Ljava/util/List<Lorg/apache/bval/jsr/xml/ParameterType;>;>;)TSELF;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;Ljava/util/function/Function;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "lambda$withGetParameters$3", "(Ljava/util/function/Function;)Ljava/util/List;", false), Type.getType("()Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "getParameters", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$withGetParameters$3", "(Ljava/util/function/Function;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "descriptor", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$withGetCrossParameter$2", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/xml/CrossParameterType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "descriptor", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/CrossParameterType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$withGetReturnValue$1", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/xml/ReturnValueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "descriptor", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/xml/ReturnValueType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getParameters$0", "(Lorg/apache/bval/jsr/xml/ParameterType;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/XmlBuilder$ForParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForParameter", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/ParameterType;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
