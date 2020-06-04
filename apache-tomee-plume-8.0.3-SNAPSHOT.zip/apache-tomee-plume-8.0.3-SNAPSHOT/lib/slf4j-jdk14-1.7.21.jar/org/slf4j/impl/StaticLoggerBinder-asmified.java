package asm.org.slf4j.impl;
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
public class StaticLoggerBinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/slf4j/impl/StaticLoggerBinder", null, "java/lang/Object", new String[] { "org/slf4j/spi/LoggerFactoryBinder" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SINGLETON", "Lorg/slf4j/impl/StaticLoggerBinder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "REQUESTED_API_VERSION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "loggerFactoryClassStr", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "loggerFactory", "Lorg/slf4j/ILoggerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "getSingleton", "()Lorg/slf4j/impl/StaticLoggerBinder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/impl/StaticLoggerBinder", "SINGLETON", "Lorg/slf4j/impl/StaticLoggerBinder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/slf4j/impl/JDK14LoggerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/impl/JDK14LoggerFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/slf4j/impl/StaticLoggerBinder", "loggerFactory", "Lorg/slf4j/ILoggerFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoggerFactory", "()Lorg/slf4j/ILoggerFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/slf4j/impl/StaticLoggerBinder", "loggerFactory", "Lorg/slf4j/ILoggerFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoggerFactoryClassStr", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/impl/StaticLoggerBinder", "loggerFactoryClassStr", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/slf4j/impl/StaticLoggerBinder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/impl/StaticLoggerBinder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/impl/StaticLoggerBinder", "SINGLETON", "Lorg/slf4j/impl/StaticLoggerBinder;");
methodVisitor.visitLdcInsn("1.6.99");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/impl/StaticLoggerBinder", "REQUESTED_API_VERSION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/slf4j/impl/JDK14LoggerFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/impl/StaticLoggerBinder", "loggerFactoryClassStr", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
