package asm.org.hsqldb.index;
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
public class IndexAVL$IndexRowIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/hsqldb/index/IndexAVL$IndexRowIterator", null, "java/lang/Object", new String[] { "org/hsqldb/navigator/RowIterator" });

classWriter.visitInnerClass("org/hsqldb/index/IndexAVL$IndexRowIterator", "org/hsqldb/index/IndexAVL", "IndexRowIterator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "session", "Lorg/hsqldb/Session;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "store", "Lorg/hsqldb/persist/PersistentStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "index", "Lorg/hsqldb/index/IndexAVL;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextnode", "Lorg/hsqldb/index/NodeAVL;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastrow", "Lorg/hsqldb/Row;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "distinctCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "single", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "reversed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;Lorg/hsqldb/index/IndexAVL;Lorg/hsqldb/index/NodeAVL;IZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "distinctCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "single", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "reversed", "Z");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/hsqldb/index/IndexAVL$IndexRowIterator", "org/hsqldb/Session", "org/hsqldb/persist/PersistentStore", "org/hsqldb/index/IndexAVL", "org/hsqldb/index/NodeAVL", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextRow", "()Lorg/hsqldb/Row;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/IndexAVL$IndexRowIterator", "release", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "single", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/index/NodeAVL"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL", "readLock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "lock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "writeLock", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "reversed", "Z");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "distinctCount", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/IndexAVL", "last", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;Lorg/hsqldb/index/NodeAVL;I)Lorg/hsqldb/index/NodeAVL;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "distinctCount", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/IndexAVL", "next", "(Lorg/hsqldb/Session;Lorg/hsqldb/persist/PersistentStore;Lorg/hsqldb/index/NodeAVL;I)Lorg/hsqldb/index/NodeAVL;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "writeUnlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL", "readLock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "writeUnlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "index", "Lorg/hsqldb/index/IndexAVL;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL", "readLock", "Ljava/util/concurrent/locks/Lock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/locks/Lock", "unlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/NodeAVL", "getRow", "(Lorg/hsqldb/persist/PersistentStore;)Lorg/hsqldb/RowAVL;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "lastrow", "Lorg/hsqldb/Row;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "lastrow", "Lorg/hsqldb/Row;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNext", "()[Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/IndexAVL$IndexRowIterator", "getNextRow", "()Lorg/hsqldb/Row;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/hsqldb/Row"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/Row", "getData", "()[Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[Ljava/lang/Object;"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeCurrent", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "session", "Lorg/hsqldb/Session;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "lastrow", "Lorg/hsqldb/Row;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "delete", "(Lorg/hsqldb/Session;Lorg/hsqldb/Row;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "store", "Lorg/hsqldb/persist/PersistentStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "lastrow", "Lorg/hsqldb/Row;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/hsqldb/persist/PersistentStore", "remove", "(Lorg/hsqldb/persist/CachedObject;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRowColumns", "([Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRowId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/index/IndexAVL$IndexRowIterator", "nextnode", "Lorg/hsqldb/index/NodeAVL;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/index/NodeAVL", "getPos", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
