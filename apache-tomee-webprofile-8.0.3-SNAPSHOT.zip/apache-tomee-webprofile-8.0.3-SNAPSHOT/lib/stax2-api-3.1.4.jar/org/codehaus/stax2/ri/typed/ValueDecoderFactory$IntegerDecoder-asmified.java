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
public class ValueDecoderFactory$IntegerDecoderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", null, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecoderBase", null);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "IntegerDecoder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecoderBase", "org/codehaus/stax2/ri/typed/ValueDecoderFactory", "DecoderBase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mValue", "Ljava/math/BigInteger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$DecoderBase", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("integer");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "mValue", "Ljava/math/BigInteger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decode", "(Ljava/lang/String;)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NumberFormatException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "mValue", "Ljava/math/BigInteger;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "constructInvalidValue", "(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decode", "([CII)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NumberFormatException");
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "mValue", "Ljava/math/BigInteger;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/typed/ValueDecoderFactory$IntegerDecoder", "constructInvalidValue", "(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
