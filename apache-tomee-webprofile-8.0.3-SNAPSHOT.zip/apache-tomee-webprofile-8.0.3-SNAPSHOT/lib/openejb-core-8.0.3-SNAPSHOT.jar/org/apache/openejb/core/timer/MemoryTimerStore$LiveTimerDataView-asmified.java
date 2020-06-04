package asm.org.apache.openejb.core.timer;
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
public class MemoryTimerStore$LiveTimerDataViewDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", null, "java/lang/Object", new String[] { "org/apache/openejb/core/timer/MemoryTimerStore$TimerDataView" });

classWriter.visitInnerClass("org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "org/apache/openejb/core/timer/MemoryTimerStore", "LiveTimerDataView", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/core/timer/MemoryTimerStore$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/core/timer/MemoryTimerStore$TimerDataView", "org/apache/openejb/core/timer/MemoryTimerStore", "TimerDataView", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/timer/MemoryTimerStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "this$0", "Lorg/apache/openejb/core/timer/MemoryTimerStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTasks", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Long;Lorg/apache/openejb/core/timer/TimerData;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/TreeMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "this$0", "Lorg/apache/openejb/core/timer/MemoryTimerStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/timer/MemoryTimerStore", "access$100", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addTimerData", "(Lorg/apache/openejb/core/timer/TimerData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "this$0", "Lorg/apache/openejb/core/timer/MemoryTimerStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/timer/MemoryTimerStore", "access$100", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/timer/TimerData", "getId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeTimerData", "(Ljava/lang/Long;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "this$0", "Lorg/apache/openejb/core/timer/MemoryTimerStore;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/timer/MemoryTimerStore", "access$100", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;Lorg/apache/openejb/core/timer/MemoryTimerStore$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/timer/MemoryTimerStore$LiveTimerDataView", "<init>", "(Lorg/apache/openejb/core/timer/MemoryTimerStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
