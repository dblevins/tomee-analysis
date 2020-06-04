package asm.org.apache.openjpa.kernel;
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
public class ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitor", null, "org/apache/openjpa/kernel/exps/AbstractExpressionVisitor", null);

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor", "org/apache/openjpa/kernel/ExpressionStoreQuery", "InMemoryExecutor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitor", "org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor", "AssertNoVariablesExpressionVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_ctx", "Lorg/apache/openjpa/kernel/QueryContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/QueryContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/exps/AbstractExpressionVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitor", "_ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enter", "(Lorg/apache/openjpa/kernel/exps/Value;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/exps/Value", "isVariable", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/ExpressionStoreQuery", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("inmem-agg-proj-var");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitor", "_ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getCandidateType", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExpressionStoreQuery$InMemoryExecutor$AssertNoVariablesExpressionVisitor", "_ctx", "Lorg/apache/openjpa/kernel/QueryContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "getQueryString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UnsupportedException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
