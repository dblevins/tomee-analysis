package asm.org.joda.time;
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
public class LocalTime$PropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/joda/time/LocalTime$Property", null, "org/joda/time/field/AbstractReadableInstantFieldProperty", null);

classWriter.visitInnerClass("org/joda/time/LocalTime$Property", "org/joda/time/LocalTime", "Property", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-325842547277223L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iInstant", "Lorg/joda/time/LocalTime;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeField;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/AbstractReadableInstantFieldProperty", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeObject", "(Ljava/io/ObjectOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getType", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readObject", "(Ljava/io/ObjectInputStream;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/LocalTime");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/DateTimeFieldType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeFieldType", "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getChronology", "()Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalTime", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addCopy", "(I)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addCopy", "(J)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JJ)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addNoWrapToCopy", "(I)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JI)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "millisOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "get", "(J)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The addition exceeded the boundaries of LocalTime");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrapFieldToCopy", "(I)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "addWrapField", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(I)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JLjava/lang/String;Ljava/util/Locale;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;)Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime$Property", "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMaximumValue", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime$Property", "getMaximumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime$Property", "setCopy", "(I)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMinimumValue", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime$Property", "getMinimumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime$Property", "setCopy", "(I)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundFloorCopy", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundFloor", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundCeilingCopy", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundCeiling", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfFloorCopy", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfFloor", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfCeilingCopy", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfCeiling", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfEvenCopy", "()Lorg/joda/time/LocalTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalTime$Property", "iInstant", "Lorg/joda/time/LocalTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfEven", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalTime", "withLocalMillis", "(J)Lorg/joda/time/LocalTime;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
