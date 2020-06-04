package asm.org.apache.activemq.transport.discovery.simple;
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
public class SimpleDiscoveryAgent$SimpleDiscoveryEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", null, "org/apache/activemq/command/DiscoveryEvent", null);

classWriter.visitInnerClass("org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent", "SimpleDiscoveryEvent", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectFailures", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "reconnectDelay", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "this$0", "Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/DiscoveryEvent", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent;Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "this$0", "Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/DiscoveryEvent", "<init>", "(Lorg/apache/activemq/command/DiscoveryEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "get", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "serviceName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", failed:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", connectionFailures:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "failed", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$408", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$702", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "reconnectDelay", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lorg/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent;J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/simple/SimpleDiscoveryAgent$SimpleDiscoveryEvent", "connectTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
