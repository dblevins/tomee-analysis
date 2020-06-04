package asm.org.slf4j.event;
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
public class LevelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/slf4j/event/Level", "Ljava/lang/Enum<Lorg/slf4j/event/Level;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR", "Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WARN", "Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INFO", "Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEBUG", "Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRACE", "Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "levelInt", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "levelStr", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/slf4j/event/Level;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/slf4j/event/Level;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "$VALUES", "[Lorg/slf4j/event/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/slf4j/event/Level;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/slf4j/event/Level;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/slf4j/event/Level;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/slf4j/event/Level");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "(ILjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/slf4j/event/Level", "levelInt", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/slf4j/event/Level", "levelStr", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toInt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/slf4j/event/Level", "levelInt", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/slf4j/event/Level", "levelStr", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitLdcInsn("ERROR");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/event/Level", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "ERROR", "Lorg/slf4j/event/Level;");
methodVisitor.visitTypeInsn(NEW, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WARN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitLdcInsn("WARN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/event/Level", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "WARN", "Lorg/slf4j/event/Level;");
methodVisitor.visitTypeInsn(NEW, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INFO");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("INFO");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/event/Level", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "INFO", "Lorg/slf4j/event/Level;");
methodVisitor.visitTypeInsn(NEW, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEBUG");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("DEBUG");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/event/Level", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "DEBUG", "Lorg/slf4j/event/Level;");
methodVisitor.visitTypeInsn(NEW, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/slf4j/event/Level", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "TRACE", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/slf4j/event/Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "ERROR", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "WARN", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "INFO", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "DEBUG", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/slf4j/event/Level", "TRACE", "Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/slf4j/event/Level", "$VALUES", "[Lorg/slf4j/event/Level;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
