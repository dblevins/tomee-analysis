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
public class DelimitedTokenReplacementInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", null, "org/codehaus/swizzle/stream/FilteredInputStream", null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "StreamReadingStrategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$2", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beginBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "endBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/io/InputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "strategy", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "readingToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushingValue", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lookingForToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/swizzle/stream/StreamTokenHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/swizzle/stream/StreamTokenHandler;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/swizzle/stream/StreamTokenHandler;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/FilteredInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "<init>", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "readingToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$2", "<init>", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "flushingValue", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "<init>", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/ScanBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/ScanBuffer", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "beginBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/ScanBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/ScanBuffer", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "endBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "_read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "endBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "superRead", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "beginBuffer", "Lorg/codehaus/swizzle/stream/ScanBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "value", "Ljava/io/InputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "flushingValue", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "strategy", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/StreamTokenHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "handler", "Lorg/codehaus/swizzle/stream/StreamTokenHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Ljava/io/InputStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "value", "Ljava/io/InputStream;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "lookingForToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "readingToken", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
