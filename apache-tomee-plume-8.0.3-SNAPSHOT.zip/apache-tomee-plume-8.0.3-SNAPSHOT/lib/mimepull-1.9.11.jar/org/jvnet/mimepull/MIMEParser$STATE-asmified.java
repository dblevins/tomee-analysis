package asm.org.jvnet.mimepull;
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
public class MIMEParser$STATEDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/jvnet/mimepull/MIMEParser$STATE", "Ljava/lang/Enum<Lorg/jvnet/mimepull/MIMEParser$STATE;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEParser$STATE", "org/jvnet/mimepull/MIMEParser", "STATE", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SKIP_PREAMBLE", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADERS", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BODY", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "$VALUES", "[Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/jvnet/mimepull/MIMEParser$STATE;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/jvnet/mimepull/MIMEParser$STATE;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/jvnet/mimepull/MIMEParser$STATE;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/jvnet/mimepull/MIMEParser$STATE");
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
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_MESSAGE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SKIP_PREAMBLE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "SKIP_PREAMBLE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_PART");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADERS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "HEADERS", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BODY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "BODY", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END_PART");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END_MESSAGE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParser$STATE", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/jvnet/mimepull/MIMEParser$STATE");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "SKIP_PREAMBLE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "HEADERS", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "BODY", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "$VALUES", "[Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
