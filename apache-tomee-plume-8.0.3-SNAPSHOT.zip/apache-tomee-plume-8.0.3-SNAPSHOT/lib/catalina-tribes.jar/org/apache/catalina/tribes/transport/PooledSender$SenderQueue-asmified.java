package asm.org.apache.catalina.tribes.transport;
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
public class PooledSender$SenderQueueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "org/apache/catalina/tribes/transport/PooledSender", "SenderQueue", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "limit", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "parent", "Lorg/apache/catalina/tribes/transport/PooledSender;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "notinuse", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/catalina/tribes/transport/DataSender;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inuse", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/catalina/tribes/transport/DataSender;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isOpen", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/catalina/tribes/transport/PooledSender;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "limit", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "parent", "Lorg/apache/catalina/tribes/transport/PooledSender;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "isOpen", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "limit", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "parent", "Lorg/apache/catalina/tribes/transport/PooledSender;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLimit", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "limit", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLimit", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "limit", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInUsePoolSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInPoolSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "checkIdleKeepAlive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/tribes/transport/DataSender");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "[Lorg/apache/catalina/tribes/transport/DataSender;", Opcodes.INTEGER, "[Lorg/apache/catalina/tribes/transport/DataSender;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/transport/DataSender", "keepalive", "()Z", true);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getSender", "(J)Lorg/apache/catalina/tribes/transport/DataSender;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "isOpen", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/transport/PooledSender", "sm", "Lorg/apache/catalina/tribes/util/StringManager;");
methodVisitor.visitLdcInsn("pooledSender.closed.queue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/util/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "limit", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "parent", "Lorg/apache/catalina/tribes/transport/PooledSender;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/transport/PooledSender", "getNewDataSender", "()Lorg/apache/catalina/tribes/transport/DataSender;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/tribes/transport/DataSender"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/transport/DataSender");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(JJ)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "wait", "(J)V", false);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "returnSender", "(Lorg/apache/catalina/tribes/transport/DataSender;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "isOpen", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/transport/DataSender", "disconnect", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "getLimit", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/transport/DataSender", "disconnect", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/transport/PooledSender", "access$000", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "isDebugEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/tribes/transport/PooledSender", "access$000", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/transport/PooledSender", "sm", "Lorg/apache/catalina/tribes/util/StringManager;");
methodVisitor.visitLdcInsn("PooledSender.senderDisconnectFail");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/tribes/util/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "notifyAll", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "isOpen", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "()[Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "[Ljava/lang/Object;", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/transport/DataSender");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/transport/DataSender", "disconnect", "()V", true);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/transport/DataSender");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/tribes/transport/DataSender", "disconnect", "()V", true);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "notinuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "inuse", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "notifyAll", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "open", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/transport/PooledSender$SenderQueue", "isOpen", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "notifyAll", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}