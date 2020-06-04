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
public class JsonpCharacterEscapesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/fasterxml/jackson/core/JsonpCharacterEscapes", null, "com/fasterxml/jackson/core/io/CharacterEscapes", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "asciiEscapes", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "escapeFor2028", "Lcom/fasterxml/jackson/core/io/SerializedString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "escapeFor2029", "Lcom/fasterxml/jackson/core/io/SerializedString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sInstance", "Lcom/fasterxml/jackson/core/JsonpCharacterEscapes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/CharacterEscapes", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instance", "()Lcom/fasterxml/jackson/core/JsonpCharacterEscapes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "sInstance", "Lcom/fasterxml/jackson/core/JsonpCharacterEscapes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEscapeSequence", "(I)Lcom/fasterxml/jackson/core/SerializableString;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 8232, 8233 }, new Label[] { label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "escapeFor2028", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "escapeFor2029", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEscapeCodesForAscii", "()[I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "asciiEscapes", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/core/io/CharacterEscapes", "standardAsciiEscapesForJSON", "()[I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "asciiEscapes", "[I");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/io/SerializedString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("\\u2028");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/SerializedString", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "escapeFor2028", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/io/SerializedString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("\\u2029");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/io/SerializedString", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "escapeFor2029", "Lcom/fasterxml/jackson/core/io/SerializedString;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/JsonpCharacterEscapes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/JsonpCharacterEscapes", "sInstance", "Lcom/fasterxml/jackson/core/JsonpCharacterEscapes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
