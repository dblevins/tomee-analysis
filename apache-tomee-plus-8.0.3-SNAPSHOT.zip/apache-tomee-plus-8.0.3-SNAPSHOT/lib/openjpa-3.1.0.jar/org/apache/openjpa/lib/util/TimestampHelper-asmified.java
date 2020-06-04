package asm.org.apache.openjpa.lib.util;
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
public class TimestampHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/lib/util/TimestampHelper", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "MilliMuliplier", "J", null, new Long(1000L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "MicroMuliplier", "J", null, new Long(1000000L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NanoMuliplier", "J", null, new Long(1000000000L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "sec0", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "nano0", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getNanoPrecisionTimestamp", "()Ljava/sql/Timestamp;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/TimestampHelper", "nano0", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/util/TimestampHelper", "sec0", "J");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(1000000000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(1000000000L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/sql/Timestamp");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/sql/Timestamp", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/Timestamp", "setNanos", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/TimestampHelper", "sec0", "J");
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitLdcInsn(new Long(1000000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/util/TimestampHelper", "nano0", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
