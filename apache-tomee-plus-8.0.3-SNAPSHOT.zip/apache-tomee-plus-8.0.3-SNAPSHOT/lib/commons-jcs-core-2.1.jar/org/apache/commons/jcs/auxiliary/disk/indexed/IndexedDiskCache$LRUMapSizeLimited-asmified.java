package asm.org.apache.commons.jcs.auxiliary.disk.indexed;
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
public class IndexedDiskCache$LRUMapSizeLimitedDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "Lorg/apache/commons/jcs/utils/struct/AbstractLRUMap<TK;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;>;", "org/apache/commons/jcs/utils/struct/AbstractLRUMap", null);

classWriter.visitInnerClass("org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "LRUMapSizeLimited", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG", "Ljava/lang/String;", null, "orig");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "contentSize", "Ljava/util/concurrent/atomic/AtomicInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "<init>", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/struct/AbstractLRUMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "maxSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicInteger", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "contentSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "contentSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor", "len", "I");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(SIPUSH, -1024);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addLengthToCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "contentSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor", "len", "I");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/Object;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;", "(TK;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/struct/AbstractLRUMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "addLengthToCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "addLengthToCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/struct/AbstractLRUMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor", "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "java/lang/Object", "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processRemovedLRU", "(Ljava/lang/Object;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", "(TK;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "subLengthFromCacheSize", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "addToRecycleBin", "(Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "logCacheName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Removing key: [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("] from key store.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "access$100", "()Lorg/apache/commons/logging/Log;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "logCacheName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("Key store size: [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("].");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "this$0", "Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache", "doOptimizeRealTime", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "shouldRemove", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "maxSize", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "contentSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "get", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "maxSize", "I");
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "size", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "processRemovedLRU", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "processRemovedLRU", "(Ljava/lang/Object;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "put", "(Ljava/lang/Object;Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskCache$LRUMapSizeLimited", "remove", "(Ljava/lang/Object;)Lorg/apache/commons/jcs/auxiliary/disk/indexed/IndexedDiskElementDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
