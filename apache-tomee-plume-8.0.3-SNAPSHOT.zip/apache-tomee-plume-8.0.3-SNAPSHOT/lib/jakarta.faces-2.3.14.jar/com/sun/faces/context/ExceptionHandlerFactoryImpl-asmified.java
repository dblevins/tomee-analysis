package asm.com.sun.faces.context;
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
public class ExceptionHandlerFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/context/ExceptionHandlerFactoryImpl", null, "javax/faces/context/ExceptionHandlerFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "associate", "Lcom/sun/faces/application/ApplicationAssociate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/context/ExceptionHandlerFactory", "<init>", "(Ljavax/faces/context/ExceptionHandlerFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionHandler", "()Ljavax/faces/context/ExceptionHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "getAssociate", "(Ljavax/faces/context/FacesContext;)Lcom/sun/faces/application/ApplicationAssociate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/AjaxNoAjaxExceptionHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/AjaxExceptionHandlerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExceptionHandlerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExceptionHandlerImpl", "<init>", "(Z)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/AjaxExceptionHandlerImpl", "<init>", "(Ljavax/faces/context/ExceptionHandler;)V", false);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExceptionHandlerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ApplicationAssociate", "isErrorPagePresent", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/context/ExceptionHandlerFactoryImpl", "javax/faces/context/FacesContext", "com/sun/faces/application/ApplicationAssociate"}, 5, new Object[] {label0, label0, "com/sun/faces/context/AjaxExceptionHandlerImpl", label1, label1});
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/sun/faces/context/ExceptionHandlerFactoryImpl", "javax/faces/context/FacesContext", "com/sun/faces/application/ApplicationAssociate"}, 6, new Object[] {label0, label0, "com/sun/faces/context/AjaxExceptionHandlerImpl", label1, label1, Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExceptionHandlerImpl", "<init>", "(Z)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/AjaxNoAjaxExceptionHandler", "<init>", "(Lcom/sun/faces/context/AjaxExceptionHandlerImpl;Lcom/sun/faces/context/ExceptionHandlerImpl;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAssociate", "(Ljavax/faces/context/FacesContext;)Lcom/sun/faces/application/ApplicationAssociate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "getCurrentInstance", "()Lcom/sun/faces/application/ApplicationAssociate;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ApplicationAssociate", "getInstance", "(Ljavax/faces/context/ExternalContext;)Lcom/sun/faces/application/ApplicationAssociate;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/context/ExceptionHandlerFactoryImpl", "associate", "Lcom/sun/faces/application/ApplicationAssociate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
