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
public class FaceletViewDeclarationLanguage$FaceletViewMetadataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", null, "org/apache/myfaces/view/ViewMetadataBase", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage", "FaceletViewMetadata", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "this$0", "Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/ViewMetadataBase", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMetadataView", "(Ljakarta/faces/context/FacesContext;)Ljakarta/faces/component/UIViewRoot;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/FileNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label5, "java/io/IOException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label8, null);
methodVisitor.visitTryCatchBlock(label6, label7, label8, null);
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label5, label9, label8, null);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "setProcessingEvents", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("org.apache.myfaces.BUILDING_VIEW_METADATA");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "getViewHandler", "()Ljakarta/faces/application/ViewHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "getViewId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ViewHandler", "createView", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "this$0", "Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIViewRoot", "getViewId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage", "access$000", "(Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/view/facelets/Facelet;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "jakarta/faces/context/FacesContext", "jakarta/faces/component/UIViewRoot", "jakarta/faces/view/facelets/Facelet"}, 1, new Object[] {"java/io/FileNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "this$0", "Lorg/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "getViewId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage", "sendSourceNotFound", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("org.apache.myfaces.BUILDING_VIEW_METADATA");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "setProcessingEvents", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/Facelet", "apply", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("org.apache.myfaces.BUILDING_VIEW_METADATA");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "setProcessingEvents", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/myfaces/view/facelets/FaceletViewDeclarationLanguage$FaceletViewMetadata", "jakarta/faces/context/FacesContext"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("org.apache.myfaces.BUILDING_VIEW_METADATA");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "setProcessingEvents", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}