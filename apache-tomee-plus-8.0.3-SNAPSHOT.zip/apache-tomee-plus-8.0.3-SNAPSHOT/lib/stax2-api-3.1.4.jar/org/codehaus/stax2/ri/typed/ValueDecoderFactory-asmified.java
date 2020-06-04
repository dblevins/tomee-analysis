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
public class ValueDecoderFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "DoubleArrayDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "FloatArrayDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "LongArrayDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "IntArrayDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$BaseArrayDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "BaseArrayDecoder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$QNameDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "QNameDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecimalDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "DecimalDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "IntegerDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "DoubleDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "FloatDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "LongDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "IntDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "BooleanDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecoderBase", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "DecoderBase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mBooleanDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mIntDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mLongDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mFloatDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mDoubleDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mBooleanDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mIntDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mLongDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mFloatDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mDoubleDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBooleanDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mBooleanDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mBooleanDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mBooleanDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$BooleanDecoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mIntDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mIntDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mIntDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLongDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mLongDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mLongDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mLongDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFloatDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mFloatDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mFloatDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mFloatDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDoubleDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mDoubleDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mDoubleDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "mDoubleDecoder", "Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntegerDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDecimalDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DecimalDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecimalDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecimalDecoder", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQNameDecoder", "(Ljavax/xml/namespace/NamespaceContext;)Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$QNameDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$QNameDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$QNameDecoder", "<init>", "(Ljavax/xml/namespace/NamespaceContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntArrayDecoder", "([III)Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getIntDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder", "<init>", "([IIILorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntArrayDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getIntDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntArrayDecoder", "<init>", "(Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$IntDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLongArrayDecoder", "([JII)Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getLongDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder", "<init>", "([JIILorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLongArrayDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getLongDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$LongArrayDecoder", "<init>", "(Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$LongDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFloatArrayDecoder", "([FII)Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getFloatDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder", "<init>", "([FIILorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFloatArrayDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getFloatDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatArrayDecoder", "<init>", "(Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$FloatDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDoubleArrayDecoder", "([DII)Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getDoubleDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder", "<init>", "([DIILorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDoubleArrayDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "getDoubleDecoder", "()Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleArrayDecoder", "<init>", "(Lorg/codehaus/stax2/ri/typed/ValueDecoderFactory$DoubleDecoder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
