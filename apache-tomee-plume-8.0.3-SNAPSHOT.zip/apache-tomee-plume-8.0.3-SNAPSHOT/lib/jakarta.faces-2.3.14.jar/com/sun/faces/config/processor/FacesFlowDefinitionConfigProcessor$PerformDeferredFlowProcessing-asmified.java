package asm.com.sun.faces.config.processor;
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
public class FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", null, "java/lang/Object", new String[] { "javax/faces/event/SystemEventListener" });

classWriter.visitInnerClass("com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor", "PerformDeferredFlowProcessing", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$FlowDefinitionDocument", "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor", "FlowDefinitionDocument", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "this$0", "Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Ljavax/faces/event/SystemEvent;)V", null, new String[] { "javax/faces/event/AbortProcessingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/xpath/XPathExpressionException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/event/SystemEvent", "getFacesContext", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "this$0", "Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor", "access$100", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;Ljavax/faces/context/FacesContext;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/faces/context/FacesContext", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$FlowDefinitionDocument");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "this$0", "Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$FlowDefinitionDocument", "definingDocumentURI", "Ljava/net/URI;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$FlowDefinitionDocument", "flowDefinitions", "Lorg/w3c/dom/Document;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor", "access$200", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;Ljavax/faces/context/FacesContext;Ljava/net/URI;Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "javax/faces/event/SystemEvent", "javax/faces/context/FacesContext", "java/util/Iterator", "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$FlowDefinitionDocument"}, 1, new Object[] {"javax/xml/xpath/XPathExpressionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/FacesException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "this$0", "Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor", "access$300", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;Ljavax/faces/context/FacesContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor$PerformDeferredFlowProcessing", "<init>", "(Lcom/sun/faces/config/processor/FacesFlowDefinitionConfigProcessor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
