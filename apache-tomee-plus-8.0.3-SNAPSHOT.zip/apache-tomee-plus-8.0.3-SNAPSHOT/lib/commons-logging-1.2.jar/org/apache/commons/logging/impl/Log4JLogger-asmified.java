package asm.org.apache.commons.logging.impl;
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
public class Log4JLoggerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/logging/impl/Log4JLogger", null, "java/lang/Object", new String[] { "org/apache/commons/logging/Log", "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(5160705895411730424L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FQCN", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE | ACC_TRANSIENT, "logger", "Lorg/apache/log4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "traceLevel", "Lorg/apache/log4j/Priority;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC | ACC_SYNTHETIC, "class$org$apache$commons$logging$impl$Log4JLogger", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC | ACC_SYNTHETIC, "class$org$apache$log4j$Level", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC | ACC_SYNTHETIC, "class$org$apache$log4j$Priority", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/log4j/Logger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Warning - null logger in constructor; possible log4j misconfiguration.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "traceLevel", "Lorg/apache/log4j/Priority;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "traceLevel", "Lorg/apache/log4j/Priority;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "debug", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "DEBUG", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "DEBUG", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "INFO", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "INFO", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warn", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "WARN", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "WARN", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "ERROR", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "ERROR", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fatal", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "FATAL", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fatal", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "FATAL", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "log", "(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogger", "()Lorg/apache/log4j/Logger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/logging/impl/Log4JLogger", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/log4j/Logger", "getLogger", "(Ljava/lang/String;)Lorg/apache/log4j/Logger;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/logging/impl/Log4JLogger", "logger", "Lorg/apache/log4j/Logger;");
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDebugEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isDebugEnabled", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isErrorEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "ERROR", "Lorg/apache/log4j/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isEnabledFor", "(Lorg/apache/log4j/Priority;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFatalEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "FATAL", "Lorg/apache/log4j/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isEnabledFor", "(Lorg/apache/log4j/Priority;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInfoEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isInfoEnabled", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTraceEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "traceLevel", "Lorg/apache/log4j/Priority;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isEnabledFor", "(Lorg/apache/log4j/Priority;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWarnEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/logging/impl/Log4JLogger", "getLogger", "()Lorg/apache/log4j/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "WARN", "Lorg/apache/log4j/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/log4j/Logger", "isEnabledFor", "(Lorg/apache/log4j/Priority;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NoClassDefFoundError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$commons$logging$impl$Log4JLogger", "Ljava/lang/Class;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("org.apache.commons.logging.impl.Log4JLogger");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$commons$logging$impl$Log4JLogger", "Ljava/lang/Class;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$commons$logging$impl$Log4JLogger", "Ljava/lang/Class;");
methodVisitor.visitLabel(label4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "FQCN", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Priority", "Ljava/lang/Class;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLdcInsn("org.apache.log4j.Priority");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Priority", "Ljava/lang/Class;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Priority", "Ljava/lang/Class;");
methodVisitor.visitLabel(label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitLdcInsn("org.apache.log4j.Level");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
methodVisitor.visitLabel(label8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/InstantiationError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Log4J 1.2 not available");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/InstantiationError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitLdcInsn("org.apache.log4j.Level");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "class$org$apache$log4j$Level", "Ljava/lang/Class;");
methodVisitor.visitLabel(label10);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/log4j/Priority");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/log4j/Level", "DEBUG", "Lorg/apache/log4j/Level;");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/logging/impl/Log4JLogger", "traceLevel", "Lorg/apache/log4j/Priority;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
