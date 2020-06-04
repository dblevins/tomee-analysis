package asm.org.apache.bval.util;
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
public class EmulatedAnnotatedType$VariableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/util/EmulatedAnnotatedType$Variable", "Lorg/apache/bval/util/EmulatedAnnotatedType<Ljava/lang/reflect/TypeVariable<*>;>;Ljava/lang/reflect/AnnotatedTypeVariable;", "org/apache/bval/util/EmulatedAnnotatedType", new String[] { "java/lang/reflect/AnnotatedTypeVariable" });

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$Variable", "org/apache/bval/util/EmulatedAnnotatedType", "Variable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/util/EmulatedAnnotatedType$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/reflect/TypeVariable;)V", "(Ljava/lang/reflect/TypeVariable<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/EmulatedAnnotatedType", "<init>", "(Ljava/lang/reflect/Type;Lorg/apache/bval/util/EmulatedAnnotatedType$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedBounds", "()[Ljava/lang/reflect/AnnotatedType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/util/EmulatedAnnotatedType$Variable", "wrapped", "Ljava/lang/reflect/Type;");
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/TypeVariable");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/TypeVariable", "getAnnotatedBounds", "()[Ljava/lang/reflect/AnnotatedType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
