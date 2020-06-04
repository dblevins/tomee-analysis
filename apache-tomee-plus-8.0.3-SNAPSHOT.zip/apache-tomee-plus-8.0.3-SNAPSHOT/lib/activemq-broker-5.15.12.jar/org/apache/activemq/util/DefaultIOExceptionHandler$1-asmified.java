package asm.org.apache.activemq.util;
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
public class DefaultIOExceptionHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/util/DefaultIOExceptionHandler$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/activemq/util/DefaultIOExceptionHandler", "handle", "(Ljava/io/IOException;)V");

classWriter.visitInnerClass("org/apache/activemq/util/DefaultIOExceptionHandler$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/util/DefaultIOExceptionHandler$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/util/DefaultIOExceptionHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/util/DefaultIOExceptionHandler;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/util/DefaultIOExceptionHandler$1", "this$0", "Lorg/apache/activemq/util/DefaultIOExceptionHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/ServiceStopper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/ServiceStopper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/DefaultIOExceptionHandler$1", "this$0", "Lorg/apache/activemq/util/DefaultIOExceptionHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/DefaultIOExceptionHandler", "broker", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "stopAllConnectors", "(Lorg/apache/activemq/util/ServiceStopper;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/DefaultIOExceptionHandler", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Successfully stopped transports on ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/DefaultIOExceptionHandler$1", "this$0", "Lorg/apache/activemq/util/DefaultIOExceptionHandler;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/DefaultIOExceptionHandler", "broker", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("IOExceptionHandler: restart transports");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "<init>", "(Lorg/apache/activemq/util/DefaultIOExceptionHandler$1;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "start", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/DefaultIOExceptionHandler", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Failure occurred while stopping broker connectors");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("IOExceptionHandler: restart transports");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "<init>", "(Lorg/apache/activemq/util/DefaultIOExceptionHandler$1;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "start", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("IOExceptionHandler: restart transports");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "<init>", "(Lorg/apache/activemq/util/DefaultIOExceptionHandler$1;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/DefaultIOExceptionHandler$1$1", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
