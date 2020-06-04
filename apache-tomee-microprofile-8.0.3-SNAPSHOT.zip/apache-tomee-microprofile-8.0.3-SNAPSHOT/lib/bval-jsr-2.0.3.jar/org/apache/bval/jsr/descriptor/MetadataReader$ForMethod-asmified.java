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
public class MetadataReader$ForMethodDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "Lorg/apache/bval/jsr/descriptor/MetadataReader$ForExecutable<Ljava/lang/reflect/Method;Lorg/apache/bval/jsr/descriptor/MetadataReader$ForMethod;>;", "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForExecutable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "org/apache/bval/jsr/descriptor/MetadataReader", "ForMethod", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "org/apache/bval/jsr/descriptor/MetadataReader", "ForExecutable", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/reflect/Method;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable<Ljava/lang/reflect/Method;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "this$0", "Lorg/apache/bval/jsr/descriptor/MetadataReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader;Lorg/apache/bval/jsr/metadata/Meta;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForExecutable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getParameterNames", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Method;)Ljava/util/List;", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Method;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ParameterNameProvider", "getParameterNames", "(Ljava/lang/reflect/Method;)Ljava/util/List;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_BRIDGE | ACC_SYNTHETIC, "getParameterNames", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Executable;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/MetadataReader$ForMethod", "getParameterNames", "(Ljavax/validation/ParameterNameProvider;Ljava/lang/reflect/Method;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
