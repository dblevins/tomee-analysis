package asm.org.codehaus.swizzle.stream;
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
public class FixedTokenListReplacementInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", null, "org/codehaus/swizzle/stream/FilteredInputStream", null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy", "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "StreamReadingStrategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$2", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/io/InputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mainBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "strategy", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushingValue", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushingMainBuffer", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lookingForToken", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/util/List;Lorg/codehaus/swizzle/stream/StreamTokenHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "<init>", "(Ljava/io/InputStream;Ljava/util/List;Lorg/codehaus/swizzle/stream/StreamTokenHandler;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/util/List;Lorg/codehaus/swizzle/stream/StreamTokenHandler;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FilteredInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "<init>", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "flushingValue", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$2", "<init>", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "flushingMainBuffer", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "<init>", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/codehaus/swizzle/stream/ScanBuffer");
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/ScanBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/ScanBuffer", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "size", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "size", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/ScanBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/ScanBuffer", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "mainBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy", "_read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "clearAllBuffers", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "flush", "()V", false);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "superRead", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FilteredInputStream", "read", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "value", "Ljava/io/InputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "mainBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "flushingValue", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "superRead", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)[Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "tokenBuffers", "[Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "clearAllBuffers", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "value", "Ljava/io/InputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/StreamTokenHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "flushingMainBuffer", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
