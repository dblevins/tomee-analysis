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
public class ReflectionBuilder$ForExecutable$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer<TE;>;", "org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer", null);

classWriter.visitOuterClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "getReturnValue", "(Lorg/apache/bval/jsr/metadata/Meta;)Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer;");

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "org/apache/bval/jsr/metadata/ReflectionBuilder", "ForExecutable", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", null, null, 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer", "org/apache/bval/jsr/metadata/ReflectionBuilder", "ForContainer", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;Lorg/apache/bval/jsr/metadata/Meta;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", "this$1", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "this$0", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", "(Lorg/apache/bval/jsr/metadata/Meta<TE;>;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable$1", "this$1", "Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ConstraintTarget", "RETURN_VALUE", "Ljavax/validation/ConstraintTarget;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable", "access$200", "(Lorg/apache/bval/jsr/metadata/ReflectionBuilder$ForExecutable;Ljavax/validation/ConstraintTarget;)[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
