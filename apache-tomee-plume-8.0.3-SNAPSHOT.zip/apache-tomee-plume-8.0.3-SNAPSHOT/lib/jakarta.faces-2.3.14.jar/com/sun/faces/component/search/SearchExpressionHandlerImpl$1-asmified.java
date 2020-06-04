package asm.com.sun.faces.component.search;
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
public class SearchExpressionHandlerImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", null, "java/lang/Object", new String[] { "javax/faces/component/ContextCallback" });

classWriter.visitOuterClass("com/sun/faces/component/search/SearchExpressionHandlerImpl", "invokeOnComponent", "(Ljavax/faces/component/search/SearchExpressionContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/faces/component/ContextCallback;)V");

classWriter.visitInnerClass("com/sun/faces/component/search/SearchExpressionHandlerImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$handler", "Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$searchExpressionContext", "Ljavax/faces/component/search/SearchExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$finalRemainingExpression", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$callback", "Ljavax/faces/component/ContextCallback;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/component/search/SearchExpressionHandlerImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/faces/component/search/SearchExpressionHandlerImpl;Ljavax/faces/component/search/SearchExpressionHandler;Ljavax/faces/component/search/SearchExpressionContext;Ljava/lang/String;Ljavax/faces/component/ContextCallback;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "this$0", "Lcom/sun/faces/component/search/SearchExpressionHandlerImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$handler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$searchExpressionContext", "Ljavax/faces/component/search/SearchExpressionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$finalRemainingExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$callback", "Ljavax/faces/component/ContextCallback;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invokeContextCallback", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$handler", "Ljavax/faces/component/search/SearchExpressionHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$searchExpressionContext", "Ljavax/faces/component/search/SearchExpressionContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$finalRemainingExpression", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/component/search/SearchExpressionHandlerImpl$1", "val$callback", "Ljavax/faces/component/ContextCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchExpressionHandler", "invokeOnComponent", "(Ljavax/faces/component/search/SearchExpressionContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljavax/faces/component/ContextCallback;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
