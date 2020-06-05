package asm.com.sun.faces.facelets.tag.jsf.html;
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
public class HtmlLibraryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", null, "com/sun/faces/facelets/tag/jsf/html/AbstractHtmlLibrary", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Namespace", "Ljava/lang/String;", null, "http://java.sun.com/jsf/html");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLNSNamespace", "Ljava/lang/String;", null, "http://xmlns.jcp.org/jsf/html");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Instance", "Lcom/sun/faces/facelets/tag/jsf/html/HtmlLibrary;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://java.sun.com/jsf/html");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/html/AbstractHtmlLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("body");
methodVisitor.visitLdcInsn("jakarta.faces.OutputBody");
methodVisitor.visitLdcInsn("jakarta.faces.Body");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("button");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutcomeTargetButton");
methodVisitor.visitLdcInsn("jakarta.faces.Button");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("column");
methodVisitor.visitLdcInsn("jakarta.faces.Column");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("commandButton");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlCommandButton");
methodVisitor.visitLdcInsn("jakarta.faces.Button");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("commandLink");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlCommandLink");
methodVisitor.visitLdcInsn("jakarta.faces.Link");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("commandScript");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlCommandScript");
methodVisitor.visitLdcInsn("jakarta.faces.Script");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("dataTable");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlDataTable");
methodVisitor.visitLdcInsn("jakarta.faces.Table");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("form");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlForm");
methodVisitor.visitLdcInsn("jakarta.faces.Form");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("graphicImage");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlGraphicImage");
methodVisitor.visitLdcInsn("jakarta.faces.Image");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("head");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.Head");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("html");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.Html");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("doctype");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.Doctype");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("inputFile");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlInputFile");
methodVisitor.visitLdcInsn("jakarta.faces.File");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("inputHidden");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlInputHidden");
methodVisitor.visitLdcInsn("jakarta.faces.Hidden");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("inputSecret");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlInputSecret");
methodVisitor.visitLdcInsn("jakarta.faces.Secret");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("inputText");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlInputText");
methodVisitor.visitLdcInsn("jakarta.faces.Text");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("inputTextarea");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlInputTextarea");
methodVisitor.visitLdcInsn("jakarta.faces.Textarea");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("link");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutcomeTargetLink");
methodVisitor.visitLdcInsn("jakarta.faces.Link");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("message");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlMessage");
methodVisitor.visitLdcInsn("jakarta.faces.Message");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messages");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlMessages");
methodVisitor.visitLdcInsn("jakarta.faces.Messages");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputFormat");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutputFormat");
methodVisitor.visitLdcInsn("jakarta.faces.Format");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputLabel");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutputLabel");
methodVisitor.visitLdcInsn("jakarta.faces.Label");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputLink");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutputLink");
methodVisitor.visitLdcInsn("jakarta.faces.Link");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputText");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlOutputText");
methodVisitor.visitLdcInsn("jakarta.faces.Text");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputScript");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.resource.Script");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jsf/html/ScriptResourceHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("outputStylesheet");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.resource.Stylesheet");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jsf/html/StylesheetResourceHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("panelGrid");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlPanelGrid");
methodVisitor.visitLdcInsn("jakarta.faces.Grid");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("panelGroup");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlPanelGroup");
methodVisitor.visitLdcInsn("jakarta.faces.Group");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectBooleanCheckbox");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectBooleanCheckbox");
methodVisitor.visitLdcInsn("jakarta.faces.Checkbox");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectManyCheckbox");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectManyCheckbox");
methodVisitor.visitLdcInsn("jakarta.faces.Checkbox");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectManyListbox");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectManyListbox");
methodVisitor.visitLdcInsn("jakarta.faces.Listbox");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectManyMenu");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectManyMenu");
methodVisitor.visitLdcInsn("jakarta.faces.Menu");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectOneListbox");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectOneListbox");
methodVisitor.visitLdcInsn("jakarta.faces.Listbox");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectOneMenu");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectOneMenu");
methodVisitor.visitLdcInsn("jakarta.faces.Menu");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("selectOneRadio");
methodVisitor.visitLdcInsn("jakarta.faces.HtmlSelectOneRadio");
methodVisitor.visitLdcInsn("jakarta.faces.Radio");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitLdcInsn("jakarta.faces.Output");
methodVisitor.visitLdcInsn("jakarta.faces.Title");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "addHtmlComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/jsf/html/HtmlLibrary", "Instance", "Lcom/sun/faces/facelets/tag/jsf/html/HtmlLibrary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}