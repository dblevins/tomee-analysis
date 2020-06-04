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
public class FastDatePrinter$TimeZoneNumberRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", null, "java/lang/Object", new String[] { "org/apache/commons/lang3/time/FastDatePrinter$Rule" });

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "org/apache/commons/lang3/time/FastDatePrinter", "TimeZoneNumberRule", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$Rule", "org/apache/commons/lang3/time/FastDatePrinter", "Rule", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INSTANCE_COLON", "Lorg/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INSTANCE_NO_COLON", "Lorg/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mColon", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "mColon", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "estimateLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendTo", "(Ljava/lang/Appendable;Ljava/util/Calendar;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Appendable", "append", "(C)Ljava/lang/Appendable;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(INEG);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Appendable", "append", "(C)Ljava/lang/Appendable;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitLdcInsn(new Integer(3600000));
methodVisitor.visitInsn(IDIV);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "access$000", "(Ljava/lang/Appendable;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "mColon", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Appendable", "append", "(C)Ljava/lang/Appendable;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitLdcInsn(new Integer(60000));
methodVisitor.visitInsn(IDIV);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "access$000", "(Ljava/lang/Appendable;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "INSTANCE_COLON", "Lorg/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule", "INSTANCE_NO_COLON", "Lorg/apache/commons/lang3/time/FastDatePrinter$TimeZoneNumberRule;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
