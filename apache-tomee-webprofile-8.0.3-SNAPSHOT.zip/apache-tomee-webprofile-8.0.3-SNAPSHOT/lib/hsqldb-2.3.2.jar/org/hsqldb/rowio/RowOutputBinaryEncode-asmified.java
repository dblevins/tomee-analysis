package asm.org.hsqldb.rowio;
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
public class RowOutputBinaryEncodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/rowio/RowOutputBinaryEncode", null, "org/hsqldb/rowio/RowOutputBinary", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "crypto", "Lorg/hsqldb/persist/Crypto;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/persist/Crypto;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinary", "<init>", "(II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeData", "(Lorg/hsqldb/Row;[Lorg/hsqldb/types/Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinary", "writeData", "(Lorg/hsqldb/Row;[Lorg/hsqldb/types/Type;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "count", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getStorageSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinaryEncode", "ensureRoom", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinaryEncode", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinary", "writeData", "(Lorg/hsqldb/Row;[Lorg/hsqldb/types/Type;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "count", "I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "buffer", "[B");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "buffer", "[B");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/Crypto", "encode", "([BII[BI)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/rowio/RowOutputBinaryEncode", "writeIntData", "(II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "count", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "(Lorg/hsqldb/Row;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinary", "getSize", "(Lorg/hsqldb/Row;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/Crypto", "getEncodedSize", "(I)I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "duplicate", "()Lorg/hsqldb/rowio/RowOutputInterface;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/rowio/RowOutputBinaryEncode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "crypto", "Lorg/hsqldb/persist/Crypto;");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/rowio/RowOutputBinaryEncode", "scale", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/rowio/RowOutputBinaryEncode", "<init>", "(Lorg/hsqldb/persist/Crypto;II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
