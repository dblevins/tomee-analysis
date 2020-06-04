package asm.org.joda.time.chrono;
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
public class BuddhistChronologyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/joda/time/chrono/BuddhistChronology", null, "org/joda/time/chrono/AssembledChronology", null);

classWriter.visitInnerClass("org/joda/time/chrono/AssembledChronology$Fields", "org/joda/time/chrono/AssembledChronology", "Fields", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-3474595157769370126L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BE", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ERA_FIELD", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BUDDHIST_OFFSET", "I", null, new Integer(543));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap<Lorg/joda/time/DateTimeZone;Lorg/joda/time/chrono/BuddhistChronology;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE_UTC", "Lorg/joda/time/chrono/BuddhistChronology;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstanceUTC", "()Lorg/joda/time/chrono/BuddhistChronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BuddhistChronology", "INSTANCE_UTC", "Lorg/joda/time/chrono/BuddhistChronology;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/joda/time/chrono/BuddhistChronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeZone", "getDefault", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BuddhistChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/BuddhistChronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/BuddhistChronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeZone", "getDefault", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BuddhistChronology", "cCache", "Ljava/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ConcurrentHashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/chrono/BuddhistChronology");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BuddhistChronology");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/GJChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/chrono/GJChronology;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BuddhistChronology", "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "(IIIIIIILorg/joda/time/Chronology;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BuddhistChronology");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/LimitChronology", "getInstance", "(Lorg/joda/time/Chronology;Lorg/joda/time/ReadableDateTime;Lorg/joda/time/ReadableDateTime;)Lorg/joda/time/chrono/LimitChronology;", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BuddhistChronology", "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BuddhistChronology", "cCache", "Ljava/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ConcurrentHashMap", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/chrono/BuddhistChronology");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology", "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readResolve", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BuddhistChronology", "getInstanceUTC", "()Lorg/joda/time/chrono/BuddhistChronology;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BuddhistChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/BuddhistChronology;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withUTC", "()Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BuddhistChronology", "INSTANCE_UTC", "Lorg/joda/time/chrono/BuddhistChronology;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withZone", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeZone", "getDefault", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BuddhistChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/BuddhistChronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/joda/time/chrono/BuddhistChronology");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/chrono/BuddhistChronology");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("Buddhist");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "hashCode", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("BuddhistChronology");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "assemble", "(Lorg/joda/time/chrono/AssembledChronology$Fields;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BuddhistChronology", "getParam", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "eras", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/UnsupportedDurationField", "getInstance", "(Lorg/joda/time/DurationFieldType;)Lorg/joda/time/field/UnsupportedDurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "eras", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/SkipUndoDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/SkipUndoDateTimeField", "<init>", "(Lorg/joda/time/Chronology;Lorg/joda/time/DateTimeField;)V", false);
methodVisitor.visitIntInsn(SIPUSH, 543);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/DelegatedDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "eras", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "yearOfEra", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/DelegatedDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/SkipUndoDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/SkipUndoDateTimeField", "<init>", "(Lorg/joda/time/Chronology;Lorg/joda/time/DateTimeField;)V", false);
methodVisitor.visitIntInsn(SIPUSH, 543);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/DividedDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "eras", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "centuryOfEra", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/DividedDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDurationField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuries", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/RemainderDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/field/DividedDateTimeField");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/RemainderDateTimeField", "<init>", "(Lorg/joda/time/field/DividedDateTimeField;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "yearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/RemainderDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuries", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "weekyearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/RemainderDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "weekyearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BuddhistChronology", "ERA_FIELD", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "era", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicSingleEraDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicSingleEraDateTimeField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BuddhistChronology", "ERA_FIELD", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BuddhistChronology", "cCache", "Ljava/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeZone", "UTC", "Lorg/joda/time/DateTimeZone;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BuddhistChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/BuddhistChronology;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BuddhistChronology", "INSTANCE_UTC", "Lorg/joda/time/chrono/BuddhistChronology;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
