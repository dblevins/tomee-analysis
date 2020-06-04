package asm.org.eclipse.persistence.internal.libraries.asm.tree.analysis;
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

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/asm/tree/analysis/Value" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNINITIALIZED_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNADDRESS_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lorg/eclipse/persistence/internal/libraries/asm/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "LONG_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "DOUBLE_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReference", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSort", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getSort", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
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
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "hashCode", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "UNINITIALIZED_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "RETURNADDRESS_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLdcInsn("A");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "REFERENCE_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLdcInsn("R");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "type", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/Type", "getDescriptor", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "UNINITIALIZED_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "INT_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "INT_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "FLOAT_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "FLOAT_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "LONG_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "LONG_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "DOUBLE_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "DOUBLE_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "getObjectType", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/Type;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "REFERENCE_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/libraries/asm/Type", "VOID_TYPE", "Lorg/eclipse/persistence/internal/libraries/asm/Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/Type;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue", "RETURNADDRESS_VALUE", "Lorg/eclipse/persistence/internal/libraries/asm/tree/analysis/BasicValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
