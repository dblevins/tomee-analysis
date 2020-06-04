package asm.com.fasterxml.jackson.core.json;
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
public class JsonReadFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/core/json/JsonReadFeature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/core/json/JsonReadFeature;>;Lcom/fasterxml/jackson/core/FormatFeature;", "java/lang/Enum", new String[] { "com/fasterxml/jackson/core/FormatFeature" });

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonParser$Feature", "com/fasterxml/jackson/core/JsonParser", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_JAVA_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_YAML_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_SINGLE_QUOTES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_UNQUOTED_FIELD_NAMES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_UNESCAPED_CONTROL_CHARS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_LEADING_ZEROS_FOR_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_NON_NUMERIC_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_MISSING_VALUES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_TRAILING_COMMA", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonParser$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "$VALUES", "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/json/JsonReadFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/json/JsonReadFeature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collectDefaults", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "values", "()[Lcom/fasterxml/jackson/core/json/JsonReadFeature;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.INTEGER, "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "enabledByDefault", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "getMask", "()I", false);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", "(ZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_defaultState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "ordinal", "()I", false);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_mask", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_mask", "I");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mappedFeature", "()Lcom/fasterxml/jackson/core/JsonParser$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/json/JsonReadFeature", "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_JAVA_COMMENTS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_COMMENTS", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_JAVA_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_YAML_COMMENTS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_YAML_COMMENTS", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_YAML_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_SINGLE_QUOTES");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_SINGLE_QUOTES", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_SINGLE_QUOTES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_UNQUOTED_FIELD_NAMES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_UNQUOTED_FIELD_NAMES", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_UNQUOTED_FIELD_NAMES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_UNESCAPED_CONTROL_CHARS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_UNQUOTED_CONTROL_CHARS", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_UNESCAPED_CONTROL_CHARS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_LEADING_ZEROS_FOR_NUMBERS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_NUMERIC_LEADING_ZEROS", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_LEADING_ZEROS_FOR_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_NON_NUMERIC_NUMBERS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_NON_NUMERIC_NUMBERS", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_NON_NUMERIC_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_MISSING_VALUES");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_MISSING_VALUES", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_MISSING_VALUES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_TRAILING_COMMA");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonParser$Feature", "ALLOW_TRAILING_COMMA", "Lcom/fasterxml/jackson/core/JsonParser$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/json/JsonReadFeature", "<init>", "(Ljava/lang/String;IZLcom/fasterxml/jackson/core/JsonParser$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_TRAILING_COMMA", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/json/JsonReadFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_JAVA_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_YAML_COMMENTS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_SINGLE_QUOTES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_UNQUOTED_FIELD_NAMES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_UNESCAPED_CONTROL_CHARS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_LEADING_ZEROS_FOR_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_NON_NUMERIC_NUMBERS", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_MISSING_VALUES", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "ALLOW_TRAILING_COMMA", "Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/json/JsonReadFeature", "$VALUES", "[Lcom/fasterxml/jackson/core/json/JsonReadFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
