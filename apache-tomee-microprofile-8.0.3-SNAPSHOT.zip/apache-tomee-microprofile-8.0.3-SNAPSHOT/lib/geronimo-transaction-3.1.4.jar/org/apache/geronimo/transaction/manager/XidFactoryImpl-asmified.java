package asm.org.apache.geronimo.transaction.manager;
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
public class XidFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/transaction/manager/XidFactoryImpl", null, "java/lang/Object", new String[] { "org/apache/geronimo/transaction/manager/XidFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "baseId", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "start", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "count", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "count", "J");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/UnknownHostException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "count", "J");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getLocalHost", "()Ljava/net/InetAddress;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetAddress", "getAddress", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/geronimo/transaction/manager/XidFactoryImpl"}, 1, new Object[] {"java/net/UnknownHostException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/Random");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Random", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createXid", "()Ljavax/transaction/xa/Xid;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[B", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "count", "J");
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "count", "J");
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/geronimo/transaction/manager/XidFactoryImpl", "[B", Opcodes.TOP, Opcodes.TOP, "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/geronimo/transaction/manager/XidFactoryImpl", "[B", Opcodes.LONG}, 0, new Object[] {});
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "insertLong", "(J[BI)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/transaction/manager/XidImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/transaction/manager/XidImpl", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBranch", "(Ljavax/transaction/xa/Xid;I)Ljavax/transaction/xa/Xid;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[B", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "insertLong", "(J[BI)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/transaction/manager/XidImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/transaction/manager/XidImpl", "<init>", "(Ljavax/transaction/xa/Xid;[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "matchesGlobalId", "([B)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 64);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "extractLong", "([BI)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFGE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "matchesBranchId", "([B)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 64);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "extractLong", "([BI)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "start", "J");
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/transaction/manager/XidFactoryImpl", "baseId", "[B");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(BALOAD);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recover", "(I[B[B)Ljavax/transaction/xa/Xid;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/transaction/manager/XidImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/transaction/manager/XidImpl", "<init>", "(I[B[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "insertLong", "(J[BI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "extractLong", "([BI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(255L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(255L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(255L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(255L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
