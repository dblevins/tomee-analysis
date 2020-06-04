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
public class ValidateReturnValue$ForMethod$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/job/ValidateReturnValue$ForMethod$1", "Lorg/apache/bval/jsr/job/ValidationJob<TT;>.SproutFrame<Lorg/apache/bval/jsr/descriptor/ReturnValueD<**>;>;", "org/apache/bval/jsr/job/ValidationJob$SproutFrame", null);

classWriter.visitOuterClass("org/apache/bval/jsr/job/ValidateReturnValue$ForMethod", "createBaseFrame", "(Lorg/apache/bval/jsr/descriptor/ReturnValueD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;");

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateReturnValue$ForMethod", "org/apache/bval/jsr/job/ValidateReturnValue", "ForMethod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateReturnValue$ForMethod$1", null, null, 0);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$SproutFrame", "org/apache/bval/jsr/job/ValidationJob", "SproutFrame", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/job/ValidateReturnValue$ForMethod;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/job/ValidateReturnValue$ForMethod;Lorg/apache/bval/jsr/descriptor/ReturnValueD;Lorg/apache/bval/jsr/GraphContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateReturnValue$ForMethod$1", "this$0", "Lorg/apache/bval/jsr/job/ValidateReturnValue$ForMethod;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$SproutFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getBean", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateReturnValue$ForMethod$1", "this$0", "Lorg/apache/bval/jsr/job/ValidateReturnValue$ForMethod;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ValidateReturnValue$ForMethod", "getRootBean", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
