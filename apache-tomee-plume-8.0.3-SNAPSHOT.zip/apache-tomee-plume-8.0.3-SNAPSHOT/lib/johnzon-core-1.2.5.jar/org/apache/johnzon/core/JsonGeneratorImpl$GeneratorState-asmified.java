package asm.org.apache.johnzon.core;
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
public class JsonGeneratorImpl$GeneratorStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "Ljava/lang/Enum<Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "org/apache/johnzon/core/JsonGeneratorImpl", "GeneratorState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITIAL", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_KEY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "START_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "END", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ROOT_VALUE", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "acceptsKey", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "acceptsValue", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "endable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "$VALUES", "[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZZZ)V", "(ZZZ)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "acceptsKey", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "acceptsValue", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "endable", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "endable", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "acceptsKey", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "acceptsValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITIAL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "INITIAL", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_OBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "START_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN_OBJECT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "IN_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_KEY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "AFTER_KEY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START_ARRAY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "START_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN_ARRAY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "IN_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("END");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "END", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ROOT_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "<init>", "(Ljava/lang/String;IZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "ROOT_VALUE", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "INITIAL", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "START_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "IN_OBJECT", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "AFTER_KEY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "START_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "IN_ARRAY", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "END", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "ROOT_VALUE", "Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JsonGeneratorImpl$GeneratorState", "$VALUES", "[Lorg/apache/johnzon/core/JsonGeneratorImpl$GeneratorState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
