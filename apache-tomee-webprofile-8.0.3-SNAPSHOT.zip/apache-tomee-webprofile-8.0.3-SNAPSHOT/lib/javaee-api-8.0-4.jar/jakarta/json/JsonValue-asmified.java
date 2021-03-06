package asm.jakarta.json;
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
public class JsonValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/json/JsonValue", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/json/JsonValue$ValueType", "jakarta/json/JsonValue", "ValueType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/json/JsonValue$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("jakarta/json/JsonValue$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("jakarta/json/JsonValue$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_JSON_OBJECT", "Ljakarta/json/JsonObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_JSON_ARRAY", "Ljakarta/json/JsonArray;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL", "Ljakarta/json/JsonValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE", "Ljakarta/json/JsonValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE", "Ljakarta/json/JsonValue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValueType", "()Ljakarta/json/JsonValue$ValueType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asJsonObject", "()Ljakarta/json/JsonObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/JsonObject;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonObject");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asJsonArray", "()Ljakarta/json/JsonArray;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/json/JsonArray;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/json/JsonArray");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/json/EmptyJsonObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/EmptyJsonObject", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/JsonValue", "EMPTY_JSON_OBJECT", "Ljakarta/json/JsonObject;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/EmptyJsonArray");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/EmptyJsonArray", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/JsonValue", "EMPTY_JSON_ARRAY", "Ljakarta/json/JsonArray;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/JsonValue$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/JsonValue$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/JsonValue", "NULL", "Ljakarta/json/JsonValue;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/JsonValue$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/JsonValue$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/JsonValue", "TRUE", "Ljakarta/json/JsonValue;");
methodVisitor.visitTypeInsn(NEW, "jakarta/json/JsonValue$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/json/JsonValue$3", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/json/JsonValue", "FALSE", "Ljakarta/json/JsonValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
