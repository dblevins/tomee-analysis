package asm.com.sun.faces.util;
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
public class FacesLoggerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/util/FacesLogger", "Ljava/lang/Enum<Lcom/sun/faces/util/FacesLogger;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION_VIEW", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESOURCE", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONFIG", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONTEXT", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_COMPILER", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_COMPONENT", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_EL", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_META", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_COMPOSITION", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_DECORATE", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_INCLUDE", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_FACELET", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACELETS_FACTORY", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLOW", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIFECYCLE", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANAGEDBEAN", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RENDERKIT", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TAGLIB", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMING", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTIL", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLASH", "Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER_RESOURCES", "Ljava/lang/String;", null, "com.sun.faces.LogStrings");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_LOGGER_NAME_PREFIX", "Ljava/lang/String;", null, "javax.enterprise.resource.webcontainer.jsf.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loggerName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/util/FacesLogger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/util/FacesLogger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "$VALUES", "[Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/util/FacesLogger;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/util/FacesLogger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/util/FacesLogger;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("javax.enterprise.resource.webcontainer.jsf.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/util/FacesLogger", "loggerName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoggerName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/util/FacesLogger", "loggerName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResourcesName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("com.sun.faces.LogStrings");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogger", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/util/FacesLogger", "loggerName", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("com.sun.faces.LogStrings");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "interpolateMessage", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/util/MissingResourceException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getViewRoot", "()Ljakarta/faces/component/UIViewRoot;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "getCurrentLoader", "(Ljava/lang/Object;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"com/sun/faces/util/FacesLogger", "jakarta/faces/context/FacesContext", "java/lang/String", "[Ljava/lang/Object;", "java/lang/String", "java/util/ResourceBundle", "jakarta/faces/component/UIViewRoot", Opcodes.TOP, "java/lang/ClassLoader"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIViewRoot", "getLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"com/sun/faces/util/FacesLogger", "jakarta/faces/context/FacesContext", "java/lang/String", "[Ljava/lang/Object;", "java/lang/String", "java/util/ResourceBundle", "jakarta/faces/component/UIViewRoot", "java/util/Locale", "java/lang/ClassLoader"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getResourcesName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/ClassLoader;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/MissingResourceException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("application");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION_VIEW");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("application.view");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION_VIEW", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESOURCE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("resource");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "RESOURCE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONFIG");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("config");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "CONFIG", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTEXT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("context");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "CONTEXT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_COMPILER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("facelets.compiler");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPILER", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_COMPONENT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("facelets.tag.component");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPONENT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_EL");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("facelets.el");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_EL", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_META");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("facelets.tag.meta");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_META", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_COMPOSITION");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("facelets.tag.ui.composition");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPOSITION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_DECORATE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("facelets.tag.ui.decorate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_DECORATE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_INCLUDE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("facelets.tag.ui.include");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_INCLUDE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_FACELET");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("faclets.facelet");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_FACELET", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACELETS_FACTORY");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("facelets.factory");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_FACTORY", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLOW");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("flow");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FLOW", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIFECYCLE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("lifecycle");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "LIFECYCLE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANAGEDBEAN");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("managedbean");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "MANAGEDBEAN", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RENDERKIT");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("renderkit");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "RENDERKIT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TAGLIB");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("taglib");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "TAGLIB", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMING");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("timing");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "TIMING", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTIL");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("util");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "UTIL", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLASH");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("flash");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/util/FacesLogger", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "FLASH", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/util/FacesLogger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION_VIEW", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "RESOURCE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "CONFIG", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "CONTEXT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPILER", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPONENT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_EL", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_META", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_COMPOSITION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_DECORATE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_INCLUDE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_FACELET", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FACELETS_FACTORY", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FLOW", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "LIFECYCLE", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "MANAGEDBEAN", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "RENDERKIT", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "TAGLIB", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "TIMING", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "UTIL", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "FLASH", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/util/FacesLogger", "$VALUES", "[Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
