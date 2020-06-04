package asm.org.hsqldb.rowio;
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
public class RowOutputBinary180Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/rowio/RowOutputBinary180", null, "org/hsqldb/rowio/RowOutputBinary", null);

{
fieldVisitor = classWriter.visitField(0, "tempCalDefault", "Ljava/util/Calendar;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinary", "<init>", "(II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/GregorianCalendar");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/GregorianCalendar", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/rowio/RowOutputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeDate", "(Lorg/hsqldb/types/TimestampData;Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getSeconds", "()J", false);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisToCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeLong", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeTime", "(Lorg/hsqldb/types/TimeData;Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 92);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimeData", "getSeconds", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisToCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeLong", "(J)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimeData", "getSeconds", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimeData", "getNanos", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimeData", "getZone", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeTimestamp", "(Lorg/hsqldb/types/TimestampData;Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 93);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getSeconds", "()J", false);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisToCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeLong", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getNanos", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getSeconds", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeLong", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getNanos", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/types/TimestampData", "getZone", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinary180", "writeInt", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
