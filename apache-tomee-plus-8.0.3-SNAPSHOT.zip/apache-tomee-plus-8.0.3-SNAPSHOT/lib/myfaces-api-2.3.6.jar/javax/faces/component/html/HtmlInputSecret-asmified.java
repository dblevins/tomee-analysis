package asm.javax.faces.component.html;
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
public class HtmlInputSecretDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/faces/component/html/HtmlInputSecret", null, "javax/faces/component/UIInput", new String[] { "javax/faces/component/behavior/ClientBehaviorHolder" });

classWriter.visitInnerClass("javax/faces/component/html/HtmlInputSecret$PropertyKeys", "javax/faces/component/html/HtmlInputSecret", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_FAMILY", "Ljava/lang/String;", null, "javax.faces.Input");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_TYPE", "Ljava/lang/String;", null, "javax.faces.HtmlInputSecret");
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.faces.Secret");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "setRendererType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFamily", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("javax.faces.Input");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventNames", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addClientBehavior", "(Ljava/lang/String;Ljavax/faces/component/behavior/ClientBehavior;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput", "addClientBehavior", "(Ljava/lang/String;Ljavax/faces/component/behavior/ClientBehavior;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonEventConstants", "markEvent", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultEventName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("valueChange");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxlength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "maxlength", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxlength", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "maxlength", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(137438953472L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRedisplay", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "redisplay", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRedisplay", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "redisplay", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "size", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "size", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(274877906944L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutocomplete", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "autocomplete", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutocomplete", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "autocomplete", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAccesskey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAccesskey", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(512L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnselect", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onselect", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnselect", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onselect", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4096L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnclick", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8192L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOndblclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOndblclick", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16384L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeydown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeydown", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2097152L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeypress", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeypress", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1048576L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeyup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnkeyup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4194304L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousedown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmousedown", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(32768L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousemove", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmousemove", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(262144L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseout", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseout", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(524288L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseover", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseover", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(131072L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnmouseup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(65536L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStyle", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyleClass", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setStyleClass", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDisabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "disabled", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDisabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "disabled", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(64L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReadonly", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "readonly", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadonly", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "readonly", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(256L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRole", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRole", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(549755813888L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLabel", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "label", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLabel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "label", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(33554432L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlt", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "alt", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAlt", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "alt", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1024L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDir", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDir", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLang", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLang", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTitle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTitle", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnblur", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnblur", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16777216L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnfocus", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnfocus", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8388608L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTabindex", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTabindex", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(17179869184L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnchange", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onchange", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnchange", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlInputSecret", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlInputSecret$PropertyKeys", "onchange", "Ljavax/faces/component/html/HtmlInputSecret$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2048L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValueBinding", "(Ljava/lang/String;Ljavax/faces/el/ValueBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput", "setValueBinding", "(Ljava/lang/String;Ljavax/faces/el/ValueBinding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValueExpression", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput", "setValueExpression", "(Ljava/lang/String;Ljavax/el/ValueExpression;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljavax/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("select");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("click");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("dblclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("keydown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("keypress");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("keyup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("mousedown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("mousemove");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("mouseout");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("mouseover");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("mouseup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("blur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("focus");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("change");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("valueChange");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlInputSecret", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
