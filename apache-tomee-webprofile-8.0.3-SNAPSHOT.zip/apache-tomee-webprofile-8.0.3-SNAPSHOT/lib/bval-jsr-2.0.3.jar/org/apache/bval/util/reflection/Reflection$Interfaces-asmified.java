package asm.org.apache.bval.util.reflection;
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
public class Reflection$InterfacesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/bval/util/reflection/Reflection$Interfaces", "Ljava/lang/Enum<Lorg/apache/bval/util/reflection/Reflection$Interfaces;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/bval/util/reflection/Reflection$Interfaces", "org/apache/bval/util/reflection/Reflection", "Interfaces", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "$VALUES", "[Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/bval/util/reflection/Reflection$Interfaces;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/util/reflection/Reflection$Interfaces;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/util/reflection/Reflection$Interfaces");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/reflection/Reflection$Interfaces");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCLUDE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/reflection/Reflection$Interfaces", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "INCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/reflection/Reflection$Interfaces");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCLUDE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/reflection/Reflection$Interfaces", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "EXCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/util/reflection/Reflection$Interfaces");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "INCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "EXCLUDE", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/util/reflection/Reflection$Interfaces", "$VALUES", "[Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
