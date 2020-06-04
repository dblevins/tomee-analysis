package asm.org.apache.myfaces.view.facelets;
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
public class AbstractFaceletDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/view/facelets/AbstractFacelet", null, "javax/faces/view/facelets/Facelet", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/view/facelets/Facelet", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "include", "(Lorg/apache/myfaces/view/facelets/AbstractFaceletContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "include", "(Lorg/apache/myfaces/view/facelets/AbstractFaceletContext;Ljavax/faces/component/UIComponent;Ljava/net/URL;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlias", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "applyCompositeComponent", "(Lorg/apache/myfaces/view/facelets/AbstractFaceletContext;Ljavax/faces/component/UIComponent;Ljavax/faces/application/Resource;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "applyDynamicComponentHandler", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/faces/FacesException", "javax/faces/view/facelets/FaceletException", "javax/el/ELException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isBuildingCompositeComponentMetadata", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFaceletId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/AbstractFacelet", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
