package asm.com.fasterxml.jackson.core.type;
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
public class WritableTypeId$InclusionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "Ljava/lang/Enum<Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "com/fasterxml/jackson/core/type/WritableTypeId", "Inclusion", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAPPER_ARRAY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAPPER_OBJECT", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METADATA_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAYLOAD_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARENT_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "$VALUES", "[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresObjectContext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "METADATA_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "PAYLOAD_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAPPER_ARRAY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "WRAPPER_ARRAY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAPPER_OBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "WRAPPER_OBJECT", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METADATA_PROPERTY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "METADATA_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAYLOAD_PROPERTY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "PAYLOAD_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARENT_PROPERTY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "PARENT_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "WRAPPER_ARRAY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "WRAPPER_OBJECT", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "METADATA_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "PAYLOAD_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "PARENT_PROPERTY", "Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/core/type/WritableTypeId$Inclusion", "$VALUES", "[Lcom/fasterxml/jackson/core/type/WritableTypeId$Inclusion;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
