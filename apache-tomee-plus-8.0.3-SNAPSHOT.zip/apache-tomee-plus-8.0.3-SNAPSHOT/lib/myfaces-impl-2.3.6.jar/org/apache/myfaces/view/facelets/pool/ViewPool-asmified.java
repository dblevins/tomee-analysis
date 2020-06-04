package asm.org.apache.myfaces.view.facelets.pool;
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
public class ViewPoolDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/view/facelets/pool/ViewPool", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_MAX_POOL_SIZE", "Ljava/lang/String;", null, "org.apache.myfaces.VIEW_POOL_MAX_POOL_SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_MAX_POOL_SIZE_DEFAULT", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_MAX_DYNAMIC_PARTIAL_LIMIT", "Ljava/lang/String;", null, "org.apache.myfaces.VIEW_POOL_MAX_DYNAMIC_PARTIAL_LIMIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_MAX_DYNAMIC_PARTIAL_LIMIT_DEFAULT", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_ENTRY_MODE", "Ljava/lang/String;", null, "org.apache.myfaces.VIEW_POOL_ENTRY_MODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTRY_MODE_SOFT", "Ljava/lang/String;", null, "soft");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTRY_MODE_WEAK", "Ljava/lang/String;", null, "weak");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_ENTRY_MODE_DEFAULT", "Ljava/lang/String;", null, "soft");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT_PARAM_VIEW_POOL_DEFERRED_NAVIGATION", "Ljava/lang/String;", null, "org.apache.myfaces.VIEW_POOL_DEFERRED_NAVIGATION");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDeferredNavigationEnabled", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeStaticViewStructureMetadata", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "retrieveStaticViewStructureMetadata", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)Lorg/apache/myfaces/view/facelets/pool/ViewStructureMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pushStaticStructureView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pushPartialStructureView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "popStaticOrPartialStructureView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)Lorg/apache/myfaces/view/facelets/pool/ViewEntry;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isWorthToRecycleThisView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "storeDynamicViewStructureMetadata", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "retrieveDynamicViewStructureMetadata", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;)Lorg/apache/myfaces/view/facelets/pool/ViewStructureMetadata;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pushDynamicStructureView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "popDynamicStructureView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;Lorg/apache/myfaces/view/facelets/tag/jsf/FaceletState;)Lorg/apache/myfaces/view/facelets/pool/ViewEntry;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
