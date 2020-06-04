package asm.com.ctc.wstx.cfg;
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
public class ErrorConstsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/cfg/ErrorConsts", null, "java/lang/Object", new String[] { "javax/xml/stream/XMLStreamConstants" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_ENT_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_ELEM_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_ATTR_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_XML_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_DT_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_NS_DECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WT_VALIDATION", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "W_UNDEFINED_ELEM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "W_MIXED_ENCODINGS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "W_MISSING_DTD", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "W_DTD_DUP_ATTR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "W_DTD_ATTR_REDECL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_INTERNAL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NULL_ARG", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_UNKNOWN_FEATURE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_STATE_NOT_STELEM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_STATE_NOT_ELEM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_STATE_NOT_PI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_STATE_NOT_ELEM_OR_TEXT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_XML_10_VS_11", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_IN_EPILOG", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_DUP", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_CDATA_IN_EPILOG", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_HYPHENS_IN_COMMENT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_BRACKET_IN_TEXT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_UNEXP_KEYWORD", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_PI_MISSING_TARGET", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_PI_XML_TARGET", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_PI_XML_MISSING_SPACE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_ENTITY_EXT_DECLARED", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_GE_UNDECLARED", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_WF_GE_UNDECLARED_SA", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_UNDECLARED", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_UNDECLARED_FOR_ATTR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_REDECL_XML", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_REDECL_XMLNS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_REDECL_XML_URI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_REDECL_XMLNS_URI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_NS_EMPTY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_MAINLEVEL_KEYWORD", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_ATTR_TYPE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_DEFAULT_TYPE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_ELEM_REDEFD", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_NOTATION_REDEFD", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_UNDECLARED_ENTITY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_XML_SPACE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_DTD_XML_ID", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_UNKNOWN_ELEM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_EMPTY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_NON_MIXED", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_ANY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_UNKNOWN_ATTR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ERR_VLD_WRONG_ROOT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_PROLOG_CDATA", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_PROLOG_NONWS_TEXT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_PROLOG_SECOND_ROOT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_CDATA_CONTENT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_COMMENT_CONTENT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_ATTR_NO_ELEM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_NAME_EMPTY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_NAME_ILLEGAL_FIRST_CHAR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WERR_NAME_ILLEGAL_CHAR", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "tokenTypeDesc", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTableSwitchInsn(1, 12, label9, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("START_ELEMENT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("END_ELEMENT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("START_DOCUMENT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("END_DOCUMENT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("CHARACTERS");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("CDATA");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("SPACE");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("COMMENT");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("PROCESSING_INSTRUCTION");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("DTD");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("ENTITY_REFERENCE");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("entity declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_ENT_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("element declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_ELEM_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("attribute declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_ATTR_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("xml declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_XML_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("doctype declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_DT_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("namespace declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_NS_DECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("schema validation");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WT_VALIDATION", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undefined element \"{0}\"; referred to by attribute(s)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "W_UNDEFINED_ELEM", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Inconsistent text encoding; declared as \"{0}\" in xml declaration, application had passed \"{1}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "W_MIXED_ENCODINGS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Missing DOCTYPE declaration in validating mode; can not validate elements or attributes");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "W_MISSING_DTD", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Attribute \"{0}\" (for element <{1}>) declared multiple times");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "W_DTD_DUP_ATTR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Attribute \"{0}\" already declared for element <{1}>; ignoring re-declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "W_DTD_ATTR_REDECL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Internal error");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_INTERNAL", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal to pass null as argument");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NULL_ARG", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Unrecognized feature \"{0}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_UNKNOWN_FEATURE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Current event not START_ELEMENT");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_STATE_NOT_STELEM", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Current event not START_ELEMENT or END_ELEMENT");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_STATE_NOT_ELEM", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Current event not PROCESSING_INSTRUCTION");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_STATE_NOT_PI", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Current event ({0}) not START_ELEMENT, END_ELEMENT, CHARACTERS or CDATA");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_STATE_NOT_ELEM_OR_TEXT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("XML 1.0 document can not refer to XML 1.1 parsed external entities");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_XML_10_VS_11", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Can not have DOCTYPE declaration in epilog");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_IN_EPILOG", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Duplicate DOCTYPE declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_DUP", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(" (CDATA not allowed in prolog/epilog)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_CDATA_IN_EPILOG", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("String '--' not allowed in comment (missing '>'?)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_HYPHENS_IN_COMMENT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("String ']]>' not allowed in textual content, except as the end marker of CDATA section");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_BRACKET_IN_TEXT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Unexpected keyword \"{0}\"; expected \"{1}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_UNEXP_KEYWORD", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Missing processing instruction target");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_PI_MISSING_TARGET", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal processing instruction target (\"{0}\"); 'xml' (case insensitive) is reserved by the specs.");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_PI_XML_TARGET", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("excepted either space or \"?>\" after PI target");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_PI_XML_MISSING_SPACE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Entity \"{0}\" declared externally, but referenced from a document declared 'standalone=\"yes\"'");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_ENTITY_EXT_DECLARED", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undeclared general entity \"{0}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_GE_UNDECLARED", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undeclared general entity \"{0}\" (document in stand-alone mode; perhaps declared externally?)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_WF_GE_UNDECLARED_SA", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undeclared namespace prefix \"{0}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_UNDECLARED", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undeclared namespace prefix \"{0}\" (for attribute \"{1}\")");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_UNDECLARED_FOR_ATTR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to redeclare prefix 'xml' from its default URI 'http://www.w3.org/XML/1998/namespace' to \"{0}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_REDECL_XML", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to declare prefix 'xmlns' (illegal as per NS 1.1 #4)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_REDECL_XMLNS", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to bind URI 'http://www.w3.org/XML/1998/namespace to prefix \"{0}\" (can only bind to 'xml')");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_REDECL_XML_URI", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to bind URI 'http://www.w3.org/2000/xmlns/ to prefix \"{0}\" (can not be explicitly bound)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_REDECL_XMLNS_URI", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Non-default namespace can not map to empty URI (as per Namespace 1.0 # 2) in XML 1.0 documents");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_NS_EMPTY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("; expected a keyword (ATTLIST, ELEMENT, ENTITY, NOTATION), comment, or conditional section");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_MAINLEVEL_KEYWORD", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("; expected one of type (CDATA, ID, IDREF, IDREFS, ENTITY, ENTITIES NOTATION, NMTOKEN or NMTOKENS)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_ATTR_TYPE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("; expected #REQUIRED, #IMPLIED or #FIXED");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_DEFAULT_TYPE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to redefine element \"{0}\" (originally defined at {1})");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_ELEM_REDEFD", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to redefine notation \"{0}\" (originally defined at {1})");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_NOTATION_REDEFD", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undeclared {0} entity \"{1}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_UNDECLARED_ENTITY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Attribute xml:space has to be defined of type enumerated, and have 1 or 2 values, 'default' and/or 'preserve'");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_XML_SPACE", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Attribute xml:id has to have attribute type of ID, as per Xml:id specification");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_XML_ID", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Undefined element <{0}> encountered");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_UNKNOWN_ELEM", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Element <{0}> has EMPTY content specification; can not contain {1}");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_EMPTY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Element <{0}> has non-mixed content specification; can not contain non-white space text, or any CDATA sections");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_NON_MIXED", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Element <{0}> has ANY content specification; can not contain {1}");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_ANY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Element <{0}> has no attribute \"{1}\"");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_UNKNOWN_ATTR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Unexpected root element <{0}>; expected <{0}> as per DOCTYPE declaration");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_VLD_WRONG_ROOT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to output a CDATA block outside main element tree (in prolog or epilog)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_PROLOG_CDATA", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to output non-whitespace characters outside main element tree (in prolog or epilog)");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_PROLOG_NONWS_TEXT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to output second root, <{0}>");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_PROLOG_SECOND_ROOT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal input: CDATA block has embedded ']]>' in it (index {0})");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_CDATA_CONTENT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal input: comment content has embedded '--' in it (index {0})");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_COMMENT_CONTENT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Trying to write an attribute when there is no open start element.");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_ATTR_NO_ELEM", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal to pass empty name");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_NAME_EMPTY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal first name character {0}");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_NAME_ILLEGAL_FIRST_CHAR", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("Illegal name character {0}");
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "WERR_NAME_ILLEGAL_CHAR", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
