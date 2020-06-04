package asm.org.eclipse.jdt.internal.compiler.lookup;
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
public class InferenceContext18$SuspendedInferenceRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18", "SuspendedInferenceRecord", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "site", "Lorg/eclipse/jdt/internal/compiler/lookup/InvocationSite;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "invocationArguments", "[Lorg/eclipse/jdt/internal/compiler/ast/Expression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "inferenceVariables", "[Lorg/eclipse/jdt/internal/compiler/lookup/InferenceVariable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "inferenceKind", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "usesUncheckedConversion", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/InvocationSite;[Lorg/eclipse/jdt/internal/compiler/ast/Expression;[Lorg/eclipse/jdt/internal/compiler/lookup/InferenceVariable;IZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "site", "Lorg/eclipse/jdt/internal/compiler/lookup/InvocationSite;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "invocationArguments", "[Lorg/eclipse/jdt/internal/compiler/ast/Expression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "inferenceVariables", "[Lorg/eclipse/jdt/internal/compiler/lookup/InferenceVariable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "inferenceKind", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/lookup/InferenceContext18$SuspendedInferenceRecord", "usesUncheckedConversion", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
