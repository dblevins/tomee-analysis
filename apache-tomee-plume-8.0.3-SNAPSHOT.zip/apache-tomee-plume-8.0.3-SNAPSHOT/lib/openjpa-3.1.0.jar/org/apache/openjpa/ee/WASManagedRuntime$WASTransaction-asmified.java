package asm.org.apache.openjpa.ee;
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
public class WASManagedRuntime$WASTransactionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", null, "java/lang/Object", new String[] { "javax/transaction/TransactionManager", "javax/transaction/Transaction" });

classWriter.visitInnerClass("org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "org/apache/openjpa/ee/WASManagedRuntime", "WASTransaction", 0);

classWriter.visitInnerClass("org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "org/apache/openjpa/ee/WASManagedRuntime", "WASSynchronization", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatus", "()I", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "getGlobalId", "()[B", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openjpa/ee/WASManagedRuntime$WASTransaction"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/NoTransactionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-transaction-id-exception");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/NoTransactionException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/util/NoTransactionException", "setCause", "(Ljava/lang/Throwable;)Lorg/apache/openjpa/util/OpenJPAException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransaction", "()Ljavax/transaction/Transaction;", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerSynchronization", "(Ljavax/transaction/Synchronization;)V", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/RollbackException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$100", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Ljava/lang/Object;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$200", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$100", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/ee/WASManagedRuntime$WASSynchronization", "<init>", "(Ljavax/transaction/Synchronization;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-reflection-exception");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/util/InvalidStateException", "setCause", "(Ljava/lang/Throwable;)Lorg/apache/openjpa/util/OpenJPAException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-lookup-error");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getGlobalId", "()[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$300", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$100", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-reflection-exception");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/util/InvalidStateException", "setCause", "(Ljava/lang/Throwable;)Lorg/apache/openjpa/util/OpenJPAException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "()V", null, new String[] { "javax/transaction/NotSupportedException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("begin");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, new String[] { "javax/transaction/HeuristicMixedException", "javax/transaction/HeuristicRollbackException", "java/lang/IllegalStateException", "javax/transaction/RollbackException", "java/lang/SecurityException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("commit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resume", "(Ljavax/transaction/Transaction;)V", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/InvalidTransactionException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("resume");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, new String[] { "java/lang/IllegalStateException", "java/lang/SecurityException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$400", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$400", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("rollback");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRollbackOnly", "()V", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$400", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/ee/WASManagedRuntime$WASTransaction", "this$0", "Lorg/apache/openjpa/ee/WASManagedRuntime;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$400", "(Lorg/apache/openjpa/ee/WASManagedRuntime;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("setRollbackOnly");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionTimeout", "(I)V", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("setTransactionTimeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "suspend", "()Ljavax/transaction/Transaction;", null, new String[] { "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("suspend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "delistResource", "(Ljavax/transaction/xa/XAResource;I)Z", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("delistResource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enlistResource", "(Ljavax/transaction/xa/XAResource;)Z", null, new String[] { "java/lang/IllegalStateException", "javax/transaction/RollbackException", "javax/transaction/SystemException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InvalidStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/ee/WASManagedRuntime", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("was-unsupported-op");
methodVisitor.visitLdcInsn("enlistResource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InvalidStateException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
