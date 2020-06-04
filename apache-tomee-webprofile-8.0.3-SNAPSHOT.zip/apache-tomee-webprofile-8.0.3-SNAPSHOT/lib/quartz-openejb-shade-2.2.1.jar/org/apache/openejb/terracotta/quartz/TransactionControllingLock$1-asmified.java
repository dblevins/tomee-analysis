package asm.org.apache.openejb.terracotta.quartz;
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
public class TransactionControllingLock$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", "Ljava/lang/ThreadLocal<Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState;>;", "java/lang/ThreadLocal", null);

classWriter.visitOuterClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock", null, null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "HoldState", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialValue", "()Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "<init>", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "initialValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", "initialValue", "()Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
