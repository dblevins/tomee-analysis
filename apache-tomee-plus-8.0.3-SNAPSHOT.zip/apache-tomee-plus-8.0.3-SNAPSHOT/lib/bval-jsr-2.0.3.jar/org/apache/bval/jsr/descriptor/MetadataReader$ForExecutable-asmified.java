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
public class MetadataReader$ForExecutableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "<E:Ljava/lang/reflect/Executable;SELF:Lorg/apache/bval/jsr/descriptor/MetadataReader$ForExecutable<TE;TSELF;>;>Lorg/apache/bval/jsr/descriptor/MetadataReader$ForElement<TE;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;>;", "org/apache/bval/jsr/descriptor/MetadataReader$ForElement", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "org/apache/bval/jsr/descriptor/MetadataReader", "ForExecutable", ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForContainer", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForCrossParameter", "org/apache/bval/jsr/metadata/Meta", "ForCrossParameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForParameter", "org/apache/bval/jsr/metadata/Meta", "ForParameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForElement", "org/apache/bval/jsr/descriptor/MetadataReader", "ForElement", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "org/apache/bval/jsr/descriptor/MetadataReader", "ForContainer", 0);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "executableBuilder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forElement", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForElement", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("executableBuilder");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "executableBuilder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getParameterDescriptors", "(Lorg/apache/bval/jsr/descriptor/ExecutableD;)Ljava/util/List;", "<X:Lorg/apache/bval/jsr/descriptor/ExecutableD<TE;TSELF;TX;>;>(TX;)Ljava/util/List<Lorg/apache/bval/jsr/descriptor/ParameterD<TX;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Executable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Executable", "getParameters", "()[Ljava/lang/reflect/Parameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/descriptor/MetadataReader", "access$000", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;)Lorg/apache/bval/jsr/ApacheValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ApacheValidatorFactory", "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Executable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "getParameterNames", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Executable;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "executableBuilder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getParameters", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/IntStream", "range", "(II)Ljava/util/stream/IntStream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForExecutable;[Ljava/lang/reflect/Parameter;Ljava/util/List;Ljava/util/List;Lorg/apache/bval/jsr/descriptor/ExecutableD;)Ljava/util/function/IntFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "lambda$getParameterDescriptors$0", "([Ljava/lang/reflect/Parameter;Ljava/util/List;Ljava/util/List;Lorg/apache/bval/jsr/descriptor/ExecutableD;I)Lorg/apache/bval/jsr/descriptor/ParameterD;", false), Type.getType("(I)Lorg/apache/bval/jsr/descriptor/ParameterD;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/IntStream", "mapToObj", "(Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/ToUnmodifiable", "list", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getCrossParameterDescriptor", "(Lorg/apache/bval/jsr/descriptor/ExecutableD;)Lorg/apache/bval/jsr/descriptor/CrossParameterD;", "<X:Lorg/apache/bval/jsr/descriptor/ExecutableD<TE;TSELF;TX;>;>(TX;)Lorg/apache/bval/jsr/descriptor/CrossParameterD<TX;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForCrossParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForCrossParameter", "<init>", "(Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/CrossParameterD");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/MetadataReader$ForElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "executableBuilder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getCrossParameter", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForElement", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/CrossParameterD", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForElement;Lorg/apache/bval/jsr/descriptor/ExecutableD;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getReturnValueDescriptor", "(Lorg/apache/bval/jsr/descriptor/ExecutableD;)Lorg/apache/bval/jsr/descriptor/ReturnValueD;", "<X:Lorg/apache/bval/jsr/descriptor/ExecutableD<TE;TSELF;TX;>;>(TX;)Lorg/apache/bval/jsr/descriptor/ReturnValueD<TX;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/ReturnValueD");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "executableBuilder", "Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ReturnValueD", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;Lorg/apache/bval/jsr/descriptor/ExecutableD;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getParameterNames", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Executable;)Ljava/util/List;", "(Ljavax/validation/ParameterNameProvider;TE;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$getParameterDescriptors$0", "([Ljava/lang/reflect/Parameter;Ljava/util/List;Ljava/util/List;Lorg/apache/bval/jsr/descriptor/ExecutableD;I)Lorg/apache/bval/jsr/descriptor/ParameterD;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "<init>", "(Ljava/lang/reflect/Parameter;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/metadata/Meta$ForParameter"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/EmptyBuilder", "instance", "()Lorg/apache/bval/jsr/metadata/EmptyBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/EmptyBuilder", "forContainer", "()Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/bval/jsr/metadata/MetadataBuilder$ForContainer"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/ParameterD");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForContainer", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForContainer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ParameterD", "<init>", "(Lorg/apache/bval/jsr/metadata/Meta$ForParameter;ILorg/apache/bval/jsr/descriptor/MetadataReader$ForContainer;Lorg/apache/bval/jsr/descriptor/ExecutableD;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
