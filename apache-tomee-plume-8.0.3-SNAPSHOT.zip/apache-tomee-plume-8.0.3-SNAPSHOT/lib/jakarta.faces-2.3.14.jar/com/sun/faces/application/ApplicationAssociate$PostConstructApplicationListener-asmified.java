package asm.com.sun.faces.application;
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
public class ApplicationAssociate$PostConstructApplicationListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", null, "java/lang/Object", new String[] { "javax/faces/event/SystemEventListener" });

classWriter.visitInnerClass("com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "com/sun/faces/application/ApplicationAssociate", "PostConstructApplicationListener", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/application/ApplicationAssociate$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/application/ApplicationAssociate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isListenerForSource", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/faces/application/Application");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Ljavax/faces/event/SystemEvent;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "initializeFacelets", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$100", "(Lcom/sun/faces/application/ApplicationAssociate;)Ljavax/faces/flow/FlowHandler;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("javax.faces.flow.FlowHandlerFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/FactoryFinder", "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/flow/FlowHandlerFactory");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/flow/FlowHandlerFactory", "createFlowHandler", "(Ljavax/faces/context/FacesContext;)Ljavax/faces/flow/FlowHandler;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$102", "(Lcom/sun/faces/application/ApplicationAssociate;Ljavax/faces/flow/FlowHandler;)Ljavax/faces/flow/FlowHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$200", "(Lcom/sun/faces/application/ApplicationAssociate;)Ljavax/faces/component/search/SearchExpressionHandler;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/search/SearchExpressionHandlerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/search/SearchExpressionHandlerImpl", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$202", "(Lcom/sun/faces/application/ApplicationAssociate;Ljavax/faces/component/search/SearchExpressionHandler;)Ljavax/faces/component/search/SearchExpressionHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "isCdiAvailable", "(Ljavax/faces/context/FacesContext;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/JavaFlowLoaderHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/JavaFlowLoaderHelper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "this$0", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$100", "(Lcom/sun/faces/application/ApplicationAssociate;)Ljavax/faces/flow/FlowHandler;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/JavaFlowLoaderHelper", "loadFlows", "(Ljavax/faces/context/FacesContext;Ljavax/faces/flow/FlowHandler;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "javax/faces/event/SystemEvent", "javax/faces/context/FacesContext"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "access$300", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getViewHandler", "()Ljavax/faces/application/ViewHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("com.sun.faces.xhtml");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/ViewHandler", "getViewDeclarationLanguage", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/view/ViewDeclarationLanguage;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "getFacesConfigXmlVersion", "(Ljavax/faces/context/FacesContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/ExternalContext", "getApplicationMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("com.sun.faces.facesConfigVersion");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;Lcom/sun/faces/application/ApplicationAssociate$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationAssociate$PostConstructApplicationListener", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
