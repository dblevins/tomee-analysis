package asm.jakarta.faces.view;
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
public class ViewDeclarationLanguageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/faces/view/ViewDeclarationLanguage", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JSP_VIEW_DECLARATION_LANGUAGE_ID", "Ljava/lang/String;", null, "java.faces.JSP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_VIEW_DECLARATION_LANGUAGE_ID", "Ljava/lang/String;", null, "java.faces.Facelets");
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restoreView", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getViewMetadata", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/view/ViewMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createView", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "renderView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getComponentMetadata", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/application/Resource;)Ljava/beans/BeanInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getScriptComponentResource", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/application/Resource;)Ljakarta/faces/application/Resource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljakarta/faces/component/UIComponent;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljakarta/faces/component/UIComponent;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retargetAttachedObjects", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/List;)V", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;Ljava/util/List<Ljakarta/faces/view/AttachedObjectHandler;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retargetMethodExpressions", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateResourceLibraryContracts", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/List;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStateManagementStrategy", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/view/StateManagementStrategy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "viewExists", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getResourceHandler", "()Ljakarta/faces/application/ResourceHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ResourceHandler", "createViewResource", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/application/ViewResource;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getResourceHandler", "()Ljakarta/faces/application/ResourceHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/application/ResourceVisitOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/application/ResourceVisitOption", "TOP_LEVEL_VIEWS_ONLY", "Ljakarta/faces/application/ResourceVisitOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ResourceHandler", "getViewResources", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljakarta/faces/application/ResourceVisitOption;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;I[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;I[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getResourceHandler", "()Ljakarta/faces/application/ResourceHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/application/ResourceVisitOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/application/ResourceVisitOption", "TOP_LEVEL_VIEWS_ONLY", "Ljakarta/faces/application/ResourceVisitOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ResourceHandler", "getViewResources", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;I[Ljakarta/faces/application/ResourceVisitOption;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
