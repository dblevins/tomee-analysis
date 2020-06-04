package asm.com.sun.faces.lifecycle;
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
public class ClientWindowFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", null, "javax/faces/lifecycle/ClientWindowFactory", null);

classWriter.visitInnerClass("com/sun/faces/lifecycle/ClientWindowFactoryImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("com/sun/faces/lifecycle/ClientWindowFactoryImpl$PostConstructApplicationListener", "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "PostConstructApplicationListener", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/config/WebConfiguration$WebContextInitParameter", "com/sun/faces/config/WebConfiguration", "WebContextInitParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isClientWindowEnabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "config", "Lcom/sun/faces/config/WebConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/lifecycle/ClientWindowFactory", "<init>", "(Ljavax/faces/lifecycle/ClientWindowFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "isClientWindowEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "config", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getApplication", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/event/PostConstructApplicationEvent;"));
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/application/Application;"));
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/lifecycle/ClientWindowFactoryImpl$PostConstructApplicationListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/lifecycle/ClientWindowFactoryImpl$PostConstructApplicationListener", "<init>", "(Lcom/sun/faces/lifecycle/ClientWindowFactoryImpl;Lcom/sun/faces/lifecycle/ClientWindowFactoryImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "subscribeToEvent", "(Ljava/lang/Class;Ljava/lang/Class;Ljavax/faces/event/SystemEventListener;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/lifecycle/ClientWindowFactory", "<init>", "(Ljavax/faces/lifecycle/ClientWindowFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "isClientWindowEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "config", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "isClientWindowEnabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "postConstructApplicationInitialization", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/context/FacesContext", "getCurrentInstance", "()Ljavax/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/context/FacesContext", "getExternalContext", "()Ljavax/faces/context/ExternalContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/config/WebConfiguration", "getInstance", "(Ljavax/faces/context/ExternalContext;)Lcom/sun/faces/config/WebConfiguration;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "config", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "config", "Lcom/sun/faces/config/WebConfiguration;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/config/WebConfiguration$WebContextInitParameter", "ClientWindowMode", "Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/config/WebConfiguration", "getOptionValue", "(Lcom/sun/faces/config/WebConfiguration$WebContextInitParameter;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitLdcInsn("url");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/faces/lifecycle/ClientWindowFactoryImpl", "javax/faces/context/FacesContext", "javax/faces/context/ExternalContext", "java/lang/String"}, 1, new Object[] {"com/sun/faces/lifecycle/ClientWindowFactoryImpl"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/faces/lifecycle/ClientWindowFactoryImpl", "javax/faces/context/FacesContext", "javax/faces/context/ExternalContext", "java/lang/String"}, 2, new Object[] {"com/sun/faces/lifecycle/ClientWindowFactoryImpl", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "isClientWindowEnabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientWindow", "(Ljavax/faces/context/FacesContext;)Ljavax/faces/lifecycle/ClientWindow;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "isClientWindowEnabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/lifecycle/ClientWindowImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/lifecycle/ClientWindowImpl", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/faces/lifecycle/ClientWindowFactoryImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/lifecycle/ClientWindowFactoryImpl", "postConstructApplicationInitialization", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
