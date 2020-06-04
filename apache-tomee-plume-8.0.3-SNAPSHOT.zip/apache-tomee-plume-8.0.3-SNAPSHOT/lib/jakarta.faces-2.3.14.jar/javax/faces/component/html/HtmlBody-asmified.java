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
public class HtmlBodyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/faces/component/html/HtmlBody", null, "javax/faces/component/UIOutput", new String[] { "javax/faces/component/behavior/ClientBehaviorHolder" });

classWriter.visitInnerClass("javax/faces/component/html/HtmlBody$PropertyKeys", "javax/faces/component/html/HtmlBody", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "OPTIMIZED_PACKAGE", "Ljava/lang/String;", null, "javax.faces.component.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_TYPE", "Ljava/lang/String;", null, "javax.faces.OutputBody");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EVENT_NAMES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIOutput", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.faces.Body");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "setRendererType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDir", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLang", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOndblclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeydown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeypress", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnkeyup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnload", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onload", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnload", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onload", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onload");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousedown", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmousemove", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseout", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseover", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnmouseup", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnunload", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onunload", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnunload", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "onunload", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("onunload");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRole", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyleClass", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTitle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlns", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "xmlns", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlns", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getStateHelper", "()Ljavax/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody$PropertyKeys", "xmlns", "Ljavax/faces/component/html/HtmlBody$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlBody", "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventNames", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlBody", "EVENT_NAMES", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultEventName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "handleAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("javax.faces.component.UIComponentBase.attributesThatAreSet");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("javax.faces.component.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("javax.faces.component.UIComponentBase.attributesThatAreSet");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/component/html/HtmlBody", "getValueExpression", "(Ljava/lang/String;)Ljavax/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 12);
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
methodVisitor.visitLdcInsn("load");
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
methodVisitor.visitLdcInsn("unload");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlBody", "EVENT_NAMES", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
