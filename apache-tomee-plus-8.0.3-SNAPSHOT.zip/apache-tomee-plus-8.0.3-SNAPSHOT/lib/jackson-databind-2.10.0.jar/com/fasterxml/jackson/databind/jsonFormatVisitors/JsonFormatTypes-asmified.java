package asm.com.fasterxml.jackson.databind.jsonFormatVisitors;
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
public class JsonFormatTypesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRING", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NUMBER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTEGER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOOLEAN", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBJECT", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ARRAY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_byLCName", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/fasterxml/jackson/annotation/JsonValue;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "forValue", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/fasterxml/jackson/annotation/JsonCreator;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "_byLCName", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "STRING", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NUMBER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "NUMBER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "INTEGER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOOLEAN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "BOOLEAN", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBJECT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "OBJECT", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ARRAY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "ARRAY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "NULL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "ANY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "STRING", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "NUMBER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "INTEGER", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "BOOLEAN", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "OBJECT", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "ARRAY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "NULL", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "ANY", "Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "$VALUES", "[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "_byLCName", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "values", "()[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "_byLCName", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/jsonFormatVisitors/JsonFormatTypes", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
