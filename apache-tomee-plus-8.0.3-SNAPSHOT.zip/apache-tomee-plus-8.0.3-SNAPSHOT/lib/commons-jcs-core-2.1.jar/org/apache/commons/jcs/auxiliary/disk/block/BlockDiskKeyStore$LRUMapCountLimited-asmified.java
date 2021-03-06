package asm.org.apache.commons.jcs.auxiliary.disk.block;
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
public class BlockDiskKeyStore$LRUMapCountLimitedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "Lorg/apache/commons/jcs/utils/struct/LRUMap<TK;[I>;", "org/apache/commons/jcs/utils/struct/LRUMap", null);

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "LRUMapCountLimited", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG", "Ljava/lang/String;", null, "orig-lru-count");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/struct/LRUMap", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processRemovedLRU", "(Ljava/lang/Object;[I)V", "(TK;[I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "blockDiskCache", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskCache;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskCache", "freeBlocks", "([I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "logCacheName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Removing key: [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("] from key store.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore", "logCacheName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Key store size: [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/struct/LRUMap", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("].");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "processRemovedLRU", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/block/BlockDiskKeyStore$LRUMapCountLimited", "processRemovedLRU", "(Ljava/lang/Object;[I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
