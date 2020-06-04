package asm.javax.faces.view;
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
public class ViewDeclarationLanguageWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "javax/faces/view/ViewDeclarationLanguageWrapper", "Ljavax/faces/view/ViewDeclarationLanguage;Ljavax/faces/FacesWrapper<Ljavax/faces/view/ViewDeclarationLanguage;>;", "javax/faces/view/ViewDeclarationLanguage", new String[] { "javax/faces/FacesWrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "delegate", "Ljavax/faces/view/ViewDeclarationLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/ViewDeclarationLanguage", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/view/ViewDeclarationLanguage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/ViewDeclarationLanguage", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/view/ViewDeclarationLanguageWrapper", "delegate", "Ljavax/faces/view/ViewDeclarationLanguage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildView", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIViewRoot;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "buildView", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIViewRoot;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createView", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIViewRoot;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "createView", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIViewRoot;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getComponentMetadata", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;)Ljava/beans/BeanInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getComponentMetadata", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;)Ljava/beans/BeanInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScriptComponentResource", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;)Ljavax/faces/application/Resource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getScriptComponentResource", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;)Ljavax/faces/application/Resource;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStateManagementStrategy", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/view/StateManagementStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getStateManagementStrategy", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/view/StateManagementStrategy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewMetadata", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/view/ViewMetadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getViewMetadata", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/view/ViewMetadata;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "renderView", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIViewRoot;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "renderView", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIViewRoot;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "restoreView", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIViewRoot;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "restoreView", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIViewRoot;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retargetAttachedObjects", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/util/List;)V", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/util/List<Ljavax/faces/view/AttachedObjectHandler;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "retargetAttachedObjects", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retargetMethodExpressions", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "retargetMethodExpressions", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "viewExists", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "viewExists", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljavax/faces/component/UIComponent;", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljavax/faces/component/UIComponent;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "createComponent", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateResourceLibraryContracts", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/List;", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "calculateResourceLibraryContracts", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/view/ViewDeclarationLanguageWrapper", "delegate", "Ljavax/faces/view/ViewDeclarationLanguage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;I[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;I[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getViews", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;I[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguage", "getViews", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;[Ljavax/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/view/ViewDeclarationLanguageWrapper", "getWrapped", "()Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
