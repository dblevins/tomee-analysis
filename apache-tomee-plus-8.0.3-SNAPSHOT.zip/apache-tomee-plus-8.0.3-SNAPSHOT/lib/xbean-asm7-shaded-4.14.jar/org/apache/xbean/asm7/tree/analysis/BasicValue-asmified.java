package asm.org.apache.xbean.asm7.tree.analysis;
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
public class BasicValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/asm7/tree/analysis/BasicValue", null, "java/lang/Object", new String[] { "org/apache/xbean/asm7/tree/analysis/Value" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNINITIALIZED_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNADDRESS_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/apache/xbean/asm7/Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/asm7/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lorg/apache/xbean/asm7/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "LONG_TYPE", "Lorg/apache/xbean/asm7/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "DOUBLE_TYPE", "Lorg/apache/xbean/asm7/Type;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReference", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSort", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getSort", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/xbean/asm7/tree/analysis/BasicValue");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "hashCode", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "UNINITIALIZED_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "RETURNADDRESS_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLdcInsn("A");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "REFERENCE_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLdcInsn("R");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/analysis/BasicValue", "type", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/Type", "getDescriptor", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "UNINITIALIZED_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "INT_TYPE", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "INT_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "FLOAT_TYPE", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "FLOAT_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "LONG_TYPE", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "LONG_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "DOUBLE_TYPE", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "DOUBLE_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/Type", "getObjectType", "(Ljava/lang/String;)Lorg/apache/xbean/asm7/Type;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "REFERENCE_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/asm7/Type", "VOID_TYPE", "Lorg/apache/xbean/asm7/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/analysis/BasicValue", "<init>", "(Lorg/apache/xbean/asm7/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/asm7/tree/analysis/BasicValue", "RETURNADDRESS_VALUE", "Lorg/apache/xbean/asm7/tree/analysis/BasicValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
