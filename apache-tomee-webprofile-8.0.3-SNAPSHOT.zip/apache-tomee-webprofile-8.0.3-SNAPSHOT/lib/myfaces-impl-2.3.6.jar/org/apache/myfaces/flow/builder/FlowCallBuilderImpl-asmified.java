package asm.org.apache.myfaces.flow.builder;
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
public class FlowCallBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", null, "javax/faces/flow/builder/FlowCallBuilder", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/flow/builder/FlowCallBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/FlowCallNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "putFlowCall", "(Ljava/lang/String;Ljavax/faces/flow/FlowCallNode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flowReference", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/flow/builder/FlowCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/el/ELText", "isLiteral", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "setCalledFlowDocumentId", "(Ljava/lang/String;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createValueExpression", "(Ljava/lang/String;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "setCalledFlowDocumentId", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/el/ELText", "isLiteral", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "setCalledFlowId", "(Ljava/lang/String;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createValueExpression", "(Ljava/lang/String;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "setCalledFlowId", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "outboundParameter", "(Ljava/lang/String;Ljavax/el/ValueExpression;)Ljavax/faces/flow/builder/FlowCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/ParameterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/ParameterImpl", "<init>", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "putOutboundParameter", "(Ljava/lang/String;Ljavax/faces/flow/Parameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "outboundParameter", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/flow/builder/FlowCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/ParameterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createValueExpression", "(Ljava/lang/String;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/ParameterImpl", "<init>", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "putOutboundParameter", "(Ljava/lang/String;Ljavax/faces/flow/Parameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "markAsStartNode", "()Ljavax/faces/flow/builder/FlowCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "_flowCallNode", "Lorg/apache/myfaces/flow/FlowCallNodeImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowCallNodeImpl", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setStartNodeId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "markAsStartNode", "()Ljavax/faces/flow/builder/NodeBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "markAsStartNode", "()Ljavax/faces/flow/builder/FlowCallBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
