package asm.org.joda.time.format;
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
public class DateTimeParserBucket$SavedStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/joda/time/format/DateTimeParserBucket$SavedState", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/joda/time/format/DateTimeParserBucket$SavedField", "org/joda/time/format/DateTimeParserBucket", "SavedField", ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/format/DateTimeParserBucket$SavedState", "org/joda/time/format/DateTimeParserBucket", "SavedState", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iZone", "Lorg/joda/time/DateTimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iOffset", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iSavedFields", "[Lorg/joda/time/format/DateTimeParserBucket$SavedField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iSavedFieldsCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/joda/time/format/DateTimeParserBucket;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/format/DateTimeParserBucket;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "this$0", "Lorg/joda/time/format/DateTimeParserBucket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$000", "(Lorg/joda/time/format/DateTimeParserBucket;)Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iZone", "Lorg/joda/time/DateTimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$100", "(Lorg/joda/time/format/DateTimeParserBucket;)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iOffset", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$200", "(Lorg/joda/time/format/DateTimeParserBucket;)[Lorg/joda/time/format/DateTimeParserBucket$SavedField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iSavedFields", "[Lorg/joda/time/format/DateTimeParserBucket$SavedField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$300", "(Lorg/joda/time/format/DateTimeParserBucket;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iSavedFieldsCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "restoreState", "(Lorg/joda/time/format/DateTimeParserBucket;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "this$0", "Lorg/joda/time/format/DateTimeParserBucket;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iZone", "Lorg/joda/time/DateTimeZone;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$002", "(Lorg/joda/time/format/DateTimeParserBucket;Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iOffset", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$102", "(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/Integer;)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iSavedFields", "[Lorg/joda/time/format/DateTimeParserBucket$SavedField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$202", "(Lorg/joda/time/format/DateTimeParserBucket;[Lorg/joda/time/format/DateTimeParserBucket$SavedField;)[Lorg/joda/time/format/DateTimeParserBucket$SavedField;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iSavedFieldsCount", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$300", "(Lorg/joda/time/format/DateTimeParserBucket;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$402", "(Lorg/joda/time/format/DateTimeParserBucket;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/format/DateTimeParserBucket$SavedState", "iSavedFieldsCount", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeParserBucket", "access$302", "(Lorg/joda/time/format/DateTimeParserBucket;I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
