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
public class MemoryDataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/jvnet/mimepull/MemoryData", null, "java/lang/Object", new String[] { "org/jvnet/mimepull/Data" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "data", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "len", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "config", "Lorg/jvnet/mimepull/MIMEConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/nio/ByteBuffer;Lorg/jvnet/mimepull/MIMEConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "array", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/MemoryData", "data", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/MemoryData", "len", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "len", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "data", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Lorg/jvnet/mimepull/DataFile;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "data", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "len", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/DataFile", "writeTo", "([BII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNext", "(Lorg/jvnet/mimepull/DataHead;Ljava/nio/ByteBuffer;)Lorg/jvnet/mimepull/Data;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEConfig", "isOnlyMemory", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "inMemory", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEConfig", "memoryThreshold", "J");
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLT, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEConfig", "getTempFilePrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEConfig", "getTempFileSuffix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEConfig", "getTempDir", "()Ljava/io/File;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/TempFiles", "createTempFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "deleteOnExit", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MemoryData", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MemoryData", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Created temp file = {0}");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/String", "java/io/File"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/DataFile");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/DataFile", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/DataHead", "dataFile", "Lorg/jvnet/mimepull/DataFile;");
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/jvnet/mimepull/MemoryData", "org/jvnet/mimepull/DataHead", "java/nio/ByteBuffer"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParsingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParsingException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "head", "Lorg/jvnet/mimepull/Chunk;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "head", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitVarInsn(ASTORE, 3);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/jvnet/mimepull/Chunk"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "dataFile", "Lorg/jvnet/mimepull/DataFile;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/jvnet/mimepull/Data", "writeTo", "(Lorg/jvnet/mimepull/DataFile;)J", true);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/FileData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "dataFile", "Lorg/jvnet/mimepull/DataFile;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "len", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/FileData", "<init>", "(Lorg/jvnet/mimepull/DataFile;JI)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/Chunk", "data", "Lorg/jvnet/mimepull/Data;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/Chunk", "next", "Lorg/jvnet/mimepull/Chunk;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/FileData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/DataHead", "dataFile", "Lorg/jvnet/mimepull/DataFile;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/FileData", "<init>", "(Lorg/jvnet/mimepull/DataFile;Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MemoryData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MemoryData", "config", "Lorg/jvnet/mimepull/MIMEConfig;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MemoryData", "<init>", "(Ljava/nio/ByteBuffer;Lorg/jvnet/mimepull/MIMEConfig;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/jvnet/mimepull/MemoryData;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MemoryData", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
