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
public class LogBufferManager$WriteStatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_SUPER, "org/objectweb/howl/log/LogBufferManager$WriteStats", null, "java/lang/Object", new String[] { "org/objectweb/howl/log/LogBufferManager$WriteStatsMBean" });

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$WriteStats", "org/objectweb/howl/log/LogBufferManager", "WriteStats", ACC_PUBLIC);

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$WriteStatsMBean", "org/objectweb/howl/log/LogBufferManager", "WriteStatsMBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/objectweb/howl/log/LogBufferManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/objectweb/howl/log/LogBufferManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getWriteCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$800", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageWriteTime", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$1200", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$800", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaximumWriteTime", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$1300", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitLdcInsn(new Double("1000.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAverageWaitForWriteLockTime", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$1400", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$800", "(Lorg/objectweb/howl/log/LogBufferManager;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getWaitForBuffer", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$WriteStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/objectweb/howl/log/LogBufferManager", "getWaitForBuffer", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
