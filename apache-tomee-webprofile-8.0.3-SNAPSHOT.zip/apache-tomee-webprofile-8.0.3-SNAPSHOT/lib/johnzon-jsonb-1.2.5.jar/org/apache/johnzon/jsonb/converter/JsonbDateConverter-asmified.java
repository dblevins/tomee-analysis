package asm.org.apache.johnzon.jsonb.converter;
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
public class JsonbDateConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "Lorg/apache/johnzon/jsonb/converter/JsonbDateConverterBase<Ljava/util/Date;>;", "org/apache/johnzon/jsonb/converter/JsonbDateConverterBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "UTC", "Ljava/time/ZoneId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "hasTimezone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "isIso", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/json/bind/annotation/JsonbDateFormat;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverterBase", "<init>", "(Ljavax/json/bind/annotation/JsonbDateFormat;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "hasTimezone", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "isIso", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/util/Date;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "toString", "(J)Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toStringWithFormatter", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fromString", "(Ljava/lang/String;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "parseLong", "(Ljava/lang/String;)J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromStringWithFormatter", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/Date"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fromStringWithFormatter", "(Ljava/lang/String;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/time/DateTimeException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/time/DateTimeException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/time/DateTimeException");
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/time/DateTimeException");
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label9, "java/time/DateTimeException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "hasTimezone", "Z");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "isIso", "Z");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromIso", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromZonedDateTime", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromLocalDateTime", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/time/DateTimeException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitInsn(ICONST_1);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/DateTimeException"}, 1, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/DateTimeException"}, 2, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "hasTimezone", "Z");
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromLocalDateTime", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromZonedDateTime", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/time/DateTimeException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromIso", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNE, label14);
methodVisitor.visitInsn(ICONST_1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/DateTimeException", "java/time/DateTimeException", "java/util/Date"}, 1, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/DateTimeException", "java/time/DateTimeException", "java/util/Date"}, 2, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "isIso", "Z");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fromIso", "(Ljava/lang/String;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/time/format/DateTimeFormatter", "ISO_ZONED_DATE_TIME", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZonedDateTime", "parse", "(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/ZonedDateTime", "toInstant", "()Ljava/time/Instant;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toStringWithFormatter", "(Ljava/util/Date;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/time/DateTimeException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/time/DateTimeException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/time/DateTimeException");
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/time/DateTimeException");
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label10, label11, label9, "java/time/DateTimeException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "hasTimezone", "Z");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "isIso", "Z");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/Instant", "ofEpochMilli", "(J)Ljava/time/Instant;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toIsoString", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, "java/time/Instant"}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toStringFromZonedDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toStringFromLocalDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/time/DateTimeException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitInsn(ICONST_1);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/util/Date", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/Instant", "java/time/DateTimeException"}, 1, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/util/Date", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/Instant", "java/time/DateTimeException"}, 2, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "hasTimezone", "Z");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toStringFromLocalDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toStringFromZonedDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/time/DateTimeException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNE, label14);
methodVisitor.visitInsn(ICONST_1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/util/Date", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/Instant", "java/time/DateTimeException", "java/time/DateTimeException"}, 1, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", "java/util/Date", Opcodes.INTEGER, Opcodes.INTEGER, "java/time/Instant", "java/time/DateTimeException", "java/time/DateTimeException"}, 2, new Object[] {"org/apache/johnzon/jsonb/converter/JsonbDateConverter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "isIso", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toIsoString", "(Ljava/time/Instant;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toIsoString", "(Ljava/time/Instant;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/time/format/DateTimeFormatter", "ISO_ZONED_DATE_TIME", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "UTC", "Ljava/time/ZoneId;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZonedDateTime", "ofInstant", "(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/format/DateTimeFormatter", "format", "(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fromLocalDateTime", "(Ljava/lang/String;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/LocalDateTime", "parse", "(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/time/ZoneOffset", "UTC", "Ljava/time/ZoneOffset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/LocalDateTime", "toInstant", "(Ljava/time/ZoneOffset;)Ljava/time/Instant;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fromZonedDateTime", "(Ljava/lang/String;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZonedDateTime", "parse", "(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/ZonedDateTime", "toInstant", "()Ljava/time/Instant;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Date", "from", "(Ljava/time/Instant;)Ljava/util/Date;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toStringFromLocalDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "UTC", "Ljava/time/ZoneId;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/LocalDateTime", "ofInstant", "(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/format/DateTimeFormatter", "format", "(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toStringFromZonedDateTime", "(Ljava/time/Instant;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "UTC", "Ljava/time/ZoneId;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZonedDateTime", "ofInstant", "(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/format/DateTimeFormatter", "format", "(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "fromString", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "fromString", "(Ljava/lang/String;)Ljava/util/Date;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "toString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Date");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "toString", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("UTC");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZoneId", "of", "(Ljava/lang/String;)Ljava/time/ZoneId;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/jsonb/converter/JsonbDateConverter", "UTC", "Ljava/time/ZoneId;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
