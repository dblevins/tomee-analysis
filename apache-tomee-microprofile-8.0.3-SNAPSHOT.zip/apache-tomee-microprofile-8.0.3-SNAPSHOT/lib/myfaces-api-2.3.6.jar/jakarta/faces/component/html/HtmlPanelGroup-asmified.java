package asm.jakarta.faces.component.html;
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
public class HtmlPanelGroupDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/faces/component/html/HtmlPanelGroup", null, "jakarta/faces/component/UIPanel", new String[] { "jakarta/faces/component/behavior/ClientBehaviorHolder" });

classWriter.visitInnerClass("jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "jakarta/faces/component/html/HtmlPanelGroup", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_FAMILY", "Ljava/lang/String;", null, "jakarta.faces.Panel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_TYPE", "Ljava/lang/String;", null, "jakarta.faces.HtmlPanelGroup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLIENT_EVENTS_LIST", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIPanel", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.faces.Group");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "setRendererType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFamily", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.faces.Panel");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventNames", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addClientBehavior", "(Ljava/lang/String;Ljakarta/faces/component/behavior/ClientBehavior;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIPanel", "addClientBehavior", "(Ljava/lang/String;Ljakarta/faces/component/behavior/ClientBehavior;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonEventConstants", "markEvent", "(Ljakarta/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLayout", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "layout", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLayout", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "layout", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStyle", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyleClass", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStyleClass", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnclick", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8192L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOndblclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOndblclick", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16384L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeydown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeydown", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2097152L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeypress", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeypress", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1048576L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeyup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeyup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4194304L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousedown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmousedown", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(32768L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousemove", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmousemove", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(262144L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseout", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseout", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(524288L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseover", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseover", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(131072L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlPanelGroup", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlPanelGroup$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlPanelGroup$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(65536L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValueBinding", "(Ljava/lang/String;Ljakarta/faces/el/ValueBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIPanel", "setValueBinding", "(Ljava/lang/String;Ljakarta/faces/el/ValueBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValueExpression", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIPanel", "setValueExpression", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("click");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("dblclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("keydown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("keypress");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("keyup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("mousedown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("mousemove");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("mouseout");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("mouseover");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("mouseup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlPanelGroup", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
