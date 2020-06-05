package asm.com.sun.faces.renderkit;
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
public class RenderKitUtils$PredefinedPostbackParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "Ljava/lang/Enum<Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "com/sun/faces/renderkit/RenderKitUtils", "PredefinedPostbackParameter", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VIEW_STATE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLIENT_WINDOW_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RENDER_KIT_ID_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEHAVIOR_SOURCE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEHAVIOR_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL_EXECUTE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL_RENDER_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL_RESET_VALUES_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
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
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getExternalContext", "()Ljakarta/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getRequestParameterMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "getName", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "(Ljakarta/faces/context/FacesContext;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/renderkit/RenderKitUtils", "getParameterName", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VIEW_STATE_PARAM");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("jakarta.faces.ViewState");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "VIEW_STATE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLIENT_WINDOW_PARAM");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("jakarta.faces.ClientWindow");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "CLIENT_WINDOW_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RENDER_KIT_ID_PARAM");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jakarta.faces.RenderKitId");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "RENDER_KIT_ID_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEHAVIOR_SOURCE_PARAM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("jakarta.faces.source");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "BEHAVIOR_SOURCE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEHAVIOR_EVENT_PARAM");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jakarta.faces.behavior.event");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "BEHAVIOR_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL_EVENT_PARAM");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("jakarta.faces.partial.event");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL_EXECUTE_PARAM");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("jakarta.faces.partial.execute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_EXECUTE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL_RENDER_PARAM");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("jakarta.faces.partial.render");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_RENDER_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL_RESET_VALUES_PARAM");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("jakarta.faces.partial.resetValues");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_RESET_VALUES_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "VIEW_STATE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "CLIENT_WINDOW_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "RENDER_KIT_ID_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "BEHAVIOR_SOURCE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "BEHAVIOR_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_EVENT_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_EXECUTE_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_RENDER_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "PARTIAL_RESET_VALUES_PARAM", "Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter", "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$PredefinedPostbackParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
