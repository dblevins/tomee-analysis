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
public class Meta$ForParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/metadata/Meta$ForParameter", "Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/reflect/Parameter;>;", "org/apache/bval/jsr/metadata/Meta", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForParameter", "org/apache/bval/jsr/metadata/Meta", "ForParameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForMethod", "org/apache/bval/jsr/metadata/Meta", "ForMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/Meta$ForConstructor", "org/apache/bval/jsr/metadata/Meta", "ForConstructor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/bval/util/Lazy;", "Lorg/apache/bval/util/Lazy<Lorg/apache/bval/jsr/metadata/Meta<+Ljava/lang/reflect/Executable;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/reflect/Parameter;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/annotation/ElementType", "PARAMETER", "Ljava/lang/annotation/ElementType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta", "<init>", "(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/annotation/ElementType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/Lazy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("get", "(Lorg/apache/bval/jsr/metadata/Meta$ForParameter;)Ljava/util/function/Supplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("()Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "computeParent", "()Lorg/apache/bval/jsr/metadata/Meta;", false), Type.getType("()Lorg/apache/bval/jsr/metadata/Meta;")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/Lazy", "<init>", "(Ljava/util/function/Supplier;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/Meta$ForParameter", "parent", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/Meta$ForParameter", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Parameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Parameter", "getParameterizedType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaringClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Parameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Parameter", "getDeclaringExecutable", "()Ljava/lang/reflect/Executable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Executable", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedType", "()Ljava/lang/reflect/AnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Parameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Parameter", "getAnnotatedType", "()Ljava/lang/reflect/AnnotatedType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/Meta$ForParameter", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "describeHost", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("%s of %s");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Parameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Parameter", "getDeclaringExecutable", "()Ljava/lang/reflect/Executable;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "()Lorg/apache/bval/jsr/metadata/Meta;", "()Lorg/apache/bval/jsr/metadata/Meta<+Ljava/lang/reflect/Executable;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/Meta$ForParameter", "parent", "Lorg/apache/bval/util/Lazy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/util/Lazy", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/Meta");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "computeParent", "()Lorg/apache/bval/jsr/metadata/Meta;", "()Lorg/apache/bval/jsr/metadata/Meta<+Ljava/lang/reflect/Executable;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta$ForParameter", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Parameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Parameter", "getDeclaringExecutable", "()Ljava/lang/reflect/Executable;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/reflect/Method");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForMethod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForMethod", "<init>", "(Ljava/lang/reflect/Method;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Executable"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/metadata/Meta$ForConstructor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Constructor");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/Meta$ForConstructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/bval/jsr/metadata/Meta"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
