package asm.org.apache.openjpa.lib.util.concurrent;
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
public class ConcurrentReferenceHashMap$HashIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "Entry", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "HashIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "table", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "type", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "startIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "stopIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "access$000", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "table", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "stopIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "type", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "startIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "stopIndex", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "table", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "stopIndex", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "table", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "startIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "stopIndex", "I");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "stopIndex", "I");
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "table", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "index", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "hasNext", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getNext", "()Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "entry", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "type", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getKey", "()Ljava/lang/Object;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "type", "I");
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Object"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "access$000", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getHash", "()I", true);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "java/lang/Object", "[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", Opcodes.INTEGER, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getNext", "()Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", true);
methodVisitor.visitInsn(AASTORE);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getNext", "()Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "setNext", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;)V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "access$110", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "lastReturned", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "getNext", "()Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/Error");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterated off table when doing remove");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Error", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
