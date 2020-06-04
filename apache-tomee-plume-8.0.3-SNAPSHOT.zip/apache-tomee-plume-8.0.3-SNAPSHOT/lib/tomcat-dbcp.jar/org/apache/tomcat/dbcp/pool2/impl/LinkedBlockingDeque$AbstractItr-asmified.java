package asm.org.apache.tomcat.dbcp.pool2.impl;
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
public class LinkedBlockingDeque$AbstractItrDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "Ljava/lang/Object;Ljava/util/Iterator<TE;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node", "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "Node", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "AbstractItr", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextItem", "Ljava/lang/Object;", "TE;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastRet", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "firstNode", "()Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", "()Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "nextNode", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "firstNode", "()Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque"}, 1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node", "item", "Ljava/lang/Object;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque"}, 2, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "java/lang/Object"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "nextItem", "Ljava/lang/Object;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "succ", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node<TE;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "nextNode", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node", "item", "Ljava/lang/Object;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "firstNode", "()Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "advance", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "succ", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;)Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node", "item", "Ljava/lang/Object;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr"}, 2, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "java/lang/Object"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "nextItem", "Ljava/lang/Object;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "next", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "lastRet", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "nextItem", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "advance", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "lastRet", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "lastRet", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node", "item", "Ljava/lang/Object;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$300", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$Node;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque$AbstractItr", "this$0", "Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque", "access$200", "(Lorg/apache/tomcat/dbcp/pool2/impl/LinkedBlockingDeque;)Lorg/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/InterruptibleReentrantLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
