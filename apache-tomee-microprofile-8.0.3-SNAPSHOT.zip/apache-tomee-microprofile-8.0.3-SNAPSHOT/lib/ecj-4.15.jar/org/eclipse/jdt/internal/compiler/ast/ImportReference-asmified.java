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
public class ImportReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/ast/ImportReference", null, "org/eclipse/jdt/internal/compiler/ast/ASTNode", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "tokens", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "sourcePositions", "[J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "declarationEnd", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "declarationSourceStart", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "declarationSourceEnd", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "modifiers", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "annotations", "[Lorg/eclipse/jdt/internal/compiler/ast/Annotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "trailingStarPosition", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([[C[JZI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ASTNode", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "tokens", "[[C");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "sourcePositions", "[J");
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "bits", "I");
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "bits", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/jdt/internal/compiler/ast/ImportReference", "[[C", "[J", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(L2I);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "sourceEnd", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "sourceStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "modifiers", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStatic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "modifiers", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImportName", "()[[C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "tokens", "[[C");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkPackageConflict", "(Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "module", "()Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "tokens", "[[C");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ModuleBinding", "getVisiblePackage", "([[C)Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/SplitPackageBinding");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/SplitPackageBinding");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/SplitPackageBinding", "incarnations", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/jdt/internal/compiler/ast/ImportReference", "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "org/eclipse/jdt/internal/compiler/lookup/ModuleBinding", "org/eclipse/jdt/internal/compiler/lookup/PackageBinding", "java/util/Set", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/PackageBinding");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/PackageBinding", "enclosingModule", "Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ModuleBinding", "canAccess", "(Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/PackageBinding", "enclosingModule", "Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "compilerOptions", "()Lorg/eclipse/jdt/internal/compiler/impl/CompilerOptions;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/impl/CompilerOptions", "enableJdtDebugCompileMode", "Z");
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "conflictingPackagesFromOtherModules", "(Lorg/eclipse/jdt/internal/compiler/ast/ImportReference;Ljava/util/Set;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/jdt/internal/compiler/ast/ImportReference", "org/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope", "org/eclipse/jdt/internal/compiler/lookup/ModuleBinding", "org/eclipse/jdt/internal/compiler/lookup/PackageBinding"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(ILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "print", "(ILjava/lang/StringBuffer;Z)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(ILjava/lang/StringBuffer;Z)Ljava/lang/StringBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "tokens", "[[C");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "([C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "tokens", "[[C");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/ImportReference", "bits", "I");
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(".*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "traverse", "(Lorg/eclipse/jdt/internal/compiler/ASTVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/ast/ImportReference;Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "endVisit", "(Lorg/eclipse/jdt/internal/compiler/ast/ImportReference;Lorg/eclipse/jdt/internal/compiler/lookup/CompilationUnitScope;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
