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
public class WstxInputPropertiesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/api/WstxInputProperties", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/ctc/wstx/api/WstxInputProperties$ParsingMode", "com/ctc/wstx/api/WstxInputProperties", "ParsingMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN_ATTR_TYPE", "Ljava/lang/String;", null, "CDATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_NORMALIZE_LFS", "Ljava/lang/String;", null, "com.ctc.wstx.normalizeLFs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_VALIDATE_TEXT_CHARS", "Ljava/lang/String;", null, "com.ctc.wstx.validateTextChars");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_CACHE_DTDS", "Ljava/lang/String;", null, "com.ctc.wstx.cacheDTDs");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_CACHE_DTDS_BY_PUBLIC_ID", "Ljava/lang/String;", null, "com.ctc.wstx.cacheDTDsByPublicId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "P_LAZY_PARSING", "Ljava/lang/String;", null, "com.ctc.wstx.lazyParsing");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_RETURN_NULL_FOR_DEFAULT_NAMESPACE", "Ljava/lang/String;", null, "com.ctc.wstx.returnNullForDefaultNamespace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "P_SUPPORT_DTDPP", "Ljava/lang/String;", null, "com.ctc.wstx.supportDTDPP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_TREAT_CHAR_REFS_AS_ENTS", "Ljava/lang/String;", null, "com.ctc.wstx.treatCharRefsAsEnts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_INPUT_BUFFER_LENGTH", "Ljava/lang/String;", null, "com.ctc.wstx.inputBufferLength");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MIN_TEXT_SEGMENT", "Ljava/lang/String;", null, "com.ctc.wstx.minTextSegment");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ATTRIBUTES_PER_ELEMENT", "Ljava/lang/String;", null, "com.ctc.wstx.maxAttributesPerElement");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ATTRIBUTE_SIZE", "Ljava/lang/String;", null, "com.ctc.wstx.maxAttributeSize");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_CHILDREN_PER_ELEMENT", "Ljava/lang/String;", null, "com.ctc.wstx.maxChildrenPerElement");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ELEMENT_COUNT", "Ljava/lang/String;", null, "com.ctc.wstx.maxElementCount");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ELEMENT_DEPTH", "Ljava/lang/String;", null, "com.ctc.wstx.maxElementDepth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_CHARACTERS", "Ljava/lang/String;", null, "com.ctc.wstx.maxCharacters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_TEXT_LENGTH", "Ljava/lang/String;", null, "com.ctc.wstx.maxTextLength");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ENTITY_COUNT", "Ljava/lang/String;", null, "com.ctc.wstx.maxEntityCount");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_MAX_ENTITY_DEPTH", "Ljava/lang/String;", null, "com.ctc.wstx.maxEntityDepth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "P_CUSTOM_INTERNAL_ENTITIES", "Ljava/lang/String;", null, "com.ctc.wstx.customInternalEntities");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_DTD_RESOLVER", "Ljava/lang/String;", null, "com.ctc.wstx.dtdResolver");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_ENTITY_RESOLVER", "Ljava/lang/String;", null, "com.ctc.wstx.entityResolver");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_UNDECLARED_ENTITY_RESOLVER", "Ljava/lang/String;", null, "com.ctc.wstx.undeclaredEntityResolver");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_BASE_URL", "Ljava/lang/String;", null, "com.ctc.wstx.baseURL");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_INPUT_PARSING_MODE", "Ljava/lang/String;", null, "com.ctc.wstx.fragmentMode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARSING_MODE_DOCUMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARSING_MODE_FRAGMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARSING_MODE_DOCUMENTS", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/WstxInputProperties$ParsingMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/WstxInputProperties$ParsingMode", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_DOCUMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/WstxInputProperties$ParsingMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/WstxInputProperties$ParsingMode", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_FRAGMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/WstxInputProperties$ParsingMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/WstxInputProperties$ParsingMode", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_DOCUMENTS", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
