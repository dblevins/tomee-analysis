package asm.org.apache.tomee.microprofile.jwt.bval;
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
public class ValidationGenerator$CopyMethodAnnotations$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", null, "org/apache/xbean/asm7/MethodVisitor", null);

classWriter.visitOuterClass("org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations", "visitMethod", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/xbean/asm7/MethodVisitor;");

classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations", "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator", "CopyMethodAnnotations", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$generatedMethod", "Lorg/apache/xbean/asm7/MethodVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations;ILorg/apache/xbean/asm7/MethodVisitor;Lorg/apache/xbean/asm7/MethodVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", "this$1", "Lorg/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", "val$generatedMethod", "Lorg/apache/xbean/asm7/MethodVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/MethodVisitor", "<init>", "(ILorg/apache/xbean/asm7/MethodVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", "val$generatedMethod", "Lorg/apache/xbean/asm7/MethodVisitor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/MethodVisitor", "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitEnd", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ValidationGenerator$CopyMethodAnnotations$1", "val$generatedMethod", "Lorg/apache/xbean/asm7/MethodVisitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/MethodVisitor", "visitEnd", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/MethodVisitor", "visitEnd", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
