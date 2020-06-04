package asm.org.apache.commons.pool2.impl;
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
public class EvictionTimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/pool2/impl/EvictionTimer", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/EvictionTimer$1", "org/apache/commons/pool2/impl/EvictionTimer", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/EvictionTimer$PrivilegedNewEvictionTimer", "org/apache/commons/pool2/impl/EvictionTimer", "PrivilegedNewEvictionTimer", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl", "org/apache/commons/pool2/impl/EvictionTimer", "PrivilegedSetTccl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/pool2/impl/EvictionTimer$PrivilegedGetTccl", "org/apache/commons/pool2/impl/EvictionTimer", "PrivilegedGetTccl", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_timer", "Ljava/util/Timer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_usageCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNCHRONIZED, "schedule", "(Ljava/util/TimerTask;JJ)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_timer", "Ljava/util/Timer;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedGetTccl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedGetTccl", "<init>", "(Lorg/apache/commons/pool2/impl/EvictionTimer$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/pool2/impl/EvictionTimer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedNewEvictionTimer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedNewEvictionTimer", "<init>", "(Lorg/apache/commons/pool2/impl/EvictionTimer$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Timer");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_timer", "Ljava/util/Timer;");
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/util/TimerTask", Opcodes.LONG, Opcodes.LONG, "java/lang/ClassLoader"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/impl/EvictionTimer$PrivilegedSetTccl", "<init>", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_usageCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_usageCount", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_timer", "Ljava/util/Timer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "schedule", "(Ljava/util/TimerTask;JJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNCHRONIZED, "cancel", "(Ljava/util/TimerTask;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/TimerTask", "cancel", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_usageCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_usageCount", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_usageCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_timer", "Ljava/util/Timer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Timer", "cancel", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/impl/EvictionTimer", "_timer", "Ljava/util/Timer;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
