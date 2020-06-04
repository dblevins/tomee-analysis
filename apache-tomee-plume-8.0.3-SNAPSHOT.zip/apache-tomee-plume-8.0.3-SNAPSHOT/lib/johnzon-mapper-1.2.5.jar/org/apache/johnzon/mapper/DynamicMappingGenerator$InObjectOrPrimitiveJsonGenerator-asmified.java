package asm.org.apache.johnzon.mapper;
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
public class DynamicMappingGenerator$InObjectOrPrimitiveJsonGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", null, "java/lang/Object", new String[] { "jakarta/json/stream/JsonGenerator" });

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "org/apache/johnzon/mapper/DynamicMappingGenerator", "WritingState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "org/apache/johnzon/mapper/DynamicMappingGenerator", "InObjectOrPrimitiveJsonGenerator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/json/stream/JsonGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writeStart", "Ljava/lang/Runnable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyIfNoObject", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nested", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/json/stream/JsonGenerator;Ljava/lang/Runnable;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "writeStart", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "ensureStart", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "writeStart", "Ljava/lang/Runnable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartObject", "()Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeStartObject", "()Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartObject", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeStartObject", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartArray", "()Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeStartArray", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeStartArray", "()Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartArray", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeStartArray", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeKey", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeKey", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;Ljava/math/BigInteger;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/math/BigInteger;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;I)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;I)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;J)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;J)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;D)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(DLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;D)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;Z)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Z)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeNull", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "ensureStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeNull", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeEnd", "()Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "nested", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeEnd", "()Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljakarta/json/JsonValue;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljakarta/json/JsonValue;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljakarta/json/JsonValue;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/math/BigDecimal;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/math/BigDecimal;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/math/BigInteger;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Ljava/math/BigInteger;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/math/BigInteger;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;I)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(I)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(J)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;J)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(J)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(D)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;D)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(D)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Z)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Ljava/lang/String;Z)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "write", "(Z)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeNull", "()Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "isWritingPrimitive", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeNull", "(Ljava/lang/String;)Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "writeNull", "()Ljakarta/json/stream/JsonGenerator;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isWritingPrimitive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "keyIfNoObject", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/json/stream/JsonGenerator", "flush", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/json/stream/JsonGenerator;Ljava/lang/Runnable;Ljava/lang/String;Lorg/apache/johnzon/mapper/DynamicMappingGenerator$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "<init>", "(Ljakarta/json/stream/JsonGenerator;Ljava/lang/Runnable;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;)Ljakarta/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "delegate", "Ljakarta/json/stream/JsonGenerator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;)Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;)Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "state", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
