package asm.org.eclipse.microprofile.metrics;
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
public class MetricTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/microprofile/metrics/MetricType", "Ljava/lang/Enum<Lorg/eclipse/microprofile/metrics/MetricType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COUNTER", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GAUGE", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METERED", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HISTOGRAM", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMER", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID", "Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "classtype", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/microprofile/metrics/MetricType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/MetricType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", "(Ljava/lang/String;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/metrics/MetricType", "type", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/metrics/MetricType", "classtype", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/metrics/MetricType", "type", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "from", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/MetricType;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/EnumSet", "allOf", "(Ljava/lang/Class;)Ljava/util/EnumSet;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/EnumSet", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/EnumSet", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/metrics/MetricType", "type", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is not a valid MetricType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "from", "(Ljava/lang/Class;)Lorg/eclipse/microprofile/metrics/MetricType;", "(Ljava/lang/Class<*>;)Lorg/eclipse/microprofile/metrics/MetricType;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/MetricType;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/EnumSet", "allOf", "(Ljava/lang/Class;)Ljava/util/EnumSet;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/EnumSet", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/EnumSet", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/metrics/MetricType", "classtype", "Ljava/lang/Class;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/metrics/MetricType", "classtype", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "INVALID", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COUNTER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("counter");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/Counter;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "COUNTER", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GAUGE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("gauge");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/Gauge;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "GAUGE", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METERED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("meter");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/Meter;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "METERED", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HISTOGRAM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("histogram");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/Histogram;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "HISTOGRAM", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("timer");
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/Timer;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "TIMER", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("invalid");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "INVALID", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/microprofile/metrics/MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "COUNTER", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "GAUGE", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "METERED", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "HISTOGRAM", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "TIMER", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricType", "INVALID", "Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricType", "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
