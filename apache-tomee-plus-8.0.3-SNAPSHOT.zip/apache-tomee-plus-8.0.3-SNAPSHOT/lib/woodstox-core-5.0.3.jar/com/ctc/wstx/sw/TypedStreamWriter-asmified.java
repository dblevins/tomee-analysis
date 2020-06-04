package asm.com.ctc.wstx.sw;
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
public class TypedStreamWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/ctc/wstx/sw/TypedStreamWriter", null, "com/ctc/wstx/sw/BaseStreamWriter", null);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "ScalarEncoder", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "IntEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "LongEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "FloatEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "DoubleEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "IntArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "LongArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "FloatArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "DoubleArrayEncoder", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder", "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "Base64Encoder", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mValueEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/ctc/wstx/sw/XmlWriter;Ljava/lang/String;Lcom/ctc/wstx/api/WriterConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sw/BaseStreamWriter", "<init>", "(Lcom/ctc/wstx/sw/XmlWriter;Ljava/lang/String;Lcom/ctc/wstx/api/WriterConfig;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mValueEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueEncoderFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mValueEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mValueEncoderFactory", "Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBoolean", "(Z)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Z)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeInt", "(I)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(I)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLong", "(J)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(J)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeFloat", "(F)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(F)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDouble", "(D)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(D)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeInteger", "(Ljava/math/BigInteger;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDecimal", "(Ljava/math/BigDecimal;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigDecimal", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeQName", "(Ljavax/xml/namespace/QName;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sw/TypedStreamWriter", "serializeQName", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "writeIntArray", "([III)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([III)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLongArray", "([JII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([JII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeFloatArray", "([FII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([FII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDoubleArray", "([DII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([DII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBinary", "([BII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/typed/Base64Variants", "getDefaultVariant", "()Lorg/codehaus/stax2/typed/Base64Variant;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBinary", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mStartElementOpen", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mEmptyElement", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "closeStartElement", "(Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mCheckStructure", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "inPrologOrEpilog", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_PROLOG_NONWS_TEXT", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/sw/TypedStreamWriter", "reportNwfStructure", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mVldContent", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "reportInvalidContent", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mVldContent", "I");
methodVisitor.visitInsn(ICONST_3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mValidator", "Lorg/codehaus/stax2/validation/XMLValidator;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/codehaus/stax2/validation/XMLValidator"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mWriter", "Lcom/ctc/wstx/sw/XmlWriter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/XmlWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/codehaus/stax2/validation/XMLValidator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sw/TypedStreamWriter", "mWriter", "Lcom/ctc/wstx/sw/XmlWriter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "getCopyBuffer", "()[C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/XmlWriter", "writeTypedElement", "(Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;Lorg/codehaus/stax2/validation/XMLValidator;[C)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/exc/WstxIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/exc/WstxIOException", "<init>", "(Ljava/io/IOException;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBooleanAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Z)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeIntAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(I)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLongAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(J)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeFloatAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(FLOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(F)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDoubleAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(D)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeIntegerAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDecimalAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigDecimal", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getScalarEncoder", "(Ljava/lang/String;)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$ScalarEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeQNameAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljavax/xml/namespace/QName;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sw/TypedStreamWriter", "serializeQName", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeIntArrayAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[I)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([III)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$IntArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLongArrayAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[J)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([JII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$LongArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeFloatArrayAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[F)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([FII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$FloatArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeDoubleArrayAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[D)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "([DII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$DoubleArrayEncoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBinaryAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/typed/Base64Variants", "getDefaultVariant", "()Lorg/codehaus/stax2/typed/Base64Variant;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeBinaryAttribute", "(Lorg/codehaus/stax2/typed/Base64Variant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "valueEncoderFactory", "()Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueEncoderFactory", "getEncoder", "(Lorg/codehaus/stax2/typed/Base64Variant;[BII)Lorg/codehaus/stax2/ri/typed/ValueEncoderFactory$Base64Encoder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "writeTypedAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/stax2/ri/typed/AsciiValueEncoder;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "serializeQName", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/sw/TypedStreamWriter", "validateQNamePrefix", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
