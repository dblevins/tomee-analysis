package asm.com.fasterxml.jackson.databind;
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
public class DeserializationFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/DeserializationFeature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/DeserializationFeature;>;Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;", "java/lang/Enum", new String[] { "com/fasterxml/jackson/databind/cfg/ConfigFeature" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_BIG_DECIMAL_FOR_FLOATS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_BIG_INTEGER_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_LONG_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_JAVA_ARRAY_FOR_JSON_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_UNKNOWN_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_NULL_FOR_PRIMITIVES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_NUMBERS_FOR_ENUMS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_INVALID_SUBTYPE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_READING_DUP_TREE_KEY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_IGNORED_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_UNRESOLVED_OBJECT_IDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_MISSING_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_NULL_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_TRAILING_TOKENS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNWRAP_SINGLE_VALUE_ARRAYS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNWRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_FLOAT_AS_INT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_UNKNOWN_ENUM_VALUES_AS_NULL", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EAGER_DESERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_defaultState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_mask", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/DeserializationFeature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/DeserializationFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/DeserializationFeature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/DeserializationFeature", "_defaultState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/DeserializationFeature", "ordinal", "()I", false);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/DeserializationFeature", "_mask", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/DeserializationFeature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/DeserializationFeature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/DeserializationFeature", "_mask", "I");
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_BIG_DECIMAL_FOR_FLOATS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_BIG_DECIMAL_FOR_FLOATS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_BIG_INTEGER_FOR_INTS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_BIG_INTEGER_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_LONG_FOR_INTS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_LONG_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_JAVA_ARRAY_FOR_JSON_ARRAY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_JAVA_ARRAY_FOR_JSON_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_UNKNOWN_PROPERTIES");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_UNKNOWN_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_NULL_FOR_PRIMITIVES");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NULL_FOR_PRIMITIVES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_NUMBERS_FOR_ENUMS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NUMBERS_FOR_ENUMS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_INVALID_SUBTYPE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_INVALID_SUBTYPE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_READING_DUP_TREE_KEY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_READING_DUP_TREE_KEY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_IGNORED_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_IGNORED_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_UNRESOLVED_OBJECT_IDS");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_UNRESOLVED_OBJECT_IDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_MISSING_CREATOR_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_MISSING_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_NULL_CREATOR_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NULL_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_TRAILING_TOKENS");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_TRAILING_TOKENS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAP_EXCEPTIONS");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_SINGLE_VALUE_AS_ARRAY");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNWRAP_SINGLE_VALUE_ARRAYS");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "UNWRAP_SINGLE_VALUE_ARRAYS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNWRAP_ROOT_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "UNWRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_EMPTY_STRING_AS_NULL_OBJECT");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_FLOAT_AS_INT");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_FLOAT_AS_INT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_ENUMS_USING_TO_STRING");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_UNKNOWN_ENUM_VALUES_AS_NULL");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_UNKNOWN_ENUM_VALUES_AS_NULL", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_DATE_TIMESTAMPS_AS_NANOSECONDS");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ADJUST_DATES_TO_CONTEXT_TIME_ZONE");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EAGER_DESERIALIZER_FETCH");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/DeserializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "EAGER_DESERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/DeserializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_BIG_DECIMAL_FOR_FLOATS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_BIG_INTEGER_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_LONG_FOR_INTS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "USE_JAVA_ARRAY_FOR_JSON_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_UNKNOWN_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NULL_FOR_PRIMITIVES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NUMBERS_FOR_ENUMS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_INVALID_SUBTYPE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_READING_DUP_TREE_KEY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_IGNORED_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_UNRESOLVED_OBJECT_IDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_MISSING_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_NULL_CREATOR_PROPERTIES", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "FAIL_ON_TRAILING_TOKENS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "UNWRAP_SINGLE_VALUE_ARRAYS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "UNWRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ACCEPT_FLOAT_AS_INT", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_UNKNOWN_ENUM_VALUES_AS_NULL", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "READ_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "EAGER_DESERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/DeserializationFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/DeserializationFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
