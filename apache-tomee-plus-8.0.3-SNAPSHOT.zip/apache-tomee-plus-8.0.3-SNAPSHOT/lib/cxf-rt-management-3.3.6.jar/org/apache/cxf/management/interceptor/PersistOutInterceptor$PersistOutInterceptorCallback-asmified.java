package asm.org.apache.cxf.management.interceptor;
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
public class PersistOutInterceptor$PersistOutInterceptorCallbackDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", null, "java/lang/Object", new String[] { "org/apache/cxf/io/CachedOutputStreamCallback" });

classWriter.visitInnerClass("org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "org/apache/cxf/management/interceptor/PersistOutInterceptor", "PersistOutInterceptorCallback", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "message", "Lorg/apache/cxf/message/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "origStream", "Ljava/io/OutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;Lorg/apache/cxf/message/Message;Ljava/io/OutputStream;Lorg/apache/cxf/management/persistence/ExchangeData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "this$0", "Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "origStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onClose", "(Lorg/apache/cxf/io/CachedOutputStream;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitLdcInsn("exchangeId");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/UUID", "randomUUID", "()Ljava/util/UUID;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitLdcInsn("exchangeId");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/io/CachedOutputStream", "size", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/io/CachedOutputStream", "writeCacheTo", "(Ljava/lang/StringBuilder;J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/io/CachedOutputStream", "size", "()J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/persistence/ExchangeData", "setResponseSize", "(Ljava/lang/Integer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/persistence/ExchangeData", "setResponse", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/io/CachedOutputStream", "lockOutputStream", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/io/CachedOutputStream", "resetOut", "(Ljava/io/OutputStream;Z)V", false);
methodVisitor.visitLabel(label4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "message", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/io/OutputStream;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "origStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "setContent", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "this$0", "Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/interceptor/PersistOutInterceptor", "access$000", "(Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;)Lorg/apache/cxf/management/persistence/ExchangeDataFilter;", false);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "this$0", "Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/interceptor/PersistOutInterceptor", "access$000", "(Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;)Lorg/apache/cxf/management/persistence/ExchangeDataFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/persistence/ExchangeDataFilter", "shouldPersist", "(Lorg/apache/cxf/management/persistence/ExchangeData;)Z", true);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "this$0", "Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/management/interceptor/PersistOutInterceptor", "access$100", "(Lorg/apache/cxf/management/interceptor/PersistOutInterceptor;)Lorg/apache/cxf/management/persistence/ExchangeDataDAO;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/PersistOutInterceptor$PersistOutInterceptorCallback", "exchange", "Lorg/apache/cxf/management/persistence/ExchangeData;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/management/persistence/ExchangeDataDAO", "save", "(Lorg/apache/cxf/management/persistence/ExchangeData;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "printStackTrace", "()V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onFlush", "(Lorg/apache/cxf/io/CachedOutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
