package asm.org.apache.johnzon.core;
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
public class JsonCharsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/johnzon/core/JsonChars", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/json/stream/JsonParser$Event", "javax/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EOF", "C", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_OBJECT_CHAR", "C", null, new Integer(123));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_OBJECT_CHAR", "C", null, new Integer(125));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_ARRAY_CHAR", "C", null, new Integer(91));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_ARRAY_CHAR", "C", null, new Integer(93));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUOTE_CHAR", "C", null, new Integer(34));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMA_CHAR", "C", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_SEPARATOR", "C", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EOL", "C", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPACE", "C", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE_T", "C", null, new Integer(116));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE_R", "C", null, new Integer(114));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE_U", "C", null, new Integer(117));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE_E", "C", null, new Integer(101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_F", "C", null, new Integer(102));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_A", "C", null, new Integer(97));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_L", "C", null, new Integer(108));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_S", "C", null, new Integer(115));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_E", "C", null, new Integer(101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_N", "C", null, new Integer(110));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_U", "C", null, new Integer(117));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_L", "C", null, new Integer(108));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ZERO", "C", null, new Integer(48));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NINE", "C", null, new Integer(57));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOT", "C", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MINUS", "C", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PLUS", "C", null, new Integer(43));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXP_LOWERCASE", "C", null, new Integer(101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXP_UPPERCASE", "C", null, new Integer(69));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ESCAPE_CHAR", "C", null, new Integer(92));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAB", "C", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BACKSPACE", "C", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORMFEED", "C", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CR", "C", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_ARRAY", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "START_OBJECT", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_NAME", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_STRING", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_NUMBER", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_TRUE", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_FALSE", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_NULL", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_OBJECT", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "END_ARRAY", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMA_EVENT", "B", null, new Integer(127));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_SEPARATOR_EVENT", "B", null, new Integer(-128));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVT_MAP", "[Ljavax/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("null");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "NULL", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "START_ARRAY", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "START_ARRAY", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "START_OBJECT", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "START_OBJECT", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "KEY_NAME", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "KEY_NAME", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "VALUE_STRING", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "VALUE_STRING", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "VALUE_NUMBER", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "VALUE_NUMBER", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "VALUE_TRUE", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "VALUE_TRUE", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "VALUE_FALSE", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "VALUE_FALSE", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "VALUE_NULL", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "VALUE_NULL", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "END_OBJECT", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "END_OBJECT", "B");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/stream/JsonParser$Event", "END_ARRAY", "Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(I2B);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "END_ARRAY", "B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/stream/JsonParser$Event", "values", "()[Ljavax/json/stream/JsonParser$Event;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonChars", "EVT_MAP", "[Ljavax/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
