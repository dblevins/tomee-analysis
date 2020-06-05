package asm.jakarta.faces.application;
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
public class ViewHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/faces/application/ViewHandler", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_ENCODING_KEY", "Ljava/lang/String;", null, "jakarta.faces.request.charset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_SUFFIX_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.DEFAULT_SUFFIX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_SUFFIX", "Ljava/lang/String;", null, ".xhtml .view.xml .jsp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_SKIP_COMMENTS_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_SKIP_COMMENTS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_SUFFIX_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_SUFFIX");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_FACELETS_SUFFIX", "Ljava/lang/String;", null, ".xhtml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_VIEW_MAPPINGS_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_VIEW_MAPPINGS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_BUFFER_SIZE_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_BUFFER_SIZE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_REFRESH_PERIOD_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_REFRESH_PERIOD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_LIBRARIES_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_LIBRARIES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACELETS_DECORATORS_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.FACELETS_DECORATORS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISABLE_FACELET_JSF_VIEWHANDLER_PARAM_NAME", "Ljava/lang/String;", null, "jakarta.faces.DISABLE_FACELET_JSF_VIEWHANDLER");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initView", "(Ljakarta/faces/context/FacesContext;)V", null, new String[] { "jakarta/faces/FacesException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getExternalContext", "()Ljakarta/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getRequestCharacterEncoding", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ViewHandler", "calculateCharacterEncoding", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getExternalContext", "()Ljakarta/faces/context/ExternalContext;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "setRequestCharacterEncoding", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Can't set encoding to: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" Exception:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/UnsupportedEncodingException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/application/ViewHandler", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/application/ViewHandler", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/io/UnsupportedEncodingException", "java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restoreView", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createView", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "renderView", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIViewRoot;)V", null, new String[] { "java/io/IOException", "jakarta/faces/FacesException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calculateLocale", "(Ljakarta/faces/context/FacesContext;)Ljava/util/Locale;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateCharacterEncoding", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getExternalContext", "()Ljakarta/faces/context/ExternalContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getRequestHeaderMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Content-Type");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("charset=");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"jakarta/faces/application/ViewHandler", "jakarta/faces/context/FacesContext", "jakarta/faces/context/ExternalContext", "java/util/Map", "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getSession", "(Z)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getSessionMap", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("jakarta.faces.request.charset");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calculateRenderKitId", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deriveViewId", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "deriveLogicalViewId", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getActionURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRedirectURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;Z)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ViewHandler", "getActionURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBookmarkableURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/util/Map;Z)Ljava/lang/String;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;Z)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/ViewHandler", "getActionURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResourceURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getWebsocketURL", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProtectedViewsUnmodifiable", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProtectedView", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeProtectedView", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getViewDeclarationLanguage", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljakarta/faces/view/ViewDeclarationLanguage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;I[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;I[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "empty", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "getViews", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream;", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;[Ljakarta/faces/application/ViewVisitOption;)Ljava/util/stream/Stream<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "empty", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeState", "(Ljakarta/faces/context/FacesContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.faces.application");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/application/ViewHandler", "log", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
