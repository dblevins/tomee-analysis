package asm.org.apache.commons.lang3.time;
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
public class FastDatePrinter$DayInWeekFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", null, "java/lang/Object", new String[] { "org/apache/commons/lang3/time/FastDatePrinter$NumberRule" });

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "org/apache/commons/lang3/time/FastDatePrinter", "NumberRule", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "org/apache/commons/lang3/time/FastDatePrinter", "DayInWeekField", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mRule", "Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "mRule", "Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "estimateLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "mRule", "Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "estimateLength", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendTo", "(Ljava/lang/Appendable;Ljava/util/Calendar;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "mRule", "Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitIntInsn(BIPUSH, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "java/lang/Appendable", "java/util/Calendar", Opcodes.INTEGER}, 2, new Object[] {"org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "java/lang/Appendable"});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "java/lang/Appendable", "java/util/Calendar", Opcodes.INTEGER}, 3, new Object[] {"org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "java/lang/Appendable", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "appendTo", "(Ljava/lang/Appendable;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendTo", "(Ljava/lang/Appendable;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$DayInWeekField", "mRule", "Lorg/apache/commons/lang3/time/FastDatePrinter$NumberRule;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/lang3/time/FastDatePrinter$NumberRule", "appendTo", "(Ljava/lang/Appendable;I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
