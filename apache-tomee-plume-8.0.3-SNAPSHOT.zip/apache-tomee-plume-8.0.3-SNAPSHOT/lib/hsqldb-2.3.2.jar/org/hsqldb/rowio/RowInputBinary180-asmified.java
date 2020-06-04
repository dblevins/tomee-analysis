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
public class RowInputBinary180Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/rowio/RowInputBinary180", null, "org/hsqldb/rowio/RowInputBinary", null);

{
fieldVisitor = classWriter.visitField(0, "tempCalDefault", "Ljava/util/Calendar;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowInputBinary", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/GregorianCalendar");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/GregorianCalendar", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/rowio/RowInputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readTime", "(Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/TimeData;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 92);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readLong", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowInputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisFromCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "getNormalisedTime", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/TimeData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/TimeData", "<init>", "(III)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/TimeData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/TimeData", "<init>", "(III)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readDate", "(Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/TimestampData;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readLong", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowInputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisFromCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "getNormalisedDate", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/TimestampData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/TimestampData", "<init>", "(J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readTimestamp", "(Lorg/hsqldb/types/Type;)Lorg/hsqldb/types/TimestampData;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/types/Type", "typeCode", "I");
methodVisitor.visitIntInsn(BIPUSH, 93);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readLong", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowInputBinary180", "tempCalDefault", "Ljava/util/Calendar;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/HsqlDateTime", "convertMillisFromCalendar", "(Ljava/util/Calendar;J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/TimestampData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/TimestampData", "<init>", "(JI)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/types/TimestampData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readLong", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowInputBinary180", "readInt", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/types/TimestampData", "<init>", "(JII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
