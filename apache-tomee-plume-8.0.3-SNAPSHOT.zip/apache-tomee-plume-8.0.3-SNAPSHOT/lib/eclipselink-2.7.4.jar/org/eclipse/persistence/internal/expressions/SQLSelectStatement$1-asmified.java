package asm.org.eclipse.persistence.internal.expressions;
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
public class SQLSelectStatement$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/expressions/SQLSelectStatement$1", null, "org/eclipse/persistence/internal/expressions/ExpressionIterator", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/expressions/SQLSelectStatement", "assignAliases", "(Ljava/util/Vector;)V");

classWriter.visitInnerClass("org/eclipse/persistence/internal/expressions/SQLSelectStatement$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/expressions/SQLSelectStatement;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/expressions/SQLSelectStatement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/expressions/SQLSelectStatement$1", "this$0", "Lorg/eclipse/persistence/internal/expressions/SQLSelectStatement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/expressions/ExpressionIterator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterate", "(Lorg/eclipse/persistence/expressions/Expression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/SQLSelectStatement$1", "this$0", "Lorg/eclipse/persistence/internal/expressions/SQLSelectStatement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/SQLSelectStatement$1", "this$0", "Lorg/eclipse/persistence/internal/expressions/SQLSelectStatement;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/expressions/SQLSelectStatement", "currentAliasNumber", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/Expression", "assignTableAliasesStartingAt", "(I)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/expressions/SQLSelectStatement", "currentAliasNumber", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
