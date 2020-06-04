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
public class ConstructorDDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/descriptor/ConstructorD", "<T:Ljava/lang/Object;>Lorg/apache/bval/jsr/descriptor/ExecutableD<Ljava/lang/reflect/Constructor<+TT;>;Lorg/apache/bval/jsr/descriptor/MetadataReader$ForConstructor<TT;>;Lorg/apache/bval/jsr/descriptor/ConstructorD<TT;>;>;Ljavax/validation/metadata/ConstructorDescriptor;", "org/apache/bval/jsr/descriptor/ExecutableD", new String[] { "javax/validation/metadata/ConstructorDescriptor" });

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForConstructor", "org/apache/bval/jsr/descriptor/MetadataReader", "ForConstructor", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/descriptor/MetadataReader$ForExecutable", "org/apache/bval/jsr/descriptor/MetadataReader", "ForExecutable", ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForConstructor;Lorg/apache/bval/jsr/descriptor/BeanD;)V", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForConstructor<TT;>;Lorg/apache/bval/jsr/descriptor/BeanD<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/descriptor/ExecutableD", "<init>", "(Lorg/apache/bval/jsr/descriptor/MetadataReader$ForExecutable;Lorg/apache/bval/jsr/descriptor/BeanD;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/ConstructorD", "getParent", "()Lorg/apache/bval/jsr/descriptor/ElementD;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/BeanD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/descriptor/BeanD", "getElementClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
