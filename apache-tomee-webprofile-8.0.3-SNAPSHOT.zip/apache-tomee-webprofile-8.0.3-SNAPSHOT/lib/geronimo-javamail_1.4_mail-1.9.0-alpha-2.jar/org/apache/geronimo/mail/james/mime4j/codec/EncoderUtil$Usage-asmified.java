package asm.org.apache.geronimo.mail.james.mime4j.codec;
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
public class EncoderUtil$UsageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "Ljava/lang/Enum<Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil", "Usage", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEXT_TOKEN", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WORD_ENTITY", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "$VALUES", "[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEXT_TOKEN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "TEXT_TOKEN", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WORD_ENTITY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "WORD_ENTITY", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "TEXT_TOKEN", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "WORD_ENTITY", "Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage", "$VALUES", "[Lorg/apache/geronimo/mail/james/mime4j/codec/EncoderUtil$Usage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
