package asm.com.fasterxml.jackson.dataformat.yaml;
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
public class YAMLGenerator$FeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;>;Lcom/fasterxml/jackson/core/FormatFeature;", "java/lang/Enum", new String[] { "com/fasterxml/jackson/core/FormatFeature" });

classWriter.visitInnerClass("com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_DOC_START_MARKER", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_NATIVE_OBJECT_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_NATIVE_TYPE_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANONICAL_OUTPUT", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPLIT_LINES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MINIMIZE_QUOTES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALWAYS_QUOTE_NUMBERS_AS_STRINGS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LITERAL_BLOCK_STYLE", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDENT_ARRAYS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_PLATFORM_LINE_BREAKS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_defaultState", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_mask", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "$VALUES", "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collectDefaults", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "values", "()[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.INTEGER, "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "enabledByDefault", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "getMask", "()I", false);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "_defaultState", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "ordinal", "()I", false);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "_mask", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "_mask", "I");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMask", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_DOC_START_MARKER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "WRITE_DOC_START_MARKER", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_NATIVE_OBJECT_ID");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_NATIVE_OBJECT_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_NATIVE_TYPE_ID");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_NATIVE_TYPE_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANONICAL_OUTPUT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "CANONICAL_OUTPUT", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPLIT_LINES");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "SPLIT_LINES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MINIMIZE_QUOTES");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "MINIMIZE_QUOTES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALWAYS_QUOTE_NUMBERS_AS_STRINGS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "ALWAYS_QUOTE_NUMBERS_AS_STRINGS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LITERAL_BLOCK_STYLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "LITERAL_BLOCK_STYLE", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDENT_ARRAYS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "INDENT_ARRAYS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_PLATFORM_LINE_BREAKS");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_PLATFORM_LINE_BREAKS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "WRITE_DOC_START_MARKER", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_NATIVE_OBJECT_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_NATIVE_TYPE_ID", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "CANONICAL_OUTPUT", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "SPLIT_LINES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "MINIMIZE_QUOTES", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "ALWAYS_QUOTE_NUMBERS_AS_STRINGS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "LITERAL_BLOCK_STYLE", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "INDENT_ARRAYS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "USE_PLATFORM_LINE_BREAKS", "Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature", "$VALUES", "[Lcom/fasterxml/jackson/dataformat/yaml/YAMLGenerator$Feature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
