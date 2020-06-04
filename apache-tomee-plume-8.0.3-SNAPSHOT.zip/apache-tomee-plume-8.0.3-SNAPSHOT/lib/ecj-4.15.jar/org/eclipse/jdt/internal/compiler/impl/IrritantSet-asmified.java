package asm.org.eclipse.jdt.internal.compiler.impl;
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
public class IrritantSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP_MASK", "I", null, new Integer(-536870912));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP_SHIFT", "I", null, new Integer(29));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP_MAX", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP0", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP1", "I", null, new Integer(536870912));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUP2", "I", null, new Integer(1073741824));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOXING", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CAST", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEPRECATION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TERMINAL_DEPRECATION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEP_ANN", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALLTHROUGH", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FINALLY", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HIDING", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCOMPLETE_SWITCH", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NLS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RAW", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESTRICTION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIAL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATIC_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STATIC_METHOD", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNCHRONIZED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUPER", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNUSED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNQUALIFIED_FIELD_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNLIKELY_ARGUMENT_TYPE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "API_LEAK", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVADOC", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PREVIEW", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPILER_DEFAULT_ERRORS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPILER_DEFAULT_WARNINGS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPILER_DEFAULT_INFOS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bits", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536870911));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "ALL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536871168));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "BOXING", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(67108864));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "CAST", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "DEPRECATION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1082130432));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "TERMINAL_DEPRECATION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536879104));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "DEP_ANN", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(537395200));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "FALLTHROUGH", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(16777216));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "FINALLY", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "HIDING", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536875008));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "INCOMPLETE_SWITCH", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "NLS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536871040));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "NULL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536936448));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "RAW", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536870944));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "RESTRICTION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536870920));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "SERIAL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(268435456));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "STATIC_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1073741840));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "STATIC_METHOD", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "SYNTHETIC_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(805306368));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "SYNCHRONIZED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(537919488));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "SUPER", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNUSED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(536870914));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(4194304));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNQUALIFIED_FIELD_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1073741952));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "RESOURCE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1075838976));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNLIKELY_ARGUMENT_TYPE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1090519040));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "API_LEAK", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1107296256));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "MODULE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(33554432));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "JAVADOC", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(new Integer(1140850688));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "PREVIEW", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_ERRORS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_WARNINGS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/impl/IrritantSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_INFOS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_INFOS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1480589312));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_WARNINGS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(16838239));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(721671934));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1203384454));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "COMPILER_DEFAULT_ERRORS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1073744896));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "ALL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "setAll", "()Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "HIDING", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(65536));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(536871936));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "NULL", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(538968064));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(541065216));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073742848));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073743872));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073745920));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073750016));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073872896));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073758208));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1074266112));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1074790400));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1342177280));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "RESTRICTION", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(536887296));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "STATIC_ACCESS", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNUSED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1074003968));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(32768));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(8388608));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(537001984));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(553648128));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(603979776));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073741826));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073741832));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073807360));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073741888));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "STATIC_METHOD", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1073741856));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "RESOURCE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1073742080));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(1073742336));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "INCOMPLETE_SWITCH", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1073774592));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("suppressRawWhenUnchecked");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(536936448));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "JAVADOC", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1048576));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "UNLIKELY_ARGUMENT_TYPE", "Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;");
methodVisitor.visitLdcInsn(new Integer(1077936128));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "initialize", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "initialize", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "areAllSet", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitLdcInsn(new Integer(536870911));
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-536870912));
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearAll", "()Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-536870912));
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(536870911));
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAnySet", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(IAND);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasSameIrritants", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSet", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-536870912));
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBits", "()[I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(I)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(-536870912));
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLdcInsn(new Integer(536870911));
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;)Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitLdcInsn(new Integer(536870911));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ACONST_NULL);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/jdt/internal/compiler/impl/IrritantSet"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAll", "()Lorg/eclipse/jdt/internal/compiler/impl/IrritantSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/IrritantSet", "bits", "[I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitLdcInsn(new Integer(536870911));
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
