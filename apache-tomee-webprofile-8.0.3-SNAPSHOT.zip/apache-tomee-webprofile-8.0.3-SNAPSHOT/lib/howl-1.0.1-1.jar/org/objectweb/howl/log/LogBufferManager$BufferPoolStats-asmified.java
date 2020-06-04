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
public class LogBufferManager$BufferPoolStatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_SUPER, "org/objectweb/howl/log/LogBufferManager$BufferPoolStats", null, "java/lang/Object", new String[] { "org/objectweb/howl/log/LogBufferManager$BufferPoolStatsMBean" });

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$BufferPoolStats", "org/objectweb/howl/log/LogBufferManager", "BufferPoolStats", ACC_PUBLIC);

classWriter.visitInnerClass("org/objectweb/howl/log/LogBufferManager$BufferPoolStatsMBean", "org/objectweb/howl/log/LogBufferManager", "BufferPoolStatsMBean", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/objectweb/howl/log/LogBufferManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/objectweb/howl/log/LogBufferManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/objectweb/howl/log/LogBufferManager$BufferPoolStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBufferPoolCurrentSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$BufferPoolStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$000", "(Lorg/objectweb/howl/log/LogBufferManager;)[Lorg/objectweb/howl/log/LogBuffer;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBufferPoolInitialSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$BufferPoolStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager", "config", "Lorg/objectweb/howl/log/Configuration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/objectweb/howl/log/Configuration", "getMinBuffers", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBufferPoolGrowCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/objectweb/howl/log/LogBufferManager$BufferPoolStats", "this$0", "Lorg/objectweb/howl/log/LogBufferManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/objectweb/howl/log/LogBufferManager", "access$100", "(Lorg/objectweb/howl/log/LogBufferManager;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
