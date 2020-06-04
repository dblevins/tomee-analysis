package asm.com.fasterxml.jackson.core;
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
public class StreamWriteFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/core/StreamWriteFeature", "Ljava/lang/Enum<Lcom/fasterxml/jackson/core/StreamWriteFeature;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/core/JsonGenerator$Feature", "com/fasterxml/jackson/core/JsonGenerator", "Feature", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_CLOSE_TARGET", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTO_CLOSE_CONTENT", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLUSH_PASSED_TO_STREAM", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRICT_DUPLICATE_DETECTION", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IGNORE_UNKNOWN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
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
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "$VALUES", "[Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/core/StreamWriteFeature;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/StreamWriteFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/StreamWriteFeature;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", "(Lcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator$Feature", "getMask", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_mask", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/JsonGenerator$Feature", "enabledByDefault", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_defaultState", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collectDefaults", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "values", "()[Lcom/fasterxml/jackson/core/StreamWriteFeature;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.INTEGER, "[Lcom/fasterxml/jackson/core/StreamWriteFeature;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/StreamWriteFeature", "enabledByDefault", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/core/StreamWriteFeature", "getMask", "()I", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledByDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_defaultState", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enabledIn", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_mask", "I");
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
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_mask", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mappedFeature", "()Lcom/fasterxml/jackson/core/JsonGenerator$Feature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/core/StreamWriteFeature", "_mappedFeature", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_CLOSE_TARGET");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "AUTO_CLOSE_TARGET", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "AUTO_CLOSE_TARGET", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTO_CLOSE_CONTENT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "AUTO_CLOSE_JSON_CONTENT", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "AUTO_CLOSE_CONTENT", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLUSH_PASSED_TO_STREAM");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "FLUSH_PASSED_TO_STREAM", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "FLUSH_PASSED_TO_STREAM", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_BIGDECIMAL_AS_PLAIN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRICT_DUPLICATE_DETECTION");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "STRICT_DUPLICATE_DETECTION", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "STRICT_DUPLICATE_DETECTION", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IGNORE_UNKNOWN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonGenerator$Feature", "IGNORE_UNKNOWN", "Lcom/fasterxml/jackson/core/JsonGenerator$Feature;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/StreamWriteFeature", "<init>", "(Ljava/lang/String;ILcom/fasterxml/jackson/core/JsonGenerator$Feature;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "IGNORE_UNKNOWN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/StreamWriteFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "AUTO_CLOSE_TARGET", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "AUTO_CLOSE_CONTENT", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "FLUSH_PASSED_TO_STREAM", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "WRITE_BIGDECIMAL_AS_PLAIN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "STRICT_DUPLICATE_DETECTION", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "IGNORE_UNKNOWN", "Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/StreamWriteFeature", "$VALUES", "[Lcom/fasterxml/jackson/core/StreamWriteFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
