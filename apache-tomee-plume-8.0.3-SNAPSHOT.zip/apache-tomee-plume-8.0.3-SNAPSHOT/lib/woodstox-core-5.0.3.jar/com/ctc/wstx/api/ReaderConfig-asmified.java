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
public class ReaderConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/api/ReaderConfig", null, "com/ctc/wstx/api/CommonConfig", new String[] { "com/ctc/wstx/cfg/InputConfigFlags" });

classWriter.visitInnerClass("com/ctc/wstx/api/WstxInputProperties$ParsingMode", "com/ctc/wstx/api/WstxInputProperties", "ParsingMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MAX_ATTRIBUTES_PER_ELEMENT", "I", null, new Integer(1000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MAX_ATTRIBUTE_LENGTH", "I", null, new Integer(524288));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MAX_ELEMENT_DEPTH", "I", null, new Integer(1000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MAX_ENTITY_DEPTH", "I", null, new Integer(500));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_MAX_ENTITY_COUNT", "I", null, new Integer(100000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_COALESCE_TEXT", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_NAMESPACE_AWARE", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_REPLACE_ENTITY_REFS", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_SUPPORT_EXTERNAL_ENTITIES", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_VALIDATE_AGAINST_DTD", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_SUPPORT_DTD", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_EVENT_ALLOCATOR", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_WARNING_REPORTER", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_XML_RESOLVER", "I", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INTERN_NS_URIS", "I", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INTERN_NAMES", "I", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_REPORT_CDATA", "I", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_REPORT_PROLOG_WS", "I", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_PRESERVE_LOCATION", "I", null, new Integer(24));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_AUTO_CLOSE_INPUT", "I", null, new Integer(25));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_SUPPORT_XMLID", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_DTD_OVERRIDE", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_NORMALIZE_LFS", "I", null, new Integer(40));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_CACHE_DTDS", "I", null, new Integer(42));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_CACHE_DTDS_BY_PUBLIC_ID", "I", null, new Integer(43));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_LAZY_PARSING", "I", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_SUPPORT_DTDPP", "I", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_TREAT_CHAR_REFS_AS_ENTS", "I", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INPUT_BUFFER_LENGTH", "I", null, new Integer(50));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MIN_TEXT_SEGMENT", "I", null, new Integer(52));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_CUSTOM_INTERNAL_ENTITIES", "I", null, new Integer(53));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_DTD_RESOLVER", "I", null, new Integer(54));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_ENTITY_RESOLVER", "I", null, new Integer(55));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_UNDECLARED_ENTITY_RESOLVER", "I", null, new Integer(56));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_BASE_URL", "I", null, new Integer(57));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INPUT_PARSING_MODE", "I", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ATTRIBUTES_PER_ELEMENT", "I", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_CHILDREN_PER_ELEMENT", "I", null, new Integer(61));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ELEMENT_COUNT", "I", null, new Integer(62));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ELEMENT_DEPTH", "I", null, new Integer(63));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_CHARACTERS", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ATTRIBUTE_SIZE", "I", null, new Integer(65));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_TEXT_LENGTH", "I", null, new Integer(66));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ENTITY_COUNT", "I", null, new Integer(67));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_MAX_ENTITY_DEPTH", "I", null, new Integer(68));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MIN_INPUT_BUFFER_LENGTH", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DTD_CACHE_SIZE_J2SE", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DTD_CACHE_SIZE_J2ME", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFAULT_SHORTEST_TEXT_SEGMENT", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFAULT_FLAGS_FULL", "I", null, new Integer(2973213));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFAULT_FLAGS_J2ME", "I", null, new Integer(2973213));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sProperties", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mIsJ2MESubset", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "mSymbols", "Lcom/ctc/wstx/util/SymbolTable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mConfigFlags", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mConfigFlagMods", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INTERN_NAMES_EXPLICIT", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "PROP_INTERN_NS_URIS_EXPLICIT", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mInputBufferLen", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMinTextSegmentLen", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxAttributesPerElement", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxAttributeSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxChildrenPerElement", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxElementDepth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxElementCount", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxCharacters", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxTextLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxEntityDepth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mMaxEntityCount", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mBaseURL", "Ljava/net/URL;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mXml11", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mReporter", "Ljavax/xml/stream/XMLReporter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mDtdResolver", "Ljavax/xml/stream/XMLResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mEntityResolver", "Ljavax/xml/stream/XMLResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mSpecialProperties", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SPEC_PROC_COUNT", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SP_IX_CUSTOM_ENTITIES", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SP_IX_UNDECL_ENT_RESOLVER", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SP_IX_DTD_EVENT_LISTENER", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SP_IX_DTD_OVERRIDE", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "mRecyclerRef", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Ljava/lang/ref/SoftReference<Lcom/ctc/wstx/io/BufferRecycler;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lcom/ctc/wstx/api/ReaderConfig;ZLcom/ctc/wstx/util/SymbolTable;IIII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "<init>", "(Lcom/ctc/wstx/api/CommonConfig;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(524288));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 500);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(100000L));
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_DOCUMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mXml11", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mIsJ2MESubset", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mSymbols", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mInputBufferLen", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMinTextSegmentLen", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/ctc/wstx/api/ReaderConfig", "com/ctc/wstx/api/ReaderConfig", Opcodes.INTEGER, "com/ctc/wstx/util/SymbolTable", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "mRecyclerRef", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ref/SoftReference");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ref/SoftReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/io/BufferRecycler");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ref/SoftReference"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createJ2MEDefaults", "()Lcom/ctc/wstx/api/ReaderConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/ReaderConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(new Integer(2973213));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 2000);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "<init>", "(Lcom/ctc/wstx/api/ReaderConfig;ZLcom/ctc/wstx/util/SymbolTable;IIII)V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createFullDefaults", "()Lcom/ctc/wstx/api/ReaderConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/ReaderConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(new Integer(2973213));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 4000);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "<init>", "(Lcom/ctc/wstx/api/ReaderConfig;ZLcom/ctc/wstx/util/SymbolTable;IIII)V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNonShared", "(Lcom/ctc/wstx/util/SymbolTable;)Lcom/ctc/wstx/api/ReaderConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/api/ReaderConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mIsJ2MESubset", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mInputBufferLen", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMinTextSegmentLen", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "<init>", "(Lcom/ctc/wstx/api/ReaderConfig;ZLcom/ctc/wstx/util/SymbolTable;IIII)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mReporter", "Ljavax/xml/stream/XMLReporter;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mReporter", "Ljavax/xml/stream/XMLReporter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mBaseURL", "Ljava/net/URL;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mBaseURL", "Ljava/net/URL;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/ctc/wstx/api/ReaderConfig"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resetState", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mXml11", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findPropertyId", "(Ljava/lang/String;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Integer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSymbols", "()Lcom/ctc/wstx/util/SymbolTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSymbols", "Lcom/ctc/wstx/util/SymbolTable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDtdCacheSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mIsJ2MESubset", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfigFlags", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willCoalesceText", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willSupportNamespaces", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willReplaceEntityRefs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willSupportExternalEntities", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willSupportDTDs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willValidateWithDTD", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willReportCData", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willParseLazily", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(262144));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willInternNames", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willInternNsURIs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willPreserveLocation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willAutoCloseInput", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 8192);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willReportPrologWhitespace", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willCacheDTDs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(65536));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willCacheDTDsByPublicId", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willDoXmlIdTyping", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willDoXmlIdUniqChecks", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(4194304));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willSupportDTDPP", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(524288));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willNormalizeLFs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "willTreatCharRefsAsEnts", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(8388608));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputBufferLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mInputBufferLen", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getShortestReportedTextSegment", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMinTextSegmentLen", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxAttributesPerElement", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxAttributeSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxChildrenPerElement", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxElementDepth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxElementCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxEntityDepth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxEntityCount", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxCharacters", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxTextLength", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCustomInternalEntities", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Lcom/ctc/wstx/ent/EntityDecl;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_getSpecialProperty", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLdcInsn(new Float("0.81"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, "java/util/HashMap", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findCustomInternalEntity", "(Ljava/lang/String;)Lcom/ctc/wstx/ent/EntityDecl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_getSpecialProperty", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/ent/EntityDecl");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLReporter", "()Ljavax/xml/stream/XMLReporter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mReporter", "Ljavax/xml/stream/XMLReporter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLResolver", "()Ljavax/xml/stream/XMLResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDtdResolver", "()Ljavax/xml/stream/XMLResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntityResolver", "()Ljavax/xml/stream/XMLResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUndeclaredEntityResolver", "()Ljavax/xml/stream/XMLResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_getSpecialProperty", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLResolver");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseURL", "()Ljava/net/URL;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mBaseURL", "Ljava/net/URL;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputParsingMode", "()Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inputParsingModeDocuments", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_DOCUMENTS", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inputParsingModeFragment", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/WstxInputProperties", "PARSING_MODE_FRAGMENT", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isXml11", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mXml11", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDTDEventListener", "()Lcom/ctc/wstx/dtd/DTDEventListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_getSpecialProperty", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/dtd/DTDEventListener");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDTDOverride", "()Lorg/codehaus/stax2/validation/DTDValidationSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_getSpecialProperty", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/codehaus/stax2/validation/DTDValidationSchema");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasInternNamesBeenEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasExplicitConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasInternNsURIsBeenEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasExplicitConfigFlag", "(I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConfigFlag", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearConfigFlag", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doCoalesceText", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doSupportNamespaces", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doReplaceEntityRefs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doSupportExternalEntities", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doSupportDTDs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doValidateWithDTD", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doInternNames", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doInternNsURIs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doReportPrologWhitespace", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doReportCData", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doCacheDTDs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(65536));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doCacheDTDsByPublicId", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(131072));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doParseLazily", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(262144));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doXmlIdTyping", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doXmlIdUniqChecks", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(4194304));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doPreserveLocation", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doAutoCloseInput", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 8192);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doSupportDTDPP", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(524288));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doTreatCharRefsAsEnts", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(8388608));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doNormalizeLFs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 16384);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInputBufferLength", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mInputBufferLen", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setShortestReportedTextSegment", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMinTextSegmentLen", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxAttributesPerElement", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributesPerElement", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxAttributeSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxAttributeSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxChildrenPerElement", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxChildrenPerElement", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxElementDepth", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementDepth", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxElementCount", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxElementCount", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxCharacters", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxCharacters", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxTextLength", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxTextLength", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxEntityDepth", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityDepth", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxEntityCount", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mMaxEntityCount", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCustomInternalEntities", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLdcInsn(new Float("0.75"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Map", Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "getEmptyCharArray", "()[C", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(INSTANCEOF, "[C");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "[C");
methodVisitor.visitTypeInsn(CHECKCAST, "[C");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[C"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/ent/IntEntity", "create", "(Ljava/lang/String;[C)Lcom/ctc/wstx/ent/IntEntity;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/ctc/wstx/api/ReaderConfig", "java/util/Map", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_setSpecialProperty", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXMLReporter", "(Ljavax/xml/stream/XMLReporter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mReporter", "Ljavax/xml/stream/XMLReporter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXMLResolver", "(Ljavax/xml/stream/XMLResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDtdResolver", "(Ljavax/xml/stream/XMLResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mDtdResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEntityResolver", "(Ljavax/xml/stream/XMLResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mEntityResolver", "Ljavax/xml/stream/XMLResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUndeclaredEntityResolver", "(Ljavax/xml/stream/XMLResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_setSpecialProperty", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBaseURL", "(Ljava/net/URL;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mBaseURL", "Ljava/net/URL;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInputParsingMode", "(Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mParsingMode", "Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enableXml11", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mXml11", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDTDEventListener", "(Lcom/ctc/wstx/dtd/DTDEventListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_setSpecialProperty", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDTDOverride", "(Lorg/codehaus/stax2/validation/DTDValidationSchema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "_setSpecialProperty", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureForXmlConformance", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportNamespaces", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportDTDs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportExternalEntities", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReplaceEntityRefs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doXmlIdTyping", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doXmlIdUniqChecks", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureForConvenience", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCoalesceText", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReplaceEntityRefs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportCData", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportPrologWhitespace", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doPreserveLocation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doParseLazily", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureForSpeed", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCoalesceText", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doPreserveLocation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportPrologWhitespace", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doInternNsURIs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doXmlIdUniqChecks", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCacheDTDs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doParseLazily", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setShortestReportedTextSegment", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 8000);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setInputBufferLength", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureForLowMemUsage", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCoalesceText", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doPreserveLocation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCacheDTDs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doParseLazily", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doXmlIdUniqChecks", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setShortestReportedTextSegment", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setInputBufferLength", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configureForRoundTripping", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCoalesceText", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReplaceEntityRefs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportCData", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportPrologWhitespace", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doTreatCharRefsAsEnts", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doNormalizeLFs", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setShortestReportedTextSegment", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allocSmallCBuffer", "(I)[C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "getSmallCBuffer", "(I)[C", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freeSmallCBuffer", "([C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "createRecycler", "()Lcom/ctc/wstx/io/BufferRecycler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "returnSmallCBuffer", "([C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allocMediumCBuffer", "(I)[C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "getMediumCBuffer", "(I)[C", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freeMediumCBuffer", "([C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "createRecycler", "()Lcom/ctc/wstx/io/BufferRecycler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "returnMediumCBuffer", "([C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allocFullCBuffer", "(I)[C", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "getFullCBuffer", "(I)[C", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freeFullCBuffer", "([C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "createRecycler", "()Lcom/ctc/wstx/io/BufferRecycler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "returnFullCBuffer", "([C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allocFullBBuffer", "(I)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "getFullBBuffer", "(I)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "freeFullBBuffer", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "createRecycler", "()Lcom/ctc/wstx/io/BufferRecycler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mCurrRecycler", "Lcom/ctc/wstx/io/BufferRecycler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/io/BufferRecycler", "returnFullBBuffer", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createRecycler", "()Lcom/ctc/wstx/io/BufferRecycler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/io/BufferRecycler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/io/BufferRecycler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "mRecyclerRef", "Ljava/lang/ThreadLocal;");
methodVisitor.visitTypeInsn(NEW, "java/lang/ref/SoftReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/SoftReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setConfigFlag", "(IZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IAND);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperty", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
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
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
Label label30 = new Label();
Label label31 = new Label();
Label label32 = new Label();
Label label33 = new Label();
Label label34 = new Label();
Label label35 = new Label();
Label label36 = new Label();
Label label37 = new Label();
Label label38 = new Label();
Label label39 = new Label();
methodVisitor.visitTableSwitchInsn(1, 68, label9, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label10, label11, label12, label13, label14, label15, label16, label17, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label9, label18, label9, label19, label20, label21, label9, label22, label9, label9, label9, label23, label9, label24, label25, label26, label27, label28, label29, label30, label9, label31, label32, label33, label34, label35, label36, label37, label38, label39 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willCoalesceText", "()Z", false);
Label label40 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label40);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label41 = new Label();
methodVisitor.visitJumpInsn(GOTO, label41);
methodVisitor.visitLabel(label40);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label41);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willSupportNamespaces", "()Z", false);
Label label42 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label42);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label43 = new Label();
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label42);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label43);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willReplaceEntityRefs", "()Z", false);
Label label44 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label44);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label45 = new Label();
methodVisitor.visitJumpInsn(GOTO, label45);
methodVisitor.visitLabel(label44);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label45);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willSupportExternalEntities", "()Z", false);
Label label46 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label46);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label47 = new Label();
methodVisitor.visitJumpInsn(GOTO, label47);
methodVisitor.visitLabel(label46);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label47);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willValidateWithDTD", "()Z", false);
Label label48 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label48);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label49 = new Label();
methodVisitor.visitJumpInsn(GOTO, label49);
methodVisitor.visitLabel(label48);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label49);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willSupportDTDs", "()Z", false);
Label label50 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label50);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label51 = new Label();
methodVisitor.visitJumpInsn(GOTO, label51);
methodVisitor.visitLabel(label50);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label51);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getXMLReporter", "()Ljavax/xml/stream/XMLReporter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getXMLResolver", "()Ljavax/xml/stream/XMLResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willReportPrologWhitespace", "()Z", false);
Label label52 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label52);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label53 = new Label();
methodVisitor.visitJumpInsn(GOTO, label53);
methodVisitor.visitLabel(label52);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label53);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willReportCData", "()Z", false);
Label label54 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label54);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label55 = new Label();
methodVisitor.visitJumpInsn(GOTO, label55);
methodVisitor.visitLabel(label54);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label55);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willInternNames", "()Z", false);
Label label56 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label56);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label57 = new Label();
methodVisitor.visitJumpInsn(GOTO, label57);
methodVisitor.visitLabel(label56);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label57);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willInternNsURIs", "()Z", false);
Label label58 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label58);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label59 = new Label();
methodVisitor.visitJumpInsn(GOTO, label59);
methodVisitor.visitLabel(label58);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label59);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willPreserveLocation", "()Z", false);
Label label60 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label60);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label61 = new Label();
methodVisitor.visitJumpInsn(GOTO, label61);
methodVisitor.visitLabel(label60);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label61);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willAutoCloseInput", "()Z", false);
Label label62 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label62);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label63 = new Label();
methodVisitor.visitJumpInsn(GOTO, label63);
methodVisitor.visitLabel(label62);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label63);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getDTDOverride", "()Lorg/codehaus/stax2/validation/DTDValidationSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willCacheDTDs", "()Z", false);
Label label64 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label64);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label65 = new Label();
methodVisitor.visitJumpInsn(GOTO, label65);
methodVisitor.visitLabel(label64);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label65);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willCacheDTDsByPublicId", "()Z", false);
Label label66 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label66);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label67 = new Label();
methodVisitor.visitJumpInsn(GOTO, label67);
methodVisitor.visitLabel(label66);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label67);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willParseLazily", "()Z", false);
Label label68 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label68);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label69 = new Label();
methodVisitor.visitJumpInsn(GOTO, label69);
methodVisitor.visitLabel(label68);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label69);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
Label label70 = new Label();
methodVisitor.visitJumpInsn(IFNE, label70);
methodVisitor.visitLdcInsn("disable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label70);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(4194304));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
Label label71 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label71);
methodVisitor.visitLdcInsn("xmlidFull");
Label label72 = new Label();
methodVisitor.visitJumpInsn(GOTO, label72);
methodVisitor.visitLabel(label71);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xmlidTyping");
methodVisitor.visitLabel(label72);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willTreatCharRefsAsEnts", "()Z", false);
Label label73 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label73);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label74 = new Label();
methodVisitor.visitJumpInsn(GOTO, label74);
methodVisitor.visitLabel(label73);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label74);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "willNormalizeLFs", "()Z", false);
Label label75 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label75);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
Label label76 = new Label();
methodVisitor.visitJumpInsn(GOTO, label76);
methodVisitor.visitLabel(label75);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label76);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getInputBufferLength", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxAttributesPerElement", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label36);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxAttributeSize", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxChildrenPerElement", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label34);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxElementDepth", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxElementCount", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label35);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxCharacters", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label37);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxTextLength", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label39);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxEntityDepth", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label38);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getMaxEntityCount", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getShortestReportedTextSegment", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getCustomInternalEntities", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getDtdResolver", "()Ljavax/xml/stream/XMLResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getEntityResolver", "()Ljavax/xml/stream/XMLResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getUndeclaredEntityResolver", "()Ljavax/xml/stream/XMLResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getBaseURL", "()Ljava/net/URL;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "getInputParsingMode", "()Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Internal error: no handler for property with internal id ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;ILjava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
Label label30 = new Label();
Label label31 = new Label();
Label label32 = new Label();
Label label33 = new Label();
Label label34 = new Label();
Label label35 = new Label();
Label label36 = new Label();
Label label37 = new Label();
Label label38 = new Label();
Label label39 = new Label();
Label label40 = new Label();
Label label41 = new Label();
Label label42 = new Label();
methodVisitor.visitTableSwitchInsn(1, 68, label12, new Label[] { label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label12, label12, label12, label12, label12, label12, label12, label12, label12, label13, label14, label15, label16, label17, label18, label19, label20, label12, label12, label12, label12, label12, label12, label12, label12, label12, label12, label12, label12, label21, label12, label22, label23, label24, label12, label25, label12, label12, label12, label26, label12, label27, label28, label29, label30, label31, label32, label33, label12, label34, label35, label36, label37, label38, label39, label40, label41, label42 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCoalesceText", "(Z)V", false);
Label label43 = new Label();
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportNamespaces", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReplaceEntityRefs", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportExternalEntities", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doSupportDTDs", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doValidateWithDTD", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLReporter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setXMLReporter", "(Ljavax/xml/stream/XMLReporter;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setXMLResolver", "(Ljavax/xml/stream/XMLResolver;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doInternNsURIs", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doInternNames", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportCData", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doReportPrologWhitespace", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doPreserveLocation", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doAutoCloseInput", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("disable");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label44 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label44);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label45 = new Label();
methodVisitor.visitJumpInsn(GOTO, label45);
methodVisitor.visitLabel(label44);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xmlidTyping");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label46 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label46);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label45);
methodVisitor.visitLabel(label46);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xmlidFull");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label47 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label47);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label45);
methodVisitor.visitLabel(label47);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Illegal argument ('");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("') to set property ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("org.codehaus.stax2.supportXmlId");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" to: has to be one of '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("disable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("', '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("xmlidTyping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("' or '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("xmlidFull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label45);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(4194304));
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/ReaderConfig", "setConfigFlag", "(IZ)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/codehaus/stax2/validation/DTDValidationSchema");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setDTDOverride", "(Lorg/codehaus/stax2/validation/DTDValidationSchema;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCacheDTDs", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doCacheDTDsByPublicId", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doParseLazily", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doTreatCharRefsAsEnts", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToBoolean", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "doNormalizeLFs", "(Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setInputBufferLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label34);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxAttributesPerElement", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label39);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxAttributeSize", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label35);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxChildrenPerElement", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label37);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxElementDepth", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label36);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToLong", "(Ljava/lang/String;Ljava/lang/Object;J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxElementCount", "(J)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label38);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToLong", "(Ljava/lang/String;Ljava/lang/Object;J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxCharacters", "(J)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label40);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxTextLength", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label42);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxEntityDepth", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label41);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToLong", "(Ljava/lang/String;Ljava/lang/Object;J)J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setMaxEntityCount", "(J)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ArgUtil", "convertToInt", "(Ljava/lang/String;Ljava/lang/Object;I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setShortestReportedTextSegment", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label28);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setCustomInternalEntities", "(Ljava/util/Map;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setDtdResolver", "(Ljavax/xml/stream/XMLResolver;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setEntityResolver", "(Ljavax/xml/stream/XMLResolver;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label31);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setUndeclaredEntityResolver", "(Ljavax/xml/stream/XMLResolver;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label48 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label48);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label49 = new Label();
methodVisitor.visitJumpInsn(GOTO, label49);
methodVisitor.visitLabel(label48);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/net/URL");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label49);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label49);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label49);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/net/URL"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setBaseURL", "(Ljava/net/URL;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/api/WstxInputProperties$ParsingMode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "setInputParsingMode", "(Lcom/ctc/wstx/api/WstxInputProperties$ParsingMode;)V", false);
methodVisitor.visitJumpInsn(GOTO, label43);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Internal error: no handler for property with internal id ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label43);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "_hasConfigFlag", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlags", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IAND);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "_hasExplicitConfigFlag", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/api/ReaderConfig", "_hasConfigFlag", "(I)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mConfigFlagMods", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "_getSpecialProperty", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "_setSpecialProperty", "(ILjava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/api/ReaderConfig", "mSpecialProperties", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "returnNullForDefaultNamespace", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "returnNullForDefaultNamespace", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "doesSupportXmlId", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "doesSupportXmlId", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "doesSupportXml11", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "doesSupportXml11", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isPropertySupported", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "isPropertySupported", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/api/CommonConfig", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.isCoalescing");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.isNamespaceAware");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.isReplacingEntityReferences");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.isSupportingExternalEntities");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.isValidating");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.supportDTD");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.allocator");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.reporter");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("javax.xml.stream.resolver");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.internNames");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.internNsUris");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("http://java.sun.com/xml/stream/properties/report-cdata-event");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.reportPrologWhitespace");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.preserveLocation");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.closeInputSource");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.supportXmlId");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("org.codehaus.stax2.propDtdOverride");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.cacheDTDs");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.cacheDTDsByPublicId");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.lazyParsing");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.supportDTDPP");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.treatCharRefsAsEnts");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.normalizeLFs");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.inputBufferLength");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.minTextSegment");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxAttributesPerElement");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxAttributeSize");
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxChildrenPerElement");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxTextLength");
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxElementCount");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxElementDepth");
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxEntityDepth");
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxEntityCount");
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.maxCharacters");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("com.ctc.wstx.customInternalEntities");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.dtdResolver");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.entityResolver");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.undeclaredEntityResolver");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.baseURL");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/api/ReaderConfig", "sProperties", "Ljava/util/HashMap;");
methodVisitor.visitLdcInsn("com.ctc.wstx.fragmentMode");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "Integer", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/api/ReaderConfig", "mRecyclerRef", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
