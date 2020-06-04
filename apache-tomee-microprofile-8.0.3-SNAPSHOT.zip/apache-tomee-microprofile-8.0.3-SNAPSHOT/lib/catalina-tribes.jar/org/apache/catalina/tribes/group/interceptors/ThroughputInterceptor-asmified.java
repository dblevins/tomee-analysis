package asm.org.apache.catalina.tribes.group.interceptors;
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
public class ThroughputInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", null, "org/apache/catalina/tribes/group/ChannelInterceptorBase", new String[] { "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptorMBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/catalina/tribes/util/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mbTx", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mbAppTx", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mbRx", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "timeTx", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastCnt", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "msgTxErr", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "interval", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "access", "Ljava/util/concurrent/atomic/AtomicInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "txStart", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "rxStart", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "df", "Ljava/text/DecimalFormat;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "lastCnt", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxErr", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "interval", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicInteger", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "access", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "txStart", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "rxStart", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/text/DecimalFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("#0.00");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/text/DecimalFormat", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendMessage", "([Lorg/apache/catalina/tribes/Member;Lorg/apache/catalina/tribes/ChannelMessage;Lorg/apache/catalina/tribes/group/InterceptorPayload;)V", null, new String[] { "org/apache/catalina/tribes/ChannelException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/catalina/tribes/ChannelException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "access", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "txStart", "J");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/io/ChannelData");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/io/ChannelData", "getDataPackageLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/io/XByteBuffer", "getDataPackageLength", "(I)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "sendMessage", "([Lorg/apache/catalina/tribes/Member;Lorg/apache/catalina/tribes/ChannelMessage;Lorg/apache/catalina/tribes/group/InterceptorPayload;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "[Lorg/apache/catalina/tribes/Member;", "org/apache/catalina/tribes/ChannelMessage", "org/apache/catalina/tribes/group/InterceptorPayload", Opcodes.LONG}, 1, new Object[] {"org/apache/catalina/tribes/ChannelException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxErr", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "addAndGet", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "access", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "get", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "access", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/tribes/ChannelException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1048576.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1048576.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "access", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "txStart", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1000.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "interval", "I");
methodVisitor.visitInsn(I2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "lastCnt", "D");
methodVisitor.visitInsn(DCMPL);
methodVisitor.visitJumpInsn(IFLT, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "lastCnt", "D");
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "lastCnt", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "report", "(D)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "addAndGet", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageReceived", "(Lorg/apache/catalina/tribes/ChannelMessage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "rxStart", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "rxStart", "J");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/io/ChannelData");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/io/ChannelData", "getDataPackageLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/io/XByteBuffer", "getDataPackageLength", "(I)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1048576.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "addAndGet", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "interval", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "report", "(D)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/group/ChannelInterceptorBase", "messageReceived", "(Lorg/apache/catalina/tribes/ChannelMessage;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "report", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isInfoEnabled", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "sm", "Lorg/apache/catalina/tribes/util/StringManager;");
methodVisitor.visitLdcInsn("throughputInterceptor.report");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxErr", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "rxStart", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1000.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "df", "Ljava/text/DecimalFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/DecimalFormat", "format", "(D)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/util/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "info", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(13, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInterval", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "interval", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInterval", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "interval", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastCnt", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "lastCnt", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMbAppTx", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbAppTx", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMbRx", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbRx", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMbTx", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "mbTx", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMsgRxCnt", "()Ljava/util/concurrent/atomic/AtomicLong;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgRxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMsgTxCnt", "()Ljava/util/concurrent/atomic/AtomicLong;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxCnt", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMsgTxErr", "()Ljava/util/concurrent/atomic/AtomicLong;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "msgTxErr", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRxStart", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "rxStart", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimeTx", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "timeTx", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTxStart", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "txStart", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/tribes/group/interceptors/ThroughputInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/tribes/group/interceptors/ThroughputInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/util/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/catalina/tribes/util/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/group/interceptors/ThroughputInterceptor", "sm", "Lorg/apache/catalina/tribes/util/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
