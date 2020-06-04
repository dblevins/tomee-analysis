package asm.org.apache.myfaces.view.facelets.compiler;
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
public class FaceletsProcessingInstructionsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROCESS_AS_HTML5", "Ljava/lang/String;", null, "html5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROCESS_AS_JSPX", "Ljava/lang/String;", null, "jspx");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROCESS_AS_XHTML", "Ljava/lang/String;", null, "xhtml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROCESS_AS_XML", "Ljava/lang/String;", null, "xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_HTML5", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_XHTML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_XML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_JSPX", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_HTML5_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_XHTML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_XML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FACELETS_PROCESSING_JSPX_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "consumeXmlDocType", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "consumeXmlDeclaration", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "consumeProcessingInstructions", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "consumeCDataSections", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "escapeInlineText", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "consumeXMLComments", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "swallowCDataContent", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "compressSpaces", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "html5Doctype", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProcessingInstructions", "(Ljava/lang/String;)Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("html5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xhtml");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xml");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("jspx");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_JSPX", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProcessingInstructions", "(Ljava/lang/String;Z)Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "getProcessingInstructions", "(Ljava/lang/String;)Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("html5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xhtml");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xml");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("jspx");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_JSPX_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZZZZZZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZZZZZZZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZZZZZZZZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXmlDocType", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXmlDeclaration", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeProcessingInstructions", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeCDataSections", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "escapeInlineText", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXMLComments", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "swallowCDataContent", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "compressSpaces", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "html5Doctype", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConsumeXmlDocType", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXmlDocType", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConsumeXmlDeclaration", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXmlDeclaration", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConsumeProcessingInstructions", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeProcessingInstructions", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConsumeCDataSections", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeCDataSections", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEscapeInlineText", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "escapeInlineText", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConsumeXMLComments", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "consumeXMLComments", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSwallowCDataContent", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "swallowCDataContent", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCompressSpaces", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "compressSpaces", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isHtml5Doctype", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "html5Doctype", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XML", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_JSPX", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_HTML5_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XHTML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_XML_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "<init>", "(ZZZZZZZZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions", "FACELETS_PROCESSING_JSPX_COMPRESS_SPACES", "Lorg/apache/myfaces/view/facelets/compiler/FaceletsProcessingInstructions;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
