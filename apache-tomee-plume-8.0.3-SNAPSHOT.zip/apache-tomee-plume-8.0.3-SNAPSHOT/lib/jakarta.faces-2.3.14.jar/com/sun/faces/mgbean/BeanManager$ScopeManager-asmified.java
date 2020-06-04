package asm.com.sun.faces.mgbean;
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
public class BeanManager$ScopeManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/mgbean/BeanManager$ScopeManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager", "com/sun/faces/mgbean/BeanManager", "ScopeManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "CustomScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$ApplicationScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "ApplicationScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$SessionScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "SessionScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$ViewScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "ViewScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$RequestScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "RequestScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$NoneScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "NoneScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "ScopeHandler", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/el/ELUtils$Scope", "com/sun/faces/el/ELUtils", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "handlerMap", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap<Ljava/lang/String;Lcom/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "pushToScope", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljavax/faces/context/FacesContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "getScopeHandler", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Lcom/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler", "handle", "(Ljava/lang/String;Ljava/lang/Object;Ljavax/faces/context/FacesContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "isInScope", "(Ljava/lang/String;Ljava/lang/String;Ljavax/faces/context/FacesContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "getScopeHandler", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Lcom/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler", "isInScope", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getFromScope", "(Ljava/lang/String;Ljava/lang/String;Ljavax/faces/context/FacesContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "getScopeHandler", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Lcom/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler", "getFromScope", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getScopeHandler", "(Ljava/lang/String;Ljavax/faces/context/FacesContext;)Lcom/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getELContext", "()Ljavax/el/ELContext;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/el/ExpressionFactory", "createValueExpression", "(Ljavax/el/ELContext;Ljava/lang/String;Ljava/lang/Class;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler", "<init>", "(Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/faces/mgbean/BeanManager$ScopeManager$ScopeHandler"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "REQUEST", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/ELUtils$Scope", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$RequestScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$RequestScopeHandler", "<init>", "(Lcom/sun/faces/mgbean/BeanManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "VIEW", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/ELUtils$Scope", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$ViewScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$ViewScopeHandler", "<init>", "(Lcom/sun/faces/mgbean/BeanManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "SESSION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/ELUtils$Scope", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$SessionScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$SessionScopeHandler", "<init>", "(Lcom/sun/faces/mgbean/BeanManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "APPLICATION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/ELUtils$Scope", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$ApplicationScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$ApplicationScopeHandler", "<init>", "(Lcom/sun/faces/mgbean/BeanManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/mgbean/BeanManager$ScopeManager", "handlerMap", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "NONE", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/el/ELUtils$Scope", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/mgbean/BeanManager$ScopeManager$NoneScopeHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/mgbean/BeanManager$ScopeManager$NoneScopeHandler", "<init>", "(Lcom/sun/faces/mgbean/BeanManager$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
