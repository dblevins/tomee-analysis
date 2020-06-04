package asm.org.apache.openejb.util;
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
public class PerformanceTimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/util/PerformanceTimer", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/util/PerformanceTimer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/util/PerformanceTimer$Start", "org/apache/openejb/util/PerformanceTimer", "Start", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/PerformanceTimer$Event", "org/apache/openejb/util/PerformanceTimer", "Event", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "start", "Lorg/apache/openejb/util/PerformanceTimer$Start;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/PerformanceTimer$Start");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/PerformanceTimer$Start", "<init>", "(Lorg/apache/openejb/util/PerformanceTimer;Lorg/apache/openejb/util/PerformanceTimer$1;)V", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/PerformanceTimer", "start", "Lorg/apache/openejb/util/PerformanceTimer$Start;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/PerformanceTimer", "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "event", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/PerformanceTimer$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/PerformanceTimer", "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/PerformanceTimer$Event", "<init>", "(Lorg/apache/openejb/util/PerformanceTimer;Lorg/apache/openejb/util/PerformanceTimer$Event;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/PerformanceTimer", "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "(Ljava/io/PrintStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/PerformanceTimer$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/PerformanceTimer", "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;");
methodVisitor.visitLdcInsn("stop");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/PerformanceTimer$Event", "<init>", "(Lorg/apache/openejb/util/PerformanceTimer;Lorg/apache/openejb/util/PerformanceTimer$Event;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/PerformanceTimer", "event", "Lorg/apache/openejb/util/PerformanceTimer$Event;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/PerformanceTimer$Event", "stop", "(Lorg/apache/openejb/util/PerformanceTimer$Event;Ljava/io/PrintStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/PerformanceTimer", "start", "Lorg/apache/openejb/util/PerformanceTimer$Start;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/PerformanceTimer$Start", "stop", "(Lorg/apache/openejb/util/PerformanceTimer$Event;Ljava/io/PrintStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
