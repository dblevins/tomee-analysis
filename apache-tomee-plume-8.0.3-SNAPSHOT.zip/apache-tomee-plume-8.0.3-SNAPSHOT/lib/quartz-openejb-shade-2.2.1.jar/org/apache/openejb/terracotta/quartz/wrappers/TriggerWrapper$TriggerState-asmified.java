package asm.org.apache.openejb.terracotta.quartz.wrappers;
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
public class TriggerWrapper$TriggerStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "Ljava/lang/Enum<Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper", "TriggerState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WAITING", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACQUIRED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPLETE", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAUSED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAUSED_BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "$VALUES", "[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WAITING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "WAITING", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACQUIRED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "ACQUIRED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPLETE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "COMPLETE", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAUSED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "PAUSED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BLOCKED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAUSED_BLOCKED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "PAUSED_BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "ERROR", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "WAITING", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "ACQUIRED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "COMPLETE", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "PAUSED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "PAUSED_BLOCKED", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "ERROR", "Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState", "$VALUES", "[Lorg/apache/openejb/terracotta/quartz/wrappers/TriggerWrapper$TriggerState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
