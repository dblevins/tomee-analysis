package asm.org.apache.myfaces.util;
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
public class ThreadsafeXorShiftRandom$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/util/ThreadsafeXorShiftRandom$1", "Ljava/lang/ThreadLocal<Lorg/apache/myfaces/util/XorShiftRandom;>;", "java/lang/ThreadLocal", null);

classWriter.visitOuterClass("org/apache/myfaces/util/ThreadsafeXorShiftRandom", null, null);

classWriter.visitInnerClass("org/apache/myfaces/util/ThreadsafeXorShiftRandom$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initialValue", "()Lorg/apache/myfaces/util/XorShiftRandom;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/util/XorShiftRandom");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/util/ThreadsafeXorShiftRandom", "access$000", "()Ljava/util/Random;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Random", "nextLong", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/util/XorShiftRandom", "<init>", "(J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "initialValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/util/ThreadsafeXorShiftRandom$1", "initialValue", "()Lorg/apache/myfaces/util/XorShiftRandom;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
