package asm.org.apache.xbean.recipe;
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
public class ReflectionUtil$ParameterLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/apache/xbean/recipe/ReflectionUtil$ParameterLoader", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/xbean/recipe/ReflectionUtil$ParameterLoader", "org/apache/xbean/recipe/ReflectionUtil", "ParameterLoader", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "PARAMETER_NAME_LOADER", "Lorg/apache/xbean/recipe/ParameterNameLoader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/apache/xbean/recipe/ParameterNameLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/ReflectionUtil$ParameterLoader", "PARAMETER_NAME_LOADER", "Lorg/apache/xbean/recipe/ParameterNameLoader;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.apache.xbean.asm7.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/XbeanAsmParameterNameLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/XbeanAsmParameterNameLoader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/ReflectionUtil$ParameterLoader", "PARAMETER_NAME_LOADER", "Lorg/apache/xbean/recipe/ParameterNameLoader;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("org.objectweb.asm.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/AsmParameterNameLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/AsmParameterNameLoader", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/ReflectionUtil$ParameterLoader", "PARAMETER_NAME_LOADER", "Lorg/apache/xbean/recipe/ParameterNameLoader;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitLdcInsn("org.apache.xbean.asm.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLdcInsn("org.apache.xbean.asm4.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLdcInsn("org.apache.xbean.asm5.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLdcInsn("org.apache.xbean.asm6.ClassReader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/recipe/ReflectionUtil", "access$000", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Your xbean-asm-shade is too old, please upgrade to xbean-asm7-shade");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
