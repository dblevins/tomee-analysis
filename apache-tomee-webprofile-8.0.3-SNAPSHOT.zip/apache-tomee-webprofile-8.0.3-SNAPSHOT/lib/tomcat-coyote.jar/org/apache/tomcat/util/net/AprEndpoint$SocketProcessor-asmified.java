package asm.org.apache.tomcat.util.net;
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
public class AprEndpoint$SocketProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "Lorg/apache/tomcat/util/net/SocketProcessorBase<Ljava/lang/Long;>;", "org/apache/tomcat/util/net/SocketProcessorBase", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "org/apache/tomcat/util/net/AprEndpoint", "SocketProcessor", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler", "org/apache/tomcat/util/net/AbstractEndpoint", "Handler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "SocketState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/net/AprEndpoint;Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)V", "(Lorg/apache/tomcat/util/net/SocketWrapperBase<Ljava/lang/Long;>;Lorg/apache/tomcat/util/net/SocketEvent;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SocketProcessorBase", "<init>", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doRun", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AprEndpoint", "getHandler", "()Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "process", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "running", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "socketWrapper", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "event", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "running", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "paused", "Z");
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint$SocketProcessor", "this$0", "Lorg/apache/tomcat/util/net/AprEndpoint;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/AprEndpoint", "processorCache", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
