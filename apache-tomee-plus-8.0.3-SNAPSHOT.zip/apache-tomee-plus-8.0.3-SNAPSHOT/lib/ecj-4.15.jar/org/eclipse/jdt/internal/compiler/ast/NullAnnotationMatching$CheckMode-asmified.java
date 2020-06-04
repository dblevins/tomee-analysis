package asm.org.eclipse.jdt.internal.compiler.ast;
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
public class NullAnnotationMatching$CheckModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ENUM, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "Ljava/lang/Enum<Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching", "CheckMode", ACC_PUBLIC | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$1", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$2", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$3", null, null, ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPATIBLE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXACT", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOUND_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOUND_SUPER_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OVERRIDE_RETURN", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OVERRIDE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPATIBLE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "COMPATIBLE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXACT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "EXACT", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOUND_CHECK");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "BOUND_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOUND_SUPER_CHECK");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "BOUND_SUPER_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OVERRIDE_RETURN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "OVERRIDE_RETURN", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OVERRIDE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "OVERRIDE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "COMPATIBLE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "EXACT", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "BOUND_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "BOUND_SUPER_CHECK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "OVERRIDE_RETURN", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "OVERRIDE", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
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
methodVisitor = classWriter.visitMethod(0, "requiredNullableMatchesAll", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "toDetail", "()Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "EXACT", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$CheckMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
