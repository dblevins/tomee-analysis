package asm.org.apache.tomcat.util.buf;
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
public class Utf8EncoderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/buf/Utf8Encoder", null, "java/nio/charset/CharsetEncoder", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
methodVisitor.visitLdcInsn(new Float("1.1"));
methodVisitor.visitLdcInsn(new Float("4.0"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/nio/charset/CharsetEncoder", "<init>", "(Ljava/nio/charset/Charset;FF)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encodeLoop", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "hasArray", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasArray", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/buf/Utf8Encoder", "encodeHasArray", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/buf/Utf8Encoder", "encodeNotHasArray", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "encodeHasArray", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "limit", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "array", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "array", "()[C", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/tomcat/util/buf/Utf8Encoder", "java/nio/CharBuffer", "java/nio/ByteBuffer", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "[B", "[C", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(IADD);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 127);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(3, -1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(SIPUSH, 2047);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(3, -2);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitLdcInsn(new Integer(55296));
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label7);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitLdcInsn(new Integer(57343));
methodVisitor.visitJumpInsn(IF_ICMPGT, label7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "UNDERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitLdcInsn(new Integer(56320));
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/CoderResult", "malformedForLength", "(I)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitLdcInsn(new Integer(56320));
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/CoderResult", "malformedForLength", "(I)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLdcInsn(new Integer(-56613888));
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(3, -4);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 224);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(3, -3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label14);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "UNDERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "UNDERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "encodeNotHasArray", "(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, null);
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label2, null);
Label label9 = new Label();
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label2, null);
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label2, null);
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label13, label14, label2, null);
Label label15 = new Label();
Label label16 = new Label();
methodVisitor.visitTryCatchBlock(label15, label16, label2, null);
Label label17 = new Label();
Label label18 = new Label();
methodVisitor.visitTryCatchBlock(label17, label18, label2, null);
Label label19 = new Label();
methodVisitor.visitTryCatchBlock(label2, label19, label2, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "limit", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitJumpInsn(IF_ICMPGE, label18);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "get", "()C", false);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 127);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label20);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(3, -1);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(SIPUSH, 2047);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label22);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(3, -2);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitLdcInsn(new Integer(55296));
Label label23 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label23);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitLdcInsn(new Integer(57343));
methodVisitor.visitJumpInsn(IF_ICMPGT, label23);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitJumpInsn(IF_ICMPGT, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "UNDERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitJumpInsn(IF_ICMPGE, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitLdcInsn(new Integer(56320));
methodVisitor.visitJumpInsn(IF_ICMPLT, label13);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/CoderResult", "malformedForLength", "(I)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "get", "()C", false);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitLdcInsn(new Integer(56320));
methodVisitor.visitJumpInsn(IF_ICMPGE, label15);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/CoderResult", "malformedForLength", "(I)Ljava/nio/charset/CoderResult;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label14);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLdcInsn(new Integer(-56613888));
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(3, -4);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPGE, label17);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "OVERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label16);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 224);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2B);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(3, -3);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
Label label24 = new Label();
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label19);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/CoderResult", "UNDERFLOW", "Ljava/nio/charset/CoderResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}