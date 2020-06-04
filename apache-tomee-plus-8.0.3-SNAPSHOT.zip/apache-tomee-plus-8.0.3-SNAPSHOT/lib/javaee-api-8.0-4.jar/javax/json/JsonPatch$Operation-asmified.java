package asm.javax.json;
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
public class JsonPatch$OperationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/json/JsonPatch$Operation", "Ljava/lang/Enum<Ljavax/json/JsonPatch$Operation;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/json/JsonPatch$Operation", "javax/json/JsonPatch", "Operation", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ADD", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOVE", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REPLACE", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MOVE", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COPY", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEST", "Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "operationName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/json/JsonPatch$Operation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/json/JsonPatch$Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "$VALUES", "[Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/json/JsonPatch$Operation;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/json/JsonPatch$Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/json/JsonPatch$Operation;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/json/JsonPatch$Operation", "operationName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "operationName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/json/JsonPatch$Operation", "operationName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromOperationName", "(Ljava/lang/String;)Ljavax/json/JsonPatch$Operation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/json/JsonPatch$Operation", "values", "()[Ljavax/json/JsonPatch$Operation;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljavax/json/JsonPatch$Operation;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/JsonPatch$Operation", "operationName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unknown value for the operationName of the JSON patch operation: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ADD");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("add");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "ADD", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOVE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "REMOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REPLACE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("replace");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "REPLACE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MOVE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("move");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "MOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COPY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("copy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "COPY", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitTypeInsn(NEW, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEST");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("test");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/json/JsonPatch$Operation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "TEST", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/json/JsonPatch$Operation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "ADD", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "REMOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "REPLACE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "MOVE", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "COPY", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/json/JsonPatch$Operation", "TEST", "Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/json/JsonPatch$Operation", "$VALUES", "[Ljavax/json/JsonPatch$Operation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
