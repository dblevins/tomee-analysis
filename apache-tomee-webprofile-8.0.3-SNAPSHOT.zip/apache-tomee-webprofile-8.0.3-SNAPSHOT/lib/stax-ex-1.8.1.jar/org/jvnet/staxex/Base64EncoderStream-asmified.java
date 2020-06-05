package asm.org.jvnet.staxex;
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
public class Base64EncoderStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jvnet/staxex/Base64EncoderStream", null, "java/io/FilterOutputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "buffer", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bufsize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "outWriter", "Ljavax/xml/stream/XMLStreamWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "pem_array", "[C", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/OutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLStreamWriter;Ljava/io/OutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FilterOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "outWriter", "Ljavax/xml/stream/XMLStreamWriter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/staxex/Base64EncoderStream", "write", "(I)V", false);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/staxex/Base64EncoderStream", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitInsn(ICONST_3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/staxex/Base64EncoderStream", "encode", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/staxex/Base64EncoderStream", "encode", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "out", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "flush", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "outWriter", "Ljavax/xml/stream/XMLStreamWriter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "flush", "()V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/jvnet/staxex/Base64EncoderStream;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/staxex/Base64EncoderStream", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "out", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "encode", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/jvnet/staxex/Base64EncoderStream", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "[C"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "bufsize", "I");
methodVisitor.visitInsn(ICONST_2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "buffer", "[B");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/jvnet/staxex/Base64EncoderStream", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, "[C"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/staxex/Base64EncoderStream", "outWriter", "Ljavax/xml/stream/XMLStreamWriter;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "([CII)V", true);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/jvnet/staxex/Base64EncoderStream;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitIntInsn(BIPUSH, 107);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitIntInsn(BIPUSH, 117);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/staxex/Base64EncoderStream", "pem_array", "[C");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}