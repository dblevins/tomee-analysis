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
public class HtmlOutputLinkDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/faces/component/html/HtmlOutputLink", null, "jakarta/faces/component/UIOutput", new String[] { "jakarta/faces/component/behavior/ClientBehaviorHolder" });

classWriter.visitInnerClass("jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "jakarta/faces/component/html/HtmlOutputLink", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_FAMILY", "Ljava/lang/String;", null, "jakarta.faces.Output");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_TYPE", "Ljava/lang/String;", null, "jakarta.faces.HtmlOutputLink");
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIOutput", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("jakarta.faces.Link");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "setRendererType", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFamily", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventNames", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIOutput", "addClientBehavior", "(Ljava/lang/String;Ljakarta/faces/component/behavior/ClientBehavior;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonEventConstants", "markEvent", "(Ljakarta/faces/component/UIComponent;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFragment", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "fragment", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFragment", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "fragment", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAccesskey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "accesskey", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAccesskey", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "accesskey", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(512L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCharset", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "charset", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCharset", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "charset", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(67108864L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCoords", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "coords", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCoords", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "coords", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(134217728L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHreflang", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "hreflang", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHreflang", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "hreflang", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(268435456L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRel", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "rel", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "rel", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(536870912L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRev", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "rev", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRev", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "rev", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(1073741824L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getShape", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "shape", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setShape", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "shape", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(2147483648L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTarget", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "target", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTarget", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "target", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4294967296L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "type", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setType", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "type", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8589934592L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDisabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "disabled", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "disabled", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(64L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnclick", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRole", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRole", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(549755813888L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDir", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDir", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLang", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLang", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTitle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTitle", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnblur", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onblur", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnblur", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onblur", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(16777216L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOnfocus", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onfocus", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOnfocus", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "onfocus", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(8388608L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/html/_CommonPropertyConstants", "markProperty", "(Ljakarta/faces/component/UIComponent;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTabindex", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "tabindex", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "eval", "(Ljava/io/Serializable;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTabindex", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/html/HtmlOutputLink", "getStateHelper", "()Ljakarta/faces/component/StateHelper;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlOutputLink$PropertyKeys", "tabindex", "Ljakarta/faces/component/html/HtmlOutputLink$PropertyKeys;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/StateHelper", "put", "(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(17179869184L));
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIOutput", "setValueBinding", "(Ljava/lang/String;Ljakarta/faces/el/ValueBinding;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIOutput", "setValueExpression", "(Ljava/lang/String;Ljakarta/el/ValueExpression;)V", false);
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
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("blur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("focus");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlOutputLink", "CLIENT_EVENTS_LIST", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
