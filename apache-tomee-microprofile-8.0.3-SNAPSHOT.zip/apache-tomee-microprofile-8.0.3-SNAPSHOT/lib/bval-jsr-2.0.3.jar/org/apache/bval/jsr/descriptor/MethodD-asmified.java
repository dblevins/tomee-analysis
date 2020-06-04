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
public class MethodDDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/descriptor/MethodD", "Lorg/apache/bval/jsr/descriptor/ExecutableD<Ljava/lang/reflect/Method;Lorg/apache/bval/jsr/descriptor/MetadataReader$ForMethod;Lorg/apache/bval/jsr/descriptor/MethodD;>;Ljavax/validation/metadata/MethodDescriptor;", "org/apache/bval/jsr/descriptor/ExecutableD", new String[] { "javax/validation/metadata/MethodDescriptor" });

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "org/apache/bval/jsr/descriptor/MetadataReader", "ForMethod", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "org/apache/bval/jsr/descriptor/MetadataReader", "ForExecutable", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "methodType", "Ljavax/validation/metadata/MethodType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForMethod;Lorg/apache/bval/jsr/descriptor/BeanD;)V", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForMethod;Lorg/apache/bval/jsr/descriptor/BeanD<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ExecutableD", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForExecutable;Lorg/apache/bval/jsr/descriptor/BeanD;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "meta", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/Meta", "getHost", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "isGetter", "(Ljava/lang/reflect/Method;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/metadata/MethodType", "GETTER", "Ljavax/validation/metadata/MethodType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/bval/jsr/descriptor/MethodD", "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "org/apache/bval/jsr/descriptor/BeanD"}, 1, new Object[] {"org/apache/bval/jsr/descriptor/MethodD"});
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/metadata/MethodType", "NON_GETTER", "Ljavax/validation/metadata/MethodType;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/bval/jsr/descriptor/MethodD", "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "org/apache/bval/jsr/descriptor/BeanD"}, 2, new Object[] {"org/apache/bval/jsr/descriptor/MethodD", "javax/validation/metadata/MethodType"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/descriptor/MethodD", "methodType", "Ljavax/validation/metadata/MethodType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/MethodD", "getTarget", "()Ljava/lang/reflect/AnnotatedElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getReturnType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMethodType", "()Ljavax/validation/metadata/MethodType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/descriptor/MethodD", "methodType", "Ljavax/validation/metadata/MethodType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
