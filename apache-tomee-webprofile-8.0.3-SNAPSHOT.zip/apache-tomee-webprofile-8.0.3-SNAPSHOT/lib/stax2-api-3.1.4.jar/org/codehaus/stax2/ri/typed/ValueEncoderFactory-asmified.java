package asm.org.codehaus.stax2.ri.typed;
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
public class ValueEncoderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "Base64Encoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "DoubleArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "FloatArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "LongArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "IntArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$ArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "ArrayEncoder", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "DoubleEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "FloatEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "LongEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "IntEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$TypedScalarEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "TypedScalarEncoder", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$StringEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "StringEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "TokenEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "ScalarEncoder", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "BYTE_SPACE", "B", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 64);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder", "reset", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_tokenEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$TokenEncoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$StringEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$StringEncoder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(Z)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("true");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(I)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder", "reset", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_intEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(J)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder", "reset", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_longEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(F)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;");
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder", "reset", "(F)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_floatEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(D)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder", "reset", "(D)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "_doubleEncoder", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "([III)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder", "<init>", "([III)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "([JII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder", "<init>", "([JII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "([FII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder", "<init>", "([FII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "([DII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder", "<init>", "([DII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder", "<init>", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
