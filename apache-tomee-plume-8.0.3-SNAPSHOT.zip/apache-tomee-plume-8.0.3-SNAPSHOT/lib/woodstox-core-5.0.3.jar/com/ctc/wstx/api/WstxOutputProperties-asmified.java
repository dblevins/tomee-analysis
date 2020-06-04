package asm.com.ctc.wstx.api;
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
public class WstxOutputPropertiesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/api/WstxOutputProperties", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_XML_VERSION", "Ljava/lang/String;", null, "1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_OUTPUT_ENCODING", "Ljava/lang/String;", null, "UTF-8");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_USE_DOUBLE_QUOTES_IN_XML_DECL", "Ljava/lang/String;", null, "com.ctc.wstx.useDoubleQuotesInXmlDecl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_CDATA_AS_TEXT", "Ljava/lang/String;", null, "com.ctc.wstx.outputCDataAsText");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_COPY_DEFAULT_ATTRS", "Ljava/lang/String;", null, "com.ctc.wstx.copyDefaultAttrs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_ADD_SPACE_AFTER_EMPTY_ELEM", "Ljava/lang/String;", null, "com.ctc.wstx.addSpaceAfterEmptyElem");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_AUTOMATIC_END_ELEMENTS", "Ljava/lang/String;", null, "com.ctc.wstx.automaticEndElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_VALIDATE_STRUCTURE", "Ljava/lang/String;", null, "com.ctc.wstx.outputValidateStructure");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_VALIDATE_CONTENT", "Ljava/lang/String;", null, "com.ctc.wstx.outputValidateContent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_VALIDATE_ATTR", "Ljava/lang/String;", null, "com.ctc.wstx.outputValidateAttr");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_VALIDATE_NAMES", "Ljava/lang/String;", null, "com.ctc.wstx.outputValidateNames");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_FIX_CONTENT", "Ljava/lang/String;", null, "com.ctc.wstx.outputFixContent");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_ESCAPE_CR", "Ljava/lang/String;", null, "com.ctc.wstx.outputEscapeCr");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_INVALID_CHAR_HANDLER", "Ljava/lang/String;", null, "com.ctc.wstx.outputInvalidCharHandler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_EMPTY_ELEMENT_HANDLER", "Ljava/lang/String;", null, "com.ctc.wstx.outputEmptyElementHandler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_UNDERLYING_STREAM", "Ljava/lang/String;", null, "com.ctc.wstx.outputUnderlyingStream");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_OUTPUT_UNDERLYING_WRITER", "Ljava/lang/String;", null, "com.ctc.wstx.outputUnderlyingWriter");
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
