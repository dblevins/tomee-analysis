package asm.org.apache.bval.jsr;
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
public class CascadingPropertyValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/bval/jsr/CascadingPropertyValidator", null, "java/lang/Object", new String[] { "javax/validation/Validator" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "validateProperty", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;Ljava/lang/String;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/CascadingPropertyValidator", "validateProperty", "(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/Class;)Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateProperty", "(Ljava/lang/Object;Ljava/lang/String;Z[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;Ljava/lang/String;Z[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "validateValue", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/CascadingPropertyValidator", "validateValue", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z[Ljava/lang/Class;)Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateValue", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Z[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;Ljava/lang/Object;Z[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
