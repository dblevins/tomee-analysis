package asm.org.objectweb.howl.log;
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
public class LogBufferManager$ForceStatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_SUPER, "org/objectweb/howl/log/LogBufferManager$ForceStats", null, "java/lang/Object", new String[] { "org/objectweb/howl/log/LogBufferManager$ForceStatsMBean" });

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$ForceStats", "org/objectweb/howl/log/LogBufferManager", "ForceStats", ACC_PUBLIC);

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$ForceStatsMBean", "org/objectweb/howl/log/LogBufferManager", "ForceStatsMBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/objectweb/howl/log/LogBufferManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/objectweb/howl/log/LogBufferManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageThreadsWaitingForce", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$200", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getForceCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageForceTime", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$400", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMinTimeBetweenForce", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$500", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxTimeBetweenForce", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$600", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageTimeBetweenForce", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$700", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageBuffersPerForce", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$800", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMinBuffersForced", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$900", "(Lorg/objectweb/howl/log/LogBufferManager;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxBuffersForced", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$1000", "(Lorg/objectweb/howl/log/LogBufferManager;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxThreadsWaitingForce", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$ForceStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$1100", "(Lorg/objectweb/howl/log/LogBufferManager;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
