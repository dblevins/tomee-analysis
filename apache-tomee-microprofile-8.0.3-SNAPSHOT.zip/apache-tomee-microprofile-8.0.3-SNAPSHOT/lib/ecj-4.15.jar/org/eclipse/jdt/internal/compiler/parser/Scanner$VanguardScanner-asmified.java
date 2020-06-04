package asm.org.eclipse.jdt.internal.compiler.parser;
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
public class Scanner$VanguardScannerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", null, "org/eclipse/jdt/internal/compiler/parser/Scanner", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", "org/eclipse/jdt/internal/compiler/parser/Scanner", "Goal", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext", "org/eclipse/jdt/internal/compiler/parser/Scanner", "ScanContext", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser", "org/eclipse/jdt/internal/compiler/parser/Scanner", "VanguardParser", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "org/eclipse/jdt/internal/compiler/parser/Scanner", "VanguardScanner", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(JJZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/parser/Scanner", "<init>", "(ZZZJJ[[C[[CZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(12, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextToken", "()I", null, new String[] { "org/eclipse/jdt/core/compiler/InvalidInputException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "nextToken", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "nextToken", "I");
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "nextToken", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "scanContext", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "isInModuleDeclaration", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext", "EXPECTING_KEYWORD", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner"});
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext", "INACTIVE", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner"}, 2, new Object[] {"org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "org/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "scanContext", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$ScanContext;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "getNextToken0", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "areRestrictedModuleKeywordsActive", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "isRestrictedKeyword", "(I)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "disambiguatedRestrictedKeyword", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "updateScanContext", "(I)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 37);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "atTypeAnnotation", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "activeParser", "Lorg/eclipse/jdt/internal/compiler/parser/ConflictedParser;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardParser", "currentGoal", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$Goal;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/parser/Scanner$Goal", "LambdaParameterListGoal", "Lorg/eclipse/jdt/internal/compiler/parser/Scanner$Goal;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/parser/Scanner$VanguardScanner", "disambiguatedToken", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 62);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
methodVisitor.visitInsn(ICONST_0);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
