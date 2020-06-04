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
public class YearMonthDay$PropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/joda/time/YearMonthDay$Property", null, "org/joda/time/field/AbstractPartialFieldProperty", new String[] { "java/io/Serializable" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/joda/time/YearMonthDay$Property", "org/joda/time/YearMonthDay", "Property", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(5727734012190224363L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iYearMonthDay", "Lorg/joda/time/YearMonthDay;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iFieldIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/YearMonthDay;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/AbstractPartialFieldProperty", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getField", "(I)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getReadablePartial", "()Lorg/joda/time/ReadablePartial;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getYearMonthDay", "()Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getValue", "(I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToCopy", "(I)Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/YearMonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/YearMonthDay", "<init>", "(Lorg/joda/time/YearMonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrapFieldToCopy", "(I)Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "addWrapField", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/YearMonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/YearMonthDay", "<init>", "(Lorg/joda/time/YearMonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(I)Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/YearMonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/YearMonthDay", "<init>", "(Lorg/joda/time/YearMonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iFieldIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(Lorg/joda/time/ReadablePartial;I[ILjava/lang/String;Ljava/util/Locale;)[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/YearMonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/YearMonthDay$Property", "iYearMonthDay", "Lorg/joda/time/YearMonthDay;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/YearMonthDay", "<init>", "(Lorg/joda/time/YearMonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCopy", "(Ljava/lang/String;)Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "setCopy", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/joda/time/YearMonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMaximumValue", "()Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getMaximumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "setCopy", "(I)Lorg/joda/time/YearMonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMinimumValue", "()Lorg/joda/time/YearMonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "getMinimumValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/YearMonthDay$Property", "setCopy", "(I)Lorg/joda/time/YearMonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
