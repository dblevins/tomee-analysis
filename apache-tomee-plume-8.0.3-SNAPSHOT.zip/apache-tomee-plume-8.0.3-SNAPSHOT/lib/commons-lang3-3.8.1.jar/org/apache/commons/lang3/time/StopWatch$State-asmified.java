package asm.org.apache.commons.lang3.time;
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
public class StopWatch$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER | ACC_ENUM | ACC_ABSTRACT, "org/apache/commons/lang3/time/StopWatch$State", "Ljava/lang/Enum<Lorg/apache/commons/lang3/time/StopWatch$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$State", "org/apache/commons/lang3/time/StopWatch", "State", ACC_PRIVATE | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$State$4", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$State$3", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$State$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$State$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/commons/lang3/time/StopWatch$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSTARTED", "Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RUNNING", "Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPED", "Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDED", "Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "$VALUES", "[Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/lang3/time/StopWatch$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/StopWatch$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/lang3/time/StopWatch$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/lang3/time/StopWatch$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "isStarted", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "isStopped", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "isSuspended", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/apache/commons/lang3/time/StopWatch$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/StopWatch$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/StopWatch$State$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSTARTED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/StopWatch$State$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "UNSTARTED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/StopWatch$State$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RUNNING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/StopWatch$State$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "RUNNING", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/StopWatch$State$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/StopWatch$State$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "STOPPED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/time/StopWatch$State$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/time/StopWatch$State$4", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "SUSPENDED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/lang3/time/StopWatch$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "UNSTARTED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "RUNNING", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "STOPPED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "SUSPENDED", "Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/StopWatch$State", "$VALUES", "[Lorg/apache/commons/lang3/time/StopWatch$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
