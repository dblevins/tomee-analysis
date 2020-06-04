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
public class NavigationCaseBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", null, "javax/faces/flow/builder/NavigationCaseBuilder", null);

classWriter.visitInnerClass("org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "RedirectBuilderImpl", ACC_PUBLIC);

classWriter.visitInnerClass("javax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder", "javax/faces/flow/builder/NavigationCaseBuilder", "RedirectBuilder", ACC_PUBLIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/flow/builder/NavigationCaseBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_flowBuilder", "Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/NavigationCaseImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/NavigationCaseImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fromViewId", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "getFromViewId", "()Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "removeNavigationCase", "(Ljavax/faces/application/NavigationCase;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setFromViewId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "addNavigationCase", "(Ljavax/faces/application/NavigationCase;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fromAction", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setFromAction", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fromOutcome", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setFromOutcome", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toViewId", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setToViewId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toFlowDocumentId", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setToFlowDocumentId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "condition", "(Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setConditionExpression", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setCondition", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "condition", "(Ljavax/el/ValueExpression;)Ljavax/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setCondition", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setConditionExpression", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "redirect", "()Ljavax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/NavigationCaseImpl", "setRedirect", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/NavigationCaseBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/myfaces/flow/builder/NavigationCaseBuilderImpl;)Lorg/apache/myfaces/flow/NavigationCaseImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "_navigationCaseImpl", "Lorg/apache/myfaces/flow/NavigationCaseImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
