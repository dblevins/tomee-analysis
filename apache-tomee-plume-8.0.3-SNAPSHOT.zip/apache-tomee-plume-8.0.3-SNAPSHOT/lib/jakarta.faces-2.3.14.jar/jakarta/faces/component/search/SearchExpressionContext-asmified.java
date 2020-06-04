package asm.jakarta.faces.component.search;
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
public class SearchExpressionContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/faces/component/search/SearchExpressionContext", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSource", "()Ljakarta/faces/component/UIComponent;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVisitHints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/faces/component/visit/VisitHint;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExpressionHints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/faces/component/search/SearchExpressionHint;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFacesContext", "()Ljakarta/faces/context/FacesContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSearchExpressionContext", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)Ljakarta/faces/component/search/SearchExpressionContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/search/SearchExpressionContext", "createSearchExpressionContext", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/Set;Ljava/util/Set;)Ljakarta/faces/component/search/SearchExpressionContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSearchExpressionContext", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/Set;Ljava/util/Set;)Ljakarta/faces/component/search/SearchExpressionContext;", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/Set<Ljakarta/faces/component/search/SearchExpressionHint;>;Ljava/util/Set<Ljakarta/faces/component/visit/VisitHint;>;)Ljakarta/faces/component/search/SearchExpressionContext;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.faces.component.search.SearchExpressionContextFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/FactoryFinder", "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/search/SearchExpressionContextFactory");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/search/SearchExpressionContextFactory", "getSearchExpressionContext", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/Set;Ljava/util/Set;)Ljakarta/faces/component/search/SearchExpressionContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
