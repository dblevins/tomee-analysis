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
public class SimpleValueEncoderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "IntArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "LongArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "FloatArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "DoubleArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "Base64Encoder", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mBuffer", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 500);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodeAsString", "([III)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([III)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodeAsString", "([JII)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([JII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodeAsString", "([FII)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([FII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodeAsString", "([DII)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([DII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodeAsString", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encode", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/AsciiValueEncoder", "encodeMore", "([CII)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/AsciiValueEncoder", "isCompleted", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "([CII)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/AsciiValueEncoder", "encodeMore", "([CII)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/SimpleValueEncoder", "mBuffer", "[C");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "([CII)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/AsciiValueEncoder", "isCompleted", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
