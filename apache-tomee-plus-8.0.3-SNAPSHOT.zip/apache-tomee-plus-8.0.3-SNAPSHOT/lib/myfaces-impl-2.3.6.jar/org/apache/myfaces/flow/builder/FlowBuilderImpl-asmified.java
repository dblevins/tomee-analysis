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
public class FlowBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/flow/builder/FlowBuilderImpl", null, "jakarta/faces/flow/builder/FlowBuilder", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EMPTY_PARAMS", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_facesContext", "Ljakarta/faces/context/FacesContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/flow/builder/FlowBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/FlowImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/FlowImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/context/FacesContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/flow/builder/FlowBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "id", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setDefiningDocumentId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "viewNode", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/faces/flow/builder/ViewBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/ViewBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/ViewBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "switchNode", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/SwitchBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/SwitchBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/SwitchBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "returnNode", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/ReturnBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/ReturnBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/ReturnBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "methodCallNode", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/MethodCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/MethodCallBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/MethodCallBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flowCallNode", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/FlowCallBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/FlowCallBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializer", "(Ljakarta/el/MethodExpression;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setInitializer", "(Ljakarta/el/MethodExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializer", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createMethodExpression", "(Ljava/lang/String;)Ljakarta/el/MethodExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setInitializer", "(Ljakarta/el/MethodExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "finalizer", "(Ljakarta/el/MethodExpression;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setFinalizer", "(Ljakarta/el/MethodExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "finalizer", "(Ljava/lang/String;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createMethodExpression", "(Ljava/lang/String;)Ljakarta/el/MethodExpression;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "setFinalizer", "(Ljakarta/el/MethodExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inboundParameter", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/ParameterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/ParameterImpl", "<init>", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "putInboundParameter", "(Ljava/lang/String;Ljakarta/faces/flow/Parameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inboundParameter", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/faces/flow/builder/FlowBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/ParameterImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "createValueExpression", "(Ljava/lang/String;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/ParameterImpl", "<init>", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/FlowImpl", "putInboundParameter", "(Ljava/lang/String;Ljakarta/faces/flow/Parameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlow", "()Ljakarta/faces/flow/Flow;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getFacesContext", "()Ljakarta/faces/context/FacesContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesContext", "Ljakarta/faces/context/FacesContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/context/FacesContext", "getCurrentInstance", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesContext", "Ljakarta/faces/context/FacesContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMethodExpression", "(Ljava/lang/String;)Ljakarta/el/MethodExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getExpressionFactory", "()Ljakarta/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getELContext", "()Ljakarta/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "EMPTY_PARAMS", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "createMethodExpression", "(Ljakarta/el/ELContext;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/el/MethodExpression;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMethodExpression", "(Ljava/lang/String;[Ljava/lang/Class;)Ljakarta/el/MethodExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getExpressionFactory", "()Ljakarta/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getELContext", "()Ljakarta/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "createMethodExpression", "(Ljakarta/el/ELContext;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljakarta/el/MethodExpression;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createValueExpression", "(Ljava/lang/String;)Ljakarta/el/ValueExpression;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getExpressionFactory", "()Ljakarta/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getELContext", "()Ljakarta/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ExpressionFactory", "createValueExpression", "(Ljakarta/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "navigationCase", "()Ljakarta/faces/flow/builder/NavigationCaseBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "_facesFlow", "Lorg/apache/myfaces/flow/FlowImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/builder/NavigationCaseBuilderImpl", "<init>", "(Lorg/apache/myfaces/flow/builder/FlowBuilderImpl;Lorg/apache/myfaces/flow/FlowImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/flow/builder/FlowBuilderImpl", "EMPTY_PARAMS", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
