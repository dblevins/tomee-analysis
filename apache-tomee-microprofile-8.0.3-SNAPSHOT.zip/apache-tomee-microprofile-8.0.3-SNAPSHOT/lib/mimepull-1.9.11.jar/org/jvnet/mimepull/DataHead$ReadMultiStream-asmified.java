package asm.org.jvnet.mimepull;
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
public class DataHead$ReadMultiStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/jvnet/mimepull/DataHead$ReadMultiStream", null, "java/io/InputStream", null);

classWriter.visitInnerClass("org/jvnet/mimepull/DataHead$ReadMultiStream", "org/jvnet/mimepull/DataHead", "ReadMultiStream", 0);

{
fieldVisitor = classWriter.visitField(0, "current", "Lorg/jvnet/mimepull/Chunk;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "len", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "buf", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "closed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/jvnet/mimepull/DataHead;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/jvnet/mimepull/DataHead;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "this$0", "Lorg/jvnet/mimepull/DataHead;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "head", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jvnet/mimepull/Data", "size", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "len", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jvnet/mimepull/Data", "read", "()[B", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "buf", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/DataHead$ReadMultiStream", "fetch", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "len", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "buf", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/DataHead$ReadMultiStream", "fetch", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "buf", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "adjustInMemoryUsage", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fetch", "()Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Stream already closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "len", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "this$0", "Lorg/jvnet/mimepull/DataHead;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/DataHead", "access$000", "(Lorg/jvnet/mimepull/DataHead;)Lorg/jvnet/mimepull/MIMEPart;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEPart", "parsed", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "next", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "this$0", "Lorg/jvnet/mimepull/DataHead;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/DataHead", "access$000", "(Lorg/jvnet/mimepull/DataHead;)Lorg/jvnet/mimepull/MIMEPart;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEPart", "msg", "Lorg/jvnet/mimepull/MIMEMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEMessage", "makeProgress", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "next", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/DataHead$ReadMultiStream", "adjustInMemoryUsage", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jvnet/mimepull/Data", "read", "()[B", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "buf", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jvnet/mimepull/Data", "size", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "len", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "current", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead$ReadMultiStream", "closed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
