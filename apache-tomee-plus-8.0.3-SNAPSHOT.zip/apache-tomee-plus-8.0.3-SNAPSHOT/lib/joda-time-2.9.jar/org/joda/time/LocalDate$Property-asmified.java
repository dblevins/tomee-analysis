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
public class LocalDate$PropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/joda/time/LocalDate$Property", null, "org/joda/time/field/AbstractReadableInstantFieldProperty", null);

classWriter.visitInnerClass("org/joda/time/LocalDate$Property", "org/joda/time/LocalDate", "Property", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-3193829732634L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iInstant", "Lorg/joda/time/LocalDate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/DateTimeField;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/AbstractReadableInstantFieldProperty", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeObject", "(Ljava/io/ObjectOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
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
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/LocalDate");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/DateTimeFieldType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeFieldType", "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getChronology", "()Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalDate", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToCopy", "(I)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrapFieldToCopy", "(I)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "addWrapField", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(I)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JI)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JLjava/lang/String;Ljava/util/Locale;)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate$Property", "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMaximumValue", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate$Property", "getMaximumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate$Property", "setCopy", "(I)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMinimumValue", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate$Property", "getMinimumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate$Property", "setCopy", "(I)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundFloorCopy", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundFloor", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundCeilingCopy", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundCeiling", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfFloorCopy", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfFloor", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfCeilingCopy", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfCeiling", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfEvenCopy", "()Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/LocalDate$Property", "iInstant", "Lorg/joda/time/LocalDate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getLocalMillis", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfEven", "(J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "withLocalMillis", "(J)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
