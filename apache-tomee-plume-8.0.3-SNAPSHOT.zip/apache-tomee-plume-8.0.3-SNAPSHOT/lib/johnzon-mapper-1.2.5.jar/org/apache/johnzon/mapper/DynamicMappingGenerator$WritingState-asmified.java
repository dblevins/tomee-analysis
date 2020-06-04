package asm.org.apache.johnzon.mapper;
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
public class DynamicMappingGenerator$WritingStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "Ljava/lang/Enum<Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "org/apache/johnzon/mapper/DynamicMappingGenerator", "WritingState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "$VALUES", "[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WROTE_START");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DONT_WRITE_END");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "DONT_WRITE_END", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "$VALUES", "[Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
