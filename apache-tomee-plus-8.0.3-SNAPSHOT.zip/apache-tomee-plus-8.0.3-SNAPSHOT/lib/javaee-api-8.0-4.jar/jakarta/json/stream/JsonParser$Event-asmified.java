package asm.jakarta.json.stream;
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
public class JsonParser$EventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/json/stream/JsonParser$Event", "Ljava/lang/Enum<Ljakarta/json/stream/JsonParser$Event;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/json/stream/JsonParser$Event", "jakarta/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_ARRAY", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_OBJECT", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_NAME", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE_STRING", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE_NUMBER", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE_TRUE", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE_FALSE", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE_NULL", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END_OBJECT", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END_ARRAY", "Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/json/stream/JsonParser$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "$VALUES", "[Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/json/stream/JsonParser$Event;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/json/stream/JsonParser$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/stream/JsonParser$Event;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_ARRAY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "START_ARRAY", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_OBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "START_OBJECT", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_NAME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "KEY_NAME", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE_STRING");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_STRING", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE_NUMBER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NUMBER", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE_TRUE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_TRUE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE_FALSE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_FALSE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE_NULL");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NULL", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END_OBJECT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "END_OBJECT", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END_ARRAY");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/stream/JsonParser$Event", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "END_ARRAY", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/json/stream/JsonParser$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "START_ARRAY", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "START_OBJECT", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "KEY_NAME", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_STRING", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NUMBER", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_TRUE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_FALSE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NULL", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "END_OBJECT", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "END_ARRAY", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/stream/JsonParser$Event", "$VALUES", "[Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
