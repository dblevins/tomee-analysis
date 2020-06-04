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
public class AttributeManager$KeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/renderkit/AttributeManager$Key", "Ljava/lang/Enum<Lcom/sun/faces/renderkit/AttributeManager$Key;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/renderkit/AttributeManager$Key", "com/sun/faces/renderkit/AttributeManager", "Key", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMANDBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMANDLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATATABLE", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FORMFORM", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GRAPHICIMAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUTFILE", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUTSECRET", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUTTEXTAREA", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MESSAGEMESSAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MESSAGESMESSAGES", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTCOMETARGETBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTCOMETARGETLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTFORMAT", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTLABEL", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PANELGRID", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PANELGROUP", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTBOOLEANCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTMANYCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTMANYLISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTMANYMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTONELISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTONEMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SELECTONERADIO", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTBODY", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTDOCTYPE", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUTPUTHEAD", "Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "key", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "$VALUES", "[Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/renderkit/AttributeManager$Key;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/renderkit/AttributeManager$Key;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/renderkit/AttributeManager$Key;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/renderkit/AttributeManager$Key");
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
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/renderkit/AttributeManager$Key", "key", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/AttributeManager$Key", "key", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMANDBUTTON");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("CommandButton");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "COMMANDBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMANDLINK");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("CommandLink");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "COMMANDLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATATABLE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("DataTable");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "DATATABLE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FORMFORM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("FormForm");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "FORMFORM", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GRAPHICIMAGE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("GraphicImage");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "GRAPHICIMAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUTFILE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("InputFile");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTFILE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUTSECRET");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("InputSecret");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTSECRET", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUTTEXT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("InputText");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUTTEXTAREA");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("InputTextarea");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTTEXTAREA", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MESSAGEMESSAGE");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("MessageMessage");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "MESSAGEMESSAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MESSAGESMESSAGES");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("MessagesMessages");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "MESSAGESMESSAGES", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTCOMETARGETBUTTON");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("OutcomeTargetButton");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTCOMETARGETBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTCOMETARGETLINK");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("OutcomeTargetLink");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTCOMETARGETLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTFORMAT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("OutputFormat");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTFORMAT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTLABEL");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("OutputLabel");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTLABEL", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTLINK");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("OutputLink");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTTEXT");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("OutputText");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PANELGRID");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("PanelGrid");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "PANELGRID", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PANELGROUP");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("PanelGroup");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "PANELGROUP", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTBOOLEANCHECKBOX");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("SelectBooleanCheckbox");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTBOOLEANCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTMANYCHECKBOX");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("SelectManyCheckbox");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTMANYLISTBOX");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("SelectManyListbox");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYLISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTMANYMENU");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("SelectManyMenu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTONELISTBOX");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("SelectOneListbox");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONELISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTONEMENU");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("SelectOneMenu");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONEMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECTONERADIO");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitLdcInsn("SelectOneRadio");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONERADIO", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTBODY");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitLdcInsn("OutputBody");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTBODY", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTDOCTYPE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitLdcInsn("OutputDoctype");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTDOCTYPE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUTPUTHEAD");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitLdcInsn("OutputHead");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/AttributeManager$Key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTHEAD", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/renderkit/AttributeManager$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "COMMANDBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "COMMANDLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "DATATABLE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "FORMFORM", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "GRAPHICIMAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTFILE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTSECRET", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "INPUTTEXTAREA", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "MESSAGEMESSAGE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "MESSAGESMESSAGES", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTCOMETARGETBUTTON", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTCOMETARGETLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTFORMAT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTLABEL", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTLINK", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTTEXT", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "PANELGRID", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "PANELGROUP", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTBOOLEANCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYCHECKBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYLISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTMANYMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONELISTBOX", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONEMENU", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "SELECTONERADIO", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTBODY", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTDOCTYPE", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "OUTPUTHEAD", "Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/AttributeManager$Key", "$VALUES", "[Lcom/sun/faces/renderkit/AttributeManager$Key;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
