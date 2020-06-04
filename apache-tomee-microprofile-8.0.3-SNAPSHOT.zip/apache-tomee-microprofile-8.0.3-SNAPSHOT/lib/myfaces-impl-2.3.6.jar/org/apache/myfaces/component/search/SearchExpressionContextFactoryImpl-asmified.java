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
public class SearchExpressionContextFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/component/search/SearchExpressionContextFactoryImpl", null, "javax/faces/component/search/SearchExpressionContextFactory", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/search/SearchExpressionContextFactory", "<init>", "(Ljavax/faces/component/search/SearchExpressionContextFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/component/search/SearchExpressionContextFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/search/SearchExpressionContextFactory", "<init>", "(Ljavax/faces/component/search/SearchExpressionContextFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchExpressionContext", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/util/Set;Ljava/util/Set;)Ljavax/faces/component/search/SearchExpressionContext;", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/util/Set<Ljavax/faces/component/search/SearchExpressionHint;>;Ljava/util/Set<Ljavax/faces/component/visit/VisitHint;>;)Ljavax/faces/component/search/SearchExpressionContext;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/component/search/SearchExpressionContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/component/search/SearchExpressionContextImpl", "<init>", "(Ljavax/faces/context/FacesContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/component/search/SearchExpressionContextImpl", "setSource", "(Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(I)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/myfaces/component/search/SearchExpressionContextFactoryImpl", "javax/faces/context/FacesContext", "javax/faces/component/UIComponent", "java/util/Set", "java/util/Set", "org/apache/myfaces/component/search/SearchExpressionContextImpl"}, 1, new Object[] {"org/apache/myfaces/component/search/SearchExpressionContextImpl"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/myfaces/component/search/SearchExpressionContextFactoryImpl", "javax/faces/context/FacesContext", "javax/faces/component/UIComponent", "java/util/Set", "java/util/Set", "org/apache/myfaces/component/search/SearchExpressionContextImpl"}, 2, new Object[] {"org/apache/myfaces/component/search/SearchExpressionContextImpl", "java/util/Set"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/component/search/SearchExpressionContextImpl", "setExpressionHints", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/component/search/SearchExpressionContextImpl", "setVisitHints", "(Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
