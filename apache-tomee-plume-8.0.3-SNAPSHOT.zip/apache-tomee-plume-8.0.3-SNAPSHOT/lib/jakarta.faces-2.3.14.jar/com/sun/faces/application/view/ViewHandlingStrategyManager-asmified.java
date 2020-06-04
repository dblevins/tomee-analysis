package asm.com.sun.faces.application.view;
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
public class ViewHandlingStrategyManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/view/ViewHandlingStrategyManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "com/sun/faces/config/WebConfiguration", "BooleanWebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "strategies", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration", "getInstance", "()Lcom/sun/faces/config/WebConfiguration;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandler", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter", "DisableFaceletJSFViewHandlerDeprecated", "Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "isOptionEnabled", "(Lcom/sun/faces/config/WebConfiguration$BooleanWebContextInitParameter;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/sun/faces/application/view/ViewHandlingStrategyManager", "com/sun/faces/config/WebConfiguration"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/application/view/ViewHandlingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/JspViewHandlingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/JspViewHandlingStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/application/view/ViewHandlingStrategyManager", "com/sun/faces/config/WebConfiguration", Opcodes.INTEGER}, 1, new Object[] {"com/sun/faces/application/view/ViewHandlingStrategyManager"});
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/application/view/ViewHandlingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/FaceletViewHandlingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/FaceletViewHandlingStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/JspViewHandlingStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/JspViewHandlingStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/application/view/ViewHandlingStrategyManager", "com/sun/faces/config/WebConfiguration", Opcodes.INTEGER}, 2, new Object[] {"com/sun/faces/application/view/ViewHandlingStrategyManager", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;"});
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/ViewHandlingStrategyManager", "strategies", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStrategy", "(Ljava/lang/String;)Lcom/sun/faces/application/view/ViewHandlingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewHandlingStrategyManager", "strategies", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lcom/sun/faces/application/view/ViewHandlingStrategy;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/view/ViewHandlingStrategy", "handlesViewId", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/view/ViewHandlingStrategyNotFoundException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/view/ViewHandlingStrategyNotFoundException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewHandlingStrategies", "()[Lcom/sun/faces/application/view/ViewHandlingStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/view/ViewHandlingStrategyManager", "strategies", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/application/view/ViewHandlingStrategy;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "setViewHandlingStrategies", "([Lcom/sun/faces/application/view/ViewHandlingStrategy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/application/view/ViewHandlingStrategy;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/view/ViewHandlingStrategyManager", "strategies", "[Lcom/sun/faces/application/view/ViewHandlingStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
