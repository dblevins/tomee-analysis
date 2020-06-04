package asm.org.hsqldb.persist;
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
public class RAFileHybridDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/hsqldb/persist/RAFileHybrid", null, "java/lang/Object", new String[] { "org/hsqldb/persist/RandomAccessInterface" });

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "database", "Lorg/hsqldb/Database;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "fileName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "isReadOnly", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "preNio", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "isNio", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "initialMaxLength", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "store", "Lorg/hsqldb/persist/RandomAccessInterface;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8388608L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "initialMaxLength", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "database", "Lorg/hsqldb/Database;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "fileName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "isReadOnly", "Z");
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "length", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/RAFileHybrid", "newStore", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "length", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "length", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "seek", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "seek", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilePointer", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "getFilePointer", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "read", "([BII)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "write", "([BII)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readInt", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "readInt", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeInt", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "writeInt", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readLong", "()J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "readLong", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLong", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "writeLong", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReadOnly", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "isReadOnly", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ensureLength", "(J)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "initialMaxLength", "J");
methodVisitor.visitInsn(LCMP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFGT, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "ensureLength", "(J)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "preNio", "Z");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/RAFileHybrid", "newStore", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "ensureLength", "(J)Z", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "isNio", "Z");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/RAFileHybrid", "newStore", "(J)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "ensureLength", "(J)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLength", "(J)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "setLength", "(J)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDatabase", "()Lorg/hsqldb/Database;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "synch", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "synch", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "newStore", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "database", "Lorg/hsqldb/Database;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Database", "logger", "Lorg/hsqldb/persist/Logger;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/Logger", "propNioMaxSize", "J");
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFGT, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/hsqldb/persist/RAFileHybrid", Opcodes.LONG, Opcodes.LONG}, 1, new Object[] {"org/hsqldb/persist/RAFileHybrid"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/hsqldb/persist/RAFileHybrid", Opcodes.LONG, Opcodes.LONG}, 2, new Object[] {"org/hsqldb/persist/RAFileHybrid", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "preNio", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "getFilePointer", "()J", true);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "synch", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "close", "()V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "preNio", "Z");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "initialMaxLength", "J");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGT, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/persist/RAFileNIO");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "database", "Lorg/hsqldb/Database;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "fileName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "isReadOnly", "Z");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "database", "Lorg/hsqldb/Database;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/Database", "logger", "Lorg/hsqldb/persist/Logger;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/Logger", "propNioMaxSize", "J");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/persist/RAFileNIO", "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZJJ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "seek", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "preNio", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "isNio", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "preNio", "Z");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "isNio", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/persist/RAFile");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "database", "Lorg/hsqldb/Database;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "fileName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "isReadOnly", "Z");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/persist/RAFile", "<init>", "(Lorg/hsqldb/Database;Ljava/lang/String;ZZZ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/RAFileHybrid", "store", "Lorg/hsqldb/persist/RandomAccessInterface;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/RandomAccessInterface", "seek", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
