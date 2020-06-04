package asm.org.apache.juli;
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
public class OneLineFormatter$MillisHandlingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/juli/OneLineFormatter$MillisHandling", "Ljava/lang/Enum<Lorg/apache/juli/OneLineFormatter$MillisHandling;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/juli/OneLineFormatter$MillisHandling", "org/apache/juli/OneLineFormatter", "MillisHandling", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPEND", "Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REPLACE_S", "Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REPLACE_SS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REPLACE_SSS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "$VALUES", "[Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/juli/OneLineFormatter$MillisHandling;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/juli/OneLineFormatter$MillisHandling;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/juli/OneLineFormatter$MillisHandling;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/juli/OneLineFormatter$MillisHandling");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/juli/OneLineFormatter$MillisHandling", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "NONE", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitTypeInsn(NEW, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPEND");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/juli/OneLineFormatter$MillisHandling", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "APPEND", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitTypeInsn(NEW, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REPLACE_S");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/juli/OneLineFormatter$MillisHandling", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_S", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitTypeInsn(NEW, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REPLACE_SS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/juli/OneLineFormatter$MillisHandling", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_SS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitTypeInsn(NEW, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REPLACE_SSS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/juli/OneLineFormatter$MillisHandling", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_SSS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/juli/OneLineFormatter$MillisHandling");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "NONE", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "APPEND", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_S", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_SS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "REPLACE_SSS", "Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/juli/OneLineFormatter$MillisHandling", "$VALUES", "[Lorg/apache/juli/OneLineFormatter$MillisHandling;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
