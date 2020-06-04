package asm.org.apache.openjpa.persistence.criteria;
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
public class CriteriaExpressionVisitor$ParameterVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$ParameterVisitor", null, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$AbstractVisitor", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$ParameterVisitor", "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "ParameterVisitor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$AbstractVisitor", "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "AbstractVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "query", "Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;", "Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;)V", "(Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$AbstractVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$ParameterVisitor", "query", "Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enter", "(Lorg/apache/openjpa/persistence/criteria/CriteriaExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$ParameterVisitor", "query", "Lorg/apache/openjpa/persistence/criteria/CriteriaQueryImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "registerParameter", "(Lorg/apache/openjpa/persistence/criteria/ParameterExpressionImpl;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
