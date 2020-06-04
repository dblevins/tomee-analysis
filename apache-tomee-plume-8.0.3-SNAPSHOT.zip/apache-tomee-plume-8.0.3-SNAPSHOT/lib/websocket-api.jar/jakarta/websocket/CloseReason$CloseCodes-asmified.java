package asm.jakarta.websocket;
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
public class CloseReason$CloseCodesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/websocket/CloseReason$CloseCodes", "Ljava/lang/Enum<Ljakarta/websocket/CloseReason$CloseCodes;>;Ljakarta/websocket/CloseReason$CloseCode;", "java/lang/Enum", new String[] { "jakarta/websocket/CloseReason$CloseCode" });

classWriter.visitInnerClass("jakarta/websocket/CloseReason$CloseCodes", "jakarta/websocket/CloseReason", "CloseCodes", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/websocket/CloseReason$CloseCodes$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("jakarta/websocket/CloseReason$CloseCode", "jakarta/websocket/CloseReason", "CloseCode", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NORMAL_CLOSURE", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GOING_AWAY", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROTOCOL_ERROR", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANNOT_ACCEPT", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESERVED", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_STATUS_CODE", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED_ABNORMALLY", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_CONSISTENT", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VIOLATED_POLICY", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOO_BIG", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_EXTENSION", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNEXPECTED_CONDITION", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_RESTART", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRY_AGAIN_LATER", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TLS_HANDSHAKE_FAILURE", "Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "code", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "$VALUES", "[Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/websocket/CloseReason$CloseCodes;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/websocket/CloseReason$CloseCodes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/websocket/CloseReason$CloseCodes;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/websocket/CloseReason$CloseCodes", "code", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getCloseCode", "(I)Ljakarta/websocket/CloseReason$CloseCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 2999);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 5000);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes$1", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
methodVisitor.visitTableSwitchInsn(1000, 1015, label15, new Label[] { label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NORMAL_CLOSURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "GOING_AWAY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "PROTOCOL_ERROR", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CANNOT_ACCEPT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "RESERVED", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_STATUS_CODE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CLOSED_ABNORMALLY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NOT_CONSISTENT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "VIOLATED_POLICY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TOO_BIG", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_EXTENSION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "UNEXPECTED_CONDITION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "SERVICE_RESTART", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TRY_AGAIN_LATER", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TLS_HANDSHAKE_FAILURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid close code: [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/websocket/CloseReason$CloseCodes", "code", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NORMAL_CLOSURE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NORMAL_CLOSURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GOING_AWAY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 1001);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "GOING_AWAY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROTOCOL_ERROR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(SIPUSH, 1002);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "PROTOCOL_ERROR", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANNOT_ACCEPT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(SIPUSH, 1003);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CANNOT_ACCEPT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESERVED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 1004);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "RESERVED", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_STATUS_CODE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 1005);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_STATUS_CODE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED_ABNORMALLY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(SIPUSH, 1006);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CLOSED_ABNORMALLY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_CONSISTENT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(SIPUSH, 1007);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NOT_CONSISTENT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VIOLATED_POLICY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(SIPUSH, 1008);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "VIOLATED_POLICY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOO_BIG");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(SIPUSH, 1009);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TOO_BIG", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_EXTENSION");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(SIPUSH, 1010);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_EXTENSION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNEXPECTED_CONDITION");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(SIPUSH, 1011);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "UNEXPECTED_CONDITION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_RESTART");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(SIPUSH, 1012);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "SERVICE_RESTART", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRY_AGAIN_LATER");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(SIPUSH, 1013);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TRY_AGAIN_LATER", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitTypeInsn(NEW, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TLS_HANDSHAKE_FAILURE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(SIPUSH, 1015);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/websocket/CloseReason$CloseCodes", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TLS_HANDSHAKE_FAILURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/websocket/CloseReason$CloseCodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NORMAL_CLOSURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "GOING_AWAY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "PROTOCOL_ERROR", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CANNOT_ACCEPT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "RESERVED", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_STATUS_CODE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "CLOSED_ABNORMALLY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NOT_CONSISTENT", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "VIOLATED_POLICY", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TOO_BIG", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "NO_EXTENSION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "UNEXPECTED_CONDITION", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "SERVICE_RESTART", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TRY_AGAIN_LATER", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "TLS_HANDSHAKE_FAILURE", "Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/websocket/CloseReason$CloseCodes", "$VALUES", "[Ljakarta/websocket/CloseReason$CloseCodes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
