package asm.org.apache.johnzon.jsonb;
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
public class JohnzonBuilder$23Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "Ljava/lang/Object;Lorg/apache/johnzon/mapper/Converter<Ljava/time/OffsetDateTime;>;", "java/lang/Object", new String[] { "org/apache/johnzon/mapper/Converter" });

classWriter.visitOuterClass("org/apache/johnzon/jsonb/JohnzonBuilder", "lambda$addDateFormatConfigConverters$29", "(Ljava/util/Map;Ljava/time/ZoneId;Ljava/lang/String;)V");

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JohnzonBuilder$23", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$formatter", "Ljava/time/format/DateTimeFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$zoneIDUTC", "Ljava/time/ZoneId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/johnzon/jsonb/JohnzonBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/johnzon/jsonb/JohnzonBuilder;Ljava/time/format/DateTimeFormatter;Ljava/time/ZoneId;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "this$0", "Lorg/apache/johnzon/jsonb/JohnzonBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$zoneIDUTC", "Ljava/time/ZoneId;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/OffsetDateTime", "toInstant", "()Ljava/time/Instant;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$zoneIDUTC", "Ljava/time/ZoneId;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/ZonedDateTime", "ofInstant", "(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/format/DateTimeFormatter", "format", "(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fromString", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/time/format/DateTimeParseException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$formatter", "Ljava/time/format/DateTimeFormatter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "val$zoneIDUTC", "Ljava/time/ZoneId;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/jsonb/JohnzonBuilder", "access$500", "(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/time/ZonedDateTime", "toOffsetDateTime", "()Ljava/time/OffsetDateTime;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/time/format/DateTimeParseException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/time/OffsetDateTime", "parse", "(Ljava/lang/CharSequence;)Ljava/time/OffsetDateTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "fromString", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "fromString", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "toString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/time/OffsetDateTime");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JohnzonBuilder$23", "toString", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
