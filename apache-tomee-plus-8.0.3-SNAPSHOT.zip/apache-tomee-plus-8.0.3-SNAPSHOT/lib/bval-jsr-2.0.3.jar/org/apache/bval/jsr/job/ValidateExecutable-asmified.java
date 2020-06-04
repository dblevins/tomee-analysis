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
public class ValidateExecutableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/jsr/job/ValidateExecutable", "<E:Ljava/lang/reflect/Executable;T:Ljava/lang/Object;>Lorg/apache/bval/jsr/job/ValidationJob<TT;>;", "org/apache/bval/jsr/job/ValidationJob", null);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateExecutable$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("javax/validation/Path$Node", "javax/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$ConstructorNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "ConstructorNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$MethodNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "MethodNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_NODE", "Ljava/util/function/Function;", "Ljava/util/function/Function<Ljava/lang/reflect/Method;Ljavax/validation/Path$Node;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CONSTRUCTOR_NODE", "Ljava/util/function/Function;", "Ljava/util/function/Function<Ljava/lang/reflect/Constructor<*>;Ljavax/validation/Path$Node;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "executable", "Ljava/lang/reflect/Executable;", "TE;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "executableNode", "Ljava/util/function/Function;", "Ljava/util/function/Function<TE;Ljavax/validation/Path$Node;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;[Ljava/lang/Class;Lorg/apache/bval/jsr/metadata/Meta;)V", "(Lorg/apache/bval/jsr/ApacheFactoryContext;[Ljava/lang/Class<*>;Lorg/apache/bval/jsr/metadata/Meta<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;[Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;")});
methodVisitor.visitLdcInsn("meta");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/Meta");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Executable");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateExecutable", "executable", "Ljava/lang/reflect/Executable;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/job/ValidateExecutable$1", "$SwitchMap$java$lang$annotation$ElementType", "[I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getElementType", "()Ljava/lang/annotation/ElementType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/annotation/ElementType", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 1, 2 }, new Label[] { label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/bval/jsr/job/ValidateExecutable", "org/apache/bval/jsr/ApacheFactoryContext", "[Ljava/lang/Class;", "org/apache/bval/jsr/metadata/Meta"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "CONSTRUCTOR_NODE", "Ljava/util/function/Function;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateExecutable", "executableNode", "Ljava/util/function/Function;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "METHOD_NODE", "Ljava/util/function/Function;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateExecutable", "executableNode", "Ljava/util/function/Function;");
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;")});
methodVisitor.visitLdcInsn("Unsupported %s: %s");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/annotation/ElementType;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "create", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Exception;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createBasePath", "()Lorg/apache/bval/jsr/util/PathImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/PathImpl", "create", "()Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateExecutable", "executableNode", "Ljava/util/function/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateExecutable", "executable", "Ljava/lang/reflect/Executable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/Path$Node");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljavax/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$1", "(Ljava/lang/reflect/Constructor;)Ljavax/validation/Path$Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$ConstructorNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$ConstructorNodeImpl", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$0", "(Ljava/lang/reflect/Method;)Ljavax/validation/Path$Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$MethodNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getParameterTypes", "()[Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$MethodNodeImpl", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "lambda$static$0", "(Ljava/lang/reflect/Method;)Ljavax/validation/Path$Node;", false), Type.getType("(Ljava/lang/reflect/Method;)Ljavax/validation/Path$Node;")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "METHOD_NODE", "Ljava/util/function/Function;");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "lambda$static$1", "(Ljava/lang/reflect/Constructor;)Ljavax/validation/Path$Node;", false), Type.getType("(Ljava/lang/reflect/Constructor;)Ljavax/validation/Path$Node;")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/job/ValidateExecutable", "CONSTRUCTOR_NODE", "Ljava/util/function/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
