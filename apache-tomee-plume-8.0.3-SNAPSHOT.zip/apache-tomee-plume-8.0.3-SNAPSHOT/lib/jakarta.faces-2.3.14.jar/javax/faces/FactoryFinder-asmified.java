package asm.javax.faces;
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
public class FactoryFinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "javax/faces/FactoryFinder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION_FACTORY", "Ljava/lang/String;", null, "javax.faces.application.ApplicationFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_WINDOW_FACTORY", "Ljava/lang/String;", null, "javax.faces.lifecycle.ClientWindowFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPTION_HANDLER_FACTORY", "Ljava/lang/String;", null, "javax.faces.context.ExceptionHandlerFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXTERNAL_CONTEXT_FACTORY", "Ljava/lang/String;", null, "javax.faces.context.ExternalContextFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_CONTEXT_FACTORY", "Ljava/lang/String;", null, "javax.faces.context.FacesContextFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELET_CACHE_FACTORY", "Ljava/lang/String;", null, "javax.faces.view.facelets.FaceletCacheFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLASH_FACTORY", "Ljava/lang/String;", null, "javax.faces.context.FlashFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOW_HANDLER_FACTORY", "Ljava/lang/String;", null, "javax.faces.flow.FlowHandlerFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTIAL_VIEW_CONTEXT_FACTORY", "Ljava/lang/String;", null, "javax.faces.context.PartialViewContextFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VISIT_CONTEXT_FACTORY", "Ljava/lang/String;", null, "javax.faces.component.visit.VisitContextFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIFECYCLE_FACTORY", "Ljava/lang/String;", null, "javax.faces.lifecycle.LifecycleFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RENDER_KIT_FACTORY", "Ljava/lang/String;", null, "javax.faces.render.RenderKitFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VIEW_DECLARATION_LANGUAGE_FACTORY", "Ljava/lang/String;", null, "javax.faces.view.ViewDeclarationLanguageFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_HANDLER_DELEGATE_FACTORY", "Ljava/lang/String;", null, "javax.faces.view.facelets.TagHandlerDelegateFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEARCH_EXPRESSION_CONTEXT_FACTORY", "Ljava/lang/String;", null, "javax.faces.component.search.SearchExpressionContextFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("com.sun.faces.ServletContextFacesContextFactory");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "getFactoryFinder", "(Z)Ljavax/faces/FactoryFinderInstance;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "getFactoryFinder", "()Ljavax/faces/FactoryFinderInstance;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/faces/FactoryFinderInstance"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/FactoryFinderInstance", "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setFactory", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "getFactoryFinder", "()Ljavax/faces/FactoryFinderInstance;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/FactoryFinderInstance", "addFactory", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "releaseFactories", "()V", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/CurrentThreadToServletContext", "factoryFinderMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "getFactoryFinder", "()Ljavax/faces/FactoryFinderInstance;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/FactoryFinderInstance", "releaseFactories", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "removeFactoryFinder", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "reInitializeFactoryManager", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/CurrentThreadToServletContext", "resetSpecialInitializationCaseFlags", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/faces/CurrentThreadToServletContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/CurrentThreadToServletContext", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/FactoryFinder", "FACTORIES_CACHE", "Ljavax/faces/CurrentThreadToServletContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
