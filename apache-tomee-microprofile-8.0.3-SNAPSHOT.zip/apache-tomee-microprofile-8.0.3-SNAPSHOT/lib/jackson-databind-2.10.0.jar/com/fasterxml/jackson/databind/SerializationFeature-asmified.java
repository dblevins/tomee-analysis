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
public class SerializationFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/databind/SerializationFeature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/databind/SerializationFeature;>;Lcom/fasterxml/jackson/databind/cfg/ConfigFeature;", "java/lang/Enum", new String[] { "com/fasterxml/jackson/databind/cfg/ConfigFeature" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDENT_OUTPUT", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_EMPTY_BEANS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_SELF_REFERENCES", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSE_CLOSEABLE", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLUSH_AFTER_WRITE_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATES_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATE_KEYS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DURATIONS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_ENUMS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_ENUM_KEYS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM | ACC_DEPRECATED, "WRITE_NULL_MAP_VALUES", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM | ACC_DEPRECATED, "WRITE_EMPTY_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM | ACC_DEPRECATED, "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ORDER_MAP_ENTRIES_BY_KEYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EAGER_SERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_EQUALITY_FOR_OBJECT_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/databind/SerializationFeature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/SerializationFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/databind/SerializationFeature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/databind/SerializationFeature");
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
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/SerializationFeature", "_defaultState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/SerializationFeature", "ordinal", "()I", false);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/SerializationFeature", "_mask", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/SerializationFeature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/SerializationFeature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/SerializationFeature", "_mask", "I");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAP_ROOT_VALUE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDENT_OUTPUT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "INDENT_OUTPUT", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_EMPTY_BEANS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_EMPTY_BEANS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_SELF_REFERENCES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_SELF_REFERENCES", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAP_EXCEPTIONS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSE_CLOSEABLE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "CLOSE_CLOSEABLE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLUSH_AFTER_WRITE_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FLUSH_AFTER_WRITE_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATES_AS_TIMESTAMPS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATES_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATE_KEYS_AS_TIMESTAMPS");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATE_KEYS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATES_WITH_ZONE_ID");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DURATIONS_AS_TIMESTAMPS");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DURATIONS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_ENUMS_USING_TO_STRING");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_ENUMS_USING_INDEX");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUMS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_ENUM_KEYS_USING_INDEX");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUM_KEYS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_NULL_MAP_VALUES");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_NULL_MAP_VALUES", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_EMPTY_JSON_ARRAYS");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_EMPTY_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_BIGDECIMAL_AS_PLAIN");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ORDER_MAP_ENTRIES_BY_KEYS");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "ORDER_MAP_ENTRIES_BY_KEYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EAGER_SERIALIZER_FETCH");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "EAGER_SERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_EQUALITY_FOR_OBJECT_ID");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/SerializationFeature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "USE_EQUALITY_FOR_OBJECT_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/SerializationFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRAP_ROOT_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "INDENT_OUTPUT", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_EMPTY_BEANS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_SELF_REFERENCES", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRAP_EXCEPTIONS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "CLOSE_CLOSEABLE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "FLUSH_AFTER_WRITE_VALUE", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATES_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATE_KEYS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DURATIONS_AS_TIMESTAMPS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUMS_USING_TO_STRING", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUMS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_ENUM_KEYS_USING_INDEX", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_NULL_MAP_VALUES", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_EMPTY_JSON_ARRAYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "ORDER_MAP_ENTRIES_BY_KEYS", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "EAGER_SERIALIZER_FETCH", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "USE_EQUALITY_FOR_OBJECT_ID", "Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/SerializationFeature", "$VALUES", "[Lcom/fasterxml/jackson/databind/SerializationFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
