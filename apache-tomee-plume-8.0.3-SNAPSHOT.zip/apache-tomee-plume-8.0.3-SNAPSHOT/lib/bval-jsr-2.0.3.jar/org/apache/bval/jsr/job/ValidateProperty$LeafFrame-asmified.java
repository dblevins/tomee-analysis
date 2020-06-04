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
public class ValidateProperty$LeafFrameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "<L:Ljava/lang/Object;>Lorg/apache/bval/jsr/job/ValidationJob<TT;>.BeanFrame<TL;>;", "org/apache/bval/jsr/job/ValidationJob$BeanFrame", null);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "org/apache/bval/jsr/job/ValidateProperty", "LeafFrame", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$BeanFrame", "org/apache/bval/jsr/job/ValidationJob", "BeanFrame", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$PropertyFrame", "org/apache/bval/jsr/job/ValidateProperty", "PropertyFrame", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/job/ValidateProperty;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/GraphContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateProperty;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidationJob$BeanFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidationJob;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "propertyFrame", "(Lorg/apache/bval/jsr/descriptor/PropertyD;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", "(Lorg/apache/bval/jsr/descriptor/PropertyD<*>;Lorg/apache/bval/jsr/GraphContext;)Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidateProperty$PropertyFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "this$0", "Lorg/apache/bval/jsr/job/ValidateProperty;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateProperty$PropertyFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
