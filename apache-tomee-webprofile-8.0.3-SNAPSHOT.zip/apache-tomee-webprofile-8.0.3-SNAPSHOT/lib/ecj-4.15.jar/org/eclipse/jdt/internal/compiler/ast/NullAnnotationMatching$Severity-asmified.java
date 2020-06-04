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
public class NullAnnotationMatching$SeverityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "Ljava/lang/Enum<Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching", "Severity", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LEGACY_WARNING", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNCHECKED_TO_UNANNOTATED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MISMATCH", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OK");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "OK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LEGACY_WARNING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "LEGACY_WARNING", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNCHECKED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNCHECKED_TO_UNANNOTATED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "UNCHECKED_TO_UNANNOTATED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISMATCH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "MISMATCH", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "OK", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "LEGACY_WARNING", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "UNCHECKED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "UNCHECKED_TO_UNANNOTATED", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "MISMATCH", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "max", "(Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;)Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "compareTo", "(Ljava/lang/Enum;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAnyMismatch", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "LEGACY_WARNING", "Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "compareTo", "(Ljava/lang/Enum;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/ast/NullAnnotationMatching$Severity");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
