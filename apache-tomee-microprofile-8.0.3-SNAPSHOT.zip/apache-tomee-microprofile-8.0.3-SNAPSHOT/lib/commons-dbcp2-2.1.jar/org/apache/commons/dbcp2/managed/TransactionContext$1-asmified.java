package asm.org.apache.commons.dbcp2.managed;
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
public class TransactionContext$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/dbcp2/managed/TransactionContext$1", null, "java/lang/Object", new String[] { "jakarta/transaction/Synchronization" });

classWriter.visitOuterClass("org/apache/commons/dbcp2/managed/TransactionContext", "addTransactionContextListener", "(Lorg/apache/commons/dbcp2/managed/TransactionContextListener;)V");

classWriter.visitInnerClass("org/apache/commons/dbcp2/managed/TransactionContext$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$listener", "Lorg/apache/commons/dbcp2/managed/TransactionContextListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/dbcp2/managed/TransactionContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/dbcp2/managed/TransactionContext;Lorg/apache/commons/dbcp2/managed/TransactionContextListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/dbcp2/managed/TransactionContext$1", "this$0", "Lorg/apache/commons/dbcp2/managed/TransactionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/dbcp2/managed/TransactionContext$1", "val$listener", "Lorg/apache/commons/dbcp2/managed/TransactionContextListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeCompletion", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCompletion", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext$1", "val$listener", "Lorg/apache/commons/dbcp2/managed/TransactionContextListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/dbcp2/managed/TransactionContext$1", "this$0", "Lorg/apache/commons/dbcp2/managed/TransactionContext;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContext$1", Opcodes.INTEGER}, 2, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContextListener", "org/apache/commons/dbcp2/managed/TransactionContext"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContext$1", Opcodes.INTEGER}, 3, new Object[] {"org/apache/commons/dbcp2/managed/TransactionContextListener", "org/apache/commons/dbcp2/managed/TransactionContext", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/dbcp2/managed/TransactionContextListener", "afterCompletion", "(Lorg/apache/commons/dbcp2/managed/TransactionContext;Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
