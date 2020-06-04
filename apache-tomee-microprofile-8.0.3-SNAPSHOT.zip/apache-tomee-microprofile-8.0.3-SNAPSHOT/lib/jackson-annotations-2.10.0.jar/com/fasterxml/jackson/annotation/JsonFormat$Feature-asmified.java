package asm.com.fasterxml.jackson.annotation;
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
public class JsonFormat$FeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JsonFormat$Feature", "com/fasterxml/jackson/annotation/JsonFormat", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_SORTED_MAP_ENTRIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
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
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_SINGLE_VALUE_AS_ARRAY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_CASE_INSENSITIVE_PROPERTIES");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPT_CASE_INSENSITIVE_VALUES");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DATES_WITH_ZONE_ID");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_SORTED_MAP_ENTRIES");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_SORTED_MAP_ENTRIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ADJUST_DATES_TO_CONTEXT_TIME_ZONE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/annotation/JsonFormat$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_SINGLE_VALUE_AS_ARRAY", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_CASE_INSENSITIVE_PROPERTIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ACCEPT_CASE_INSENSITIVE_VALUES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_DATES_WITH_ZONE_ID", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "WRITE_SORTED_MAP_ENTRIES", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "ADJUST_DATES_TO_CONTEXT_TIME_ZONE", "Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/annotation/JsonFormat$Feature", "$VALUES", "[Lcom/fasterxml/jackson/annotation/JsonFormat$Feature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
