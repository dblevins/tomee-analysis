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
public class JavadocSingleTypeReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", null, "org/eclipse/jdt/internal/compiler/ast/SingleTypeReference", new String[] { "org/eclipse/jdt/internal/compiler/ast/IJavadocTypeReference" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "tagSourceStart", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "tagSourceEnd", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "packageBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([CJII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/SingleTypeReference", "<init>", "([CJ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "tagSourceStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "tagSourceEnd", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "bits", "I");
methodVisitor.visitLdcInsn(new Integer(32768));
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "bits", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "internalResolveType", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;I)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/impl/Constant", "NotAConstant", "Lorg/eclipse/jdt/internal/compiler/impl/Constant;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "constant", "Lorg/eclipse/jdt/internal/compiler/impl/Constant;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isValidBinding", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "problemId", "()I", false);
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label3, new Label[] { label2, label2, label3, label3, label2 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "closestMatch", "()Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "getTypeBinding", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/LocalTypeBinding");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/LocalTypeBinding");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalTypeBinding", "scope", "Lorg/eclipse/jdt/internal/compiler/lookup/ClassScope;");
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalTypeBinding", "scope", "Lorg/eclipse/jdt/internal/compiler/lookup/ClassScope;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ClassScope", "parent", "Lorg/eclipse/jdt/internal/compiler/lookup/Scope;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/ProblemReferenceBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/LocalTypeBinding", "sourceName", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/ProblemReferenceBinding", "<init>", "([[CLorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isValidBinding", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "token", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "getTypeOrPackage", "([[C)Lorg/eclipse/jdt/internal/compiler/lookup/Binding;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/jdt/internal/compiler/lookup/PackageBinding");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/PackageBinding");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "packageBinding", "Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[[C", "org/eclipse/jdt/internal/compiler/lookup/Binding"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "problemId", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "closestMatch", "()Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isTypeVariable", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "reportInvalidType", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "isTypeUseDeprecated", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "reportDeprecatedType", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isGenericType", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "isParameterizedType", "()Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "environment", "()Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/LookupEnvironment", "convertToRawType", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Z)Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reportDeprecatedType", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "getDeclarationModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "javadocDeprecatedType", "(Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "reportInvalidType", "(Lorg/eclipse/jdt/internal/compiler/lookup/Scope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "problemReporter", "()Lorg/eclipse/jdt/internal/compiler/problem/ProblemReporter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "resolvedType", "Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/Scope", "getDeclarationModifiers", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/problem/ProblemReporter", "javadocInvalidType", "(Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "traverse", "(Lorg/eclipse/jdt/internal/compiler/ASTVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference;Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "endVisit", "(Lorg/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference;Lorg/eclipse/jdt/internal/compiler/lookup/BlockScope;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "traverse", "(Lorg/eclipse/jdt/internal/compiler/ASTVisitor;Lorg/eclipse/jdt/internal/compiler/lookup/ClassScope;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "visit", "(Lorg/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference;Lorg/eclipse/jdt/internal/compiler/lookup/ClassScope;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/ASTVisitor", "endVisit", "(Lorg/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference;Lorg/eclipse/jdt/internal/compiler/lookup/ClassScope;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTagSourceStart", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "tagSourceStart", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTagSourceEnd", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/ast/JavadocSingleTypeReference", "tagSourceEnd", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}