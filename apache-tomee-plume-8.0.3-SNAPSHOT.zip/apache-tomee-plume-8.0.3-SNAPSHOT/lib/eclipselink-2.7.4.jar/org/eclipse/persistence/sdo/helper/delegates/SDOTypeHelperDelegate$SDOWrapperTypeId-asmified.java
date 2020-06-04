package asm.org.eclipse.persistence.sdo.helper.delegates;
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
public class SDOTypeHelperDelegate$SDOWrapperTypeIdDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "Ljava/lang/Enum<Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate", "SDOWrapperTypeId", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_BOOLEAN_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_BYTE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_BYTES_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_CHARACTER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DATE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DATETIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DECIMAL_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DOUBLE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DURATION_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_FLOAT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_INT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_INTEGER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_LONG_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_MONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_MONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_OBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_SHORT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_STRING_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_STRINGS_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_TIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_URI_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_YEAR_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_YEARMONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_YEARMONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_BOOLEANOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_BYTEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_CHARACTEROBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_DOUBLEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_FLOATOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_INTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_LONGOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SDO_SHORTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_BOOLEAN_WRAPPER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BOOLEAN_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_BYTE_WRAPPER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_BYTES_WRAPPER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTES_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_CHARACTER_WRAPPER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_CHARACTER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DATE_WRAPPER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DATE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DATETIME_WRAPPER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DATETIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DAY_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DECIMAL_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DECIMAL_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DOUBLE_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DOUBLE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DURATION_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DURATION_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_FLOAT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_FLOAT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_INT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_INTEGER_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INTEGER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_LONG_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_LONG_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_MONTH_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_MONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_MONTHDAY_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_MONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_OBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_OBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_SHORT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_SHORT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_STRING_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_STRING_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_STRINGS_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_STRINGS_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_TIME_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_TIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_URI_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_URI_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_YEAR_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEAR_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_YEARMONTH_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEARMONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_YEARMONTHDAY_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEARMONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_BOOLEANOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BOOLEANOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_BYTEOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_CHARACTEROBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_CHARACTEROBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_DOUBLEOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DOUBLEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_FLOATOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_FLOATOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_INTOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_LONGOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_LONGOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SDO_SHORTOBJECT_WRAPPER");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_SHORTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BOOLEAN_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTES_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_CHARACTER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DATE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DATETIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DECIMAL_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DOUBLE_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DURATION_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_FLOAT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INTEGER_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_LONG_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_MONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_MONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_OBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_SHORT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_STRING_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_STRINGS_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_TIME_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_URI_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEAR_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEARMONTH_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_YEARMONTHDAY_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BOOLEANOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_BYTEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_CHARACTEROBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_DOUBLEOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_FLOATOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_INTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_LONGOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "SDO_SHORTOBJECT_WRAPPER", "Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "ENUM$VALUES", "[Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId", "ENUM$VALUES", "[Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/delegates/SDOTypeHelperDelegate$SDOWrapperTypeId");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
