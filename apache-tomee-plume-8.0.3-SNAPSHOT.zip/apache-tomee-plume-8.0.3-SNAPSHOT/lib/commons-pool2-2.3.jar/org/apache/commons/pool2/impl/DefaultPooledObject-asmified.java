package asm.org.apache.commons.pool2.impl;
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
public class DefaultPooledObjectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/pool2/impl/DefaultPooledObject", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/pool2/PooledObject<TT;>;", "java/lang/Object", new String[] { "org/apache/commons/pool2/PooledObject" });

classWriter.visitInnerClass("org/apache/commons/pool2/impl/DefaultPooledObject$AbandonedObjectCreatedException", "org/apache/commons/pool2/impl/DefaultPooledObject", "AbandonedObjectCreatedException", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "object", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "createTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "lastBorrowTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "lastUseTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "lastReturnTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "logAbandoned", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "borrowedBy", "Ljava/lang/Exception;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "usedBy", "Ljava/lang/Exception;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "borrowedCount", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "createTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "createTime", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastBorrowTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "createTime", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastUseTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "createTime", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastReturnTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "logAbandoned", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedBy", "Ljava/lang/Exception;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "usedBy", "Ljava/lang/Exception;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "object", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObject", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "object", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "createTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActiveTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastReturnTime", "J");
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastBorrowTime", "J");
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, Opcodes.LONG}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIdleTimeMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastReturnTime", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(LLOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.LONG});
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastBorrowTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastBorrowTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastReturnTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastReturnTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBorrowedCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedCount", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastUsedTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "object", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/pool2/TrackedUse");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "object", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/pool2/TrackedUse");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/TrackedUse", "getLastUsed", "()J", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastUseTime", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(JJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastUseTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareTo", "(Lorg/apache/commons/pool2/PooledObject;)I", "(Lorg/apache/commons/pool2/PooledObject<TT;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/impl/DefaultPooledObject", "getLastReturnTime", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/pool2/PooledObject", "getLastReturnTime", "()J", true);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-2147483648L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(JJ)J", false);
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "min", "(JJ)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Object: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "object", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(", State: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/PooledObjectState", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/pool2/impl/DefaultPooledObject", "java/lang/StringBuilder", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "startEvictionTest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "endEvictionTest", "(Ljava/util/Deque;)Z", "(Ljava/util/Deque<Lorg/apache/commons/pool2/PooledObject<TT;>;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "offerFirst", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "allocate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "ALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastBorrowTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastBorrowTime", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastUseTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedCount", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "logAbandoned", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/DefaultPooledObject$AbandonedObjectCreatedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/DefaultPooledObject$AbandonedObjectCreatedException", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedBy", "Ljava/lang/Exception;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "deallocate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "ALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "RETURNING", "Lorg/apache/commons/pool2/PooledObjectState;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastReturnTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedBy", "Ljava/lang/Exception;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "invalidate", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "INVALID", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "use", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "lastUseTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Exception");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The last code to use this object was:");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "usedBy", "Ljava/lang/Exception;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "printStackTrace", "(Ljava/io/PrintWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "borrowedBy", "Ljava/lang/Exception;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "(Ljava/io/PrintWriter;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "usedBy", "Ljava/lang/Exception;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "printStackTrace", "(Ljava/io/PrintWriter;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getState", "()Lorg/apache/commons/pool2/PooledObjectState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "markAbandoned", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "ABANDONED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "markReturning", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "RETURNING", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "state", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLogAbandoned", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/pool2/impl/DefaultPooledObject", "logAbandoned", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compareTo", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/pool2/PooledObject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/pool2/impl/DefaultPooledObject", "compareTo", "(Lorg/apache/commons/pool2/PooledObject;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
