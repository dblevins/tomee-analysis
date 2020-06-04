package asm.org.apache.commons.lang3.text;
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
public class StrMatcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT | ACC_DEPRECATED, "org/apache/commons/lang3/text/StrMatcher", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/commons/lang3/text/StrMatcher$TrimMatcher", "org/apache/commons/lang3/text/StrMatcher", "TrimMatcher", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrMatcher$NoMatcher", "org/apache/commons/lang3/text/StrMatcher", "NoMatcher", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrMatcher$StringMatcher", "org/apache/commons/lang3/text/StrMatcher", "StringMatcher", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrMatcher$CharMatcher", "org/apache/commons/lang3/text/StrMatcher", "CharMatcher", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/text/StrMatcher$CharSetMatcher", "org/apache/commons/lang3/text/StrMatcher", "CharSetMatcher", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "COMMA_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAB_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SPACE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SPLIT_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRIM_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SINGLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DOUBLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "commaMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "COMMA_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "tabMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "TAB_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "spaceMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SPACE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "splitMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SPLIT_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "trimMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "TRIM_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "singleQuoteMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SINGLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "doubleQuoteMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "DOUBLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "quoteMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noneMatcher", "()Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "charMatcher", "(C)Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "charSetMatcher", "([C)Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher", "<init>", "([C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "charSetMatcher", "(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/StringUtils", "isEmpty", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher", "<init>", "([C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "stringMatcher", "(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrMatcher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/StringUtils", "isEmpty", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/StrMatcher", "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$StringMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$StringMatcher", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMatch", "([CIII)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMatch", "([CI)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/lang3/text/StrMatcher", "isMatch", "([CIII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "COMMA_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "TAB_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SPACE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(" \u0009\n\r\u000c");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher", "<init>", "([C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SPLIT_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$TrimMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$TrimMatcher", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "TRIM_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "SINGLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharMatcher", "<init>", "(C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "DOUBLE_QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'\"");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$CharSetMatcher", "<init>", "([C)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "QUOTE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/StrMatcher$NoMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/StrMatcher$NoMatcher", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/StrMatcher", "NONE_MATCHER", "Lorg/apache/commons/lang3/text/StrMatcher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
