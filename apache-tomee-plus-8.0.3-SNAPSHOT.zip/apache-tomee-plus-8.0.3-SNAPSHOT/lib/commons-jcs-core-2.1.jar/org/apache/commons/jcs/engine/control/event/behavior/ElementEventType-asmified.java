package asm.org.apache.commons.jcs.engine.control.event.behavior;
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
public class ElementEventTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "Ljava/lang/Enum<Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCEEDED_MAXLIFE_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCEEDED_MAXLIFE_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCEEDED_IDLETIME_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCEEDED_IDLETIME_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPOOLED_DISK_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPOOLED_DISK_NOT_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPOOLED_NOT_ALLOWED", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "$VALUES", "[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCEEDED_MAXLIFE_BACKGROUND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_MAXLIFE_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCEEDED_MAXLIFE_ONREQUEST");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_MAXLIFE_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCEEDED_IDLETIME_BACKGROUND");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_IDLETIME_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCEEDED_IDLETIME_ONREQUEST");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_IDLETIME_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPOOLED_DISK_AVAILABLE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_DISK_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPOOLED_DISK_NOT_AVAILABLE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_DISK_NOT_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPOOLED_NOT_ALLOWED");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_NOT_ALLOWED", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_MAXLIFE_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_MAXLIFE_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_IDLETIME_BACKGROUND", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "EXCEEDED_IDLETIME_ONREQUEST", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_DISK_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_DISK_NOT_AVAILABLE", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "SPOOLED_NOT_ALLOWED", "Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/engine/control/event/behavior/ElementEventType", "$VALUES", "[Lorg/apache/commons/jcs/engine/control/event/behavior/ElementEventType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
