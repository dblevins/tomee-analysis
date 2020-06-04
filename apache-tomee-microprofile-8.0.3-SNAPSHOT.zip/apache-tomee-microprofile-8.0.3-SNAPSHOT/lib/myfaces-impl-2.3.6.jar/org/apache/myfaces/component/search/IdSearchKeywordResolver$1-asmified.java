package asm.org.apache.myfaces.component.search;
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
public class IdSearchKeywordResolver$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", null, "java/lang/Object", new String[] { "javax/faces/component/visit/VisitCallback" });

classWriter.visitOuterClass("org/apache/myfaces/component/search/IdSearchKeywordResolver", "resolve", "(Ljavax/faces/component/search/SearchKeywordContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;)V");

classWriter.visitInnerClass("org/apache/myfaces/component/search/IdSearchKeywordResolver$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$targetId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$expressionContext", "Ljavax/faces/component/search/SearchKeywordContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/component/search/IdSearchKeywordResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/myfaces/component/search/IdSearchKeywordResolver;Ljava/lang/String;Ljavax/faces/component/search/SearchKeywordContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "this$0", "Lorg/apache/myfaces/component/search/IdSearchKeywordResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$targetId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$expressionContext", "Ljavax/faces/component/search/SearchKeywordContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljavax/faces/component/visit/VisitContext;Ljavax/faces/component/UIComponent;)Ljavax/faces/component/visit/VisitResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$targetId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/UIComponent", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$expressionContext", "Ljavax/faces/component/search/SearchKeywordContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchKeywordContext", "invokeContextCallback", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$expressionContext", "Ljavax/faces/component/search/SearchKeywordContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchKeywordContext", "getSearchExpressionContext", "()Ljavax/faces/component/search/SearchExpressionContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchExpressionContext", "getExpressionHints", "()Ljava/util/Set;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/component/search/IdSearchKeywordResolver$1", "val$expressionContext", "Ljavax/faces/component/search/SearchKeywordContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchKeywordContext", "getSearchExpressionContext", "()Ljavax/faces/component/search/SearchExpressionContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/search/SearchExpressionContext", "getExpressionHints", "()Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/search/SearchExpressionHint", "RESOLVE_SINGLE_COMPONENT", "Ljavax/faces/component/search/SearchExpressionHint;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/visit/VisitResult", "COMPLETE", "Ljavax/faces/component/visit/VisitResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/visit/VisitResult", "ACCEPT", "Ljavax/faces/component/visit/VisitResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/visit/VisitResult", "ACCEPT", "Ljavax/faces/component/visit/VisitResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
