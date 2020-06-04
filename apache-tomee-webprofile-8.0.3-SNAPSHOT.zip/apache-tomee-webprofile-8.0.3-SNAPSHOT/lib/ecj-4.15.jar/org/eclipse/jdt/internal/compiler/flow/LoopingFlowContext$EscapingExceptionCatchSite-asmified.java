package asm.org.eclipse.jdt.internal.compiler.flow;
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
public class LoopingFlowContext$EscapingExceptionCatchSiteDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext", "EscapingExceptionCatchSite", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "caughtException", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "catchingContext", "Lorg/eclipse/jdt/internal/compiler/flow/ExceptionHandlingFlowContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "exceptionInfo", "Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/flow/ExceptionHandlingFlowContext;Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "catchingContext", "Lorg/eclipse/jdt/internal/compiler/flow/ExceptionHandlingFlowContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "caughtException", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "exceptionInfo", "Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "simulateThrowAfterLoopBack", "(Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "catchingContext", "Lorg/eclipse/jdt/internal/compiler/flow/ExceptionHandlingFlowContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "caughtException", "Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/FlowInfo", "unconditionalCopy", "()Lorg/eclipse/jdt/internal/compiler/flow/UnconditionalFlowInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/flow/LoopingFlowContext$EscapingExceptionCatchSite", "exceptionInfo", "Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/UnconditionalFlowInfo", "addNullInfoFrom", "(Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;)Lorg/eclipse/jdt/internal/compiler/flow/FlowInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/FlowInfo", "unconditionalInits", "()Lorg/eclipse/jdt/internal/compiler/flow/UnconditionalFlowInfo;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/flow/ExceptionHandlingFlowContext", "recordHandlingException", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;Lorg/eclipse/jdt/internal/compiler/flow/UnconditionalFlowInfo;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/lookup/TypeBinding;Lorg/eclipse/jdt/internal/compiler/ast/ASTNode;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
