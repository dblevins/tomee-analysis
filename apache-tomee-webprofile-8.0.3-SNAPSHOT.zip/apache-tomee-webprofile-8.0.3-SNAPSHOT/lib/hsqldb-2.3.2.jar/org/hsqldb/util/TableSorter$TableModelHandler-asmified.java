package asm.org.hsqldb.util;
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
public class TableSorter$TableModelHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/util/TableSorter$TableModelHandler", null, "java/lang/Object", new String[] { "javax/swing/event/TableModelListener" });

classWriter.visitInnerClass("org/hsqldb/util/TableSorter$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/hsqldb/util/TableSorter$TableModelHandler", "org/hsqldb/util/TableSorter", "TableModelHandler", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/TableSorter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/hsqldb/util/TableSorter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tableChanged", "(Ljavax/swing/event/TableModelEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "isSorting", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/TableSorter", "access$700", "(Lorg/hsqldb/util/TableSorter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "fireTableChanged", "(Ljavax/swing/event/TableModelEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getFirstRow", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/TableSorter", "access$800", "(Lorg/hsqldb/util/TableSorter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "fireTableChanged", "(Ljavax/swing/event/TableModelEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getColumn", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getFirstRow", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getLastRow", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "getSortingStatus", "(I)I", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/TableSorter", "access$900", "(Lorg/hsqldb/util/TableSorter;)[I", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/TableSorter", "access$1000", "(Lorg/hsqldb/util/TableSorter;)[I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getFirstRow", "()I", false);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitTypeInsn(NEW, "javax/swing/event/TableModelEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/event/TableModelEvent", "getType", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/swing/event/TableModelEvent", "<init>", "(Ljavax/swing/table/TableModel;IIII)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "fireTableChanged", "(Ljavax/swing/event/TableModelEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/TableSorter", "access$700", "(Lorg/hsqldb/util/TableSorter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/TableSorter$TableModelHandler", "this$0", "Lorg/hsqldb/util/TableSorter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/TableSorter", "fireTableDataChanged", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/hsqldb/util/TableSorter;Lorg/hsqldb/util/TableSorter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/util/TableSorter$TableModelHandler", "<init>", "(Lorg/hsqldb/util/TableSorter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
