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
public class SpatialExpressionOperatorsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/expressions/SpatialExpressionOperators", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "withinDistance", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitLdcInsn("MDSYS.SDO_WITHIN_DISTANCE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleThreeArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "bePrefix", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "relate", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitLdcInsn("MDSYS.SDO_RELATE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleThreeArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "bePrefix", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "filter", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitLdcInsn("MDSYS.SDO_FILTER");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleThreeArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "bePrefix", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nearestNeighbor", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitLdcInsn("MDSYS.SDO_NN");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleThreeArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "bePrefix", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
