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
public class ApplicationImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/ApplicationImpl", null, "javax/faces/application/Application", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "THIS_LIBRARY", "Ljava/lang/String;", null, "com.sun.faces.composite.this.library");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "associate", "Lcom/sun/faces/application/ApplicationAssociate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "events", "Lcom/sun/faces/application/applicationimpl/Events;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "stage", "Lcom/sun/faces/application/applicationimpl/Stage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/application/Application", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/Stage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/Stage", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "stage", "Lcom/sun/faces/application/applicationimpl/Stage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/Events");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/Events", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "events", "Lcom/sun/faces/application/applicationimpl/Events;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ApplicationAssociate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ApplicationAssociate", "<init>", "(Lcom/sun/faces/application/ApplicationImpl;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/Singletons");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/Singletons", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/ExpressionLanguage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/InstanceFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/applicationimpl/SearchExpression");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/applicationimpl/SearchExpression", "<init>", "(Lcom/sun/faces/application/ApplicationAssociate;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ApplicationImpl", "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationImpl", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ApplicationImpl", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Created Application instance ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"com/sun/faces/application/ApplicationImpl"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "publishEvent", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class;Ljava/lang/Object;)V", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "publishEvent", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "publishEvent", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Class<*>;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "events", "Lcom/sun/faces/application/applicationimpl/Events;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getProjectStage", "()Ljavax/faces/application/ProjectStage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Events", "publishEvent", "(Ljavax/faces/context/FacesContext;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;Ljavax/faces/application/ProjectStage;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subscribeToEvent", "(Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljavax/faces/event/SystemEventListener;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Class<*>;Ljavax/faces/event/SystemEventListener;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "events", "Lcom/sun/faces/application/applicationimpl/Events;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Events", "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsubscribeFromEvent", "(Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljavax/faces/event/SystemEventListener;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "unsubscribeFromEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsubscribeFromEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", "(Ljava/lang/Class<+Ljavax/faces/event/SystemEvent;>;Ljava/lang/Class<*>;Ljavax/faces/event/SystemEventListener;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "events", "Lcom/sun/faces/application/applicationimpl/Events;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Events", "unsubscribeFromEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addELContextListener", "(Ljavax/el/ELContextListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "addELContextListener", "(Ljavax/el/ELContextListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeELContextListener", "(Ljavax/el/ELContextListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "removeELContextListener", "(Ljavax/el/ELContextListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELContextListeners", "()[Ljavax/el/ELContextListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getELContextListeners", "()[Ljavax/el/ELContextListener;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluateExpressionGet", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Class<+TT;>;)TT;", new String[] { "javax/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "evaluateExpressionGet", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljavax/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getELResolver", "()Ljavax/el/ELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addELResolver", "(Ljavax/el/ELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "addELResolver", "(Ljavax/el/ELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getApplicationELResolvers", "()Ljavax/el/CompositeELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getApplicationELResolvers", "()Ljavax/el/CompositeELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompositeELResolver", "()Lcom/sun/faces/el/FacesCompositeELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getCompositeELResolver", "()Lcom/sun/faces/el/FacesCompositeELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCompositeELResolver", "(Lcom/sun/faces/el/FacesCompositeELResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "setCompositeELResolver", "(Lcom/sun/faces/el/FacesCompositeELResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewHandler", "()Ljavax/faces/application/ViewHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getViewHandler", "()Ljavax/faces/application/ViewHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setViewHandler", "(Ljavax/faces/application/ViewHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setViewHandler", "(Ljavax/faces/application/ViewHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceHandler", "()Ljavax/faces/application/ResourceHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getResourceHandler", "()Ljavax/faces/application/ResourceHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResourceHandler", "(Ljavax/faces/application/ResourceHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setResourceHandler", "(Ljavax/faces/application/ResourceHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStateManager", "()Ljavax/faces/application/StateManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getStateManager", "()Ljavax/faces/application/StateManager;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStateManager", "(Ljavax/faces/application/StateManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setStateManager", "(Ljavax/faces/application/StateManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getActionListener", "()Ljavax/faces/event/ActionListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getActionListener", "()Ljavax/faces/event/ActionListener;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setActionListener", "(Ljavax/faces/event/ActionListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setActionListener", "(Ljavax/faces/event/ActionListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNavigationHandler", "()Ljavax/faces/application/NavigationHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getNavigationHandler", "()Ljavax/faces/application/NavigationHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNavigationHandler", "(Ljavax/faces/application/NavigationHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setNavigationHandler", "(Ljavax/faces/application/NavigationHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlowHandler", "()Ljavax/faces/flow/FlowHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getFlowHandler", "()Ljavax/faces/flow/FlowHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlowHandler", "(Ljavax/faces/flow/FlowHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setFlowHandler", "(Ljavax/faces/flow/FlowHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSupportedLocales", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Locale;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getSupportedLocales", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSupportedLocales", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/util/Locale;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setSupportedLocales", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getDefaultLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultLocale", "(Ljava/util/Locale;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setDefaultLocale", "(Ljava/util/Locale;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMessageBundle", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setMessageBundle", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageBundle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getMessageBundle", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultRenderKitId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getDefaultRenderKitId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDefaultRenderKitId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "setDefaultRenderKitId", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourceBundle", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/ResourceBundle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "singletons", "Lcom/sun/faces/application/applicationimpl/Singletons;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Singletons", "getResourceBundle", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBehavior", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addBehavior", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBehavior", "(Ljava/lang/String;)Ljavax/faces/component/behavior/Behavior;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createBehavior", "(Ljava/lang/String;)Ljavax/faces/component/behavior/Behavior;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBehaviorIds", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getBehaviorIds", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljava/lang/String;)Ljavax/faces/component/UIComponent;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljava/lang/String;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addComponent", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addComponent", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/el/ValueExpression;Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljavax/el/ValueExpression;Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/el/ValueExpression;Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljavax/el/ValueExpression;Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;)Ljavax/faces/component/UIComponent;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationImpl", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljavax/faces/context/FacesContext;Ljavax/faces/application/Resource;Ljavax/el/ExpressionFactory;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComponent", "(Ljavax/faces/el/ValueBinding;Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", null, new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createComponent", "(Ljavax/faces/el/ValueBinding;Ljavax/faces/context/FacesContext;Ljava/lang/String;)Ljavax/faces/component/UIComponent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getComponentTypes", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getComponentTypes", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConverter", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addConverter", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConverter", "(Ljava/lang/Class;Ljava/lang/String;)V", "(Ljava/lang/Class<*>;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addConverter", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConverter", "(Ljava/lang/String;)Ljavax/faces/convert/Converter;", "(Ljava/lang/String;)Ljavax/faces/convert/Converter<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createConverter", "(Ljava/lang/String;)Ljavax/faces/convert/Converter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConverter", "(Ljava/lang/Class;)Ljavax/faces/convert/Converter;", "(Ljava/lang/Class<*>;)Ljavax/faces/convert/Converter<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createConverter", "(Ljava/lang/Class;)Ljavax/faces/convert/Converter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConverterIds", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getConverterIds", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConverterTypes", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getConverterTypes", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addValidator", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addValidator", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createValidator", "(Ljava/lang/String;)Ljavax/faces/validator/Validator;", "(Ljava/lang/String;)Ljavax/faces/validator/Validator<*>;", new String[] { "javax/faces/FacesException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "createValidator", "(Ljava/lang/String;)Ljavax/faces/validator/Validator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidatorIds", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getValidatorIds", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDefaultValidatorId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "addDefaultValidatorId", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultValidatorInfo", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "instanceFactory", "Lcom/sun/faces/application/applicationimpl/InstanceFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/InstanceFactory", "getDefaultValidatorInfo", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProjectStage", "()Ljavax/faces/application/ProjectStage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "stage", "Lcom/sun/faces/application/applicationimpl/Stage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/Stage", "getProjectStage", "(Ljavax/faces/application/Application;)Ljavax/faces/application/ProjectStage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchExpressionHandler", "()Ljavax/faces/component/search/SearchExpressionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/SearchExpression", "getSearchExpressionHandler", "()Ljavax/faces/component/search/SearchExpressionHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSearchExpressionHandler", "(Ljavax/faces/component/search/SearchExpressionHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/SearchExpression", "setSearchExpressionHandler", "(Ljavax/faces/component/search/SearchExpressionHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSearchKeywordResolver", "(Ljavax/faces/component/search/SearchKeywordResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/SearchExpression", "addSearchKeywordResolver", "(Ljavax/faces/component/search/SearchKeywordResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchKeywordResolver", "()Ljavax/faces/component/search/SearchKeywordResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "searchExpression", "Lcom/sun/faces/application/applicationimpl/SearchExpression;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/SearchExpression", "getSearchKeywordResolver", "()Ljavax/faces/component/search/SearchKeywordResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getPropertyResolver", "()Ljavax/faces/el/PropertyResolver;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getPropertyResolver", "()Ljavax/faces/el/PropertyResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "setPropertyResolver", "(Ljavax/faces/el/PropertyResolver;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "setPropertyResolver", "(Ljavax/faces/el/PropertyResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "createMethodBinding", "(Ljava/lang/String;[Ljava/lang/Class;)Ljavax/faces/el/MethodBinding;", "(Ljava/lang/String;[Ljava/lang/Class<*>;)Ljavax/faces/el/MethodBinding;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "createMethodBinding", "(Ljava/lang/String;[Ljava/lang/Class;)Ljavax/faces/el/MethodBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "createValueBinding", "(Ljava/lang/String;)Ljavax/faces/el/ValueBinding;", null, new String[] { "javax/faces/el/ReferenceSyntaxException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "createValueBinding", "(Ljava/lang/String;)Ljavax/faces/el/ValueBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getVariableResolver", "()Ljavax/faces/el/VariableResolver;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "getVariableResolver", "()Ljavax/faces/el/VariableResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "setVariableResolver", "(Ljavax/faces/el/VariableResolver;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ApplicationImpl", "expressionLanguage", "Lcom/sun/faces/application/applicationimpl/ExpressionLanguage;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/applicationimpl/ExpressionLanguage", "setVariableResolver", "(Ljavax/faces/el/VariableResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ApplicationImpl", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
