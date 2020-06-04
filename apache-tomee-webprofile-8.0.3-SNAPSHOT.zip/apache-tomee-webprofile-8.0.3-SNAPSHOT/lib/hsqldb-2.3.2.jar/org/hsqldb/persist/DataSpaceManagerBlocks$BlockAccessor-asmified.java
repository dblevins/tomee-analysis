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
public class DataSpaceManagerBlocks$BlockAccessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/hsqldb/persist/DataSpaceManagerBlocks$1", "org/hsqldb/persist/DataSpaceManagerBlocks", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "org/hsqldb/persist/DataSpaceManagerBlocks", "BlockAccessor", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "currentKeep", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentBlockIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentDirIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentBlockOffset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/hsqldb/persist/DataSpaceManagerBlocks;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDirIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "initialise", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "nextBlock", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "moveToBlock", "(I)Z", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "nextBlockForTable", "(I)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "moveToBlock", "(I)Z", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "getTableId", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "moveToBlock", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDirIndex", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "blockSize", "I");
methodVisitor.visitInsn(IDIV);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "blockSize", "I");
methodVisitor.visitInsn(IDIV);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDirIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/persist/DataSpaceManagerBlocks", "access$100", "(Lorg/hsqldb/persist/DataSpaceManagerBlocks;IZ)Lorg/hsqldb/persist/DirectoryBlockCachedObject;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "blockSize", "I");
methodVisitor.visitInsn(IREM);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/BitMapCachedObject", "keepInMemory", "(Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getBitmapAddressArray", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "dataFileScale", "I");
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "bitMapStore", "Lorg/hsqldb/persist/BlockObjectStore;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/BlockObjectStore", "get", "(JZ)Lorg/hsqldb/persist/CachedObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/hsqldb/persist/BitMapCachedObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "keepInMemory", "(Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentKeep", "Z");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/BitMapCachedObject", "keepInMemory", "(Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDirIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "endBlockUpdate", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockIndex", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/BitMapCachedObject", "bitMap", "Lorg/hsqldb/map/BitMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/map/BitMap", "countSetBits", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/BitMapCachedObject", "bitMap", "Lorg/hsqldb/map/BitMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/map/BitMap", "countSetBitsEnd", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "setFreeSpaceValue", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "setFreeBlockValue", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/persist/DirectoryBlockCachedObject", "hasChanged", "Z");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "fileBlockItemCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "setTableId", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "setFreeSpaceValue", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "setFreeBlockValue", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBitMap", "Lorg/hsqldb/persist/BitMapCachedObject;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/BitMapCachedObject", "bitMap", "Lorg/hsqldb/map/BitMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/map/BitMap", "reset", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getTableId", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getTableIdArray", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setTableId", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getTableIdArray", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setFreeSpaceValue", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getFreeSpaceArray", "()[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getFreeSpaceValue", "()C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getFreeSpaceArray", "()[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "setFreeBlockValue", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getFreeBlockArray", "()[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2C);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getFreeBlockValue", "()C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentDir", "Lorg/hsqldb/persist/DirectoryBlockCachedObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/persist/DirectoryBlockCachedObject", "getFreeBlockArray", "()[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "this$0", "Lorg/hsqldb/persist/DataSpaceManagerBlocks;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks", "ba", "Lorg/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "currentBlockOffset", "I");
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/hsqldb/persist/DataSpaceManagerBlocks;Lorg/hsqldb/persist/DataSpaceManagerBlocks$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/persist/DataSpaceManagerBlocks$BlockAccessor", "<init>", "(Lorg/hsqldb/persist/DataSpaceManagerBlocks;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
