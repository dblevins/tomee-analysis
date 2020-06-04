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
public class FastDateParser$ISO8601TimeZoneStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", null, "org/apache/commons/lang3/time/FastDateParser$PatternStrategy", null);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$Strategy", "org/apache/commons/lang3/time/FastDateParser", "Strategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "org/apache/commons/lang3/time/FastDateParser", "ISO8601TimeZoneStrategy", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$PatternStrategy", "org/apache/commons/lang3/time/FastDateParser", "PatternStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDateParser$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ISO_8601_1_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ISO_8601_2_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ISO_8601_3_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDateParser$PatternStrategy", "<init>", "(Lorg/apache/commons/lang3/time/FastDateParser$1;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "createPattern", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setCalendar", "(Lorg/apache/commons/lang3/time/FastDateParser;Ljava/util/Calendar;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastTimeZone", "getGmtTimeZone", "(Ljava/lang/String;)Ljava/util/TimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "setTimeZone", "(Ljava/util/TimeZone;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getStrategy", "(I)Lorg/apache/commons/lang3/time/FastDateParser$Strategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_1_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_2_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_3_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid number of X");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "()Lorg/apache/commons/lang3/time/FastDateParser$Strategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_3_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("(Z|(?:[+-]\\d{2}))");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_1_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("(Z|(?:[+-]\\d{2}\\d{2}))");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_2_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/FastDateParser$ISO8601TimeZoneStrategy", "ISO_8601_3_STRATEGY", "Lorg/apache/commons/lang3/time/FastDateParser$Strategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
